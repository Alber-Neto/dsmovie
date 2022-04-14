import Formcard from 'components/FormCard';
import { Link, useParams } from 'react-router-dom';
import './styles.css';



function Form(){

    const params = useParams();

    return(
        <Formcard movieId={`${params.movieId}`}/>
    );

}

export default Form;