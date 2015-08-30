#!/usr/bin/env node

//
// See https://github.com/attm2x/m2x-nodejs/blob/master/README.md#example-usage
// for instructions
//

var config = require("./config");
var M2X = require("m2x");
var m2xClient = new M2X(config.api_key);

var postTemp = function(temp) {
    var at = new Date().toISOString();
    var value = { timestamp: at, value: temp };

    m2xClient.devices.postValues(config.device, "temperature", [value], function(result) {
        console.log('value posted');
        if (result.isError()) {
            console.log('received error', result.error());
        }
    });
};

var net = require('net');

var server = net.createServer(function(socket) {
    socket.on('data', function(data) {
        var temp = data.readFloatLE(0).toFixed(4);
        console.info('temp', temp);
        postTemp(temp);
    });

    socket.on('close', function(data) {
        console.info('connection closed');
    });
});

server.listen(1234, '0.0.0.0');