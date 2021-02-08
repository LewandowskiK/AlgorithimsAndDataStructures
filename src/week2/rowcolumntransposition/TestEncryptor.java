package week2.rowcolumntransposition;

public class TestEncryptor {
    public static void main(String[] args) {
        System.out.println(Encryptor.encryptRowColumn("This is a secret message", 5));
        System.out.println(Encryptor.decryptRowColumn(Encryptor.encryptRowColumn("This is a secret message", 5),5));
        System.out.println(Encryptor.encryptRowColumn("potatoes", 3));
        System.out.println(Encryptor.decryptRowColumn(Encryptor.encryptRowColumn("potatoes", 3),3));
        System.out.println(Encryptor.encryptRowColumn("decryption", 4));
        System.out.println(Encryptor.decryptRowColumn(Encryptor.encryptRowColumn("decryption", 4),4));
    }
}
