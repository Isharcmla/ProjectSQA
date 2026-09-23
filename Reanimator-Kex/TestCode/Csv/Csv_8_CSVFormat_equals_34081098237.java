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
import static org.apache.commons.csv.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static org.apache.commons.csv.EqualityUtils.*;
import java.lang.String;
import java.lang.Object;
import java.lang.Character;

public class CSVFormat_equals_34081098237 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term120381;
     Object term120516;
     Object term121193;
     Object term121197;

    public CSVFormat_equals_34081098237() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term121204 = Class.forName((String) "org.apache.commons.csv.Quote");
        Field term121203 = ((Class) term121204).getDeclaredField((String) "NON_NUMERIC");
        ((Field) term121203).setAccessible(true);
        Object enum212 = ((Field) term121203).get((Object) null);
        term120381 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        setCharField(term120381, term120381.getClass(), "delimiter", (char) 0);
        setField(term120381, term120381.getClass(), "quotePolicy", enum212);
        setField(term120381, term120381.getClass(), "quoteChar", null);
        setField(term120381, term120381.getClass(), "commentStart", null);
        Character term120618 = new Character((char) 0);
        term120516 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        setCharField(term120516, term120516.getClass(), "delimiter", (char) 0);
        setField(term120516, term120516.getClass(), "quotePolicy", enum212);
        setField(term120516, term120516.getClass(), "quoteChar", null);
        setField(term120516, term120516.getClass(), "commentStart", term120618);
        Class<? extends Object> term121385 = Class.forName((String) "org.apache.commons.csv.Quote");
        Field term121384 = ((Class) term121385).getDeclaredField((String) "NON_NUMERIC");
        ((Field) term121384).setAccessible(true);
        Object enum213 = ((Field) term121384).get((Object) null);
        term121193 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        setCharField(term121193, term121193.getClass(), "delimiter", (char) 0);
        setField(term121193, term121193.getClass(), "quoteChar", null);
        setField(term121193, term121193.getClass(), "quotePolicy", enum213);
        setField(term121193, term121193.getClass(), "commentStart", null);
        setField(term121193, term121193.getClass(), "escape", null);
        setBooleanField(term121193, term121193.getClass(), "ignoreSurroundingSpaces", false);
        setBooleanField(term121193, term121193.getClass(), "ignoreEmptyLines", false);
        setField(term121193, term121193.getClass(), "recordSeparator", null);
        setField(term121193, term121193.getClass(), "nullString", null);
        setField(term121193, term121193.getClass(), "header", null);
        setBooleanField(term121193, term121193.getClass(), "skipHeaderRecord", false);
        Class<? extends Object> term121565 = Class.forName((String) "org.apache.commons.csv.Quote");
        Field term121564 = ((Class) term121565).getDeclaredField((String) "NON_NUMERIC");
        ((Field) term121564).setAccessible(true);
        Object enum214 = ((Field) term121564).get((Object) null);
        Character term121201 = new Character((char) 0);
        term121197 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        setCharField(term121197, term121197.getClass(), "delimiter", (char) 0);
        setField(term121197, term121197.getClass(), "quoteChar", null);
        setField(term121197, term121197.getClass(), "quotePolicy", enum214);
        setField(term121197, term121197.getClass(), "commentStart", term121201);
        setField(term121197, term121197.getClass(), "escape", null);
        setBooleanField(term121197, term121197.getClass(), "ignoreSurroundingSpaces", false);
        setBooleanField(term121197, term121197.getClass(), "ignoreEmptyLines", false);
        setField(term121197, term121197.getClass(), "recordSeparator", null);
        setField(term121197, term121197.getClass(), "nullString", null);
        setField(term121197, term121197.getClass(), "header", null);
        setBooleanField(term121197, term121197.getClass(), "skipHeaderRecord", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.csv.CSVFormat");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term120516;
        Object retValue = callMethod(klass, "equals", argTypes, term120381, args);
        assertTrue(recursiveEquals(term120381, term121193));
        assertTrue(recursiveEquals(term120516, term121197));
        assertTrue(recursiveEquals(retValue, false));
    }

};


