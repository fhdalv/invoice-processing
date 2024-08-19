
import React, {useState, useEffect} from "react";
import Header from "../components/Header";
import {Box, Typography, Button} from '@mui/material';
import AddInvoice from "../components/AddInvoice";
import Invoices from '../components/Invoices';
import { getAllInvoice } from "../services/api";

const Home = () =>  {
    const [addInvoice, setAddInvoice] = useState(false);
    const [invoices, setInvoices] = useState([]);

    useEffect(()=> {
        const getData = async () => {
            const response = await getAllInvoice();
            setInvoices(response.data);
        }
        getData();
    }, {})

    const toggleInvoice = () => {
        setAddInvoice(true);
    }

    return (
        <>
            <Header/>
            <Box style={{ margin: 20}}>
                <Typography variant="h4">Pending Invoices</Typography>
               { !addInvoice && <Button  
                variant="contained" 
                style={{marginTop: 15}}
                onClick={() => toggleInvoice()}
                >
                    Add Invoice</Button>}
                { addInvoice && <AddInvoice setAddInvoice={setAddInvoice}/>}
            </Box>
            <Box>
                <Invoices invoices={invoices}/>
            </Box>
        </>

    )
}

export default Home;