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

public class CSVPrinter_printRecord_2092483930215 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term275080;
     Object term274044;

    public CSVPrinter_printRecord_2092483930215() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Character term275202 = new Character((char) 554);
        Class<? extends Object> term276113 = Class.forName((String) "org.apache.commons.csv.Quote");
        Field term276112 = ((Class) term276113).getDeclaredField((String) "MINIMAL");
        ((Field) term276112).setAccessible(true);
        Object enum194 = ((Field) term276112).get((Object) null);
        term275080 = newInstance(Class.forName("org.apache.commons.csv.CSVPrinter"));
        Object term275150 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        setBooleanField(term275080, term275080.getClass(), "newRecord", true);
        setField(term275150, term275150.getClass(), "quoteChar", term275202);
        setCharField(term275150, term275150.getClass(), "delimiter", (char) 56789);
        setField(term275150, term275150.getClass(), "quotePolicy", enum194);
        setField(term275080, term275080.getClass(), "format", term275150);
        term274044 = (Object[]) newArray("java.lang.Object", 1);
        Object term275378 = newInstance(Class.forName("org.apache.commons.csv.CSVPrinter$1"));
        setElement(term274044, 0, term275378);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.csv.CSVPrinter");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(Class.forName("java.lang.Object"), 0).getClass();
        Object[] args = new Object[1];
        args[0] = term274044;
        try {
            callMethod(klass, "printRecord", argTypes, term275080, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


