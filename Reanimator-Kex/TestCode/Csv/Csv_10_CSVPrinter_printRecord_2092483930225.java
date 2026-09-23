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

public class CSVPrinter_printRecord_2092483930225 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term236187;
     Object term233589;

    public CSVPrinter_printRecord_2092483930225() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Character term236309 = new Character((char) 256);
        Class<? extends Object> term236956 = Class.forName((String) "org.apache.commons.csv.Quote");
        Field term236955 = ((Class) term236956).getDeclaredField((String) "ALL");
        ((Field) term236955).setAccessible(true);
        Object enum185 = ((Field) term236955).get((Object) null);
        term236187 = newInstance(Class.forName("org.apache.commons.csv.CSVPrinter"));
        Object term236257 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        setBooleanField(term236187, term236187.getClass(), "newRecord", true);
        setField(term236257, term236257.getClass(), "quoteChar", term236309);
        setCharField(term236257, term236257.getClass(), "delimiter", (char) 4096);
        setField(term236257, term236257.getClass(), "quotePolicy", enum185);
        setField(term236187, term236187.getClass(), "format", term236257);
        term233589 = (Object[]) newArray("java.lang.Object", 1);
        Object term236481 = newInstance(Class.forName("org.apache.commons.csv.CSVPrinter"));
        setElement(term233589, 0, term236481);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.csv.CSVPrinter");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(Class.forName("java.lang.Object"), 0).getClass();
        Object[] args = new Object[1];
        args[0] = term233589;
        try {
            callMethod(klass, "printRecord", argTypes, term236187, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


