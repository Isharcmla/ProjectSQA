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

public class StringUtils_stripAll_1400325423297 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term81135;

    public StringUtils_stripAll_1400325423297() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term81135 = (Object[]) newArray("java.lang.String", 128);
        setElement(term81135, 0, " ");
        setElement(term81135, 1, "");
        setElement(term81135, 2, " ");
        setElement(term81135, 3, " ");
        setElement(term81135, 4, " ");
        setElement(term81135, 5, " ");
        setElement(term81135, 6, " ");
        setElement(term81135, 7, " ");
        setElement(term81135, 8, " ");
        setElement(term81135, 9, " ");
        setElement(term81135, 10, " ");
        setElement(term81135, 11, " ");
        setElement(term81135, 12, " ");
        setElement(term81135, 13, " ");
        setElement(term81135, 14, " ");
        setElement(term81135, 15, " ");
        setElement(term81135, 16, " ");
        setElement(term81135, 17, " ");
        setElement(term81135, 18, " ");
        setElement(term81135, 19, " ");
        setElement(term81135, 20, " ");
        setElement(term81135, 21, " ");
        setElement(term81135, 22, " ");
        setElement(term81135, 23, " ");
        setElement(term81135, 24, " ");
        setElement(term81135, 25, " ");
        setElement(term81135, 26, " ");
        setElement(term81135, 27, " ");
        setElement(term81135, 28, " ");
        setElement(term81135, 29, " ");
        setElement(term81135, 30, " ");
        setElement(term81135, 31, " ");
        setElement(term81135, 32, " ");
        setElement(term81135, 33, " ");
        setElement(term81135, 34, " ");
        setElement(term81135, 35, " ");
        setElement(term81135, 36, " ");
        setElement(term81135, 37, " ");
        setElement(term81135, 38, " ");
        setElement(term81135, 39, " ");
        setElement(term81135, 40, " ");
        setElement(term81135, 41, " ");
        setElement(term81135, 42, " ");
        setElement(term81135, 43, " ");
        setElement(term81135, 44, " ");
        setElement(term81135, 45, " ");
        setElement(term81135, 46, " ");
        setElement(term81135, 47, " ");
        setElement(term81135, 48, " ");
        setElement(term81135, 49, " ");
        setElement(term81135, 50, " ");
        setElement(term81135, 51, " ");
        setElement(term81135, 52, " ");
        setElement(term81135, 53, " ");
        setElement(term81135, 54, " ");
        setElement(term81135, 55, " ");
        setElement(term81135, 56, " ");
        setElement(term81135, 57, " ");
        setElement(term81135, 58, " ");
        setElement(term81135, 59, " ");
        setElement(term81135, 60, " ");
        setElement(term81135, 61, " ");
        setElement(term81135, 62, " ");
        setElement(term81135, 63, " ");
        setElement(term81135, 64, " ");
        setElement(term81135, 65, " ");
        setElement(term81135, 66, " ");
        setElement(term81135, 67, " ");
        setElement(term81135, 68, " ");
        setElement(term81135, 69, " ");
        setElement(term81135, 70, " ");
        setElement(term81135, 71, " ");
        setElement(term81135, 72, " ");
        setElement(term81135, 73, " ");
        setElement(term81135, 74, " ");
        setElement(term81135, 75, " ");
        setElement(term81135, 76, " ");
        setElement(term81135, 77, " ");
        setElement(term81135, 78, " ");
        setElement(term81135, 79, " ");
        setElement(term81135, 80, " ");
        setElement(term81135, 81, " ");
        setElement(term81135, 82, " ");
        setElement(term81135, 83, " ");
        setElement(term81135, 84, " ");
        setElement(term81135, 85, " ");
        setElement(term81135, 86, " ");
        setElement(term81135, 87, " ");
        setElement(term81135, 88, " ");
        setElement(term81135, 89, " ");
        setElement(term81135, 90, " ");
        setElement(term81135, 91, " ");
        setElement(term81135, 92, " ");
        setElement(term81135, 93, " ");
        setElement(term81135, 94, " ");
        setElement(term81135, 95, " ");
        setElement(term81135, 96, " ");
        setElement(term81135, 97, " ");
        setElement(term81135, 98, " ");
        setElement(term81135, 99, " ");
        setElement(term81135, 100, " ");
        setElement(term81135, 101, " ");
        setElement(term81135, 102, " ");
        setElement(term81135, 103, " ");
        setElement(term81135, 104, " ");
        setElement(term81135, 105, " ");
        setElement(term81135, 106, " ");
        setElement(term81135, 107, " ");
        setElement(term81135, 108, " ");
        setElement(term81135, 109, " ");
        setElement(term81135, 110, " ");
        setElement(term81135, 111, " ");
        setElement(term81135, 112, " ");
        setElement(term81135, 113, " ");
        setElement(term81135, 114, " ");
        setElement(term81135, 115, " ");
        setElement(term81135, 116, " ");
        setElement(term81135, 117, " ");
        setElement(term81135, 118, " ");
        setElement(term81135, 119, " ");
        setElement(term81135, 120, " ");
        setElement(term81135, 121, " ");
        setElement(term81135, 122, " ");
        setElement(term81135, 123, " ");
        setElement(term81135, 124, " ");
        setElement(term81135, 125, " ");
        setElement(term81135, 126, " ");
        setElement(term81135, 127, " ");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang3.StringUtils");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(Class.forName("java.lang.String"), 0).getClass();
        Object[] args = new Object[1];
        args[0] = term81135;
        callMethod(klass, "stripAll", argTypes, null, args);
    }

};


