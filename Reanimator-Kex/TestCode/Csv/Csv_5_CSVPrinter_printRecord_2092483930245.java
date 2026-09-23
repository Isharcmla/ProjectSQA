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

public class CSVPrinter_printRecord_2092483930245 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term344079;
     Object term343450;

    public CSVPrinter_printRecord_2092483930245() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Character term344201 = new Character((char) 2);
        Class<? extends Object> term344852 = Class.forName((String) "org.apache.commons.csv.Quote");
        Field term344851 = ((Class) term344852).getDeclaredField((String) "ALL");
        ((Field) term344851).setAccessible(true);
        Object enum228 = ((Field) term344851).get((Object) null);
        term344079 = newInstance(Class.forName("org.apache.commons.csv.CSVPrinter"));
        Object term344149 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        setBooleanField(term344079, term344079.getClass(), "newRecord", true);
        setField(term344149, term344149.getClass(), "quoteChar", term344201);
        setCharField(term344149, term344149.getClass(), "delimiter", (char) 1);
        setField(term344149, term344149.getClass(), "quotePolicy", enum228);
        setField(term344079, term344079.getClass(), "format", term344149);
        term343450 = (Object[]) newArray("java.lang.Object", 1);
        Object term344377 = newInstance(Class.forName("org.apache.commons.csv.CSVPrinter$1"));
        setElement(term343450, 0, term344377);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.csv.CSVPrinter");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(Class.forName("java.lang.Object"), 0).getClass();
        Object[] args = new Object[1];
        args[0] = term343450;
        try {
            callMethod(klass, "printRecord", argTypes, term344079, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


