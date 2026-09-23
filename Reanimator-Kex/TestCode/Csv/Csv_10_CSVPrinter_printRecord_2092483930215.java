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
     Object term212476;
     Object term212176;

    public CSVPrinter_printRecord_2092483930215() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Character term212598 = new Character((char) 32613);
        Class<? extends Object> term213358 = Class.forName((String) "org.apache.commons.csv.Quote");
        Field term213357 = ((Class) term213358).getDeclaredField((String) "NONE");
        ((Field) term213357).setAccessible(true);
        Object enum175 = ((Field) term213357).get((Object) null);
        term212476 = newInstance(Class.forName("org.apache.commons.csv.CSVPrinter"));
        Object term212546 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        setBooleanField(term212476, term212476.getClass(), "newRecord", true);
        setField(term212546, term212546.getClass(), "quoteChar", term212598);
        setCharField(term212546, term212546.getClass(), "delimiter", (char) 65524);
        setField(term212546, term212546.getClass(), "quotePolicy", enum175);
        setField(term212476, term212476.getClass(), "format", term212546);
        term212176 = (Object[]) newArray("java.lang.Object", 512);
        Object term212770 = newInstance(Class.forName("org.apache.commons.csv.CSVPrinter"));
        Object term212808 = newInstance(Class.forName("java.lang.Object"));
        Object term212846 = newInstance(Class.forName("java.lang.Object"));
        setElement(term212176, 0, term212770);
        setElement(term212176, 2, term212808);
        setElement(term212176, 8, term212846);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.csv.CSVPrinter");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(Class.forName("java.lang.Object"), 0).getClass();
        Object[] args = new Object[1];
        args[0] = term212176;
        try {
            callMethod(klass, "printRecord", argTypes, term212476, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


