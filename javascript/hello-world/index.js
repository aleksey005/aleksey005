"use strict";

/**
 * Print "Hello World!" to stdout.
 */
function main() {
  console.log("Hello World!");
}

if (require.main === module) {
  main();
}

module.exports = { main };

