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

public class CSVFormat_equals_34081098341 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term225010;
     Object term225249;
     Object term226393;
     Object term226399;

    public CSVFormat_equals_34081098341() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term226406 = Class.forName((String) "org.apache.commons.csv.Quote");
        Field term226405 = ((Class) term226406).getDeclaredField((String) "NON_NUMERIC");
        ((Field) term226405).setAccessible(true);
        Object enum373 = ((Field) term226405).get((Object) null);
        Character term225325 = new Character((char) 0);
        Character term225214 = new Character((char) 0);
        term225010 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        setCharField(term225010, term225010.getClass(), "delimiter", (char) 0);
        setField(term225010, term225010.getClass(), "quotePolicy", enum373);
        setField(term225010, term225010.getClass(), "quoteChar", null);
        setField(term225010, term225010.getClass(), "commentStart", term225325);
        setField(term225010, term225010.getClass(), "escape", term225214);
        term225249 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        setCharField(term225249, term225249.getClass(), "delimiter", (char) 0);
        setField(term225249, term225249.getClass(), "quotePolicy", enum373);
        setField(term225249, term225249.getClass(), "quoteChar", null);
        setField(term225249, term225249.getClass(), "commentStart", term225325);
        Class<? extends Object> term226587 = Class.forName((String) "org.apache.commons.csv.Quote");
        Field term226586 = ((Class) term226587).getDeclaredField((String) "NON_NUMERIC");
        ((Field) term226586).setAccessible(true);
        Object enum374 = ((Field) term226586).get((Object) null);
        Character term226397 = new Character((char) 0);
        Character term226398 = new Character((char) 0);
        term226393 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        setCharField(term226393, term226393.getClass(), "delimiter", (char) 0);
        setField(term226393, term226393.getClass(), "quoteChar", null);
        setField(term226393, term226393.getClass(), "quotePolicy", enum374);
        setField(term226393, term226393.getClass(), "commentStart", term226397);
        setField(term226393, term226393.getClass(), "escape", term226398);
        setBooleanField(term226393, term226393.getClass(), "ignoreSurroundingSpaces", false);
        setBooleanField(term226393, term226393.getClass(), "ignoreEmptyLines", false);
        setField(term226393, term226393.getClass(), "recordSeparator", null);
        setField(term226393, term226393.getClass(), "nullString", null);
        setField(term226393, term226393.getClass(), "header", null);
        setBooleanField(term226393, term226393.getClass(), "skipHeaderRecord", false);
        Class<? extends Object> term226767 = Class.forName((String) "org.apache.commons.csv.Quote");
        Field term226766 = ((Class) term226767).getDeclaredField((String) "NON_NUMERIC");
        ((Field) term226766).setAccessible(true);
        Object enum375 = ((Field) term226766).get((Object) null);
        Character term226403 = new Character((char) 0);
        term226399 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        setCharField(term226399, term226399.getClass(), "delimiter", (char) 0);
        setField(term226399, term226399.getClass(), "quoteChar", null);
        setField(term226399, term226399.getClass(), "quotePolicy", enum375);
        setField(term226399, term226399.getClass(), "commentStart", term226403);
        setField(term226399, term226399.getClass(), "escape", null);
        setBooleanField(term226399, term226399.getClass(), "ignoreSurroundingSpaces", false);
        setBooleanField(term226399, term226399.getClass(), "ignoreEmptyLines", false);
        setField(term226399, term226399.getClass(), "recordSeparator", null);
        setField(term226399, term226399.getClass(), "nullString", null);
        setField(term226399, term226399.getClass(), "header", null);
        setBooleanField(term226399, term226399.getClass(), "skipHeaderRecord", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.csv.CSVFormat");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term225249;
        Object retValue = callMethod(klass, "equals", argTypes, term225010, args);
        assertTrue(recursiveEquals(term225010, term226393));
        assertTrue(recursiveEquals(term225249, term226399));
        assertTrue(recursiveEquals(retValue, false));
    }

};


