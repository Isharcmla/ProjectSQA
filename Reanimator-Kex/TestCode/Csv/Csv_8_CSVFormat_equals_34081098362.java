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

public class CSVFormat_equals_34081098362 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term258043;
     Object term258230;
     Object term258528;
     Object term258533;

    public CSVFormat_equals_34081098362() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term258540 = Class.forName((String) "org.apache.commons.csv.Quote");
        Field term258539 = ((Class) term258540).getDeclaredField((String) "ALL");
        ((Field) term258539).setAccessible(true);
        Object enum408 = ((Field) term258539).get((Object) null);
        Character term258195 = new Character((char) 0);
        term258043 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        setCharField(term258043, term258043.getClass(), "delimiter", (char) 0);
        setField(term258043, term258043.getClass(), "quotePolicy", enum408);
        setField(term258043, term258043.getClass(), "quoteChar", term258195);
        setField(term258043, term258043.getClass(), "commentStart", null);
        setField(term258043, term258043.getClass(), "escape", null);
        setField(term258043, term258043.getClass(), "nullString", null);
        setField(term258043, term258043.getClass(), "header", null);
        setBooleanField(term258043, term258043.getClass(), "ignoreSurroundingSpaces", false);
        setBooleanField(term258043, term258043.getClass(), "ignoreEmptyLines", true);
        setBooleanField(term258043, term258043.getClass(), "skipHeaderRecord", true);
        Character term258332 = new Character((char) 0);
        term258230 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        setCharField(term258230, term258230.getClass(), "delimiter", (char) 0);
        setField(term258230, term258230.getClass(), "quotePolicy", enum408);
        setField(term258230, term258230.getClass(), "quoteChar", term258332);
        setField(term258230, term258230.getClass(), "commentStart", null);
        setField(term258230, term258230.getClass(), "escape", null);
        setField(term258230, term258230.getClass(), "nullString", null);
        setField(term258230, term258230.getClass(), "header", null);
        setBooleanField(term258230, term258230.getClass(), "ignoreSurroundingSpaces", false);
        setBooleanField(term258230, term258230.getClass(), "ignoreEmptyLines", true);
        setBooleanField(term258230, term258230.getClass(), "skipHeaderRecord", false);
        Character term258529 = new Character((char) 0);
        Class<? extends Object> term258696 = Class.forName((String) "org.apache.commons.csv.Quote");
        Field term258695 = ((Class) term258696).getDeclaredField((String) "ALL");
        ((Field) term258695).setAccessible(true);
        Object enum409 = ((Field) term258695).get((Object) null);
        term258528 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        setCharField(term258528, term258528.getClass(), "delimiter", (char) 0);
        setField(term258528, term258528.getClass(), "quoteChar", term258529);
        setField(term258528, term258528.getClass(), "quotePolicy", enum409);
        setField(term258528, term258528.getClass(), "commentStart", null);
        setField(term258528, term258528.getClass(), "escape", null);
        setBooleanField(term258528, term258528.getClass(), "ignoreSurroundingSpaces", false);
        setBooleanField(term258528, term258528.getClass(), "ignoreEmptyLines", true);
        setField(term258528, term258528.getClass(), "recordSeparator", null);
        setField(term258528, term258528.getClass(), "nullString", null);
        setField(term258528, term258528.getClass(), "header", null);
        setBooleanField(term258528, term258528.getClass(), "skipHeaderRecord", true);
        Character term258534 = new Character((char) 0);
        Class<? extends Object> term258852 = Class.forName((String) "org.apache.commons.csv.Quote");
        Field term258851 = ((Class) term258852).getDeclaredField((String) "ALL");
        ((Field) term258851).setAccessible(true);
        Object enum410 = ((Field) term258851).get((Object) null);
        term258533 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        setCharField(term258533, term258533.getClass(), "delimiter", (char) 0);
        setField(term258533, term258533.getClass(), "quoteChar", term258534);
        setField(term258533, term258533.getClass(), "quotePolicy", enum410);
        setField(term258533, term258533.getClass(), "commentStart", null);
        setField(term258533, term258533.getClass(), "escape", null);
        setBooleanField(term258533, term258533.getClass(), "ignoreSurroundingSpaces", false);
        setBooleanField(term258533, term258533.getClass(), "ignoreEmptyLines", true);
        setField(term258533, term258533.getClass(), "recordSeparator", null);
        setField(term258533, term258533.getClass(), "nullString", null);
        setField(term258533, term258533.getClass(), "header", null);
        setBooleanField(term258533, term258533.getClass(), "skipHeaderRecord", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.csv.CSVFormat");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term258230;
        Object retValue = callMethod(klass, "equals", argTypes, term258043, args);
        assertTrue(recursiveEquals(term258043, term258528));
        assertTrue(recursiveEquals(term258230, term258533));
        assertTrue(recursiveEquals(retValue, false));
    }

};


