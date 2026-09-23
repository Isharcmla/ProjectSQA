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

public class CSVPrinter_printRecord_2092483930251 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term286559;
     Object term285248;

    public CSVPrinter_printRecord_2092483930251() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Character term286681 = new Character((char) 512);
        Class<? extends Object> term287587 = Class.forName((String) "org.apache.commons.csv.Quote");
        Field term287586 = ((Class) term287587).getDeclaredField((String) "MINIMAL");
        ((Field) term287586).setAccessible(true);
        Object enum211 = ((Field) term287586).get((Object) null);
        term286559 = newInstance(Class.forName("org.apache.commons.csv.CSVPrinter"));
        Object term286629 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        setBooleanField(term286559, term286559.getClass(), "newRecord", true);
        setField(term286629, term286629.getClass(), "quoteChar", term286681);
        setCharField(term286629, term286629.getClass(), "delimiter", (char) 32768);
        setField(term286629, term286629.getClass(), "quotePolicy", enum211);
        setField(term286559, term286559.getClass(), "format", term286629);
        term285248 = (Object[]) newArray("java.lang.Object", 1);
        Object term286853 = newInstance(Class.forName("org.apache.commons.csv.CSVPrinter"));
        setElement(term285248, 0, term286853);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.csv.CSVPrinter");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(Class.forName("java.lang.Object"), 0).getClass();
        Object[] args = new Object[1];
        args[0] = term285248;
        try {
            callMethod(klass, "printRecord", argTypes, term286559, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


