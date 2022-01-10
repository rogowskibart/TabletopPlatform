import React from 'react';
import SearchBar from './SearchBar';
import GameScreen from './GameScreen';
import { BrowserRouter, Route } from 'react-router-dom';
import Menu from './Menu';

class App extends React.Component {
  onSearchSubmit(term) {
    console.log(term);
  }

  render() {
    return (
      <div className="ui container" style={{ marginTop: '10px' }}>
        {/* <SearchBar onSubmit={this.onSearchSubmit} />
        <GameScreen /> */}
        <BrowserRouter>
          <div>
            <Route path="/" component={Menu} />
            <Route path="/games" component={GameScreen} />
          </div>
        </BrowserRouter>
      </div>
    );
  }
}

export default App;
