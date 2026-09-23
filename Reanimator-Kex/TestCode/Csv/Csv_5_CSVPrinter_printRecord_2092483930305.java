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

public class CSVPrinter_printRecord_2092483930305 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term912554;
     Object term902205;

    public CSVPrinter_printRecord_2092483930305() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Character term912676 = new Character((char) 16);
        Class<? extends Object> term913426 = Class.forName((String) "org.apache.commons.csv.Quote");
        Field term913425 = ((Class) term913426).getDeclaredField((String) "ALL");
        ((Field) term913425).setAccessible(true);
        Object enum297 = ((Field) term913425).get((Object) null);
        term912554 = newInstance(Class.forName("org.apache.commons.csv.CSVPrinter"));
        Object term912624 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        setBooleanField(term912554, term912554.getClass(), "newRecord", true);
        setField(term912624, term912624.getClass(), "quoteChar", term912676);
        setCharField(term912624, term912624.getClass(), "delimiter", (char) 4096);
        setField(term912624, term912624.getClass(), "quotePolicy", enum297);
        setField(term912554, term912554.getClass(), "format", term912624);
        term902205 = (Object[]) newArray("java.lang.Object", 8);
        Object term912852 = newInstance(Class.forName("org.apache.commons.csv.CSVPrinter$1"));
        setElement(term902205, 0, term912852);
        setElement(term902205, 1, "NON_NUMERIC");
        setElement(term902205, 2, enum297);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.csv.CSVPrinter");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(Class.forName("java.lang.Object"), 0).getClass();
        Object[] args = new Object[1];
        args[0] = term902205;
        try {
            callMethod(klass, "printRecord", argTypes, term912554, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


