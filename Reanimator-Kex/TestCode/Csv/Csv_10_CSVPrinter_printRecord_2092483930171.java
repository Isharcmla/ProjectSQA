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

public class CSVPrinter_printRecord_2092483930171 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term131496;
     Object term130944;

    public CSVPrinter_printRecord_2092483930171() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Character term131618 = new Character((char) 128);
        Class<? extends Object> term132265 = Class.forName((String) "org.apache.commons.csv.Quote");
        Field term132264 = ((Class) term132265).getDeclaredField((String) "ALL");
        ((Field) term132264).setAccessible(true);
        Object enum132 = ((Field) term132264).get((Object) null);
        term131496 = newInstance(Class.forName("org.apache.commons.csv.CSVPrinter"));
        Object term131566 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        setBooleanField(term131496, term131496.getClass(), "newRecord", true);
        setField(term131566, term131566.getClass(), "quoteChar", term131618);
        setCharField(term131566, term131566.getClass(), "delimiter", (char) 64);
        setField(term131566, term131566.getClass(), "quotePolicy", enum132);
        setField(term131496, term131496.getClass(), "format", term131566);
        term130944 = (Object[]) newArray("java.lang.Object", 1);
        Object term131790 = newInstance(Class.forName("org.apache.commons.csv.CSVPrinter"));
        setElement(term130944, 0, term131790);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.csv.CSVPrinter");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(Class.forName("java.lang.Object"), 0).getClass();
        Object[] args = new Object[1];
        args[0] = term130944;
        try {
            callMethod(klass, "printRecord", argTypes, term131496, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


