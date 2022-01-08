import React from 'react';
import axios from 'axios';

class GameList extends React.Component {
  constructor() {
    axios.get('http://localhost:8080/api/v1/games', {});
  }

  render() {
    return <div>GameList</div>;
  }
}

export default GameList;
