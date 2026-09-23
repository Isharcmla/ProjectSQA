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
     Object term349357;
     Object term348536;

    public CSVPrinter_printRecord_2092483930251() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Character term349479 = new Character((char) 24576);
        Class<? extends Object> term350225 = Class.forName((String) "org.apache.commons.csv.Quote");
        Field term350224 = ((Class) term350225).getDeclaredField((String) "NON_NUMERIC");
        ((Field) term350224).setAccessible(true);
        Object enum234 = ((Field) term350224).get((Object) null);
        term349357 = newInstance(Class.forName("org.apache.commons.csv.CSVPrinter"));
        Object term349427 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        setBooleanField(term349357, term349357.getClass(), "newRecord", true);
        setField(term349427, term349427.getClass(), "quoteChar", term349479);
        setCharField(term349427, term349427.getClass(), "delimiter", (char) 2048);
        setField(term349427, term349427.getClass(), "quotePolicy", enum234);
        setField(term349357, term349357.getClass(), "format", term349427);
        term348536 = (Object[]) newArray("java.lang.Object", 2);
        Object term349655 = newInstance(Class.forName("org.apache.commons.csv.CSVPrinter$1"));
        Object term349693 = newInstance(Class.forName("java.lang.Object"));
        setElement(term348536, 0, term349655);
        setElement(term348536, 1, term349693);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.csv.CSVPrinter");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(Class.forName("java.lang.Object"), 0).getClass();
        Object[] args = new Object[1];
        args[0] = term348536;
        try {
            callMethod(klass, "printRecord", argTypes, term349357, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


