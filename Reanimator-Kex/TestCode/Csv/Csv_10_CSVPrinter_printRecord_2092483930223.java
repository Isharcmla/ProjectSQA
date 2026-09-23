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

public class CSVPrinter_printRecord_2092483930223 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term232279;
     Object term218039;

    public CSVPrinter_printRecord_2092483930223() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Character term232401 = new Character((char) 32768);
        Class<? extends Object> term233298 = Class.forName((String) "org.apache.commons.csv.Quote");
        Field term233297 = ((Class) term233298).getDeclaredField((String) "MINIMAL");
        ((Field) term233297).setAccessible(true);
        Object enum183 = ((Field) term233297).get((Object) null);
        term232279 = newInstance(Class.forName("org.apache.commons.csv.CSVPrinter"));
        Object term232349 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        setBooleanField(term232279, term232279.getClass(), "newRecord", true);
        setField(term232349, term232349.getClass(), "quoteChar", term232401);
        setCharField(term232349, term232349.getClass(), "delimiter", (char) 32768);
        setField(term232349, term232349.getClass(), "quotePolicy", enum183);
        setField(term232279, term232279.getClass(), "format", term232349);
        term218039 = (Object[]) newArray("java.lang.Object", 1);
        Object term232573 = newInstance(Class.forName("org.apache.commons.csv.CSVPrinter"));
        setElement(term218039, 0, term232573);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.csv.CSVPrinter");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(Class.forName("java.lang.Object"), 0).getClass();
        Object[] args = new Object[1];
        args[0] = term218039;
        try {
            callMethod(klass, "printRecord", argTypes, term232279, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


