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

public class CSVPrinter_printRecord_2092483930119 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term86221;
     Object term74428;

    public CSVPrinter_printRecord_2092483930119() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Character term86343 = new Character((char) 32768);
        Class<? extends Object> term87254 = Class.forName((String) "org.apache.commons.csv.Quote");
        Field term87253 = ((Class) term87254).getDeclaredField((String) "MINIMAL");
        ((Field) term87253).setAccessible(true);
        Object enum88 = ((Field) term87253).get((Object) null);
        term86221 = newInstance(Class.forName("org.apache.commons.csv.CSVPrinter"));
        Object term86291 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        setBooleanField(term86221, term86221.getClass(), "newRecord", true);
        setField(term86291, term86291.getClass(), "quoteChar", term86343);
        setCharField(term86291, term86291.getClass(), "delimiter", (char) 8192);
        setField(term86291, term86291.getClass(), "quotePolicy", enum88);
        setField(term86221, term86221.getClass(), "format", term86291);
        term74428 = (Object[]) newArray("java.lang.Object", 1);
        Object term86519 = newInstance(Class.forName("org.apache.commons.csv.CSVPrinter$1"));
        setElement(term74428, 0, term86519);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.csv.CSVPrinter");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(Class.forName("java.lang.Object"), 0).getClass();
        Object[] args = new Object[1];
        args[0] = term74428;
        try {
            callMethod(klass, "printRecord", argTypes, term86221, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


