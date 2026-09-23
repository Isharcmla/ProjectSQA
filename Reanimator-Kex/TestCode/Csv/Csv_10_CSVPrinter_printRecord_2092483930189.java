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

public class CSVPrinter_printRecord_2092483930189 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term174206;
     Object term168044;

    public CSVPrinter_printRecord_2092483930189() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Character term174328 = new Character((char) 65515);
        Class<? extends Object> term175225 = Class.forName((String) "org.apache.commons.csv.Quote");
        Field term175224 = ((Class) term175225).getDeclaredField((String) "MINIMAL");
        ((Field) term175224).setAccessible(true);
        Object enum151 = ((Field) term175224).get((Object) null);
        term174206 = newInstance(Class.forName("org.apache.commons.csv.CSVPrinter"));
        Object term174276 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        setBooleanField(term174206, term174206.getClass(), "newRecord", true);
        setField(term174276, term174276.getClass(), "quoteChar", term174328);
        setCharField(term174276, term174276.getClass(), "delimiter", (char) 256);
        setField(term174276, term174276.getClass(), "quotePolicy", enum151);
        setField(term174206, term174206.getClass(), "format", term174276);
        term168044 = (Object[]) newArray("java.lang.Object", 1);
        Object term174500 = newInstance(Class.forName("org.apache.commons.csv.CSVPrinter"));
        setElement(term168044, 0, term174500);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.csv.CSVPrinter");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(Class.forName("java.lang.Object"), 0).getClass();
        Object[] args = new Object[1];
        args[0] = term168044;
        try {
            callMethod(klass, "printRecord", argTypes, term174206, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


