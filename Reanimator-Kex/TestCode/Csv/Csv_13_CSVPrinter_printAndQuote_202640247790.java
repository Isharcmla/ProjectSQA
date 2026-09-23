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
import java.lang.Integer;

public class CSVPrinter_printAndQuote_202640247790 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term64800;
     Object term65078;

    public CSVPrinter_printAndQuote_202640247790() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Character term64922 = new Character((char) 0);
        Class<? extends Object> term66647 = Class.forName((String) "org.apache.commons.csv.QuoteMode");
        Field term66646 = ((Class) term66647).getDeclaredField((String) "NONE");
        ((Field) term66646).setAccessible(true);
        Object enum77 = ((Field) term66646).get((Object) null);
        term64800 = newInstance(Class.forName("org.apache.commons.csv.CSVPrinter"));
        Object term64870 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        setCharField(term64870, term64870.getClass(), "delimiter", (char) 0);
        setField(term64870, term64870.getClass(), "quoteCharacter", term64922);
        setField(term64870, term64870.getClass(), "quoteMode", enum77);
        setField(term64800, term64800.getClass(), "format", term64870);
        term65078 = new Integer(0);
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
        args[0] = term65078;
        args[1] = null;
        args[2] = 0;
        args[3] = 0;
        try {
            callMethod(klass, "printAndQuote", argTypes, term64800, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


