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

public class CSVPrinter_printAndQuote_202640247763 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term26206;

    public CSVPrinter_printAndQuote_202640247763() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Character term26328 = new Character((char) 0);
        Class<? extends Object> term27197 = Class.forName((String) "org.apache.commons.csv.Quote");
        Field term27196 = ((Class) term27197).getDeclaredField((String) "NON_NUMERIC");
        ((Field) term27196).setAccessible(true);
        Object enum46 = ((Field) term27196).get((Object) null);
        term26206 = newInstance(Class.forName("org.apache.commons.csv.CSVPrinter"));
        Object term26276 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        setCharField(term26276, term26276.getClass(), "delimiter", (char) 0);
        setField(term26276, term26276.getClass(), "quoteChar", term26328);
        setField(term26276, term26276.getClass(), "quotePolicy", enum46);
        setField(term26206, term26206.getClass(), "format", term26276);
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
            callMethod(klass, "printAndQuote", argTypes, term26206, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


