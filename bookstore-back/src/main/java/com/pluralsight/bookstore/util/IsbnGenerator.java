/**
 * Package:com.pluralsight.bookstore.util
 * Classname:IsbnGenerator
 *
 * @Author:Paul Rocca
 * @Since:08/07/2022 at 16:11
 */

package com.pluralsight.bookstore.util;

import java.util.Random;

public class IsbnGenerator implements NumberGenerator {
    @Override
    public String generateNumber() {
        return "13-5677-" + Math.abs(new Random().nextInt());
    }
}
