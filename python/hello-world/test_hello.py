"""Tests for hello-world example."""

from hello import main


def test_main_prints_hello_world(capsys):
    """Ensure main prints 'Hello World!'"""
    main()
    captured = capsys.readouterr()
    assert captured.out.strip() == "Hello World!"
