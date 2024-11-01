import React, { useState } from 'react';
import './OTP.css'; // Add appropriate styling for modal

const OTP = ({ isOpen, onClose }) => {
    const [otp, setOtp] = useState('');
    const [error, setError] = useState('');

    const handleOtpSubmit = (e) => {
        e.preventDefault();
        // Handle OTP submission logic here
        if (otp.length === 6) {
            console.log('OTP Submitted:', otp); // Replace with actual submission logic
            onClose();
        } else {
            setError('Please enter a valid 6-digit OTP');
        }
    };

    if (!isOpen) return null; // Return nothing if modal is closed

    return (
        <div className="otp-modal">
            <div className="otp-modal-content">
                <button className="close-button" onClick={onClose}>X</button>
                <h2>Enter OTP</h2>
                <form onSubmit={handleOtpSubmit}>
                    <input
                        type="text"
                        value={otp}
                        onChange={(e) => setOtp(e.target.value)}
                        maxLength="6"
                        placeholder="Enter 6-digit OTP"
                        required
                    />
                    {error && <p className="error">{error}</p>}
                    <div className="otp-actions">
                        <button type="submit">Submit</button>
                        <button type="button" onClick={onClose}>Cancel</button>
                    </div>
                </form>
            </div>
        </div>
    );
};

export default OTP;