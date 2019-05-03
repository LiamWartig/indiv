import React,{Component} from 'react';
import TaskField from './TaskField';

export default class Parent extends Component{

	constructor(props){
		super(props);
		this.state={
			text: "",
			taskDescription: []
		}
		this.value="hi value from parent";
	}

	setTaskDescription = (e) => {
		this.setState({
			 text : e.target.value
		})
	}

	btnfcn = () => {
		let arr = this.state.taskDescription;
			arr.push(this.state.text);
			this.setState({
				taskDescription: arr,
				text: ""
			})
	}

	render(){
		return(

			<div className="ParentDiv">
				<ul className="tasklist">
				<TaskField btnfcn={this.btnfcn} arr={this.state.taskDescription} infunction={this.setTaskDescription} text={this.state.text}/>
    			</ul>
			</div>

		);
	}


}
