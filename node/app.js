const express = require('express');
const expressLayouts = require('express-ejs-layouts');

const app = express();

app.use(expressLayouts);
app.set('view engine', 'ejs');

// Express body parser
app.use(express.urlencoded({ extended: true }));


// Routes staticas
app.use('/files',express.static('./public/files'));
// Routes archivos
app.use('/', require('./routes/index.js'));






// hostname
//const hostname = '167.86.109.78';
const hostname = 'localhost';
var port = 5000;


app.listen(port, hostname,() => {
  console.log(`Server running at http://${hostname}:${port}/`);
});

