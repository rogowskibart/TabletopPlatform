import React from 'react';
import backend from '../api/backend';
import GameList from './GameList';

class GameScreen extends React.Component {
  state = { gameList: [] };

  componentDidMount = async () => {
    const response = await backend.get('/games/', {});

    this.setState({ gameList: response.data.games });
  };

  render() {
    return (
      <div>
        <GameList games={this.state.gameList} />
      </div>
    );
  }
}

export default GameScreen;
