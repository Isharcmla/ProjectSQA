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

public class CSVFormat_equals_34081098253 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term134024;
     Object term134211;
     Object term134450;
     Object term134455;

    public CSVFormat_equals_34081098253() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term134461 = Class.forName((String) "org.apache.commons.csv.Quote");
        Field term134460 = ((Class) term134461).getDeclaredField((String) "NONE");
        ((Field) term134460).setAccessible(true);
        Object enum227 = ((Field) term134460).get((Object) null);
        Character term134176 = new Character((char) 0);
        term134024 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        setCharField(term134024, term134024.getClass(), "delimiter", (char) 0);
        setField(term134024, term134024.getClass(), "quotePolicy", enum227);
        setField(term134024, term134024.getClass(), "quoteChar", term134176);
        term134211 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        setCharField(term134211, term134211.getClass(), "delimiter", (char) 0);
        setField(term134211, term134211.getClass(), "quotePolicy", enum227);
        Character term134451 = new Character((char) 0);
        Class<? extends Object> term134621 = Class.forName((String) "org.apache.commons.csv.Quote");
        Field term134620 = ((Class) term134621).getDeclaredField((String) "NONE");
        ((Field) term134620).setAccessible(true);
        Object enum228 = ((Field) term134620).get((Object) null);
        term134450 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        setCharField(term134450, term134450.getClass(), "delimiter", (char) 0);
        setField(term134450, term134450.getClass(), "quoteChar", term134451);
        setField(term134450, term134450.getClass(), "quotePolicy", enum228);
        setField(term134450, term134450.getClass(), "commentStart", null);
        setField(term134450, term134450.getClass(), "escape", null);
        setBooleanField(term134450, term134450.getClass(), "ignoreSurroundingSpaces", false);
        setBooleanField(term134450, term134450.getClass(), "ignoreEmptyLines", false);
        setField(term134450, term134450.getClass(), "recordSeparator", null);
        setField(term134450, term134450.getClass(), "nullString", null);
        setField(term134450, term134450.getClass(), "header", null);
        setBooleanField(term134450, term134450.getClass(), "skipHeaderRecord", false);
        Class<? extends Object> term134780 = Class.forName((String) "org.apache.commons.csv.Quote");
        Field term134779 = ((Class) term134780).getDeclaredField((String) "NONE");
        ((Field) term134779).setAccessible(true);
        Object enum229 = ((Field) term134779).get((Object) null);
        term134455 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        setCharField(term134455, term134455.getClass(), "delimiter", (char) 0);
        setField(term134455, term134455.getClass(), "quoteChar", null);
        setField(term134455, term134455.getClass(), "quotePolicy", enum229);
        setField(term134455, term134455.getClass(), "commentStart", null);
        setField(term134455, term134455.getClass(), "escape", null);
        setBooleanField(term134455, term134455.getClass(), "ignoreSurroundingSpaces", false);
        setBooleanField(term134455, term134455.getClass(), "ignoreEmptyLines", false);
        setField(term134455, term134455.getClass(), "recordSeparator", null);
        setField(term134455, term134455.getClass(), "nullString", null);
        setField(term134455, term134455.getClass(), "header", null);
        setBooleanField(term134455, term134455.getClass(), "skipHeaderRecord", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.csv.CSVFormat");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term134211;
        Object retValue = callMethod(klass, "equals", argTypes, term134024, args);
        assertTrue(recursiveEquals(term134024, term134450));
        assertTrue(recursiveEquals(term134211, term134455));
        assertTrue(recursiveEquals(retValue, false));
    }

};


