import React, { useState } from 'react';
import { Link, useLocation } from 'react-router-dom';
import '../Navbar/Navbar.css'; // Ensure this file contains your navbar styles
import { FaHome, FaUser, FaInfoCircle, FaQuestionCircle, FaShoppingCart, FaBriefcase, FaEllipsisV, FaStore } from 'react-icons/fa';
import { FaSearch } from 'react-icons/fa'; // Importing FaSearch icon separately

const LandingNavbar = () => {
    const location = useLocation();
    const [searchTerm, setSearchTerm] = useState('');

    const getIcon = (path) => {
        switch (path) {
            case '/':
                return <FaHome />;
            case '/login':
                return <FaUser />;
            case '/terms':
                return <FaInfoCircle />;
            case '/help':
                return <FaQuestionCircle />;
            case '/cart':
                return <FaShoppingCart />; // Icon for Cart
            case '/more':
                return <FaEllipsisV />; // Icon for More (can represent business)
            case '/business':
                return <FaStore />;
            default:
                return <FaHome />;
        }
    };

    const handleSearch = (event) => {
        event.preventDefault();
        // Implement search functionality here
        console.log('Searching for:', searchTerm);
    };

    return (
        <nav className="navbar">
            <div className="navbar-logo">ClassyKart</div>
            <form onSubmit={handleSearch} className="search-form">
                <div className="search-container">
                    <input
                        type="text"
                        placeholder="Search for products..."
                        value={searchTerm}
                        onChange={(e) => setSearchTerm(e.target.value)}
                        className="search-input"
                    />
                </div>
            </form>
            <div className="navbar-links">
                <Link to="/login" className="nav-item">
                    {getIcon('/login')} Login
                </Link>
                <Link to="/cart" className="nav-item">
                    {getIcon('/cart')} Cart
                </Link>
                <Link to="/more" className="nav-item">
                    {getIcon('/business')} Become a Seller
                </Link>
                <Link to="/business" className="nav-item">
                     {getIcon('/more')} More
                 </Link>
            </div>
        </nav>
    );
};

export default LandingNavbar;