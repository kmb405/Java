// src/components/MyComponent.js
import React, { useEffect, useState } from "react";
import axios from "axios";

const MyComponent = () => {
    const [data, setData] = useState([]);

    useEffect(() => {
        axios
        .get("http://127.0.0.1:8000/api/mymodels/")
        .then((response) => {
            setData(response.data);
        })
        .catch((error) => {
            console.error("There was an error fetching data!", error);
        });
    }, []);

    return (
        <div>
        <h1>My Models</h1>
        <ul>
            {data.map((item) => (
            <li key={item.id}>{item.name}</li>
            ))}
        </ul>
        </div>
    );
};

export default MyComponent;
