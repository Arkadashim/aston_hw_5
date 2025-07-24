package Proxy;

public class ProxyExample {
    public static void process() {
        FileAccess adminAccess = new ProxyFileAccess("admin");
        FileAccess userAccess = new ProxyFileAccess("user");

        adminAccess.readFile("document.txt");
        userAccess.readFile("document.txt");
    }
}
