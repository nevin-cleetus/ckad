var http = require("http");
var os = require('os');

const hostname = '0.0.0.0';
const port = '8080';

http.createServer(function (request, response) {

   var hostname = os.hostname();   
   response.writeHead(200, {'Content-Type': 'text/plain'});   
   response.end(`Hello from ${os.hostname()}\n`);
   
}).listen(port);

console.log('Server running at http://${hostname}:${port}/');
