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

public class CSVFormat_equals_34081098255 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term135664;
     Object term135799;
     Object term136039;
     Object term136043;

    public CSVFormat_equals_34081098255() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term136049 = Class.forName((String) "org.apache.commons.csv.Quote");
        Field term136048 = ((Class) term136049).getDeclaredField((String) "ALL");
        ((Field) term136048).setAccessible(true);
        Object enum231 = ((Field) term136048).get((Object) null);
        term135664 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        setCharField(term135664, term135664.getClass(), "delimiter", (char) 0);
        setField(term135664, term135664.getClass(), "quotePolicy", enum231);
        setField(term135664, term135664.getClass(), "quoteChar", null);
        setField(term135664, term135664.getClass(), "commentStart", null);
        setField(term135664, term135664.getClass(), "escape", null);
        setField(term135664, term135664.getClass(), "nullString", null);
        setField(term135664, term135664.getClass(), "header", null);
        setBooleanField(term135664, term135664.getClass(), "ignoreSurroundingSpaces", false);
        term135799 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        setCharField(term135799, term135799.getClass(), "delimiter", (char) 0);
        setField(term135799, term135799.getClass(), "quotePolicy", enum231);
        setField(term135799, term135799.getClass(), "quoteChar", null);
        setField(term135799, term135799.getClass(), "commentStart", null);
        setField(term135799, term135799.getClass(), "escape", null);
        setField(term135799, term135799.getClass(), "nullString", null);
        setField(term135799, term135799.getClass(), "header", null);
        setBooleanField(term135799, term135799.getClass(), "ignoreSurroundingSpaces", true);
        Class<? extends Object> term136205 = Class.forName((String) "org.apache.commons.csv.Quote");
        Field term136204 = ((Class) term136205).getDeclaredField((String) "ALL");
        ((Field) term136204).setAccessible(true);
        Object enum232 = ((Field) term136204).get((Object) null);
        term136039 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        setCharField(term136039, term136039.getClass(), "delimiter", (char) 0);
        setField(term136039, term136039.getClass(), "quoteChar", null);
        setField(term136039, term136039.getClass(), "quotePolicy", enum232);
        setField(term136039, term136039.getClass(), "commentStart", null);
        setField(term136039, term136039.getClass(), "escape", null);
        setBooleanField(term136039, term136039.getClass(), "ignoreSurroundingSpaces", false);
        setBooleanField(term136039, term136039.getClass(), "ignoreEmptyLines", false);
        setField(term136039, term136039.getClass(), "recordSeparator", null);
        setField(term136039, term136039.getClass(), "nullString", null);
        setField(term136039, term136039.getClass(), "header", null);
        setBooleanField(term136039, term136039.getClass(), "skipHeaderRecord", false);
        Class<? extends Object> term136361 = Class.forName((String) "org.apache.commons.csv.Quote");
        Field term136360 = ((Class) term136361).getDeclaredField((String) "ALL");
        ((Field) term136360).setAccessible(true);
        Object enum233 = ((Field) term136360).get((Object) null);
        term136043 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        setCharField(term136043, term136043.getClass(), "delimiter", (char) 0);
        setField(term136043, term136043.getClass(), "quoteChar", null);
        setField(term136043, term136043.getClass(), "quotePolicy", enum233);
        setField(term136043, term136043.getClass(), "commentStart", null);
        setField(term136043, term136043.getClass(), "escape", null);
        setBooleanField(term136043, term136043.getClass(), "ignoreSurroundingSpaces", true);
        setBooleanField(term136043, term136043.getClass(), "ignoreEmptyLines", false);
        setField(term136043, term136043.getClass(), "recordSeparator", null);
        setField(term136043, term136043.getClass(), "nullString", null);
        setField(term136043, term136043.getClass(), "header", null);
        setBooleanField(term136043, term136043.getClass(), "skipHeaderRecord", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.csv.CSVFormat");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term135799;
        Object retValue = callMethod(klass, "equals", argTypes, term135664, args);
        assertTrue(recursiveEquals(term135664, term136039));
        assertTrue(recursiveEquals(term135799, term136043));
        assertTrue(recursiveEquals(retValue, false));
    }

};


