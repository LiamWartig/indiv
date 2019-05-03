import React, { Component } from 'react';
import Parent from './Parent';
import './page.css'


export default class App extends Component {

  render() {

    return (

      <div className="App">
        <div class="sidenav">
          <a href="#">List 1</a>
          <a href="#">Link</a>
          <a href="#">Link</a>
        </div>
<div className="content">
        <Parent />
        </div>
      </div>

    );

  }

}