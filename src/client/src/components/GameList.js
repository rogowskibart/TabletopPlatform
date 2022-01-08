import React from 'react';
import axios from 'axios';

class GameList extends React.Component {
  state = { gameList: [] };

  onButtonClick = async () => {
    const response = await axios.get('http://localhost:8080/api/v1/games/', {
      headers: {
        'Access-Control-Allow-Origin': '*',
      },
    });

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
