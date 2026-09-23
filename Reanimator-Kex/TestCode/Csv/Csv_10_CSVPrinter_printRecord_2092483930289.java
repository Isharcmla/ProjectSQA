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

public class CSVPrinter_printRecord_2092483930289 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term340915;
     Object term340124;

    public CSVPrinter_printRecord_2092483930289() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Character term341037 = new Character((char) 12284);
        Class<? extends Object> term341684 = Class.forName((String) "org.apache.commons.csv.Quote");
        Field term341683 = ((Class) term341684).getDeclaredField((String) "ALL");
        ((Field) term341683).setAccessible(true);
        Object enum249 = ((Field) term341683).get((Object) null);
        term340915 = newInstance(Class.forName("org.apache.commons.csv.CSVPrinter"));
        Object term340985 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        setBooleanField(term340915, term340915.getClass(), "newRecord", true);
        setField(term340985, term340985.getClass(), "quoteChar", term341037);
        setCharField(term340985, term340985.getClass(), "delimiter", (char) 12284);
        setField(term340985, term340985.getClass(), "quotePolicy", enum249);
        setField(term340915, term340915.getClass(), "format", term340985);
        term340124 = (Object[]) newArray("java.lang.Object", 1);
        Object term341209 = newInstance(Class.forName("org.apache.commons.csv.CSVPrinter"));
        setElement(term340124, 0, term341209);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.csv.CSVPrinter");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(Class.forName("java.lang.Object"), 0).getClass();
        Object[] args = new Object[1];
        args[0] = term340124;
        try {
            callMethod(klass, "printRecord", argTypes, term340915, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


