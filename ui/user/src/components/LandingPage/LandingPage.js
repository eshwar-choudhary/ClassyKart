import React from 'react';
import LandingNavbar from './LandingNavbar'; // Ensure this path matches your folder structure
import './LandingPage.css';

const LandingPage = () => {
    return (
        <div>
            <LandingNavbar />
            <header className="landing-header">
                <h1>Welcome to ClassyKart</h1>
                <p>Your one-stop shop for everything classy!</p>
            </header>
            <main className="landing-content">
                <section className="featured-products">
                    <h2>Featured Products</h2>
                    <div className="product-grid">
                        {/* Example products */}
                        <div className="product-card">
                            <img src="https://via.placeholder.com/150" alt="Product 1" />
                            <h3>Product 1</h3>
                            <p>$29.99</p>
                            <button>Add to Cart</button>
                        </div>
                        <div className="product-card">
                            <img src="https://via.placeholder.com/150" alt="Product 2" />
                            <h3>Product 2</h3>
                            <p>$39.99</p>
                            <button>Add to Cart</button>
                        </div>
                        <div className="product-card">
                            <img src="https://via.placeholder.com/150" alt="Product 3" />
                            <h3>Product 3</h3>
                            <p>$49.99</p>
                            <button>Add to Cart</button>
                        </div>
                        <div className="product-card">
                            <img src="https://via.placeholder.com/150" alt="Product 4" />
                            <h3>Product 4</h3>
                            <p>$59.99</p>
                            <button>Add to Cart</button>
                        </div>
                    </div>
                </section>
            </main>
            <footer className="landing-footer">
                <p>&copy; 2024 ClassyKart. All rights reserved.</p>
            </footer>
        </div>
    );
};

export default LandingPage;
