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

public class CSVFormat_equals_34081098291 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term157547;
     Object term157682;
     Object term157955;
     Object term157959;

    public CSVFormat_equals_34081098291() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term157965 = Class.forName((String) "org.apache.commons.csv.Quote");
        Field term157964 = ((Class) term157965).getDeclaredField((String) "NON_NUMERIC");
        ((Field) term157964).setAccessible(true);
        Object enum292 = ((Field) term157964).get((Object) null);
        term157547 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        setCharField(term157547, term157547.getClass(), "delimiter", (char) 0);
        setField(term157547, term157547.getClass(), "quotePolicy", enum292);
        setField(term157547, term157547.getClass(), "quoteChar", null);
        setField(term157547, term157547.getClass(), "commentStart", null);
        setField(term157547, term157547.getClass(), "escape", null);
        setField(term157547, term157547.getClass(), "nullString", null);
        setField(term157547, term157547.getClass(), "header", null);
        setBooleanField(term157547, term157547.getClass(), "ignoreSurroundingSpaces", true);
        setBooleanField(term157547, term157547.getClass(), "ignoreEmptyLines", false);
        term157682 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        setCharField(term157682, term157682.getClass(), "delimiter", (char) 0);
        setField(term157682, term157682.getClass(), "quotePolicy", enum292);
        setField(term157682, term157682.getClass(), "quoteChar", null);
        setField(term157682, term157682.getClass(), "commentStart", null);
        setField(term157682, term157682.getClass(), "escape", null);
        setField(term157682, term157682.getClass(), "nullString", null);
        setField(term157682, term157682.getClass(), "header", null);
        setBooleanField(term157682, term157682.getClass(), "ignoreSurroundingSpaces", true);
        setBooleanField(term157682, term157682.getClass(), "ignoreEmptyLines", true);
        Class<? extends Object> term158145 = Class.forName((String) "org.apache.commons.csv.Quote");
        Field term158144 = ((Class) term158145).getDeclaredField((String) "NON_NUMERIC");
        ((Field) term158144).setAccessible(true);
        Object enum293 = ((Field) term158144).get((Object) null);
        term157955 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        setCharField(term157955, term157955.getClass(), "delimiter", (char) 0);
        setField(term157955, term157955.getClass(), "quoteChar", null);
        setField(term157955, term157955.getClass(), "quotePolicy", enum293);
        setField(term157955, term157955.getClass(), "commentStart", null);
        setField(term157955, term157955.getClass(), "escape", null);
        setBooleanField(term157955, term157955.getClass(), "ignoreSurroundingSpaces", true);
        setBooleanField(term157955, term157955.getClass(), "ignoreEmptyLines", false);
        setField(term157955, term157955.getClass(), "recordSeparator", null);
        setField(term157955, term157955.getClass(), "nullString", null);
        setField(term157955, term157955.getClass(), "header", null);
        setBooleanField(term157955, term157955.getClass(), "skipHeaderRecord", false);
        Class<? extends Object> term158325 = Class.forName((String) "org.apache.commons.csv.Quote");
        Field term158324 = ((Class) term158325).getDeclaredField((String) "NON_NUMERIC");
        ((Field) term158324).setAccessible(true);
        Object enum294 = ((Field) term158324).get((Object) null);
        term157959 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        setCharField(term157959, term157959.getClass(), "delimiter", (char) 0);
        setField(term157959, term157959.getClass(), "quoteChar", null);
        setField(term157959, term157959.getClass(), "quotePolicy", enum294);
        setField(term157959, term157959.getClass(), "commentStart", null);
        setField(term157959, term157959.getClass(), "escape", null);
        setBooleanField(term157959, term157959.getClass(), "ignoreSurroundingSpaces", true);
        setBooleanField(term157959, term157959.getClass(), "ignoreEmptyLines", true);
        setField(term157959, term157959.getClass(), "recordSeparator", null);
        setField(term157959, term157959.getClass(), "nullString", null);
        setField(term157959, term157959.getClass(), "header", null);
        setBooleanField(term157959, term157959.getClass(), "skipHeaderRecord", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.csv.CSVFormat");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term157682;
        Object retValue = callMethod(klass, "equals", argTypes, term157547, args);
        assertTrue(recursiveEquals(term157547, term157955));
        assertTrue(recursiveEquals(term157682, term157959));
        assertTrue(recursiveEquals(retValue, false));
    }

};


