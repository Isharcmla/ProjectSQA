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

public class CSVPrinter_printRecord_2092483930131 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term112171;
     Object term101823;

    public CSVPrinter_printRecord_2092483930131() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Character term112293 = new Character((char) 16);
        Class<? extends Object> term113601 = Class.forName((String) "org.apache.commons.csv.Quote");
        Field term113600 = ((Class) term113601).getDeclaredField((String) "ALL");
        ((Field) term113600).setAccessible(true);
        Object enum102 = ((Field) term113600).get((Object) null);
        term112171 = newInstance(Class.forName("org.apache.commons.csv.CSVPrinter"));
        Object term112241 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        setBooleanField(term112171, term112171.getClass(), "newRecord", true);
        setField(term112241, term112241.getClass(), "quoteChar", term112293);
        setCharField(term112241, term112241.getClass(), "delimiter", (char) 4096);
        setField(term112241, term112241.getClass(), "quotePolicy", enum102);
        setField(term112171, term112171.getClass(), "format", term112241);
        term101823 = (Object[]) newArray("java.lang.Object", 8);
        Object term112469 = newInstance(Class.forName("org.apache.commons.csv.CSVPrinter$1"));
        setElement(term101823, 0, term112469);
        setElement(term101823, 1, "NON_NUMERIC");
        setElement(term101823, 2, enum102);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.csv.CSVPrinter");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(Class.forName("java.lang.Object"), 0).getClass();
        Object[] args = new Object[1];
        args[0] = term101823;
        try {
            callMethod(klass, "printRecord", argTypes, term112171, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


