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

public class CSVPrinter_printAndQuote_202640247750 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term20417;
     Object term20687;

    public CSVPrinter_printAndQuote_202640247750() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Character term20539 = new Character((char) 0);
        Class<? extends Object> term22465 = Class.forName((String) "org.apache.commons.csv.Quote");
        Field term22464 = ((Class) term22465).getDeclaredField((String) "NONE");
        ((Field) term22464).setAccessible(true);
        Object enum41 = ((Field) term22464).get((Object) null);
        term20417 = newInstance(Class.forName("org.apache.commons.csv.CSVPrinter"));
        Object term20487 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        setCharField(term20487, term20487.getClass(), "delimiter", (char) 0);
        setField(term20487, term20487.getClass(), "quoteChar", term20539);
        setField(term20487, term20487.getClass(), "quotePolicy", enum41);
        setField(term20417, term20417.getClass(), "format", term20487);
        term20687 = new Integer(0);
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
        args[0] = term20687;
        args[1] = null;
        args[2] = 0;
        args[3] = 0;
        try {
            callMethod(klass, "printAndQuote", argTypes, term20417, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


