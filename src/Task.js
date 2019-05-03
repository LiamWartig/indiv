import React, { Component } from 'react';
import './Task.css'

export default class Task extends Component {

    constructor(props) {
        super(props);
        this.state = {
            striked:false,           
            className: "",
            buttonText:"Done"
        }
    }


    striker = () => {
        if (!this.state.striked){
        this.setState({
            striked:true,
            className:"striked",
            buttonText:"undo"
        })
    }else {
        this.setState({
            striked:false,
            className:"",
            buttonText:"Done"
        })
    }


    }


    render() {

        return (
            <li>
                    <p className={this.state.className}>
                        {this.props.text}    
                    </p>
                    <button onClick={this.striker} className="strikerer">{this.state.buttonText} </button>
            </li>

        );

    }

}