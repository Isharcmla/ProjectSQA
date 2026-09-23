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
import java.lang.IllegalArgumentException;
import static org.apache.commons.lang3.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class ArrayUtils_toMap_528925844178 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term27;

    public ArrayUtils_toMap_528925844178() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term27 = (Object[]) newArray("java.lang.Object", 5);
        Object term28 = newInstance(Class.forName("java.lang.Object"));
        Object term29 = newInstance(Class.forName("java.lang.Object"));
        Object term30 = newInstance(Class.forName("java.lang.Object"));
        Object term31 = newInstance(Class.forName("java.lang.Object"));
        Object term32 = newInstance(Class.forName("java.lang.Object"));
        setElement(term27, 0, term28);
        setElement(term27, 1, term29);
        setElement(term27, 2, term30);
        setElement(term27, 3, term31);
        setElement(term27, 4, term32);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang3.ArrayUtils");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(Class.forName("java.lang.Object"), 0).getClass();
        Object[] args = new Object[1];
        args[0] = term27;
        try {
            callMethod(klass, "toMap", argTypes, null, args);
            assertTrue(false);
        }
        catch (IllegalArgumentException e) {
        }

    }

};


