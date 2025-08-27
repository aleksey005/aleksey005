use assert_cmd::Command;

#[test]
fn prints_hello_world() {
    let mut cmd = Command::cargo_bin("hello-world").unwrap();
    cmd.assert().stdout("Hello World!\n");
}

