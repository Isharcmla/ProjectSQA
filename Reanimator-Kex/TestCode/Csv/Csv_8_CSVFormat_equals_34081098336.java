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

public class CSVFormat_equals_34081098336 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term219574;
     Object term219761;
     Object term220593;
     Object term220598;

    public CSVFormat_equals_34081098336() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term220605 = Class.forName((String) "org.apache.commons.csv.Quote");
        Field term220604 = ((Class) term220605).getDeclaredField((String) "MINIMAL");
        ((Field) term220604).setAccessible(true);
        Object enum365 = ((Field) term220604).get((Object) null);
        Character term219726 = new Character((char) 0);
        term219574 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        setCharField(term219574, term219574.getClass(), "delimiter", (char) 0);
        setField(term219574, term219574.getClass(), "quotePolicy", enum365);
        setField(term219574, term219574.getClass(), "quoteChar", null);
        setField(term219574, term219574.getClass(), "commentStart", null);
        setField(term219574, term219574.getClass(), "escape", term219726);
        setField(term219574, term219574.getClass(), "nullString", null);
        setField(term219574, term219574.getClass(), "header", null);
        setBooleanField(term219574, term219574.getClass(), "ignoreSurroundingSpaces", true);
        setBooleanField(term219574, term219574.getClass(), "ignoreEmptyLines", true);
        setBooleanField(term219574, term219574.getClass(), "skipHeaderRecord", true);
        Character term219863 = new Character((char) 0);
        term219761 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        setCharField(term219761, term219761.getClass(), "delimiter", (char) 0);
        setField(term219761, term219761.getClass(), "quotePolicy", enum365);
        setField(term219761, term219761.getClass(), "quoteChar", null);
        setField(term219761, term219761.getClass(), "commentStart", null);
        setField(term219761, term219761.getClass(), "escape", term219863);
        setField(term219761, term219761.getClass(), "nullString", null);
        setField(term219761, term219761.getClass(), "header", null);
        setBooleanField(term219761, term219761.getClass(), "ignoreSurroundingSpaces", true);
        setBooleanField(term219761, term219761.getClass(), "ignoreEmptyLines", true);
        setBooleanField(term219761, term219761.getClass(), "skipHeaderRecord", false);
        Class<? extends Object> term220773 = Class.forName((String) "org.apache.commons.csv.Quote");
        Field term220772 = ((Class) term220773).getDeclaredField((String) "MINIMAL");
        ((Field) term220772).setAccessible(true);
        Object enum366 = ((Field) term220772).get((Object) null);
        Character term220597 = new Character((char) 0);
        term220593 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        setCharField(term220593, term220593.getClass(), "delimiter", (char) 0);
        setField(term220593, term220593.getClass(), "quoteChar", null);
        setField(term220593, term220593.getClass(), "quotePolicy", enum366);
        setField(term220593, term220593.getClass(), "commentStart", null);
        setField(term220593, term220593.getClass(), "escape", term220597);
        setBooleanField(term220593, term220593.getClass(), "ignoreSurroundingSpaces", true);
        setBooleanField(term220593, term220593.getClass(), "ignoreEmptyLines", true);
        setField(term220593, term220593.getClass(), "recordSeparator", null);
        setField(term220593, term220593.getClass(), "nullString", null);
        setField(term220593, term220593.getClass(), "header", null);
        setBooleanField(term220593, term220593.getClass(), "skipHeaderRecord", true);
        Class<? extends Object> term220941 = Class.forName((String) "org.apache.commons.csv.Quote");
        Field term220940 = ((Class) term220941).getDeclaredField((String) "MINIMAL");
        ((Field) term220940).setAccessible(true);
        Object enum367 = ((Field) term220940).get((Object) null);
        Character term220602 = new Character((char) 0);
        term220598 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        setCharField(term220598, term220598.getClass(), "delimiter", (char) 0);
        setField(term220598, term220598.getClass(), "quoteChar", null);
        setField(term220598, term220598.getClass(), "quotePolicy", enum367);
        setField(term220598, term220598.getClass(), "commentStart", null);
        setField(term220598, term220598.getClass(), "escape", term220602);
        setBooleanField(term220598, term220598.getClass(), "ignoreSurroundingSpaces", true);
        setBooleanField(term220598, term220598.getClass(), "ignoreEmptyLines", true);
        setField(term220598, term220598.getClass(), "recordSeparator", null);
        setField(term220598, term220598.getClass(), "nullString", null);
        setField(term220598, term220598.getClass(), "header", null);
        setBooleanField(term220598, term220598.getClass(), "skipHeaderRecord", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.csv.CSVFormat");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term219761;
        Object retValue = callMethod(klass, "equals", argTypes, term219574, args);
        assertTrue(recursiveEquals(term219574, term220593));
        assertTrue(recursiveEquals(term219761, term220598));
        assertTrue(recursiveEquals(retValue, false));
    }

};


