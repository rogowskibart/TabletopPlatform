import React from 'react';
import SearchBar from './SearchBar';
import GameScreen from './GameScreen';

class App extends React.Component {
  onSearchSubmit(term) {
    console.log(term);
  }

  render() {
    return (
      <div className="ui container" style={{ marginTop: '10px' }}>
        <SearchBar onSubmit={this.onSearchSubmit} />
        <GameScreen />
      </div>
    );
  }
}

export default App;
