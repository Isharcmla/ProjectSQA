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

public class CSVFormat_equals_34081098281 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term151740;
     Object term151875;
     Object term152194;
     Object term152198;

    public CSVFormat_equals_34081098281() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term152205 = Class.forName((String) "org.apache.commons.csv.Quote");
        Field term152204 = ((Class) term152205).getDeclaredField((String) "NON_NUMERIC");
        ((Field) term152204).setAccessible(true);
        Object enum277 = ((Field) term152204).get((Object) null);
        term151740 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        setCharField(term151740, term151740.getClass(), "delimiter", (char) 0);
        setField(term151740, term151740.getClass(), "quotePolicy", enum277);
        setField(term151740, term151740.getClass(), "quoteChar", null);
        Character term151977 = new Character((char) 0);
        term151875 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        setCharField(term151875, term151875.getClass(), "delimiter", (char) 0);
        setField(term151875, term151875.getClass(), "quotePolicy", enum277);
        setField(term151875, term151875.getClass(), "quoteChar", term151977);
        Class<? extends Object> term152386 = Class.forName((String) "org.apache.commons.csv.Quote");
        Field term152385 = ((Class) term152386).getDeclaredField((String) "NON_NUMERIC");
        ((Field) term152385).setAccessible(true);
        Object enum278 = ((Field) term152385).get((Object) null);
        term152194 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        setCharField(term152194, term152194.getClass(), "delimiter", (char) 0);
        setField(term152194, term152194.getClass(), "quoteChar", null);
        setField(term152194, term152194.getClass(), "quotePolicy", enum278);
        setField(term152194, term152194.getClass(), "commentStart", null);
        setField(term152194, term152194.getClass(), "escape", null);
        setBooleanField(term152194, term152194.getClass(), "ignoreSurroundingSpaces", false);
        setBooleanField(term152194, term152194.getClass(), "ignoreEmptyLines", false);
        setField(term152194, term152194.getClass(), "recordSeparator", null);
        setField(term152194, term152194.getClass(), "nullString", null);
        setField(term152194, term152194.getClass(), "header", null);
        setBooleanField(term152194, term152194.getClass(), "skipHeaderRecord", false);
        Character term152199 = new Character((char) 0);
        Class<? extends Object> term152566 = Class.forName((String) "org.apache.commons.csv.Quote");
        Field term152565 = ((Class) term152566).getDeclaredField((String) "NON_NUMERIC");
        ((Field) term152565).setAccessible(true);
        Object enum279 = ((Field) term152565).get((Object) null);
        term152198 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        setCharField(term152198, term152198.getClass(), "delimiter", (char) 0);
        setField(term152198, term152198.getClass(), "quoteChar", term152199);
        setField(term152198, term152198.getClass(), "quotePolicy", enum279);
        setField(term152198, term152198.getClass(), "commentStart", null);
        setField(term152198, term152198.getClass(), "escape", null);
        setBooleanField(term152198, term152198.getClass(), "ignoreSurroundingSpaces", false);
        setBooleanField(term152198, term152198.getClass(), "ignoreEmptyLines", false);
        setField(term152198, term152198.getClass(), "recordSeparator", null);
        setField(term152198, term152198.getClass(), "nullString", null);
        setField(term152198, term152198.getClass(), "header", null);
        setBooleanField(term152198, term152198.getClass(), "skipHeaderRecord", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.csv.CSVFormat");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term151875;
        Object retValue = callMethod(klass, "equals", argTypes, term151740, args);
        assertTrue(recursiveEquals(term151740, term152194));
        assertTrue(recursiveEquals(term151875, term152198));
        assertTrue(recursiveEquals(retValue, false));
    }

};


