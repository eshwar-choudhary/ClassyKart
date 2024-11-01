import React from 'react';
import { BrowserRouter as Router, Routes, Route } from 'react-router-dom';
import Navbar from './components/Navbar/Navbar';
import LandingPage from './components/LandingPage/LandingPage';
import Login from './components/Login/Login';
import LoggedIn from './components/LoggedIn/LoggedIn';
import Register from './components/Register/Register';

const App = () => {
    return (
        <Router>
            <Navbar />
            <div style={{ marginTop: '60px' }}> {/* Offset for fixed navbar */}
                <Routes>
                    <Route path="/" element={<LandingPage />} />
                    <Route path="/login" element={<Login />} />
                    <Route path="/signup" element={<Register />} />
                    <Route path="/logged-in" element={<LoggedIn />} />
                </Routes>
            </div>
        </Router>
    );
};

export default App;