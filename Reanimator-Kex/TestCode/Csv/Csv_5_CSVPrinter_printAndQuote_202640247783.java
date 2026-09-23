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

public class CSVPrinter_printAndQuote_202640247783 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term35976;

    public CSVPrinter_printAndQuote_202640247783() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Character term36098 = new Character((char) 0);
        Class<? extends Object> term36759 = Class.forName((String) "org.apache.commons.csv.Quote");
        Field term36758 = ((Class) term36759).getDeclaredField((String) "NON_NUMERIC");
        ((Field) term36758).setAccessible(true);
        Object enum56 = ((Field) term36758).get((Object) null);
        Character term36250 = new Character((char) 0);
        term35976 = newInstance(Class.forName("org.apache.commons.csv.CSVPrinter"));
        Object term36046 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        setCharField(term36046, term36046.getClass(), "delimiter", (char) 0);
        setField(term36046, term36046.getClass(), "quoteChar", term36098);
        setField(term36046, term36046.getClass(), "quotePolicy", enum56);
        setField(term36046, term36046.getClass(), "escape", term36250);
        setField(term35976, term35976.getClass(), "format", term36046);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.csv.CSVPrinter");
        Class<?>[] argTypes = new Class<?>[4];
        argTypes[0] = Class.forName("java.lang.Object");
        argTypes[1] = Class.forName("java.lang.CharSequence");
        argTypes[2] = int.class;
        argTypes[3] = int.class;
        Object[] args = new Object[4];
        args[0] = null;
        args[1] = null;
        args[2] = 0;
        args[3] = 0;
        try {
            callMethod(klass, "printAndQuote", argTypes, term35976, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


