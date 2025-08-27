package main

import (
	"io"
	"os"
	"testing"
)

func TestMainOutput(t *testing.T) {
	old := os.Stdout
	r, w, err := os.Pipe()
	if err != nil {
		t.Fatalf("Pipe: %v", err)
	}
	os.Stdout = w

	main()

	w.Close()
	out, err := io.ReadAll(r)
	os.Stdout = old
	if err != nil {
		t.Fatalf("ReadAll: %v", err)
	}
	expected := "Hello World!\n"
	if string(out) != expected {
		t.Errorf("expected %q, got %q", expected, string(out))
	}
}
