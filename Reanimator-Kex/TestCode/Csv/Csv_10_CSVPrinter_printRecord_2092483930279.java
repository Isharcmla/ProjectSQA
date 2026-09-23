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

public class CSVPrinter_printRecord_2092483930279 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term328285;
     Object term326915;

    public CSVPrinter_printRecord_2092483930279() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Character term328407 = new Character((char) 32769);
        Class<? extends Object> term329092 = Class.forName((String) "org.apache.commons.csv.Quote");
        Field term329091 = ((Class) term329092).getDeclaredField((String) "ALL");
        ((Field) term329091).setAccessible(true);
        Object enum243 = ((Field) term329091).get((Object) null);
        term328285 = newInstance(Class.forName("org.apache.commons.csv.CSVPrinter"));
        Object term328355 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        setBooleanField(term328285, term328285.getClass(), "newRecord", true);
        setField(term328355, term328355.getClass(), "quoteChar", term328407);
        setCharField(term328355, term328355.getClass(), "delimiter", (char) 8192);
        setField(term328355, term328355.getClass(), "quotePolicy", enum243);
        setField(term328285, term328285.getClass(), "format", term328355);
        term326915 = (Object[]) newArray("java.lang.Object", 2);
        Object term328579 = newInstance(Class.forName("org.apache.commons.csv.CSVPrinter"));
        Object term328617 = newInstance(Class.forName("java.lang.Object"));
        setElement(term326915, 0, term328579);
        setElement(term326915, 1, term328617);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.csv.CSVPrinter");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(Class.forName("java.lang.Object"), 0).getClass();
        Object[] args = new Object[1];
        args[0] = term326915;
        try {
            callMethod(klass, "printRecord", argTypes, term328285, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


