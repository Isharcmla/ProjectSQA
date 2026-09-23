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

public class CSVPrinter_printRecord_209248393093 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term40016;
     Object term39718;

    public CSVPrinter_printRecord_209248393093() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Character term40138 = new Character((char) 0);
        Class<? extends Object> term40832 = Class.forName((String) "org.apache.commons.csv.Quote");
        Field term40831 = ((Class) term40832).getDeclaredField((String) "ALL");
        ((Field) term40831).setAccessible(true);
        Object enum62 = ((Field) term40831).get((Object) null);
        term40016 = newInstance(Class.forName("org.apache.commons.csv.CSVPrinter"));
        Object term40086 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        setBooleanField(term40016, term40016.getClass(), "newRecord", true);
        setField(term40086, term40086.getClass(), "quoteChar", term40138);
        setCharField(term40086, term40086.getClass(), "delimiter", (char) 0);
        setField(term40086, term40086.getClass(), "quotePolicy", enum62);
        setField(term40016, term40016.getClass(), "format", term40086);
        term39718 = (Object[]) newArray("java.lang.Object", 18);
        Object term40310 = newInstance(Class.forName("org.apache.commons.csv.CSVPrinter"));
        setElement(term39718, 0, term40310);
        setElement(term39718, 4, "NON_NUMERIC");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.csv.CSVPrinter");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(Class.forName("java.lang.Object"), 0).getClass();
        Object[] args = new Object[1];
        args[0] = term39718;
        try {
            callMethod(klass, "printRecord", argTypes, term40016, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


