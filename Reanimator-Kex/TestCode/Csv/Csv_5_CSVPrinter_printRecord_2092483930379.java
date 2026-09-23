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

public class CSVPrinter_printRecord_2092483930379 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1053540;
     Object term1051659;

    public CSVPrinter_printRecord_2092483930379() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Character term1053662 = new Character((char) 4);
        Class<? extends Object> term1054581 = Class.forName((String) "org.apache.commons.csv.Quote");
        Field term1054580 = ((Class) term1054581).getDeclaredField((String) "MINIMAL");
        ((Field) term1054580).setAccessible(true);
        Object enum372 = ((Field) term1054580).get((Object) null);
        term1053540 = newInstance(Class.forName("org.apache.commons.csv.CSVPrinter"));
        Object term1053610 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        setBooleanField(term1053540, term1053540.getClass(), "newRecord", true);
        setField(term1053610, term1053610.getClass(), "quoteChar", term1053662);
        setCharField(term1053610, term1053610.getClass(), "delimiter", (char) 32768);
        setField(term1053610, term1053610.getClass(), "quotePolicy", enum372);
        setField(term1053610, term1053610.getClass(), "escape", term1053662);
        setField(term1053540, term1053540.getClass(), "format", term1053610);
        term1051659 = (Object[]) newArray("java.lang.Object", 1);
        Object term1053838 = newInstance(Class.forName("org.apache.commons.csv.CSVPrinter$1"));
        setElement(term1051659, 0, term1053838);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.csv.CSVPrinter");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(Class.forName("java.lang.Object"), 0).getClass();
        Object[] args = new Object[1];
        args[0] = term1051659;
        try {
            callMethod(klass, "printRecord", argTypes, term1053540, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


