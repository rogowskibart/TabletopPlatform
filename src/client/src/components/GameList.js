import React from 'react';

class GameList extends React.Component {
  render() {
    const games = this.props.games.map((game) => {
      return (
        <div key={game.id} className="ui card">
          <div className="content">
            <div class="header">{game.title}</div>
            <div className="meta">{game.publisher.name}</div>
          </div>
          <div className="extra content">
            <span className="left floated">{game.minAge}+</span>
            <span className="right floated">
              {game.minPlayers}-{game.maxPlayers} players
            </span>
          </div>
        </div>
      );
    });

    return (
      <div>
        <div>Found {this.props.games.length} games</div>
        <div className="ui cards">{games}</div>
      </div>
    );
  }
}

export default GameList;
