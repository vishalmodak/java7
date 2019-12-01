package com.foo;

import java.util.Locale;

public class Test {

    public static void main(String[] args) {
        Locale english = Locale.forLanguageTag("en-US");
        System.out.println(english.getDisplayLanguage());
        
        Locale simplifiedChinese = new Locale("zh", "cn");
        System.out.println(simplifiedChinese.getDisplayCountry()); //Chinese
        
        Locale traditionalChinese = Locale.forLanguageTag("zh-TW");
        System.out.println(traditionalChinese.getDisplayCountry()); //Chinese
        
//        System.out.println(LocaleUtils.toLocale("zh_CN").getDisplayLanguage()); //Chinese
    }
}

