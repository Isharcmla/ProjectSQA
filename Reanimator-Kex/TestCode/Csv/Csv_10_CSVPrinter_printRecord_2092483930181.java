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

public class CSVPrinter_printRecord_2092483930181 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term147912;
     Object term143129;

    public CSVPrinter_printRecord_2092483930181() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Character term147973 = new Character((char) 2048);
        Class<? extends Object> term148535 = Class.forName((String) "org.apache.commons.csv.Quote");
        Field term148534 = ((Class) term148535).getDeclaredField((String) "NONE");
        ((Field) term148534).setAccessible(true);
        Object enum143 = ((Field) term148534).get((Object) null);
        term147912 = newInstance(Class.forName("org.apache.commons.csv.CSVPrinter"));
        Object term147947 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        setBooleanField(term147912, term147912.getClass(), "newRecord", true);
        setField(term147947, term147947.getClass(), "quoteChar", term147973);
        setCharField(term147947, term147947.getClass(), "delimiter", (char) 52215);
        setField(term147947, term147947.getClass(), "quotePolicy", enum143);
        setField(term147912, term147912.getClass(), "format", term147947);
        term143129 = (Object[]) newArray("java.lang.Object", 1);
        setElement(term143129, 0, term147912);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.csv.CSVPrinter");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(Class.forName("java.lang.Object"), 0).getClass();
        Object[] args = new Object[1];
        args[0] = term143129;
        try {
            callMethod(klass, "printRecord", argTypes, term147912, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


