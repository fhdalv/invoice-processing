
import React from "react";
import Header from "../components/Header";
import {Box, Typography, Button} from '@mui/material';

const Home = () => {

    return (
        <>
            <Header/>
            <Box style={{ margin: 20}}>
                <Typography variant="h4">Pending Invoices</Typography>
                <Button variant="contained" style={{marginTop: 15}}>Add Invoice</Button>
            </Box>
        </>

    )
}

export default Home;