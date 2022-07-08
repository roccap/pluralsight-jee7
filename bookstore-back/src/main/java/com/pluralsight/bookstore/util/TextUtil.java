/**
 * Package:com.pluralsight.bookstore.util
 * Classname:TextUtil
 *
 * @Author:Paul Rocca
 * @Since:08/07/2022 at 15:29
 */

package com.pluralsight.bookstore.util;

public class TextUtil {
    public String sanitize(String textToSanitise)
    {
        return textToSanitise.replaceAll("\\s+", " ");
    }
}
