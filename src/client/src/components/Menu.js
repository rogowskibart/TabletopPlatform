import React from 'react';
import { NavLink } from 'react-router-dom';

const Menu = (props) => {
  console.log(props.location.pathname);
  return (
    <div className="ui secondary pointing menu">
      <NavLink
        exact
        to="/"
        className={(isActive) => (isActive ? 'active ' : '') + 'item'}
      >
        Home
      </NavLink>
      <NavLink
        to="/games"
        className={(isActive) => (isActive ? 'active ' : '') + 'item'}
      >
        Games
      </NavLink>

      <div className="right menu">
        <NavLink
          to="/login"
          className={(isActive) => (isActive ? 'active ' : '') + 'item'}
        >
          Log in
        </NavLink>
      </div>
    </div>
  );
};

export default Menu;
