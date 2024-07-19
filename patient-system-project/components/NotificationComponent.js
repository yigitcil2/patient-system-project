import React, { useState, useEffect } from 'react';


const NotificationComponent = () => {
    const [notifications, setNotifications] = useState([]);

   /* useEffect(() => {
        fetchNotifications().then(response => setNotifications(response.data));
    }, []);*/

    return (
        <div>
            <h2>Notification List</h2>
            <ul>
                {notifications.map(notification => (
                    <li key={notification.id}>{notification.name} - {notification.message}</li>
                ))}
            </ul>
        </div>
    );
};

export default NotificationComponent;
