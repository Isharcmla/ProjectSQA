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

public class CSVFormat_equals_34081098348 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term235782;
     Object term236007;
     Object term236313;
     Object term236320;

    public CSVFormat_equals_34081098348() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term236327 = Class.forName((String) "org.apache.commons.csv.Quote");
        Field term236326 = ((Class) term236327).getDeclaredField((String) "NONE");
        ((Field) term236326).setAccessible(true);
        Object enum383 = ((Field) term236326).get((Object) null);
        Character term235934 = new Character((char) 0);
        term235782 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        setCharField(term235782, term235782.getClass(), "delimiter", (char) 0);
        setField(term235782, term235782.getClass(), "quotePolicy", enum383);
        setField(term235782, term235782.getClass(), "quoteChar", term235934);
        setField(term235782, term235782.getClass(), "commentStart", null);
        setField(term235782, term235782.getClass(), "escape", null);
        setField(term235782, term235782.getClass(), "nullString", null);
        setField(term235782, term235782.getClass(), "header", null);
        setBooleanField(term235782, term235782.getClass(), "ignoreSurroundingSpaces", true);
        setBooleanField(term235782, term235782.getClass(), "ignoreEmptyLines", true);
        setBooleanField(term235782, term235782.getClass(), "skipHeaderRecord", true);
        setField(term235782, term235782.getClass(), "recordSeparator", "");
        Character term236109 = new Character((char) 0);
        term236007 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        setCharField(term236007, term236007.getClass(), "delimiter", (char) 0);
        setField(term236007, term236007.getClass(), "quotePolicy", enum383);
        setField(term236007, term236007.getClass(), "quoteChar", term236109);
        setField(term236007, term236007.getClass(), "commentStart", null);
        setField(term236007, term236007.getClass(), "escape", null);
        setField(term236007, term236007.getClass(), "nullString", null);
        setField(term236007, term236007.getClass(), "header", null);
        setBooleanField(term236007, term236007.getClass(), "ignoreSurroundingSpaces", true);
        setBooleanField(term236007, term236007.getClass(), "ignoreEmptyLines", true);
        setBooleanField(term236007, term236007.getClass(), "skipHeaderRecord", true);
        Character term236314 = new Character((char) 0);
        Class<? extends Object> term236486 = Class.forName((String) "org.apache.commons.csv.Quote");
        Field term236485 = ((Class) term236486).getDeclaredField((String) "NONE");
        ((Field) term236485).setAccessible(true);
        Object enum384 = ((Field) term236485).get((Object) null);
        term236313 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        setCharField(term236313, term236313.getClass(), "delimiter", (char) 0);
        setField(term236313, term236313.getClass(), "quoteChar", term236314);
        setField(term236313, term236313.getClass(), "quotePolicy", enum384);
        setField(term236313, term236313.getClass(), "commentStart", null);
        setField(term236313, term236313.getClass(), "escape", null);
        setBooleanField(term236313, term236313.getClass(), "ignoreSurroundingSpaces", true);
        setBooleanField(term236313, term236313.getClass(), "ignoreEmptyLines", true);
        setField(term236313, term236313.getClass(), "recordSeparator", "");
        setField(term236313, term236313.getClass(), "nullString", null);
        setField(term236313, term236313.getClass(), "header", null);
        setBooleanField(term236313, term236313.getClass(), "skipHeaderRecord", true);
        Character term236321 = new Character((char) 0);
        Class<? extends Object> term236645 = Class.forName((String) "org.apache.commons.csv.Quote");
        Field term236644 = ((Class) term236645).getDeclaredField((String) "NONE");
        ((Field) term236644).setAccessible(true);
        Object enum385 = ((Field) term236644).get((Object) null);
        term236320 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        setCharField(term236320, term236320.getClass(), "delimiter", (char) 0);
        setField(term236320, term236320.getClass(), "quoteChar", term236321);
        setField(term236320, term236320.getClass(), "quotePolicy", enum385);
        setField(term236320, term236320.getClass(), "commentStart", null);
        setField(term236320, term236320.getClass(), "escape", null);
        setBooleanField(term236320, term236320.getClass(), "ignoreSurroundingSpaces", true);
        setBooleanField(term236320, term236320.getClass(), "ignoreEmptyLines", true);
        setField(term236320, term236320.getClass(), "recordSeparator", null);
        setField(term236320, term236320.getClass(), "nullString", null);
        setField(term236320, term236320.getClass(), "header", null);
        setBooleanField(term236320, term236320.getClass(), "skipHeaderRecord", true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.csv.CSVFormat");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term236007;
        Object retValue = callMethod(klass, "equals", argTypes, term235782, args);
        assertTrue(recursiveEquals(term235782, term236313));
        assertTrue(recursiveEquals(term236007, term236320));
        assertTrue(recursiveEquals(retValue, false));
    }

};


