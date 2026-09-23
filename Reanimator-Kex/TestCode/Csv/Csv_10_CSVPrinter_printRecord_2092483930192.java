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

public class CSVPrinter_printRecord_2092483930192 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term176925;
     Object term175394;

    public CSVPrinter_printRecord_2092483930192() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Character term177047 = new Character((char) 28713);
        Class<? extends Object> term182783 = Class.forName((String) "org.apache.commons.csv.Quote");
        Field term182782 = ((Class) term182783).getDeclaredField((String) "ALL");
        ((Field) term182782).setAccessible(true);
        Object enum154 = ((Field) term182782).get((Object) null);
        term176925 = newInstance(Class.forName("org.apache.commons.csv.CSVPrinter"));
        Object term176995 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        setBooleanField(term176925, term176925.getClass(), "newRecord", true);
        setField(term176995, term176995.getClass(), "quoteChar", term177047);
        setCharField(term176995, term176995.getClass(), "delimiter", (char) 28713);
        setField(term176995, term176995.getClass(), "quotePolicy", enum154);
        setField(term176925, term176925.getClass(), "format", term176995);
        term175394 = (Object[]) newArray("java.lang.Object", 2);
        Object term177219 = newInstance(Class.forName("org.apache.commons.csv.CSVPrinter"));
        setElement(term175394, 0, term177219);
        setElement(term175394, 1, "NONE");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.csv.CSVPrinter");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(Class.forName("java.lang.Object"), 0).getClass();
        Object[] args = new Object[1];
        args[0] = term175394;
        try {
            callMethod(klass, "printRecord", argTypes, term176925, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


