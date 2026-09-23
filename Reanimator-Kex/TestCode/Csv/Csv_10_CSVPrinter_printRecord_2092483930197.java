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

public class CSVPrinter_printRecord_2092483930197 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term189640;
     Object term186530;

    public CSVPrinter_printRecord_2092483930197() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Character term189762 = new Character((char) 0);
        Class<? extends Object> term190484 = Class.forName((String) "org.apache.commons.csv.Quote");
        Field term190483 = ((Class) term190484).getDeclaredField((String) "NONE");
        ((Field) term190483).setAccessible(true);
        Object enum159 = ((Field) term190483).get((Object) null);
        term189640 = newInstance(Class.forName("org.apache.commons.csv.CSVPrinter"));
        Object term189710 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        setBooleanField(term189640, term189640.getClass(), "newRecord", true);
        setField(term189710, term189710.getClass(), "quoteChar", term189762);
        setCharField(term189710, term189710.getClass(), "delimiter", (char) 0);
        setField(term189710, term189710.getClass(), "quotePolicy", enum159);
        setField(term189640, term189640.getClass(), "format", term189710);
        term186530 = (Object[]) newArray("java.lang.Object", 2);
        Object term189934 = newInstance(Class.forName("org.apache.commons.csv.CSVPrinter"));
        Object term189972 = newInstance(Class.forName("java.lang.Object"));
        setElement(term186530, 0, term189934);
        setElement(term186530, 1, term189972);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.csv.CSVPrinter");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(Class.forName("java.lang.Object"), 0).getClass();
        Object[] args = new Object[1];
        args[0] = term186530;
        try {
            callMethod(klass, "printRecord", argTypes, term189640, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


