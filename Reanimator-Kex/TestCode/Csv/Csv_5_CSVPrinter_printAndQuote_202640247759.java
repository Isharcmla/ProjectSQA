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

public class CSVPrinter_printAndQuote_202640247759 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term24803;

    public CSVPrinter_printAndQuote_202640247759() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Character term24925 = new Character((char) 0);
        Class<? extends Object> term25527 = Class.forName((String) "org.apache.commons.csv.Quote");
        Field term25526 = ((Class) term25527).getDeclaredField((String) "NON_NUMERIC");
        ((Field) term25526).setAccessible(true);
        Object enum44 = ((Field) term25526).get((Object) null);
        term24803 = newInstance(Class.forName("org.apache.commons.csv.CSVPrinter"));
        Object term24873 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        setCharField(term24873, term24873.getClass(), "delimiter", (char) 0);
        setField(term24873, term24873.getClass(), "quoteChar", term24925);
        setField(term24873, term24873.getClass(), "quotePolicy", enum44);
        setField(term24803, term24803.getClass(), "format", term24873);
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
            callMethod(klass, "printAndQuote", argTypes, term24803, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


