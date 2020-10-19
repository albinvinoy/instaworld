import React, {useState, useEffect, useCallback} from 'react';
import logo from './logo.svg';
import './App.css';
import axios from 'axios'
import {useDropzone} from 'react-dropzone'

const UserProfile = () => {
    return (
        <div>
            <h1>Drap and drop your profile picture below</h1>

            <Dropzone userProfileId={"one_world25"}/>
        </div>

    )
}

function Dropzone({userProfileId}) {
    const onDrop = useCallback(acceptedFiles => {
        const file = acceptedFiles[0];
        console.log(file);
        const formData = new FormData();
        // file is request parm in controller
        formData.append("file", file);

        axios.post('http://localhost:8080/v1/api/upload/one_world25/profilePicture',
            formData,
            {
                headers: {
                    "Content-Type": "multipart/form-data"
                }
            }
        ).then(() => {
            console.log("File uploaded successfully")
        }).catch(err => {
            console.log(err);
        })

    }, [])
    const {getRootProps, getInputProps, isDragActive} = useDropzone({onDrop})

    return (
        <div {...getRootProps()}>
            <input {...getInputProps()} />
            {
                isDragActive ?
                    <p>Drop the files here ...</p> :
                    <p>Drag 'n' drop some files here, or click to select files</p>
            }
        </div>
    )
}

function App() {
    return (
        <div className="App">
            <UserProfile/>
        </div>
    );
}

export default App;
