/*******************************************************************
* Lab9.java
* <Kaylynn Diaz-Schott>
*
*<Encrypts and Decrypts a message which the user inputs>
*******************************************************************/
public class Main {
	public static void main (String[] args){
		// Creates the view object
		View mainV = new View();
		
		// Get key value from View
		int keyValue = mainV.getKey();
		
		// Creates Cipher object
		Cipher cipher = new Cipher(keyValue);
		
		// Get message from View
		String message = mainV.getMessage();
		
		// Encrypt the message and display the result 
		StringBuilder sbEncrypt = new StringBuilder();
		String encryptedM = cipher.encrypt(message);
		sbEncrypt.append("Encrypted: ");
		sbEncrypt.append(encryptedM);
		
		mainV.displayResult(sbEncrypt.toString());
		
	 // Decrypt the encrypted message and display the result 
		StringBuilder sbDecrypt = new StringBuilder();
		String decryptedM = cipher.decrypt(encryptedM);
		sbDecrypt.append("Decrypted: ");
		sbDecrypt.append(decryptedM);
		
		mainV.displayResult(sbDecrypt.toString());
	}
}