import React from 'react';
import './LoggedIn.css';

const LoggedIn = () => {
    return (
        <div className="logged-in-container">
            <h1>Welcome Back!</h1>
            <p>You are successfully logged in.</p>
            <p>Explore our application and enjoy your stay!</p>
            <a href="/logout" className="logout-button">Logout</a>
        </div>
    );
};

export default LoggedIn;