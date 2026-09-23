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

public class CSVPrinter_printRecord_2092483930331 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term959575;
     Object term956945;

    public CSVPrinter_printRecord_2092483930331() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Character term959697 = new Character((char) 64);
        Class<? extends Object> term960402 = Class.forName((String) "org.apache.commons.csv.Quote");
        Field term960401 = ((Class) term960402).getDeclaredField((String) "ALL");
        ((Field) term960401).setAccessible(true);
        Object enum323 = ((Field) term960401).get((Object) null);
        term959575 = newInstance(Class.forName("org.apache.commons.csv.CSVPrinter"));
        Object term959645 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        Object term959847 = newInstance(Class.forName("java.io.BufferedWriter"));
        setBooleanField(term959575, term959575.getClass(), "newRecord", true);
        setField(term959645, term959645.getClass(), "quoteChar", term959697);
        setCharField(term959645, term959645.getClass(), "delimiter", (char) 1);
        setField(term959645, term959645.getClass(), "quotePolicy", enum323);
        setField(term959575, term959575.getClass(), "format", term959645);
        setField(term959575, term959575.getClass(), "out", term959847);
        term956945 = (Object[]) newArray("java.lang.Object", 1);
        Object term959923 = newInstance(Class.forName("org.apache.commons.csv.CSVPrinter$1"));
        setElement(term956945, 0, term959923);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.csv.CSVPrinter");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(Class.forName("java.lang.Object"), 0).getClass();
        Object[] args = new Object[1];
        args[0] = term956945;
        try {
            callMethod(klass, "printRecord", argTypes, term959575, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


