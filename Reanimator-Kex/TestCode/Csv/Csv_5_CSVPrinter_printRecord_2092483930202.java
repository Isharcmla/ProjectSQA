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

public class CSVPrinter_printRecord_2092483930202 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term260590;
     Object term238566;

    public CSVPrinter_printRecord_2092483930202() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Character term260712 = new Character((char) 4);
        Class<? extends Object> term263686 = Class.forName((String) "org.apache.commons.csv.Quote");
        Field term263685 = ((Class) term263686).getDeclaredField((String) "MINIMAL");
        ((Field) term263685).setAccessible(true);
        Object enum181 = ((Field) term263685).get((Object) null);
        term260590 = newInstance(Class.forName("org.apache.commons.csv.CSVPrinter"));
        Object term260660 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        setBooleanField(term260590, term260590.getClass(), "newRecord", true);
        setField(term260660, term260660.getClass(), "quoteChar", term260712);
        setCharField(term260660, term260660.getClass(), "delimiter", (char) 4);
        setField(term260660, term260660.getClass(), "quotePolicy", enum181);
        setField(term260590, term260590.getClass(), "format", term260660);
        term238566 = (Object[]) newArray("java.lang.Object", 1);
        Object term260888 = newInstance(Class.forName("org.apache.commons.csv.CSVPrinter$1"));
        setElement(term238566, 0, term260888);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.csv.CSVPrinter");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(Class.forName("java.lang.Object"), 0).getClass();
        Object[] args = new Object[1];
        args[0] = term238566;
        try {
            callMethod(klass, "printRecord", argTypes, term260590, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


