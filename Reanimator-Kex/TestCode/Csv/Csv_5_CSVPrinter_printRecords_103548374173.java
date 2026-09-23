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

public class CSVPrinter_printRecords_103548374173 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term30392;
     Object term29925;

    public CSVPrinter_printRecords_103548374173() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term30392 = newInstance(Class.forName("org.apache.commons.csv.CSVPrinter"));
        Object term30462 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        setBooleanField(term30392, term30392.getClass(), "newRecord", true);
        setField(term30392, term30392.getClass(), "format", term30462);
        term29925 = (Object[]) newArray("java.lang.Object", 17);
        Object term30534 = newInstance(Class.forName("org.apache.commons.csv.CSVPrinter"));
        Object term30572 = newInstance(Class.forName("java.lang.Object"));
        setElement(term29925, 0, term30534);
        setElement(term29925, 1, term30572);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.csv.CSVPrinter");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(Class.forName("java.lang.Object"), 0).getClass();
        Object[] args = new Object[1];
        args[0] = term29925;
        try {
            callMethod(klass, "printRecords", argTypes, term30392, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


