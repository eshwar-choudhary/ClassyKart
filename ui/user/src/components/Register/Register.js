import React, { useState } from 'react';
import { useNavigate } from 'react-router-dom';
import LandingNavbar from '../LandingPage/LandingNavbar'; // Adjust the path as necessary
import './Register.css';

const Register = () => {
    const [email, setEmail] = useState('');
    const [error, setError] = useState('');
    const [loading, setLoading] = useState(false);
    const navigate = useNavigate();

    const handleSubmit = async (e) => {
        e.preventDefault();
        setLoading(true);

        const apiUrl = '/signup';

        try {
            const response = await fetch(apiUrl, {
                method: 'POST',
                headers: {
                    'Content-Type': 'text/plain',
                },
                body: email,
            });

            if (response.ok) {
                navigate('/otp'); // Redirect to the OTP page after successful submission
            } else {
                const data = await response.json();
                setError(data.message || 'Request OTP failed');
            }
        } catch (err) {
            console.error('Request OTP error:', err);
            setError('An error occurred. Please try again.');
        } finally {
            setLoading(false);
        }
    };

    return (
        <div className="register-container">
            <LandingNavbar />
            <div className="register-box">
                <h2>Register</h2>
                <form onSubmit={handleSubmit}>
                    <div className="input-group">
                        <label>Email</label>
                        <input
                            type="email"
                            value={email}
                            onChange={(e) => setEmail(e.target.value)}
                            required
                        />
                    </div>
                    {error && <p className="error">{error}</p>}
                    {loading && <p className="loading">Loading...</p>}
                    <button type="submit" disabled={loading}>Request OTP</button>
                </form>
                <p className="login-link">
                    Already have an account? <a href="/login">Login</a>
                </p>
            </div>
        </div>
    );
};

export default Register;