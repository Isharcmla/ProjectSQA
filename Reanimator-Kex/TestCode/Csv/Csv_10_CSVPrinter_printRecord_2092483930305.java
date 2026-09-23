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

public class CSVPrinter_printRecord_2092483930305 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term364047;
     Object term363749;

    public CSVPrinter_printRecord_2092483930305() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Character term364169 = new Character((char) 0);
        Class<? extends Object> term364865 = Class.forName((String) "org.apache.commons.csv.Quote");
        Field term364864 = ((Class) term364865).getDeclaredField((String) "ALL");
        ((Field) term364864).setAccessible(true);
        Object enum269 = ((Field) term364864).get((Object) null);
        term364047 = newInstance(Class.forName("org.apache.commons.csv.CSVPrinter"));
        Object term364117 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        setBooleanField(term364047, term364047.getClass(), "newRecord", true);
        setField(term364117, term364117.getClass(), "quoteChar", term364169);
        setCharField(term364117, term364117.getClass(), "delimiter", (char) 0);
        setField(term364117, term364117.getClass(), "quotePolicy", enum269);
        setField(term364047, term364047.getClass(), "format", term364117);
        term363749 = (Object[]) newArray("java.lang.Object", 18);
        Object term364341 = newInstance(Class.forName("org.apache.commons.csv.CSVPrinter"));
        setElement(term363749, 0, term364341);
        setElement(term363749, 4, "NON_NUMERIC");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.csv.CSVPrinter");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(Class.forName("java.lang.Object"), 0).getClass();
        Object[] args = new Object[1];
        args[0] = term363749;
        try {
            callMethod(klass, "printRecord", argTypes, term364047, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


