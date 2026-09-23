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

public class CSVFormat_equals_34081098295 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term160369;
     Object term160556;
     Object term160872;
     Object term160877;

    public CSVFormat_equals_34081098295() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term160884 = Class.forName((String) "org.apache.commons.csv.Quote");
        Field term160883 = ((Class) term160884).getDeclaredField((String) "MINIMAL");
        ((Field) term160883).setAccessible(true);
        Object enum300 = ((Field) term160883).get((Object) null);
        Character term160521 = new Character((char) 0);
        term160369 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        setCharField(term160369, term160369.getClass(), "delimiter", (char) 0);
        setField(term160369, term160369.getClass(), "quotePolicy", enum300);
        setField(term160369, term160369.getClass(), "quoteChar", null);
        setField(term160369, term160369.getClass(), "commentStart", term160521);
        Character term160658 = new Character((char) 0);
        term160556 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        setCharField(term160556, term160556.getClass(), "delimiter", (char) 0);
        setField(term160556, term160556.getClass(), "quotePolicy", enum300);
        setField(term160556, term160556.getClass(), "quoteChar", null);
        setField(term160556, term160556.getClass(), "commentStart", term160658);
        Class<? extends Object> term161052 = Class.forName((String) "org.apache.commons.csv.Quote");
        Field term161051 = ((Class) term161052).getDeclaredField((String) "MINIMAL");
        ((Field) term161051).setAccessible(true);
        Object enum301 = ((Field) term161051).get((Object) null);
        Character term160876 = new Character((char) 0);
        term160872 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        setCharField(term160872, term160872.getClass(), "delimiter", (char) 0);
        setField(term160872, term160872.getClass(), "quoteChar", null);
        setField(term160872, term160872.getClass(), "quotePolicy", enum301);
        setField(term160872, term160872.getClass(), "commentStart", term160876);
        setField(term160872, term160872.getClass(), "escape", null);
        setBooleanField(term160872, term160872.getClass(), "ignoreSurroundingSpaces", false);
        setBooleanField(term160872, term160872.getClass(), "ignoreEmptyLines", false);
        setField(term160872, term160872.getClass(), "recordSeparator", null);
        setField(term160872, term160872.getClass(), "nullString", null);
        setField(term160872, term160872.getClass(), "header", null);
        setBooleanField(term160872, term160872.getClass(), "skipHeaderRecord", false);
        Class<? extends Object> term161220 = Class.forName((String) "org.apache.commons.csv.Quote");
        Field term161219 = ((Class) term161220).getDeclaredField((String) "MINIMAL");
        ((Field) term161219).setAccessible(true);
        Object enum302 = ((Field) term161219).get((Object) null);
        Character term160881 = new Character((char) 0);
        term160877 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        setCharField(term160877, term160877.getClass(), "delimiter", (char) 0);
        setField(term160877, term160877.getClass(), "quoteChar", null);
        setField(term160877, term160877.getClass(), "quotePolicy", enum302);
        setField(term160877, term160877.getClass(), "commentStart", term160881);
        setField(term160877, term160877.getClass(), "escape", null);
        setBooleanField(term160877, term160877.getClass(), "ignoreSurroundingSpaces", false);
        setBooleanField(term160877, term160877.getClass(), "ignoreEmptyLines", false);
        setField(term160877, term160877.getClass(), "recordSeparator", null);
        setField(term160877, term160877.getClass(), "nullString", null);
        setField(term160877, term160877.getClass(), "header", null);
        setBooleanField(term160877, term160877.getClass(), "skipHeaderRecord", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.csv.CSVFormat");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term160556;
        Object retValue = callMethod(klass, "equals", argTypes, term160369, args);
        assertTrue(recursiveEquals(term160369, term160872));
        assertTrue(recursiveEquals(term160556, term160877));
        assertTrue(recursiveEquals(retValue, true));
    }

};


