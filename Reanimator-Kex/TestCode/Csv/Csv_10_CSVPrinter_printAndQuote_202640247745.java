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

public class CSVPrinter_printAndQuote_202640247745 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term17809;

    public CSVPrinter_printAndQuote_202640247745() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Character term17931 = new Character((char) 0);
        Class<? extends Object> term18822 = Class.forName((String) "org.apache.commons.csv.Quote");
        Field term18821 = ((Class) term18822).getDeclaredField((String) "NON_NUMERIC");
        ((Field) term18821).setAccessible(true);
        Object enum36 = ((Field) term18821).get((Object) null);
        term17809 = newInstance(Class.forName("org.apache.commons.csv.CSVPrinter"));
        Object term17879 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        setCharField(term17879, term17879.getClass(), "delimiter", (char) 0);
        setField(term17879, term17879.getClass(), "quoteChar", term17931);
        setField(term17879, term17879.getClass(), "quotePolicy", enum36);
        setField(term17809, term17809.getClass(), "format", term17879);
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
            callMethod(klass, "printAndQuote", argTypes, term17809, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


