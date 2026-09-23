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

public class CSVFormat_equals_34081098360 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term255911;
     Object term256136;
     Object term256470;
     Object term256477;

    public CSVFormat_equals_34081098360() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term256484 = Class.forName((String) "org.apache.commons.csv.Quote");
        Field term256483 = ((Class) term256484).getDeclaredField((String) "ALL");
        ((Field) term256483).setAccessible(true);
        Object enum404 = ((Field) term256483).get((Object) null);
        Character term256063 = new Character((char) 0);
        term255911 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        setCharField(term255911, term255911.getClass(), "delimiter", (char) 0);
        setField(term255911, term255911.getClass(), "quotePolicy", enum404);
        setField(term255911, term255911.getClass(), "quoteChar", null);
        setField(term255911, term255911.getClass(), "commentStart", term256063);
        setField(term255911, term255911.getClass(), "escape", null);
        setField(term255911, term255911.getClass(), "nullString", null);
        setField(term255911, term255911.getClass(), "header", null);
        setBooleanField(term255911, term255911.getClass(), "ignoreSurroundingSpaces", true);
        setBooleanField(term255911, term255911.getClass(), "ignoreEmptyLines", true);
        setBooleanField(term255911, term255911.getClass(), "skipHeaderRecord", true);
        setField(term255911, term255911.getClass(), "recordSeparator", "java.lang.Object");
        Character term256238 = new Character((char) 0);
        term256136 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        setCharField(term256136, term256136.getClass(), "delimiter", (char) 0);
        setField(term256136, term256136.getClass(), "quotePolicy", enum404);
        setField(term256136, term256136.getClass(), "quoteChar", null);
        setField(term256136, term256136.getClass(), "commentStart", term256238);
        setField(term256136, term256136.getClass(), "escape", null);
        setField(term256136, term256136.getClass(), "nullString", null);
        setField(term256136, term256136.getClass(), "header", null);
        setBooleanField(term256136, term256136.getClass(), "ignoreSurroundingSpaces", true);
        setBooleanField(term256136, term256136.getClass(), "ignoreEmptyLines", true);
        setBooleanField(term256136, term256136.getClass(), "skipHeaderRecord", true);
        Class<? extends Object> term256656 = Class.forName((String) "org.apache.commons.csv.Quote");
        Field term256655 = ((Class) term256656).getDeclaredField((String) "ALL");
        ((Field) term256655).setAccessible(true);
        Object enum405 = ((Field) term256655).get((Object) null);
        Character term256474 = new Character((char) 0);
        term256470 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        setCharField(term256470, term256470.getClass(), "delimiter", (char) 0);
        setField(term256470, term256470.getClass(), "quoteChar", null);
        setField(term256470, term256470.getClass(), "quotePolicy", enum405);
        setField(term256470, term256470.getClass(), "commentStart", term256474);
        setField(term256470, term256470.getClass(), "escape", null);
        setBooleanField(term256470, term256470.getClass(), "ignoreSurroundingSpaces", true);
        setBooleanField(term256470, term256470.getClass(), "ignoreEmptyLines", true);
        setField(term256470, term256470.getClass(), "recordSeparator", "java.lang.Object");
        setField(term256470, term256470.getClass(), "nullString", null);
        setField(term256470, term256470.getClass(), "header", null);
        setBooleanField(term256470, term256470.getClass(), "skipHeaderRecord", true);
        Class<? extends Object> term256828 = Class.forName((String) "org.apache.commons.csv.Quote");
        Field term256827 = ((Class) term256828).getDeclaredField((String) "ALL");
        ((Field) term256827).setAccessible(true);
        Object enum406 = ((Field) term256827).get((Object) null);
        Character term256481 = new Character((char) 0);
        term256477 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        setCharField(term256477, term256477.getClass(), "delimiter", (char) 0);
        setField(term256477, term256477.getClass(), "quoteChar", null);
        setField(term256477, term256477.getClass(), "quotePolicy", enum406);
        setField(term256477, term256477.getClass(), "commentStart", term256481);
        setField(term256477, term256477.getClass(), "escape", null);
        setBooleanField(term256477, term256477.getClass(), "ignoreSurroundingSpaces", true);
        setBooleanField(term256477, term256477.getClass(), "ignoreEmptyLines", true);
        setField(term256477, term256477.getClass(), "recordSeparator", null);
        setField(term256477, term256477.getClass(), "nullString", null);
        setField(term256477, term256477.getClass(), "header", null);
        setBooleanField(term256477, term256477.getClass(), "skipHeaderRecord", true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.csv.CSVFormat");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term256136;
        Object retValue = callMethod(klass, "equals", argTypes, term255911, args);
        assertTrue(recursiveEquals(term255911, term256470));
        assertTrue(recursiveEquals(term256136, term256477));
        assertTrue(recursiveEquals(retValue, false));
    }

};


