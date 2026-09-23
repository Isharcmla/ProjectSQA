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

public class CSVPrinter_printRecord_2092483930151 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term146669;
     Object term138419;

    public CSVPrinter_printRecord_2092483930151() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Character term146791 = new Character((char) 65391);
        Class<? extends Object> term147442 = Class.forName((String) "org.apache.commons.csv.Quote");
        Field term147441 = ((Class) term147442).getDeclaredField((String) "ALL");
        ((Field) term147441).setAccessible(true);
        Object enum126 = ((Field) term147441).get((Object) null);
        term146669 = newInstance(Class.forName("org.apache.commons.csv.CSVPrinter"));
        Object term146739 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        setBooleanField(term146669, term146669.getClass(), "newRecord", true);
        setField(term146739, term146739.getClass(), "quoteChar", term146791);
        setCharField(term146739, term146739.getClass(), "delimiter", (char) 32766);
        setField(term146739, term146739.getClass(), "quotePolicy", enum126);
        setField(term146669, term146669.getClass(), "format", term146739);
        term138419 = (Object[]) newArray("java.lang.Object", 1);
        Object term146967 = newInstance(Class.forName("org.apache.commons.csv.CSVPrinter$1"));
        setElement(term138419, 0, term146967);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.csv.CSVPrinter");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(Class.forName("java.lang.Object"), 0).getClass();
        Object[] args = new Object[1];
        args[0] = term138419;
        try {
            callMethod(klass, "printRecord", argTypes, term146669, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


