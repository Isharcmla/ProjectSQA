package org.apache.commons.csv;

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
import static org.apache.commons.csv.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class CSVFormat_init_1399452564101 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);

    public CSVFormat_init_1399452564101() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term49480 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.csv.CSVFormat");
        Class<?>[] argTypes = new Class<?>[11];
        argTypes[0] = char.class;
        argTypes[1] = Class.forName("java.lang.Character");
        argTypes[2] = Class.forName("org.apache.commons.csv.Quote");
        argTypes[3] = Class.forName("java.lang.Character");
        argTypes[4] = Class.forName("java.lang.Character");
        argTypes[5] = boolean.class;
        argTypes[6] = boolean.class;
        argTypes[7] = Class.forName("java.lang.String");
        argTypes[8] = Class.forName("java.lang.String");
        argTypes[9] = Array.newInstance(Class.forName("java.lang.String"), 0).getClass();
        argTypes[10] = boolean.class;
        Object[] args = new Object[11];
        args[0] = (char) 10;
        args[1] = null;
        args[2] = null;
        args[3] = null;
        args[4] = null;
        args[5] = false;
        args[6] = false;
        args[7] = null;
        args[8] = null;
        args[9] = null;
        args[10] = false;
        try {
            Object instance = callConstructor(klass, argTypes, args);
            assertTrue(false);
        }
        catch (IllegalArgumentException e) {
        }

    }

};


