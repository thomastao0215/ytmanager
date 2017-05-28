import React from 'react';
import { Router, Route } from 'dva/router';
import IndexPage from './routes/IndexPage';
import OssPage from './routes/OssPage'

function RouterConfig({ history }) {
  return (
    <Router history={history}>
      <Route path="/" component={IndexPage} />
      <Route path="/oss" component={OssPage} />
    </Router>
  );
}

export default RouterConfig;
