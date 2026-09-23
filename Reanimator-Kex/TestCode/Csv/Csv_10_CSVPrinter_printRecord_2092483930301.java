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

public class CSVPrinter_printRecord_2092483930301 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term358482;
     Object term357574;

    public CSVPrinter_printRecord_2092483930301() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Character term358604 = new Character((char) 8192);
        Class<? extends Object> term359308 = Class.forName((String) "org.apache.commons.csv.Quote");
        Field term359307 = ((Class) term359308).getDeclaredField((String) "NON_NUMERIC");
        ((Field) term359307).setAccessible(true);
        Object enum265 = ((Field) term359307).get((Object) null);
        term358482 = newInstance(Class.forName("org.apache.commons.csv.CSVPrinter"));
        Object term358552 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        setBooleanField(term358482, term358482.getClass(), "newRecord", true);
        setField(term358552, term358552.getClass(), "quoteChar", term358604);
        setCharField(term358552, term358552.getClass(), "delimiter", (char) 4);
        setField(term358552, term358552.getClass(), "quotePolicy", enum265);
        setField(term358482, term358482.getClass(), "format", term358552);
        term357574 = (Object[]) newArray("java.lang.Object", 1);
        Object term358776 = newInstance(Class.forName("org.apache.commons.csv.CSVPrinter"));
        setElement(term357574, 0, term358776);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.csv.CSVPrinter");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(Class.forName("java.lang.Object"), 0).getClass();
        Object[] args = new Object[1];
        args[0] = term357574;
        try {
            callMethod(klass, "printRecord", argTypes, term358482, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


