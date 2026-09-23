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

public class CSVPrinter_printRecord_209248393063 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term26482;
     Object term26291;

    public CSVPrinter_printRecord_209248393063() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Character term26604 = new Character((char) 0);
        Class<? extends Object> term27265 = Class.forName((String) "org.apache.commons.csv.Quote");
        Field term27264 = ((Class) term27265).getDeclaredField((String) "ALL");
        ((Field) term27264).setAccessible(true);
        Object enum46 = ((Field) term27264).get((Object) null);
        term26482 = newInstance(Class.forName("org.apache.commons.csv.CSVPrinter"));
        Object term26552 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        setBooleanField(term26482, term26482.getClass(), "newRecord", true);
        setField(term26552, term26552.getClass(), "quoteChar", term26604);
        setCharField(term26552, term26552.getClass(), "delimiter", (char) 0);
        setField(term26552, term26552.getClass(), "quotePolicy", enum46);
        setField(term26482, term26482.getClass(), "format", term26552);
        term26291 = (Object[]) newArray("java.lang.Object", 2);
        setElement(term26291, 0, "");
        setElement(term26291, 1, enum46);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.csv.CSVPrinter");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(Class.forName("java.lang.Object"), 0).getClass();
        Object[] args = new Object[1];
        args[0] = term26291;
        try {
            callMethod(klass, "printRecord", argTypes, term26482, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


