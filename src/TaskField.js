import React,{Component} from 'react';
import Task from './Task';
import './taskfield.css';

export default class TaskField extends Component{


	render(){

        return(
            <div>
				

				<div className="TaskFieldDiv">
				<input type = "text" onChange={this.props.infunction} value={this.props.text} placeholder="new task..."/> 
				<button className="adder" onClick={this.props.btnfcn}>AddToList</button>

					{this.props.arr.map((task,i) => 
													<Task key={task+i} text = {task}/>										
						)}

				</div>
				
            </div>
			);

	}

}