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

public class CSVPrinter_printRecord_2092483930137 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term82548;
     Object term82325;

    public CSVPrinter_printRecord_2092483930137() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Character term82670 = new Character((char) 0);
        Class<? extends Object> term83605 = Class.forName((String) "org.apache.commons.csv.Quote");
        Field term83604 = ((Class) term83605).getDeclaredField((String) "MINIMAL");
        ((Field) term83604).setAccessible(true);
        Object enum100 = ((Field) term83604).get((Object) null);
        term82548 = newInstance(Class.forName("org.apache.commons.csv.CSVPrinter"));
        Object term82618 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        setBooleanField(term82548, term82548.getClass(), "newRecord", true);
        setField(term82618, term82618.getClass(), "quoteChar", term82670);
        setCharField(term82618, term82618.getClass(), "delimiter", (char) 0);
        setField(term82618, term82618.getClass(), "quotePolicy", enum100);
        setField(term82548, term82548.getClass(), "format", term82618);
        term82325 = (Object[]) newArray("java.lang.Object", 2);
        Object term82842 = newInstance(Class.forName("org.apache.commons.csv.CSVPrinter"));
        Object term82880 = newInstance(Class.forName("java.lang.Object"));
        setElement(term82325, 0, term82842);
        setElement(term82325, 1, term82880);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.csv.CSVPrinter");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(Class.forName("java.lang.Object"), 0).getClass();
        Object[] args = new Object[1];
        args[0] = term82325;
        try {
            callMethod(klass, "printRecord", argTypes, term82548, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


