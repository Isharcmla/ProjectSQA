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
import java.lang.String;
import java.lang.Object;
import java.lang.Character;

public class CSVFormat_withIgnoreEmptyLines_479441451106 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term50344;

    public CSVFormat_withIgnoreEmptyLines_479441451106() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term51051 = Class.forName((String) "org.apache.commons.csv.Quote");
        Field term51050 = ((Class) term51051).getDeclaredField((String) "NONE");
        ((Field) term51050).setAccessible(true);
        Object enum136 = ((Field) term51050).get((Object) null);
        Character term50496 = new Character((char) 0);
        Character term50548 = new Character((char) 0);
        term50344 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        Object[] term50237 = (Object[]) newArray("java.lang.String", 0);
        setCharField(term50344, term50344.getClass(), "delimiter", (char) 13);
        setField(term50344, term50344.getClass(), "quoteChar", null);
        setField(term50344, term50344.getClass(), "quotePolicy", enum136);
        setField(term50344, term50344.getClass(), "commentStart", term50496);
        setField(term50344, term50344.getClass(), "escape", term50548);
        setBooleanField(term50344, term50344.getClass(), "ignoreSurroundingSpaces", false);
        setField(term50344, term50344.getClass(), "recordSeparator", null);
        setField(term50344, term50344.getClass(), "nullString", "");
        setField(term50344, term50344.getClass(), "header", term50237);
        setBooleanField(term50344, term50344.getClass(), "skipHeaderRecord", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.csv.CSVFormat");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = boolean.class;
        Object[] args = new Object[1];
        args[0] = false;
        try {
            callMethod(klass, "withIgnoreEmptyLines", argTypes, term50344, args);
            assertTrue(false);
        }
        catch (IllegalArgumentException e) {
        }

    }

};


