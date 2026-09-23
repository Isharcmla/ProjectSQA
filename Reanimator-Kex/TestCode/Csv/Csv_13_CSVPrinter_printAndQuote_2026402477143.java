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

public class CSVPrinter_printAndQuote_2026402477143 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term117431;

    public CSVPrinter_printAndQuote_2026402477143() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Character term117553 = new Character((char) 0);
        Class<? extends Object> term118189 = Class.forName((String) "org.apache.commons.csv.QuoteMode");
        Field term118188 = ((Class) term118189).getDeclaredField((String) "NON_NUMERIC");
        ((Field) term118188).setAccessible(true);
        Object enum120 = ((Field) term118188).get((Object) null);
        term117431 = newInstance(Class.forName("org.apache.commons.csv.CSVPrinter"));
        Object term117501 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        setCharField(term117501, term117501.getClass(), "delimiter", (char) 0);
        setField(term117501, term117501.getClass(), "quoteCharacter", term117553);
        setField(term117501, term117501.getClass(), "quoteMode", enum120);
        setField(term117431, term117431.getClass(), "format", term117501);
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
            callMethod(klass, "printAndQuote", argTypes, term117431, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


