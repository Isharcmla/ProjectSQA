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

public class CSVFormat_equals_34081098330 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term210498;
     Object term210723;
     Object term211093;
     Object term211100;

    public CSVFormat_equals_34081098330() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term211107 = Class.forName((String) "org.apache.commons.csv.Quote");
        Field term211106 = ((Class) term211107).getDeclaredField((String) "NON_NUMERIC");
        ((Field) term211106).setAccessible(true);
        Object enum351 = ((Field) term211106).get((Object) null);
        Character term210650 = new Character((char) 0);
        term210498 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        setCharField(term210498, term210498.getClass(), "delimiter", (char) 0);
        setField(term210498, term210498.getClass(), "quotePolicy", enum351);
        setField(term210498, term210498.getClass(), "quoteChar", null);
        setField(term210498, term210498.getClass(), "commentStart", null);
        setField(term210498, term210498.getClass(), "escape", term210650);
        setField(term210498, term210498.getClass(), "nullString", null);
        setField(term210498, term210498.getClass(), "header", null);
        setBooleanField(term210498, term210498.getClass(), "ignoreSurroundingSpaces", true);
        setBooleanField(term210498, term210498.getClass(), "ignoreEmptyLines", true);
        setBooleanField(term210498, term210498.getClass(), "skipHeaderRecord", false);
        setField(term210498, term210498.getClass(), "recordSeparator", "java.lang.String[]");
        Character term210825 = new Character((char) 0);
        term210723 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        setCharField(term210723, term210723.getClass(), "delimiter", (char) 0);
        setField(term210723, term210723.getClass(), "quotePolicy", enum351);
        setField(term210723, term210723.getClass(), "quoteChar", null);
        setField(term210723, term210723.getClass(), "commentStart", null);
        setField(term210723, term210723.getClass(), "escape", term210825);
        setField(term210723, term210723.getClass(), "nullString", null);
        setField(term210723, term210723.getClass(), "header", null);
        setBooleanField(term210723, term210723.getClass(), "ignoreSurroundingSpaces", true);
        setBooleanField(term210723, term210723.getClass(), "ignoreEmptyLines", true);
        setBooleanField(term210723, term210723.getClass(), "skipHeaderRecord", false);
        Class<? extends Object> term211305 = Class.forName((String) "org.apache.commons.csv.Quote");
        Field term211304 = ((Class) term211305).getDeclaredField((String) "NON_NUMERIC");
        ((Field) term211304).setAccessible(true);
        Object enum352 = ((Field) term211304).get((Object) null);
        Character term211097 = new Character((char) 0);
        term211093 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        setCharField(term211093, term211093.getClass(), "delimiter", (char) 0);
        setField(term211093, term211093.getClass(), "quoteChar", null);
        setField(term211093, term211093.getClass(), "quotePolicy", enum352);
        setField(term211093, term211093.getClass(), "commentStart", null);
        setField(term211093, term211093.getClass(), "escape", term211097);
        setBooleanField(term211093, term211093.getClass(), "ignoreSurroundingSpaces", true);
        setBooleanField(term211093, term211093.getClass(), "ignoreEmptyLines", true);
        setField(term211093, term211093.getClass(), "recordSeparator", "java.lang.String[]");
        setField(term211093, term211093.getClass(), "nullString", null);
        setField(term211093, term211093.getClass(), "header", null);
        setBooleanField(term211093, term211093.getClass(), "skipHeaderRecord", false);
        Class<? extends Object> term211503 = Class.forName((String) "org.apache.commons.csv.Quote");
        Field term211502 = ((Class) term211503).getDeclaredField((String) "NON_NUMERIC");
        ((Field) term211502).setAccessible(true);
        Object enum353 = ((Field) term211502).get((Object) null);
        Character term211104 = new Character((char) 0);
        term211100 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        setCharField(term211100, term211100.getClass(), "delimiter", (char) 0);
        setField(term211100, term211100.getClass(), "quoteChar", null);
        setField(term211100, term211100.getClass(), "quotePolicy", enum353);
        setField(term211100, term211100.getClass(), "commentStart", null);
        setField(term211100, term211100.getClass(), "escape", term211104);
        setBooleanField(term211100, term211100.getClass(), "ignoreSurroundingSpaces", true);
        setBooleanField(term211100, term211100.getClass(), "ignoreEmptyLines", true);
        setField(term211100, term211100.getClass(), "recordSeparator", null);
        setField(term211100, term211100.getClass(), "nullString", null);
        setField(term211100, term211100.getClass(), "header", null);
        setBooleanField(term211100, term211100.getClass(), "skipHeaderRecord", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.csv.CSVFormat");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term210723;
        Object retValue = callMethod(klass, "equals", argTypes, term210498, args);
        assertTrue(recursiveEquals(term210498, term211093));
        assertTrue(recursiveEquals(term210723, term211100));
        assertTrue(recursiveEquals(retValue, false));
    }

};


