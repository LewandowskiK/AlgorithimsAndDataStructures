package week2.rowcolumntransposition;

public class Encryptor {
    public static String encryptRowColumn(String plaintext, int numColumns){
        int numRows;
        String ciphertext = "", plaintextNoSpaces = "";

        for(int i = 0; i < plaintext.length(); i++){
            if(plaintext.charAt(i) != ' '){
                plaintextNoSpaces += plaintext.charAt(i);
            }
        }

        if(plaintextNoSpaces.length() % numColumns != 0){
            numRows = 1 + plaintextNoSpaces.length()/numColumns;
            for(int i = plaintextNoSpaces.length(); i < numRows * numColumns; i++){
                plaintextNoSpaces += "X";
            }
        }
        else{
            numRows = plaintextNoSpaces.length()/numColumns;
        }

        for (int col = 0; col < numColumns; col++){
            int index = col;

            for(int row = 0; row < numRows; row++){
                ciphertext += plaintextNoSpaces.toUpperCase().charAt(index);
                index += numColumns;
            }

        }

        return ciphertext;
    }

    public static String decryptRowColumn(String cipherText, int numColumns){
        String plaintext = "";

        int numRows = cipherText.length()/numColumns;


        for(int row = 0; row < numRows; row++){
            int index = row;

            for(int col = 0; col < numColumns; col++){
                plaintext += cipherText.charAt(index);
                index += numRows;
            }
        }

        return plaintext;
    }
}