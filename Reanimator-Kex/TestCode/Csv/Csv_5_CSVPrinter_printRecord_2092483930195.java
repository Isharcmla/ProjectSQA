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

public class CSVPrinter_printRecord_2092483930195 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term232962;
     Object term231213;

    public CSVPrinter_printRecord_2092483930195() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Character term233084 = new Character((char) 56444);
        Class<? extends Object> term234276 = Class.forName((String) "org.apache.commons.csv.Quote");
        Field term234275 = ((Class) term234276).getDeclaredField((String) "NON_NUMERIC");
        ((Field) term234275).setAccessible(true);
        Object enum172 = ((Field) term234275).get((Object) null);
        term232962 = newInstance(Class.forName("org.apache.commons.csv.CSVPrinter"));
        Object term233032 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        setBooleanField(term232962, term232962.getClass(), "newRecord", true);
        setField(term233032, term233032.getClass(), "quoteChar", term233084);
        setCharField(term233032, term233032.getClass(), "delimiter", (char) 9090);
        setField(term233032, term233032.getClass(), "quotePolicy", enum172);
        setField(term232962, term232962.getClass(), "format", term233032);
        term231213 = (Object[]) newArray("java.lang.Object", 1);
        Object term233260 = newInstance(Class.forName("org.apache.commons.csv.CSVPrinter$1"));
        setElement(term231213, 0, term233260);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.csv.CSVPrinter");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(Class.forName("java.lang.Object"), 0).getClass();
        Object[] args = new Object[1];
        args[0] = term231213;
        try {
            callMethod(klass, "printRecord", argTypes, term232962, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


