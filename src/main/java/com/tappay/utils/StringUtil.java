package com.tappay.utils;

import com.google.common.base.Strings;

public class StringUtil {

	public static boolean isEmpty(String str) {
		return Strings.isNullOrEmpty(str);
	}

	public static boolean isNotEmpty(String str) {
		return !Strings.isNullOrEmpty(str);
	}
}
