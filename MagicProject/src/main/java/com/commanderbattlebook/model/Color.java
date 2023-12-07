package com.commanderbattlebook.model;

public enum Color {

	W, U, B, R, G, WU, WB, WR, WG, UB, UR, UG, BR, BG, RG, WUB, WUR, WUG, WBR, WBG, WRG, UBR, UBG, URG, BRG, WUBR, WUBG,
	WURG, WBRG, UBRG, WUBRG, Colorless;

	public static Color convertStringToColor(String inp) {
		Color newColor = null;
		for (Color color : Color.values()) {
			if (color.toString().equalsIgnoreCase(inp)) {
				newColor = color;
				break;
			}
		}
		return newColor;
	}

}
