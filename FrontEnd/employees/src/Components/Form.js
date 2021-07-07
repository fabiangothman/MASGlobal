
import { useState } from 'react';
//Libraries
import 'bootstrap/dist/css/bootstrap.min.css';
import Spinner from 'react-bootstrap/Spinner';
//Components
import '../App.css';
import Table from './Table';

const Form = () => {
    const [employeeId, setEmployeeId] = useState("");
    const [employeesData, setEmployeesData] = useState([]);
    const [fetching, setFetching] = useState(false);

    const handleGetData = async (e) => {
        e.preventDefault();
        setFetching(true);

        const url = (employeeId) ? `http://localhost:8080/employee/id/${employeeId}` : "http://localhost:8080/employee/"
        await fetch(url)
        .then(res => res.json())
        .then((result) => {
            setData(result);
        }).catch(error => {
            console.log(error);
            alert(error);
        });

        setFetching(false);
    }

    /*  This function has a big O complexity of O(n), due the worst case could be n iterations in the forEach cycle,
            this time could improve by requesting for a limited pagination data.
    */
    const setData = (data) => {
        const newData = [];
        if(Array.isArray(data)){
            data.forEach(item => {
                if(item.id != null)
                    newData.push(item);
            });
        }else{
            if(data.id != null)
                newData.push(data);
        }
        setEmployeesData(newData);
    }

    return (
        <div>
            <form className="form-container" onSubmit={handleGetData}>
                <div className="form-group">
                    <small id="employeeHelp" className="form-text text-muted">If you don't insert any id, we'll get all employees list.</small>
                    <input type="number"
                        onChange={(e) => setEmployeeId(e.target.value)}
                        value={employeeId}
                        className="form-control"
                        id="InputEmployeeId"
                        aria-describedby="employeeHelp"
                        placeholder="Enter employee id" />
                </div>
                {(fetching) ? (
                    <Spinner animation="border" />
                ) : (
                    <button type="submit" className="btn btn-primary">Get</button>
                )}                
                
            </form>
            <Table employeesData={employeesData} />
        </div>
    );
}  
export default Form;