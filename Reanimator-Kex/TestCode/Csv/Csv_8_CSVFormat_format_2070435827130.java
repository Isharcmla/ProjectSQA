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
import java.lang.NullPointerException;
import static org.apache.commons.csv.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Character;
import java.lang.Object;
import java.lang.String;

public class CSVFormat_format_2070435827130 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term60939;
     Object term58856;

    public CSVFormat_format_2070435827130() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Character term60991 = new Character((char) 0);
        Character term61043 = new Character((char) 6180);
        Character term61273 = new Character((char) 33546);
        Class<? extends Object> term62118 = Class.forName((String) "org.apache.commons.csv.Quote");
        Field term62117 = ((Class) term62118).getDeclaredField((String) "NON_NUMERIC");
        ((Field) term62117).setAccessible(true);
        Object enum150 = ((Field) term62117).get((Object) null);
        term60939 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        Object[] term59051 = (Object[]) newArray("java.lang.String", 0);
        setField(term60939, term60939.getClass(), "quoteChar", term60991);
        setCharField(term60939, term60939.getClass(), "delimiter", 'l');
        setField(term60939, term60939.getClass(), "escape", term61043);
        setField(term60939, term60939.getClass(), "commentStart", term61273);
        setField(term60939, term60939.getClass(), "header", term59051);
        setField(term60939, term60939.getClass(), "quotePolicy", enum150);
        term58856 = (Object[]) newArray("java.lang.Object", 3);
        Object term61247 = newInstance(Class.forName("java.io.CharArrayWriter"));
        setElement(term58856, 0, term61247);
        setElement(term58856, 1, term61273);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.csv.CSVFormat");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(Class.forName("java.lang.Object"), 0).getClass();
        Object[] args = new Object[1];
        args[0] = term58856;
        try {
            callMethod(klass, "format", argTypes, term60939, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


