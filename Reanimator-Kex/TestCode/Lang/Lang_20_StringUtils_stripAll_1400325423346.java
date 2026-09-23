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

public class StringUtils_stripAll_1400325423346 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term80582;

    public StringUtils_stripAll_1400325423346() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term80582 = (Object[]) newArray("java.lang.String", 128);
        setElement(term80582, 0, "                                                                                                                                                                                                                                                                ");
        setElement(term80582, 1, "                                ");
        setElement(term80582, 2, "                                                                \n                                                                ");
        setElement(term80582, 3, "");
        setElement(term80582, 4, "");
        setElement(term80582, 5, "");
        setElement(term80582, 6, "");
        setElement(term80582, 7, "");
        setElement(term80582, 8, "");
        setElement(term80582, 9, "");
        setElement(term80582, 10, "");
        setElement(term80582, 11, "");
        setElement(term80582, 12, "");
        setElement(term80582, 13, "");
        setElement(term80582, 14, "");
        setElement(term80582, 15, "");
        setElement(term80582, 16, "");
        setElement(term80582, 17, "");
        setElement(term80582, 18, "");
        setElement(term80582, 19, "");
        setElement(term80582, 20, "");
        setElement(term80582, 21, "");
        setElement(term80582, 22, "");
        setElement(term80582, 23, "");
        setElement(term80582, 24, "");
        setElement(term80582, 25, "");
        setElement(term80582, 26, "");
        setElement(term80582, 27, "");
        setElement(term80582, 28, "");
        setElement(term80582, 29, "");
        setElement(term80582, 30, "");
        setElement(term80582, 31, "");
        setElement(term80582, 32, "");
        setElement(term80582, 33, "");
        setElement(term80582, 34, "");
        setElement(term80582, 35, "");
        setElement(term80582, 36, "");
        setElement(term80582, 37, "");
        setElement(term80582, 38, "");
        setElement(term80582, 39, "");
        setElement(term80582, 40, "");
        setElement(term80582, 41, "");
        setElement(term80582, 42, "");
        setElement(term80582, 43, "");
        setElement(term80582, 44, "");
        setElement(term80582, 45, "");
        setElement(term80582, 46, "");
        setElement(term80582, 47, "");
        setElement(term80582, 48, "");
        setElement(term80582, 49, "");
        setElement(term80582, 50, "");
        setElement(term80582, 51, "");
        setElement(term80582, 52, "");
        setElement(term80582, 53, "");
        setElement(term80582, 54, "");
        setElement(term80582, 55, "");
        setElement(term80582, 56, "");
        setElement(term80582, 57, "");
        setElement(term80582, 58, "");
        setElement(term80582, 59, "");
        setElement(term80582, 60, "");
        setElement(term80582, 61, "");
        setElement(term80582, 62, "");
        setElement(term80582, 63, "");
        setElement(term80582, 64, "");
        setElement(term80582, 65, "");
        setElement(term80582, 66, "");
        setElement(term80582, 67, "");
        setElement(term80582, 68, "");
        setElement(term80582, 69, "");
        setElement(term80582, 70, "");
        setElement(term80582, 71, "");
        setElement(term80582, 72, "");
        setElement(term80582, 73, "");
        setElement(term80582, 74, "");
        setElement(term80582, 75, "");
        setElement(term80582, 76, "");
        setElement(term80582, 77, "");
        setElement(term80582, 78, "");
        setElement(term80582, 79, "");
        setElement(term80582, 80, "");
        setElement(term80582, 81, "");
        setElement(term80582, 82, "");
        setElement(term80582, 83, "");
        setElement(term80582, 84, "");
        setElement(term80582, 85, "");
        setElement(term80582, 86, "");
        setElement(term80582, 87, "");
        setElement(term80582, 88, "");
        setElement(term80582, 89, "");
        setElement(term80582, 90, "");
        setElement(term80582, 91, "");
        setElement(term80582, 92, "");
        setElement(term80582, 93, "");
        setElement(term80582, 94, "");
        setElement(term80582, 95, "");
        setElement(term80582, 96, "");
        setElement(term80582, 97, "");
        setElement(term80582, 98, "");
        setElement(term80582, 99, "");
        setElement(term80582, 100, "");
        setElement(term80582, 101, "");
        setElement(term80582, 102, "");
        setElement(term80582, 103, "");
        setElement(term80582, 104, "");
        setElement(term80582, 105, "");
        setElement(term80582, 106, "");
        setElement(term80582, 107, "");
        setElement(term80582, 108, "");
        setElement(term80582, 109, "");
        setElement(term80582, 110, "");
        setElement(term80582, 111, "");
        setElement(term80582, 112, "");
        setElement(term80582, 113, "");
        setElement(term80582, 114, "");
        setElement(term80582, 115, "");
        setElement(term80582, 116, "");
        setElement(term80582, 117, "");
        setElement(term80582, 118, "");
        setElement(term80582, 119, "");
        setElement(term80582, 120, "");
        setElement(term80582, 121, "");
        setElement(term80582, 122, "");
        setElement(term80582, 123, "");
        setElement(term80582, 124, "");
        setElement(term80582, 125, "");
        setElement(term80582, 126, "");
        setElement(term80582, 127, "");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang3.StringUtils");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(Class.forName("java.lang.String"), 0).getClass();
        Object[] args = new Object[1];
        args[0] = term80582;
        callMethod(klass, "stripAll", argTypes, null, args);
    }

};


