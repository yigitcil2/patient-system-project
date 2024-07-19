import logo from './logo.svg';
import React from 'react';
import PatientComponent from './components/PatientComponent';
import NotificationComponent from './components/NotificationComponent';
import { BrowserRouter as Router, Route, Switch } from 'react-router-dom';
import './App.css';

function App() {
  return (
    <Router>
            <div>
                <h1>Patient Notification System</h1>
                <Switch>
                    <Route path="/patients" component={PatientComponent} />
                    <Route path="/notifications" component={NotificationComponent} />                  
                </Switch>
            </div>
        </Router>
  );
}

export default App;
