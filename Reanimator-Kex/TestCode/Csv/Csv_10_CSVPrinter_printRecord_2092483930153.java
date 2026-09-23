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

public class CSVPrinter_printRecord_2092483930153 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term115602;
     Object term107420;

    public CSVPrinter_printRecord_2092483930153() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Character term115724 = new Character((char) 2);
        Class<? extends Object> term116371 = Class.forName((String) "org.apache.commons.csv.Quote");
        Field term116370 = ((Class) term116371).getDeclaredField((String) "ALL");
        ((Field) term116370).setAccessible(true);
        Object enum116 = ((Field) term116370).get((Object) null);
        term115602 = newInstance(Class.forName("org.apache.commons.csv.CSVPrinter"));
        Object term115672 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        setBooleanField(term115602, term115602.getClass(), "newRecord", true);
        setField(term115672, term115672.getClass(), "quoteChar", term115724);
        setCharField(term115672, term115672.getClass(), "delimiter", (char) 2);
        setField(term115672, term115672.getClass(), "quotePolicy", enum116);
        setField(term115602, term115602.getClass(), "format", term115672);
        term107420 = (Object[]) newArray("java.lang.Object", 1);
        Object term115896 = newInstance(Class.forName("org.apache.commons.csv.CSVPrinter"));
        setElement(term107420, 0, term115896);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.csv.CSVPrinter");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(Class.forName("java.lang.Object"), 0).getClass();
        Object[] args = new Object[1];
        args[0] = term107420;
        try {
            callMethod(klass, "printRecord", argTypes, term115602, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


