"use strict";

const { main } = require("./index");

test("prints Hello World!", () => {
  console.log = jest.fn();
  main();
  expect(console.log).toHaveBeenCalledWith("Hello World!");
});

