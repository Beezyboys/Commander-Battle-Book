package com.commanderbattlebook.model;

public enum Colors {

	W, U, B, R, G, WU, WB, WR, WG, UB, UR, UG, BR, BG, RG, WUB, WUR, WUG, WBR, WBG, WRG, UBR, UBG, URG, BRG, WUBR, WUBG, WURG, WBRG, UBRG, WUBRG, Colorless; 
	public static Colors convertStringToColor(String inp) {
		Colors newColor = null;
		for(Colors color : Colors.values()) {
			if(color.toString().equalsIgnoreCase(inp)) {
				newColor = color;
				break;
			}
		}
		return newColor;
	}

}
