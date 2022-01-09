import React from 'react';
import backend from '../api/backend';

class GameList extends React.Component {
  render() {
    console.log(this.props.games[0]);
    return (
      <div>
        <div>Found {this.props.games.length} games</div>
      </div>
    );
  }
}

export default GameList;
