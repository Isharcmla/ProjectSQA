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

public class CSVPrinter_printAndQuote_202640247779 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term31708;

    public CSVPrinter_printAndQuote_202640247779() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Character term31830 = new Character((char) 0);
        Class<? extends Object> term32383 = Class.forName((String) "org.apache.commons.csv.Quote");
        Field term32382 = ((Class) term32383).getDeclaredField((String) "ALL");
        ((Field) term32382).setAccessible(true);
        Object enum50 = ((Field) term32382).get((Object) null);
        term31708 = newInstance(Class.forName("org.apache.commons.csv.CSVPrinter"));
        Object term31778 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        setCharField(term31778, term31778.getClass(), "delimiter", (char) 0);
        setField(term31778, term31778.getClass(), "quoteChar", term31830);
        setField(term31778, term31778.getClass(), "quotePolicy", enum50);
        setField(term31708, term31708.getClass(), "format", term31778);
        setBooleanField(term31708, term31708.getClass(), "newRecord", true);
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
            callMethod(klass, "printAndQuote", argTypes, term31708, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


