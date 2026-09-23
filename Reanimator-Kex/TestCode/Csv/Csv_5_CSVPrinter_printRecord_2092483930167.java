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

public class CSVPrinter_printRecord_2092483930167 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term165306;
     Object term160288;

    public CSVPrinter_printRecord_2092483930167() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Character term165428 = new Character((char) 4);
        Class<? extends Object> term166116 = Class.forName((String) "org.apache.commons.csv.Quote");
        Field term166115 = ((Class) term166116).getDeclaredField((String) "NONE");
        ((Field) term166115).setAccessible(true);
        Object enum144 = ((Field) term166115).get((Object) null);
        term165306 = newInstance(Class.forName("org.apache.commons.csv.CSVPrinter"));
        Object term165376 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        setBooleanField(term165306, term165306.getClass(), "newRecord", true);
        setField(term165376, term165376.getClass(), "quoteChar", term165428);
        setCharField(term165376, term165376.getClass(), "delimiter", (char) 48123);
        setField(term165376, term165376.getClass(), "quotePolicy", enum144);
        setField(term165306, term165306.getClass(), "format", term165376);
        term160288 = (Object[]) newArray("java.lang.Object", 1);
        Object term165604 = newInstance(Class.forName("org.apache.commons.csv.CSVPrinter$1"));
        setElement(term160288, 0, term165604);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.csv.CSVPrinter");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(Class.forName("java.lang.Object"), 0).getClass();
        Object[] args = new Object[1];
        args[0] = term160288;
        try {
            callMethod(klass, "printRecord", argTypes, term165306, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


