package org;

import java.io.UnsupportedEncodingException;

public class CheckStringProject {
	
	public static boolean CheckStringPattern(final String str){
		if (str.length() >= 20 ) {
			for (int i = str.length() - 20, j = 1; i < str.length(); i++, j++) {
				if ((j == 1) || (j == 6) || (j == 9) || (j == 12) || (j == 15) || (j == 18)){
					if (str.charAt(i) != '_') {
						return false;
					}
				} else {
					switch (str.charAt(i)) {
					  case '0': 
					  case '1': 
					  case '2':
					  case '3':
					  case '4':
					  case '5':
					  case '6': 
					  case '7': 
					  case '8':
					  case '9':
					    break;
					  default: return false;
					}
				}								
			}
			return true;			
		}
		return false;
	}

	public static void main(String[] args) {
		System.out.println(CheckStringPattern("Fihthrthrthskars_2016_10_24_10_41_58"));
		System.out.println(CheckStringPattern("Fiskars_20_6_10_24_10_41_58"));
		
		System.out.println("Part #2");
		
				
		try {
			String srcStr = ":home:admin:окко номер_один азс.xls";
			String tgtStrEnc = java.net.URLEncoder.encode(srcStr.replace(' ', '*'), "UTF-8").replace('*', ' ');
			String tgtStrDec = java.net.URLDecoder.decode(tgtStrEnc, "UTF-8");
		    System.out.println("Encoded: " + tgtStrEnc);
		    System.out.println("Decoded: " + tgtStrDec);
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();		
		}
	}
}

