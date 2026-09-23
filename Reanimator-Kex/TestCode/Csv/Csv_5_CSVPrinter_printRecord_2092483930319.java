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

public class CSVPrinter_printRecord_2092483930319 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term929305;
     Object term927517;

    public CSVPrinter_printRecord_2092483930319() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Character term929427 = new Character((char) 56767);
        Class<? extends Object> term930116 = Class.forName((String) "org.apache.commons.csv.Quote");
        Field term930115 = ((Class) term930116).getDeclaredField((String) "ALL");
        ((Field) term930115).setAccessible(true);
        Object enum311 = ((Field) term930115).get((Object) null);
        term929305 = newInstance(Class.forName("org.apache.commons.csv.CSVPrinter"));
        Object term929375 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        setBooleanField(term929305, term929305.getClass(), "newRecord", true);
        setField(term929375, term929375.getClass(), "quoteChar", term929427);
        setCharField(term929375, term929375.getClass(), "delimiter", (char) 52639);
        setField(term929375, term929375.getClass(), "quotePolicy", enum311);
        setField(term929305, term929305.getClass(), "format", term929375);
        term927517 = (Object[]) newArray("java.lang.Object", 2);
        Object term929599 = newInstance(Class.forName("org.apache.commons.csv.CSVPrinter"));
        setElement(term927517, 0, term929599);
        setElement(term927517, 1, "NONE");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.csv.CSVPrinter");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(Class.forName("java.lang.Object"), 0).getClass();
        Object[] args = new Object[1];
        args[0] = term927517;
        try {
            callMethod(klass, "printRecord", argTypes, term929305, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


