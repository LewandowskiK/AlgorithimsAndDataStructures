package week2.rowcolumntransposition;

public class Encryptor {
    public static String encryptRowColumn(String plaintext, int numColumns){
        int numRows;
        StringBuilder ciphertext = new StringBuilder();
        StringBuilder plaintextNoSpaces = new StringBuilder();

        for(int i = 0; i < plaintext.length(); i++){
            if(plaintext.charAt(i) != ' '){
                plaintextNoSpaces.append(plaintext.charAt(i));
            }
        }

        //padding the text with X's since it doesnt fit R*C exactly
        if(plaintextNoSpaces.length() % numColumns != 0){
            numRows = 1 + plaintextNoSpaces.length()/numColumns;
            for(int i = plaintextNoSpaces.length(); i < numRows * numColumns; i++){
                plaintextNoSpaces.append("X");
            }
        }
        else{
            //no padding needed
            numRows = plaintextNoSpaces.length()/numColumns;
        }

        for (int col = 0; col < numColumns; col++){
            int index = col;

            for(int row = 0; row < numRows; row++){
                ciphertext.append(plaintextNoSpaces.toString().toUpperCase().charAt(index));
                index += numColumns;
            }
        }

        return ciphertext.toString();
    }

    public static String decryptRowColumn(String cipherText, int numColumns){
        StringBuilder plaintext = new StringBuilder();

        int numRows = cipherText.length()/numColumns;


        for(int row = 0; row < numRows; row++){
            int index = row;

            for(int col = 0; col < numColumns; col++){
                plaintext.append(cipherText.charAt(index));
                index += numRows;
            }
        }

        return plaintext.toString();
    }
}