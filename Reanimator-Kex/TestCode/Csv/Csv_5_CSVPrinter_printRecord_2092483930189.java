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

public class CSVPrinter_printRecord_2092483930189 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term227817;
     Object term208360;

    public CSVPrinter_printRecord_2092483930189() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Character term227939 = new Character((char) 12252);
        Class<? extends Object> term228647 = Class.forName((String) "org.apache.commons.csv.Quote");
        Field term228646 = ((Class) term228647).getDeclaredField((String) "NON_NUMERIC");
        ((Field) term228646).setAccessible(true);
        Object enum166 = ((Field) term228646).get((Object) null);
        term227817 = newInstance(Class.forName("org.apache.commons.csv.CSVPrinter"));
        Object term227887 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        setBooleanField(term227817, term227817.getClass(), "newRecord", true);
        setField(term227887, term227887.getClass(), "quoteChar", term227939);
        setCharField(term227887, term227887.getClass(), "delimiter", (char) 53281);
        setField(term227887, term227887.getClass(), "quotePolicy", enum166);
        setField(term227817, term227817.getClass(), "format", term227887);
        term208360 = (Object[]) newArray("java.lang.Object", 1);
        Object term228115 = newInstance(Class.forName("org.apache.commons.csv.CSVPrinter$1"));
        setElement(term208360, 0, term228115);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.csv.CSVPrinter");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(Class.forName("java.lang.Object"), 0).getClass();
        Object[] args = new Object[1];
        args[0] = term208360;
        try {
            callMethod(klass, "printRecord", argTypes, term227817, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


