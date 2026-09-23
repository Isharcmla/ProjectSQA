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

public class CSVPrinter_printRecord_2092483930349 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term998353;
     Object term997582;

    public CSVPrinter_printRecord_2092483930349() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Character term998475 = new Character((char) 2);
        Class<? extends Object> term999415 = Class.forName((String) "org.apache.commons.csv.Quote");
        Field term999414 = ((Class) term999415).getDeclaredField((String) "NONE");
        ((Field) term999414).setAccessible(true);
        Object enum340 = ((Field) term999414).get((Object) null);
        term998353 = newInstance(Class.forName("org.apache.commons.csv.CSVPrinter"));
        Object term998423 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        setBooleanField(term998353, term998353.getClass(), "newRecord", true);
        setField(term998423, term998423.getClass(), "quoteChar", term998475);
        setCharField(term998423, term998423.getClass(), "delimiter", (char) 32);
        setField(term998423, term998423.getClass(), "quotePolicy", enum340);
        setField(term998353, term998353.getClass(), "format", term998423);
        Class<? extends Object> term999574 = Class.forName((String) "org.apache.commons.csv.Quote");
        Field term999573 = ((Class) term999574).getDeclaredField((String) "ALL");
        ((Field) term999573).setAccessible(true);
        Object enum341 = ((Field) term999573).get((Object) null);
        term997582 = (Object[]) newArray("java.lang.Object", 2);
        Object term998647 = newInstance(Class.forName("org.apache.commons.csv.CSVPrinter"));
        setElement(term997582, 0, term998647);
        setElement(term997582, 1, enum341);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.csv.CSVPrinter");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(Class.forName("java.lang.Object"), 0).getClass();
        Object[] args = new Object[1];
        args[0] = term997582;
        try {
            callMethod(klass, "printRecord", argTypes, term998353, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


