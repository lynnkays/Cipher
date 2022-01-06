public class Cipher {
	private int key;

	public Cipher(int k) {
		key = k;
	}

	public String encrypt(String message) {
		StringBuilder sb = new StringBuilder();
		
		for (int i = 0; i < message.length(); i++){
			char ch = message.charAt(i);
			if (ch != ' '){
				int asciiValue = (int)ch;
				int add = asciiValue + key;
				int finalAscii = ((add - 97)%26) + 97;
				String finalL = String.valueOf(Character.toChars(finalAscii));
				sb.append(finalL);
			}	
		}
		return sb.toString();
	} 

	public String decrypt(String message) {
			StringBuilder sb = new StringBuilder();

			for (int i = 0; i < message.length(); i++){
				char ch = message.charAt(i);

				if (ch != ' '){
					int asciiValue = (int)ch;
					int subtract = asciiValue - key;
					int finalAscii = ((subtract - 97)%26) + 97;
					String finalL = String.valueOf(Character.toChars(finalAscii));
					sb.append(finalL);
				}	
			}
		return sb.toString();
	}
}