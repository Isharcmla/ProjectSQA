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

public class CSVFormat_equals_34081098285 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term153612;
     Object term153747;
     Object term154039;
     Object term154043;

    public CSVFormat_equals_34081098285() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term154051 = Class.forName((String) "org.apache.commons.csv.Quote");
        Field term154050 = ((Class) term154051).getDeclaredField((String) "ALL");
        ((Field) term154050).setAccessible(true);
        Object enum281 = ((Field) term154050).get((Object) null);
        term153612 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        setCharField(term153612, term153612.getClass(), "delimiter", (char) 0);
        setField(term153612, term153612.getClass(), "quotePolicy", enum281);
        setField(term153612, term153612.getClass(), "quoteChar", null);
        setField(term153612, term153612.getClass(), "commentStart", null);
        setField(term153612, term153612.getClass(), "escape", null);
        setField(term153612, term153612.getClass(), "nullString", null);
        setField(term153612, term153612.getClass(), "header", null);
        setBooleanField(term153612, term153612.getClass(), "ignoreSurroundingSpaces", false);
        setBooleanField(term153612, term153612.getClass(), "ignoreEmptyLines", true);
        setBooleanField(term153612, term153612.getClass(), "skipHeaderRecord", true);
        setField(term153612, term153612.getClass(), "recordSeparator", null);
        term153747 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        setCharField(term153747, term153747.getClass(), "delimiter", (char) 0);
        setField(term153747, term153747.getClass(), "quotePolicy", enum281);
        setField(term153747, term153747.getClass(), "quoteChar", null);
        setField(term153747, term153747.getClass(), "commentStart", null);
        setField(term153747, term153747.getClass(), "escape", null);
        setField(term153747, term153747.getClass(), "nullString", null);
        setField(term153747, term153747.getClass(), "header", null);
        setBooleanField(term153747, term153747.getClass(), "ignoreSurroundingSpaces", false);
        setBooleanField(term153747, term153747.getClass(), "ignoreEmptyLines", true);
        setBooleanField(term153747, term153747.getClass(), "skipHeaderRecord", true);
        setField(term153747, term153747.getClass(), "recordSeparator", "NONE");
        Class<? extends Object> term154211 = Class.forName((String) "org.apache.commons.csv.Quote");
        Field term154210 = ((Class) term154211).getDeclaredField((String) "ALL");
        ((Field) term154210).setAccessible(true);
        Object enum282 = ((Field) term154210).get((Object) null);
        term154039 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        setCharField(term154039, term154039.getClass(), "delimiter", (char) 0);
        setField(term154039, term154039.getClass(), "quoteChar", null);
        setField(term154039, term154039.getClass(), "quotePolicy", enum282);
        setField(term154039, term154039.getClass(), "commentStart", null);
        setField(term154039, term154039.getClass(), "escape", null);
        setBooleanField(term154039, term154039.getClass(), "ignoreSurroundingSpaces", false);
        setBooleanField(term154039, term154039.getClass(), "ignoreEmptyLines", true);
        setField(term154039, term154039.getClass(), "recordSeparator", null);
        setField(term154039, term154039.getClass(), "nullString", null);
        setField(term154039, term154039.getClass(), "header", null);
        setBooleanField(term154039, term154039.getClass(), "skipHeaderRecord", true);
        Class<? extends Object> term154367 = Class.forName((String) "org.apache.commons.csv.Quote");
        Field term154366 = ((Class) term154367).getDeclaredField((String) "ALL");
        ((Field) term154366).setAccessible(true);
        Object enum283 = ((Field) term154366).get((Object) null);
        term154043 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        setCharField(term154043, term154043.getClass(), "delimiter", (char) 0);
        setField(term154043, term154043.getClass(), "quoteChar", null);
        setField(term154043, term154043.getClass(), "quotePolicy", enum283);
        setField(term154043, term154043.getClass(), "commentStart", null);
        setField(term154043, term154043.getClass(), "escape", null);
        setBooleanField(term154043, term154043.getClass(), "ignoreSurroundingSpaces", false);
        setBooleanField(term154043, term154043.getClass(), "ignoreEmptyLines", true);
        setField(term154043, term154043.getClass(), "recordSeparator", "NONE");
        setField(term154043, term154043.getClass(), "nullString", null);
        setField(term154043, term154043.getClass(), "header", null);
        setBooleanField(term154043, term154043.getClass(), "skipHeaderRecord", true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.csv.CSVFormat");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term153747;
        Object retValue = callMethod(klass, "equals", argTypes, term153612, args);
        assertTrue(recursiveEquals(term153612, term154039));
        assertTrue(recursiveEquals(term153747, term154043));
        assertTrue(recursiveEquals(retValue, false));
    }

};


