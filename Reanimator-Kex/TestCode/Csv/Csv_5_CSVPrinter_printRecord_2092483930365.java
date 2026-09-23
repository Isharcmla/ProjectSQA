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

public class CSVPrinter_printRecord_2092483930365 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1027368;
     Object term1021946;

    public CSVPrinter_printRecord_2092483930365() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Character term1027490 = new Character((char) 0);
        Class<? extends Object> term1028466 = Class.forName((String) "org.apache.commons.csv.Quote");
        Field term1028465 = ((Class) term1028466).getDeclaredField((String) "NONE");
        ((Field) term1028465).setAccessible(true);
        Object enum358 = ((Field) term1028465).get((Object) null);
        Character term1027642 = new Character((char) 25056);
        term1027368 = newInstance(Class.forName("org.apache.commons.csv.CSVPrinter"));
        Object term1027438 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        setBooleanField(term1027368, term1027368.getClass(), "newRecord", true);
        setField(term1027438, term1027438.getClass(), "quoteChar", term1027490);
        setCharField(term1027438, term1027438.getClass(), "delimiter", (char) 40476);
        setField(term1027438, term1027438.getClass(), "quotePolicy", enum358);
        setField(term1027438, term1027438.getClass(), "escape", term1027642);
        setField(term1027368, term1027368.getClass(), "format", term1027438);
        term1021946 = (Object[]) newArray("java.lang.Object", 1);
        Object term1027718 = newInstance(Class.forName("org.apache.commons.csv.CSVPrinter$1"));
        setElement(term1021946, 0, term1027718);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.csv.CSVPrinter");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(Class.forName("java.lang.Object"), 0).getClass();
        Object[] args = new Object[1];
        args[0] = term1021946;
        try {
            callMethod(klass, "printRecord", argTypes, term1027368, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


