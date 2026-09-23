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
     Object term898368;
     Object term897601;

    public CSVPrinter_printRecord_2092483930301() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Character term898490 = new Character((char) 0);
        Class<? extends Object> term899201 = Class.forName((String) "org.apache.commons.csv.Quote");
        Field term899200 = ((Class) term899201).getDeclaredField((String) "ALL");
        ((Field) term899200).setAccessible(true);
        Object enum293 = ((Field) term899200).get((Object) null);
        Character term898642 = new Character((char) 0);
        term898368 = newInstance(Class.forName("org.apache.commons.csv.CSVPrinter"));
        Object term898438 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        setBooleanField(term898368, term898368.getClass(), "newRecord", true);
        setField(term898438, term898438.getClass(), "quoteChar", term898490);
        setCharField(term898438, term898438.getClass(), "delimiter", (char) 0);
        setField(term898438, term898438.getClass(), "quotePolicy", enum293);
        setField(term898438, term898438.getClass(), "escape", term898642);
        setField(term898368, term898368.getClass(), "format", term898438);
        term897601 = (Object[]) newArray("java.lang.Object", 1);
        Object term898718 = newInstance(Class.forName("org.apache.commons.csv.CSVPrinter$1"));
        setElement(term897601, 0, term898718);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.csv.CSVPrinter");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(Class.forName("java.lang.Object"), 0).getClass();
        Object[] args = new Object[1];
        args[0] = term897601;
        try {
            callMethod(klass, "printRecord", argTypes, term898368, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


