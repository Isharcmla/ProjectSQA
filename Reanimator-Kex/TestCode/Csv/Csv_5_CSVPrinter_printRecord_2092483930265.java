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

public class CSVPrinter_printRecord_2092483930265 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term841320;
     Object term841129;

    public CSVPrinter_printRecord_2092483930265() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Character term841442 = new Character((char) 0);
        Class<? extends Object> term842105 = Class.forName((String) "org.apache.commons.csv.Quote");
        Field term842104 = ((Class) term842105).getDeclaredField((String) "ALL");
        ((Field) term842104).setAccessible(true);
        Object enum254 = ((Field) term842104).get((Object) null);
        term841320 = newInstance(Class.forName("org.apache.commons.csv.CSVPrinter"));
        Object term841390 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        setBooleanField(term841320, term841320.getClass(), "newRecord", true);
        setField(term841390, term841390.getClass(), "quoteChar", term841442);
        setCharField(term841390, term841390.getClass(), "delimiter", (char) 0);
        setField(term841390, term841390.getClass(), "quotePolicy", enum254);
        setField(term841320, term841320.getClass(), "format", term841390);
        term841129 = (Object[]) newArray("java.lang.Object", 2);
        setElement(term841129, 0, "");
        setElement(term841129, 1, enum254);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.csv.CSVPrinter");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(Class.forName("java.lang.Object"), 0).getClass();
        Object[] args = new Object[1];
        args[0] = term841129;
        try {
            callMethod(klass, "printRecord", argTypes, term841320, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


