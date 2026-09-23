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

public class StringUtils_stripAll_1400325423304 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term37784;

    public StringUtils_stripAll_1400325423304() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term37784 = (Object[]) newArray("java.lang.String", 128);
        setElement(term37784, 0, " ");
        setElement(term37784, 1, "");
        setElement(term37784, 2, " ");
        setElement(term37784, 3, " ");
        setElement(term37784, 4, " ");
        setElement(term37784, 5, " ");
        setElement(term37784, 6, " ");
        setElement(term37784, 7, " ");
        setElement(term37784, 8, " ");
        setElement(term37784, 9, " ");
        setElement(term37784, 10, " ");
        setElement(term37784, 11, " ");
        setElement(term37784, 12, " ");
        setElement(term37784, 13, " ");
        setElement(term37784, 14, " ");
        setElement(term37784, 15, " ");
        setElement(term37784, 16, " ");
        setElement(term37784, 17, " ");
        setElement(term37784, 18, " ");
        setElement(term37784, 19, " ");
        setElement(term37784, 20, " ");
        setElement(term37784, 21, " ");
        setElement(term37784, 22, " ");
        setElement(term37784, 23, " ");
        setElement(term37784, 24, " ");
        setElement(term37784, 25, " ");
        setElement(term37784, 26, " ");
        setElement(term37784, 27, " ");
        setElement(term37784, 28, " ");
        setElement(term37784, 29, " ");
        setElement(term37784, 30, " ");
        setElement(term37784, 31, " ");
        setElement(term37784, 32, " ");
        setElement(term37784, 33, " ");
        setElement(term37784, 34, " ");
        setElement(term37784, 35, " ");
        setElement(term37784, 36, " ");
        setElement(term37784, 37, " ");
        setElement(term37784, 38, " ");
        setElement(term37784, 39, " ");
        setElement(term37784, 40, " ");
        setElement(term37784, 41, " ");
        setElement(term37784, 42, " ");
        setElement(term37784, 43, " ");
        setElement(term37784, 44, " ");
        setElement(term37784, 45, " ");
        setElement(term37784, 46, " ");
        setElement(term37784, 47, " ");
        setElement(term37784, 48, " ");
        setElement(term37784, 49, " ");
        setElement(term37784, 50, " ");
        setElement(term37784, 51, " ");
        setElement(term37784, 52, " ");
        setElement(term37784, 53, " ");
        setElement(term37784, 54, " ");
        setElement(term37784, 55, " ");
        setElement(term37784, 56, " ");
        setElement(term37784, 57, " ");
        setElement(term37784, 58, " ");
        setElement(term37784, 59, " ");
        setElement(term37784, 60, " ");
        setElement(term37784, 61, " ");
        setElement(term37784, 62, " ");
        setElement(term37784, 63, " ");
        setElement(term37784, 64, " ");
        setElement(term37784, 65, " ");
        setElement(term37784, 66, " ");
        setElement(term37784, 67, " ");
        setElement(term37784, 68, " ");
        setElement(term37784, 69, " ");
        setElement(term37784, 70, " ");
        setElement(term37784, 71, " ");
        setElement(term37784, 72, " ");
        setElement(term37784, 73, " ");
        setElement(term37784, 74, " ");
        setElement(term37784, 75, " ");
        setElement(term37784, 76, " ");
        setElement(term37784, 77, " ");
        setElement(term37784, 78, " ");
        setElement(term37784, 79, " ");
        setElement(term37784, 80, " ");
        setElement(term37784, 81, " ");
        setElement(term37784, 82, " ");
        setElement(term37784, 83, " ");
        setElement(term37784, 84, " ");
        setElement(term37784, 85, " ");
        setElement(term37784, 86, " ");
        setElement(term37784, 87, " ");
        setElement(term37784, 88, " ");
        setElement(term37784, 89, " ");
        setElement(term37784, 90, " ");
        setElement(term37784, 91, " ");
        setElement(term37784, 92, " ");
        setElement(term37784, 93, " ");
        setElement(term37784, 94, " ");
        setElement(term37784, 95, " ");
        setElement(term37784, 96, " ");
        setElement(term37784, 97, " ");
        setElement(term37784, 98, " ");
        setElement(term37784, 99, " ");
        setElement(term37784, 100, " ");
        setElement(term37784, 101, " ");
        setElement(term37784, 102, " ");
        setElement(term37784, 103, " ");
        setElement(term37784, 104, " ");
        setElement(term37784, 105, " ");
        setElement(term37784, 106, " ");
        setElement(term37784, 107, " ");
        setElement(term37784, 108, " ");
        setElement(term37784, 109, " ");
        setElement(term37784, 110, " ");
        setElement(term37784, 111, " ");
        setElement(term37784, 112, " ");
        setElement(term37784, 113, " ");
        setElement(term37784, 114, " ");
        setElement(term37784, 115, " ");
        setElement(term37784, 116, " ");
        setElement(term37784, 117, " ");
        setElement(term37784, 118, " ");
        setElement(term37784, 119, " ");
        setElement(term37784, 120, " ");
        setElement(term37784, 121, " ");
        setElement(term37784, 122, " ");
        setElement(term37784, 123, " ");
        setElement(term37784, 124, " ");
        setElement(term37784, 125, " ");
        setElement(term37784, 126, " ");
        setElement(term37784, 127, " ");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang3.StringUtils");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(Class.forName("java.lang.String"), 0).getClass();
        Object[] args = new Object[1];
        args[0] = term37784;
        callMethod(klass, "stripAll", argTypes, null, args);
    }

};


