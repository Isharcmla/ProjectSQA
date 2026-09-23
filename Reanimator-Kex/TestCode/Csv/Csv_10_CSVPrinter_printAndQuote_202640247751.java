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
import java.nio.ReadOnlyBufferException;
import static org.apache.commons.csv.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.lang.Character;
import java.lang.String;

public class CSVPrinter_printAndQuote_202640247751 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term21609;
     Object term21967;

    public CSVPrinter_printAndQuote_202640247751() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Character term21731 = new Character((char) 0);
        Class<? extends Object> term22944 = Class.forName((String) "org.apache.commons.csv.Quote");
        Field term22943 = ((Class) term22944).getDeclaredField((String) "MINIMAL");
        ((Field) term22943).setAccessible(true);
        Object enum42 = ((Field) term22943).get((Object) null);
        term21609 = newInstance(Class.forName("org.apache.commons.csv.CSVPrinter"));
        Object term21679 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        Object term21891 = newInstance(Class.forName("java.nio.DirectCharBufferRS"));
        setCharField(term21679, term21679.getClass(), "delimiter", (char) 0);
        setField(term21679, term21679.getClass(), "quoteChar", term21731);
        setField(term21679, term21679.getClass(), "quotePolicy", enum42);
        setField(term21609, term21609.getClass(), "format", term21679);
        setField(term21609, term21609.getClass(), "out", term21891);
        term21967 = newInstance(Class.forName("org.apache.commons.csv.CSVPrinter$1"));
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
        args[0] = term21967;
        args[1] = null;
        args[2] = 0;
        args[3] = 0;
        try {
            callMethod(klass, "printAndQuote", argTypes, term21609, args);
            assertTrue(false);
        }
        catch (ReadOnlyBufferException e) {
        }

    }

};


