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

public class StringUtils_stripAll_1400325423274 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term48304;

    public StringUtils_stripAll_1400325423274() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term48304 = (Object[]) newArray("java.lang.String", 64);
        setElement(term48304, 0, " ");
        setElement(term48304, 2, " ");
        setElement(term48304, 3, " ");
        setElement(term48304, 4, " ");
        setElement(term48304, 5, " ");
        setElement(term48304, 6, " ");
        setElement(term48304, 7, " ");
        setElement(term48304, 8, " ");
        setElement(term48304, 9, " ");
        setElement(term48304, 10, " ");
        setElement(term48304, 11, " ");
        setElement(term48304, 12, " ");
        setElement(term48304, 13, " ");
        setElement(term48304, 14, " ");
        setElement(term48304, 15, " ");
        setElement(term48304, 16, " ");
        setElement(term48304, 17, " ");
        setElement(term48304, 18, " ");
        setElement(term48304, 19, " ");
        setElement(term48304, 20, " ");
        setElement(term48304, 21, " ");
        setElement(term48304, 22, " ");
        setElement(term48304, 23, " ");
        setElement(term48304, 24, " ");
        setElement(term48304, 25, " ");
        setElement(term48304, 26, " ");
        setElement(term48304, 27, " ");
        setElement(term48304, 28, " ");
        setElement(term48304, 29, " ");
        setElement(term48304, 30, " ");
        setElement(term48304, 31, " ");
        setElement(term48304, 32, " ");
        setElement(term48304, 33, " ");
        setElement(term48304, 34, " ");
        setElement(term48304, 35, " ");
        setElement(term48304, 36, " ");
        setElement(term48304, 37, " ");
        setElement(term48304, 38, " ");
        setElement(term48304, 39, " ");
        setElement(term48304, 40, " ");
        setElement(term48304, 41, " ");
        setElement(term48304, 42, " ");
        setElement(term48304, 43, " ");
        setElement(term48304, 44, " ");
        setElement(term48304, 45, " ");
        setElement(term48304, 46, " ");
        setElement(term48304, 47, " ");
        setElement(term48304, 48, " ");
        setElement(term48304, 49, " ");
        setElement(term48304, 50, " ");
        setElement(term48304, 51, " ");
        setElement(term48304, 52, " ");
        setElement(term48304, 53, " ");
        setElement(term48304, 54, " ");
        setElement(term48304, 55, " ");
        setElement(term48304, 56, " ");
        setElement(term48304, 57, " ");
        setElement(term48304, 58, " ");
        setElement(term48304, 59, " ");
        setElement(term48304, 60, " ");
        setElement(term48304, 61, " ");
        setElement(term48304, 62, " ");
        setElement(term48304, 63, " ");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang3.StringUtils");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(Class.forName("java.lang.String"), 0).getClass();
        Object[] args = new Object[1];
        args[0] = term48304;
        callMethod(klass, "stripAll", argTypes, null, args);
    }

};


