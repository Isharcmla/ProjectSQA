package org.apache.commons.lang3;

import java.lang.Throwable;
import java.lang.IllegalStateException;
import org.junit.Test;
import org.junit.Rule;
import org.junit.rules.Timeout;
import java.util.concurrent.TimeUnit;
import org.junit.Before;
import java.lang.Class;
import java.lang.reflect.Method;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.stream.Stream;
import java.util.stream.Collectors;
import static org.apache.commons.lang3.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class StringUtils_stripAll_1400325423326 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term122732;

    public StringUtils_stripAll_1400325423326() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term122732 = (Object[]) newArray("java.lang.String", 128);
        setElement(term122732, 0, "                                                                                                                                                                                                                                                                ");
        setElement(term122732, 1, "                                ");
        setElement(term122732, 2, "                                                                \n                                                                ");
        setElement(term122732, 3, "");
        setElement(term122732, 4, "");
        setElement(term122732, 5, "");
        setElement(term122732, 6, "");
        setElement(term122732, 7, "");
        setElement(term122732, 8, "");
        setElement(term122732, 9, "");
        setElement(term122732, 10, "");
        setElement(term122732, 11, "");
        setElement(term122732, 12, "");
        setElement(term122732, 13, "");
        setElement(term122732, 14, "");
        setElement(term122732, 15, "");
        setElement(term122732, 16, "");
        setElement(term122732, 17, "");
        setElement(term122732, 18, "");
        setElement(term122732, 19, "");
        setElement(term122732, 20, "");
        setElement(term122732, 21, "");
        setElement(term122732, 22, "");
        setElement(term122732, 23, "");
        setElement(term122732, 24, "");
        setElement(term122732, 25, "");
        setElement(term122732, 26, "");
        setElement(term122732, 27, "");
        setElement(term122732, 28, "");
        setElement(term122732, 29, "");
        setElement(term122732, 30, "");
        setElement(term122732, 31, "");
        setElement(term122732, 32, "");
        setElement(term122732, 33, "");
        setElement(term122732, 34, "");
        setElement(term122732, 35, "");
        setElement(term122732, 36, "");
        setElement(term122732, 37, "");
        setElement(term122732, 38, "");
        setElement(term122732, 39, "");
        setElement(term122732, 40, "");
        setElement(term122732, 41, "");
        setElement(term122732, 42, "");
        setElement(term122732, 43, "");
        setElement(term122732, 44, "");
        setElement(term122732, 45, "");
        setElement(term122732, 46, "");
        setElement(term122732, 47, "");
        setElement(term122732, 48, "");
        setElement(term122732, 49, "");
        setElement(term122732, 50, "");
        setElement(term122732, 51, "");
        setElement(term122732, 52, "");
        setElement(term122732, 53, "");
        setElement(term122732, 54, "");
        setElement(term122732, 55, "");
        setElement(term122732, 56, "");
        setElement(term122732, 57, "");
        setElement(term122732, 58, "");
        setElement(term122732, 59, "");
        setElement(term122732, 60, "");
        setElement(term122732, 61, "");
        setElement(term122732, 62, "");
        setElement(term122732, 63, "");
        setElement(term122732, 64, "");
        setElement(term122732, 65, "");
        setElement(term122732, 66, "");
        setElement(term122732, 67, "");
        setElement(term122732, 68, "");
        setElement(term122732, 69, "");
        setElement(term122732, 70, "");
        setElement(term122732, 71, "");
        setElement(term122732, 72, "");
        setElement(term122732, 73, "");
        setElement(term122732, 74, "");
        setElement(term122732, 75, "");
        setElement(term122732, 76, "");
        setElement(term122732, 77, "");
        setElement(term122732, 78, "");
        setElement(term122732, 79, "");
        setElement(term122732, 80, "");
        setElement(term122732, 81, "");
        setElement(term122732, 82, "");
        setElement(term122732, 83, "");
        setElement(term122732, 84, "");
        setElement(term122732, 85, "");
        setElement(term122732, 86, "");
        setElement(term122732, 87, "");
        setElement(term122732, 88, "");
        setElement(term122732, 89, "");
        setElement(term122732, 90, "");
        setElement(term122732, 91, "");
        setElement(term122732, 92, "");
        setElement(term122732, 93, "");
        setElement(term122732, 94, "");
        setElement(term122732, 95, "");
        setElement(term122732, 96, "");
        setElement(term122732, 97, "");
        setElement(term122732, 98, "");
        setElement(term122732, 99, "");
        setElement(term122732, 100, "");
        setElement(term122732, 101, "");
        setElement(term122732, 102, "");
        setElement(term122732, 103, "");
        setElement(term122732, 104, "");
        setElement(term122732, 105, "");
        setElement(term122732, 106, "");
        setElement(term122732, 107, "");
        setElement(term122732, 108, "");
        setElement(term122732, 109, "");
        setElement(term122732, 110, "");
        setElement(term122732, 111, "");
        setElement(term122732, 112, "");
        setElement(term122732, 113, "");
        setElement(term122732, 114, "");
        setElement(term122732, 115, "");
        setElement(term122732, 116, "");
        setElement(term122732, 117, "");
        setElement(term122732, 118, "");
        setElement(term122732, 119, "");
        setElement(term122732, 120, "");
        setElement(term122732, 121, "");
        setElement(term122732, 122, "");
        setElement(term122732, 123, "");
        setElement(term122732, 124, "");
        setElement(term122732, 125, "");
        setElement(term122732, 126, "");
        setElement(term122732, 127, "");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang3.StringUtils");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(Class.forName("java.lang.String"), 0).getClass();
        Object[] args = new Object[1];
        args[0] = term122732;
        callMethod(klass, "stripAll", argTypes, null, args);
    }

};


