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
import java.lang.Object;
import java.lang.Character;
import java.lang.String;

public class CSVPrinter_printRecord_3804693124 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3050;

    public CSVPrinter_printRecord_3804693124() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Character term3053 = new Character('Y');
        Class<? extends Object> term10710 = Class.forName((String) "org.apache.commons.csv.Quote");
        Field term10709 = ((Class) term10710).getDeclaredField((String) "NON_NUMERIC");
        ((Field) term10709).setAccessible(true);
        Object enum26 = ((Field) term10709).get((Object) null);
        Character term3070 = new Character('F');
        Character term3072 = new Character('s');
        term3050 = newInstance(Class.forName("org.apache.commons.csv.CSVPrinter"));
        Object term3051 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        Object[] term3100 = (Object[]) newArray("java.lang.String", 1);
        setField(term3050, term3050.getClass(), "out", null);
        setCharField(term3051, term3051.getClass(), "delimiter", 'D');
        setField(term3051, term3051.getClass(), "quoteChar", term3053);
        setField(term3051, term3051.getClass(), "quotePolicy", enum26);
        setField(term3051, term3051.getClass(), "commentStart", term3070);
        setField(term3051, term3051.getClass(), "escape", term3072);
        setBooleanField(term3051, term3051.getClass(), "ignoreSurroundingSpaces", true);
        setBooleanField(term3051, term3051.getClass(), "ignoreEmptyLines", true);
        setField(term3051, term3051.getClass(), "recordSeparator", "MLqYREekMl");
        setField(term3051, term3051.getClass(), "nullString", "ytSBIKXogI");
        setElement(term3100, 0, "nHXjMycHlU");
        setField(term3051, term3051.getClass(), "header", term3100);
        setBooleanField(term3051, term3051.getClass(), "skipHeaderRecord", true);
        setField(term3050, term3050.getClass(), "format", term3051);
        setBooleanField(term3050, term3050.getClass(), "newRecord", true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.csv.CSVPrinter");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Iterable");
        Object[] args = new Object[1];
        args[0] = null;
        try {
            callMethod(klass, "printRecord", argTypes, term3050, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


