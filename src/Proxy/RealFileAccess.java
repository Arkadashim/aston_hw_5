package Proxy;

class RealFileAccess implements FileAccess {
    public void readFile(String fileName) {
        System.out.println("Чтение файла: " + fileName);
    }
}