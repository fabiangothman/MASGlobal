import '../App.css';
import 'bootstrap/dist/css/bootstrap.min.css';

const Table = (props) => {

    const numberWithFormat = (num) => {
        return num.toString().replace(/\B(?=(\d{3})+(?!\d))/g, ",");
    }

    return (
        <div>
            <table className="table">
                <thead>
                    <tr>
                        <th scope="col">id</th>
                        <th scope="col">name</th>
                        <th scope="col">roleId</th>
                        <th scope="col">roleName</th>
                        <th scope="col">roleDescription</th>
                        <th scope="col">contractTypeName</th>
                        <th scope="col">salary</th>
                    </tr>
                </thead>
                <tbody>
                    {props.employeesData.map((item, i) => (
                        <tr key={i}>
                            <th>{item.id}</th>
                            <td>{item.name}</td>
                            <td>{item.roleId}</td>
                            <td>{item.roleName}</td>
                            <td>{item.roleDescription}</td>
                            <td>{item.contractTypeName}</td>
                            <td>{numberWithFormat(item.salary)}</td>
                        </tr>
                    ))}
                </tbody>
            </table>
        </div>
    );
}  
export default Table;