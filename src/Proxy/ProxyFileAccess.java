package Proxy;

class ProxyFileAccess implements FileAccess {
    private final RealFileAccess realFileAccess;
    private final String userRole;

    public ProxyFileAccess(String userRole) {
        this.userRole = userRole;
        this.realFileAccess = new RealFileAccess();
    }

    public void readFile(String fileName) {
        if (userRole.equals("admin")) {
            realFileAccess.readFile(fileName);
        } else {
            System.out.println("Доступ запрещен!");
        }
    }
}
