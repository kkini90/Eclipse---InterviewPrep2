package com.usc.karthik;

import java.util.ArrayList;
import java.util.Iterator;

public class Parenthesis {
	public static void addParen(ArrayList<String> list, int leftRem,
			int rightRem, char[] str, int count) {
		
		if (leftRem < 0 || rightRem < leftRem)
			return; // invalid state

		if (leftRem == 0 && rightRem == 0) { /* no more parens left */
			String s = String.copyValueOf(str);
			list.add(s);
		} else {
			/* Add left paren, if there are any left parens remaining. */
			if (leftRem > 0) {
				str[count] = '(';
				addParen(list, leftRem - 1, rightRem, str, count + 1);
			}

			/* Add right paren., if expression is valid */
			if (rightRem > leftRem) {
				str[count] = ')';
				addParen(list, leftRem, rightRem - 1, str, count + 1);
			}
		}
	}

	public static void generateParens(int count) {
		char[] str = new char[count * 2];
		ArrayList<String> list = new ArrayList<String>();
		addParen(list, count, count, str, 0);
		
		Iterator its  = list.iterator();
		while(its.hasNext()){
			Object obj = its.next();
			System.out.println(obj);		
		}
	}

	public static void main(String[] args) {
		generateParens(3);
	}
}
