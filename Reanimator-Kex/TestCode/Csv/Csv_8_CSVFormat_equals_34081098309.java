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

public class CSVFormat_equals_34081098309 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term175539;
     Object term175726;
     Object term188137;
     Object term188142;

    public CSVFormat_equals_34081098309() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term188149 = Class.forName((String) "org.apache.commons.csv.Quote");
        Field term188148 = ((Class) term188149).getDeclaredField((String) "NONE");
        ((Field) term188148).setAccessible(true);
        Object enum323 = ((Field) term188148).get((Object) null);
        Character term175691 = new Character((char) 0);
        term175539 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        setCharField(term175539, term175539.getClass(), "delimiter", (char) 0);
        setField(term175539, term175539.getClass(), "quotePolicy", enum323);
        setField(term175539, term175539.getClass(), "quoteChar", term175691);
        Character term175828 = new Character((char) 0);
        term175726 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        setCharField(term175726, term175726.getClass(), "delimiter", (char) 0);
        setField(term175726, term175726.getClass(), "quotePolicy", enum323);
        setField(term175726, term175726.getClass(), "quoteChar", term175828);
        Character term188138 = new Character((char) 0);
        Class<? extends Object> term188308 = Class.forName((String) "org.apache.commons.csv.Quote");
        Field term188307 = ((Class) term188308).getDeclaredField((String) "NONE");
        ((Field) term188307).setAccessible(true);
        Object enum324 = ((Field) term188307).get((Object) null);
        term188137 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        setCharField(term188137, term188137.getClass(), "delimiter", (char) 0);
        setField(term188137, term188137.getClass(), "quoteChar", term188138);
        setField(term188137, term188137.getClass(), "quotePolicy", enum324);
        setField(term188137, term188137.getClass(), "commentStart", null);
        setField(term188137, term188137.getClass(), "escape", null);
        setBooleanField(term188137, term188137.getClass(), "ignoreSurroundingSpaces", false);
        setBooleanField(term188137, term188137.getClass(), "ignoreEmptyLines", false);
        setField(term188137, term188137.getClass(), "recordSeparator", null);
        setField(term188137, term188137.getClass(), "nullString", null);
        setField(term188137, term188137.getClass(), "header", null);
        setBooleanField(term188137, term188137.getClass(), "skipHeaderRecord", false);
        Character term188143 = new Character((char) 0);
        Class<? extends Object> term188467 = Class.forName((String) "org.apache.commons.csv.Quote");
        Field term188466 = ((Class) term188467).getDeclaredField((String) "NONE");
        ((Field) term188466).setAccessible(true);
        Object enum325 = ((Field) term188466).get((Object) null);
        term188142 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        setCharField(term188142, term188142.getClass(), "delimiter", (char) 0);
        setField(term188142, term188142.getClass(), "quoteChar", term188143);
        setField(term188142, term188142.getClass(), "quotePolicy", enum325);
        setField(term188142, term188142.getClass(), "commentStart", null);
        setField(term188142, term188142.getClass(), "escape", null);
        setBooleanField(term188142, term188142.getClass(), "ignoreSurroundingSpaces", false);
        setBooleanField(term188142, term188142.getClass(), "ignoreEmptyLines", false);
        setField(term188142, term188142.getClass(), "recordSeparator", null);
        setField(term188142, term188142.getClass(), "nullString", null);
        setField(term188142, term188142.getClass(), "header", null);
        setBooleanField(term188142, term188142.getClass(), "skipHeaderRecord", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.csv.CSVFormat");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term175726;
        Object retValue = callMethod(klass, "equals", argTypes, term175539, args);
        assertTrue(recursiveEquals(term175539, term188137));
        assertTrue(recursiveEquals(term175726, term188142));
        assertTrue(recursiveEquals(retValue, true));
    }

};


