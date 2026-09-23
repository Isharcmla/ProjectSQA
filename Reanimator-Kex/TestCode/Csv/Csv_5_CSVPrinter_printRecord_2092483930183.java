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

public class CSVPrinter_printRecord_2092483930183 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term200864;
     Object term200630;

    public CSVPrinter_printRecord_2092483930183() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Character term200986 = new Character('d');
        Class<? extends Object> term201561 = Class.forName((String) "org.apache.commons.csv.Quote");
        Field term201560 = ((Class) term201561).getDeclaredField((String) "ALL");
        ((Field) term201560).setAccessible(true);
        Object enum158 = ((Field) term201560).get((Object) null);
        term200864 = newInstance(Class.forName("org.apache.commons.csv.CSVPrinter"));
        Object term200934 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        setBooleanField(term200864, term200864.getClass(), "newRecord", true);
        setField(term200934, term200934.getClass(), "quoteChar", term200986);
        setCharField(term200934, term200934.getClass(), "delimiter", (char) 0);
        setField(term200934, term200934.getClass(), "quotePolicy", enum158);
        setField(term200864, term200864.getClass(), "format", term200934);
        term200630 = (Object[]) newArray("java.lang.Object", 1);
        int[] term200631 = (int[]) newIntArray(0);
        setElement(term200630, 0, term200631);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.csv.CSVPrinter");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(Class.forName("java.lang.Object"), 0).getClass();
        Object[] args = new Object[1];
        args[0] = term200630;
        try {
            callMethod(klass, "printRecord", argTypes, term200864, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


