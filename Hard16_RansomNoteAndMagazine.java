package javaPraticalSession;
import java.util.*;
public class RansomNoteAndMagazine {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the RansomNote: ");
		String ransomeNote = input.nextLine();
		System.out.println("Enter the Magazine : ");
		String magazine = input.nextLine();
		
		int[] alphabet = new int[26];
		
		for(int i=0;i<magazine.length();i++) {
			alphabet[magazine.charAt(i)-'a']++;
		}
		for(int i=0;i<ransomeNote.length();i++) {
			if(--alphabet[ransomeNote.charAt(i)-'a']<0) {
				System.out.println("False");
				return;
			}
		}
		System.out.println("True");
		
	}

}
