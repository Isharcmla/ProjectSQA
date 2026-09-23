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

public class StringUtils_stripAll_1400325423303 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term37652;

    public StringUtils_stripAll_1400325423303() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term37652 = (Object[]) newArray("java.lang.String", 64);
        setElement(term37652, 0, " ");
        setElement(term37652, 2, " ");
        setElement(term37652, 3, " ");
        setElement(term37652, 4, " ");
        setElement(term37652, 5, " ");
        setElement(term37652, 6, " ");
        setElement(term37652, 7, " ");
        setElement(term37652, 8, " ");
        setElement(term37652, 9, " ");
        setElement(term37652, 10, " ");
        setElement(term37652, 11, " ");
        setElement(term37652, 12, " ");
        setElement(term37652, 13, " ");
        setElement(term37652, 14, " ");
        setElement(term37652, 15, " ");
        setElement(term37652, 16, " ");
        setElement(term37652, 17, " ");
        setElement(term37652, 18, " ");
        setElement(term37652, 19, " ");
        setElement(term37652, 20, " ");
        setElement(term37652, 21, " ");
        setElement(term37652, 22, " ");
        setElement(term37652, 23, " ");
        setElement(term37652, 24, " ");
        setElement(term37652, 25, " ");
        setElement(term37652, 26, " ");
        setElement(term37652, 27, " ");
        setElement(term37652, 28, " ");
        setElement(term37652, 29, " ");
        setElement(term37652, 30, " ");
        setElement(term37652, 31, " ");
        setElement(term37652, 32, " ");
        setElement(term37652, 33, " ");
        setElement(term37652, 34, " ");
        setElement(term37652, 35, " ");
        setElement(term37652, 36, " ");
        setElement(term37652, 37, " ");
        setElement(term37652, 38, " ");
        setElement(term37652, 39, " ");
        setElement(term37652, 40, " ");
        setElement(term37652, 41, " ");
        setElement(term37652, 42, " ");
        setElement(term37652, 43, " ");
        setElement(term37652, 44, " ");
        setElement(term37652, 45, " ");
        setElement(term37652, 46, " ");
        setElement(term37652, 47, " ");
        setElement(term37652, 48, " ");
        setElement(term37652, 49, " ");
        setElement(term37652, 50, " ");
        setElement(term37652, 51, " ");
        setElement(term37652, 52, " ");
        setElement(term37652, 53, " ");
        setElement(term37652, 54, " ");
        setElement(term37652, 55, " ");
        setElement(term37652, 56, " ");
        setElement(term37652, 57, " ");
        setElement(term37652, 58, " ");
        setElement(term37652, 59, " ");
        setElement(term37652, 60, " ");
        setElement(term37652, 61, " ");
        setElement(term37652, 62, " ");
        setElement(term37652, 63, " ");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang3.StringUtils");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(Class.forName("java.lang.String"), 0).getClass();
        Object[] args = new Object[1];
        args[0] = term37652;
        callMethod(klass, "stripAll", argTypes, null, args);
    }

};


