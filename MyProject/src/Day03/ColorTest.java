package Day03;

import MyUtil.Colors; // Colors 클래스 import

public class ColorTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(Colors.RED + "Color Test" + Colors.END);
		Colors.p("ColorTest");
		
		// basic 8 color
		for(int color=40; color<48; color++) {
			// "\033[30m";
			System.out.print("\033[" + color + "m" + "   " + Colors.END);
		}
		
		System.out.println();
		
		// extended 256 color
		for(int color=0; color<256; color++) {
			System.out.print("\033[48;5;" + color + "m" + " ");
		}
		
		System.out.println(Colors.END);
		
		// Ture Color
		String[] str = {"", "", "", ""};
		for(int color=128; color<256; color++) {
			str[0] += "\033[48;2;" + color + ";0;0" + "m" + " ";
			str[1] += "\033[48;2;" + "0;" + color + ";0" + "m" + " ";
			str[2] += "\033[48;2;" + "0;0;" + color + "m" + " ";
			str[3] += "\033[48;2;" + color + ";" + color + ";" + color + "m" + " ";
		}
		System.out.println(str[0]);
		System.out.println(str[1]);
		System.out.println(str[2]);
		System.out.println(str[3]);		
	}
}