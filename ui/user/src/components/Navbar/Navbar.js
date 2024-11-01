import React from 'react';
import { Link, useLocation } from 'react-router-dom';
import './Navbar.css';
import { FaHome, FaStore, FaShoppingCart, FaUser, FaCog } from 'react-icons/fa';

const Navbar = () => {
    const location = useLocation();

    const getIcon = (path) => {
        switch (path) {
            case '/':
                return <FaHome />;
            case '/shop':
                return <FaStore />;
            case '/cart':
                return <FaShoppingCart />;
            case '/profile':
                return <FaUser />;
            case '/settings':
                return <FaCog />;
            default:
                return <FaHome />;
        }
    };

    return (
        <nav className="navbar">
            <div className="navbar-logo">ClassyKart</div>
            <div className="navbar-links">
                <Link to="/" className="nav-item">
                    {getIcon('/')} Home
                </Link>
                <Link to="/shop" className="nav-item">
                    {getIcon('/shop')} Shop
                </Link>
                <Link to="/cart" className="nav-item cart-icon">
                    {getIcon('/cart')} Cart
                    <span className="cart-badge">3</span> {/* Example badge */}
                </Link>
                <Link to="/profile" className="nav-item">
                    {getIcon('/profile')} Profile
                </Link>
                <Link to="/settings" className="nav-item">
                    {getIcon('/settings')} Settings
                </Link>
            </div>
        </nav>
    );
};

export default Navbar;
