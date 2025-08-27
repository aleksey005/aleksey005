<?php
use PHPUnit\Framework\TestCase;

require_once __DIR__ . '/hello.php';

class HelloTest extends TestCase
{
    /**
     * Ensure main prints 'Hello World!'.
     */
    public function testMainPrintsHelloWorld(): void
    {
        $this->expectOutputString('Hello World!');
        main();
    }
}
