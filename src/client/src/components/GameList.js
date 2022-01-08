import React from 'react';
import backend from '../api/backend';

class GameList extends React.Component {
  state = { gameList: [] };

  onButtonClick = async () => {
    const response = await backend.get('/games/', {});

    this.setState({ gameList: response.data.games });
  };

  render() {
    return (
      <div>
        <button class="ui button" onClick={this.onButtonClick}>
          Click for games
        </button>
        <div>Found {this.state.gameList.length} games</div>
      </div>
    );
  }
}

export default GameList;
