package com.sms.cipher;

public class Caeser {
	

	public String encrypt(String inputText) {
		String alphabet[] = { "a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p","q", "r", "s", "t", "u", "v", "w", "x", "y", "z" };
		int key = 1;
			
		inputText.toLowerCase();
		inputText = inputText.replace(" ","_");
		System.out.println(inputText);
		String inputArr[] = inputText.split("");
		String outputArr = "";
		
		for (String demo : inputArr)
		{
			
			int index = 0;
			for (index = 0; index < alphabet.length; index++)
			{
				
				if (alphabet[index].equals(demo)) 
				{
					break;
				}
			}

			if(index == alphabet.length)
			{
				if(demo.equals("_"))
				{
					outputArr = outputArr + " ";
				}
				else
				{
					int value = Integer.parseInt(demo);
				
					value = (value + key) % 10;
					outputArr = outputArr + value;
				}
				
			}
			else
			{
				int result = (index + key) % 26;

				outputArr = outputArr + alphabet[result];
			}
			
			
		}

		
		System.out.println("encryption : "+outputArr+"\n");
		
		return outputArr;
	}
	
	public String dencrypt(String inputText) {
		String alphabet[] = { "a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p",
				"q", "r", "s", "t", "u", "v", "w", "x", "y", "z" };
		int key = 1;
		
		inputText.toLowerCase();
		inputText = inputText.replace(" ","_");
		String inputArr[] = inputText.split("");
		
		String outputArr = "";
		
		for (String demo : inputArr) {

			int index = 0;
			for (index = 0; index < alphabet.length; index++)
			{

				if (alphabet[index].contentEquals(demo)) 
				{
					break;
				}
			}

			if(index == alphabet.length)
			{
				if(demo.equals("_"))
				{
					outputArr = outputArr + " ";
				}
				else
				{
					int value = Integer.parseInt(demo);
					value = (value - key) % 10;
					if(value < 0)
					{
						value = 10+value;
					}
					outputArr = outputArr + value;
				}
				
			}
			else
			{
					int result = (index - key) % 26;
					if(result < 0)
					{
						result = 26 + result;
					}
						
					outputArr = outputArr + alphabet[result];
			}
			

		}

		
			System.out.println("decryption :"+outputArr);
			return outputArr;
		
		
	}
}
