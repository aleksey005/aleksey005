<?php
/**
 * Simple program that prints 'Hello World!'.
 */
function main(): void {
    // Print Hello World! to stdout.
    echo "Hello World!";
}

if (php_sapi_name() === 'cli' && realpath($_SERVER['SCRIPT_FILENAME']) === __FILE__) {
    main();
}
