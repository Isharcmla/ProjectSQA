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

public class CSVFormat_withIgnoreEmptyLines_479441451109 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term51861;

    public CSVFormat_withIgnoreEmptyLines_479441451109() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term52556 = Class.forName((String) "org.apache.commons.csv.Quote");
        Field term52555 = ((Class) term52556).getDeclaredField((String) "NONE");
        ((Field) term52555).setAccessible(true);
        Object enum138 = ((Field) term52555).get((Object) null);
        Character term52013 = new Character((char) 0);
        Character term52065 = new Character((char) 0);
        term51861 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        Object[] term51755 = (Object[]) newArray("java.lang.String", 0);
        setCharField(term51861, term51861.getClass(), "delimiter", (char) 10);
        setField(term51861, term51861.getClass(), "quoteChar", null);
        setField(term51861, term51861.getClass(), "quotePolicy", enum138);
        setField(term51861, term51861.getClass(), "commentStart", term52013);
        setField(term51861, term51861.getClass(), "escape", term52065);
        setBooleanField(term51861, term51861.getClass(), "ignoreSurroundingSpaces", false);
        setField(term51861, term51861.getClass(), "recordSeparator", null);
        setField(term51861, term51861.getClass(), "nullString", "");
        setField(term51861, term51861.getClass(), "header", term51755);
        setBooleanField(term51861, term51861.getClass(), "skipHeaderRecord", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.csv.CSVFormat");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = boolean.class;
        Object[] args = new Object[1];
        args[0] = false;
        try {
            callMethod(klass, "withIgnoreEmptyLines", argTypes, term51861, args);
            assertTrue(false);
        }
        catch (IllegalArgumentException e) {
        }

    }

};


