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

public class CSVPrinter_printRecords_103548374151 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term33840;
     Object term33604;

    public CSVPrinter_printRecords_103548374151() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term33840 = newInstance(Class.forName("org.apache.commons.csv.CSVPrinter"));
        setBooleanField(term33840, term33840.getClass(), "newRecord", false);
        term33604 = (Object[]) newArray("java.lang.Object", 498);
        Object term33912 = newInstance(Class.forName("org.apache.commons.csv.CSVPrinter"));
        setElement(term33604, 0, term33912);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.csv.CSVPrinter");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(Class.forName("java.lang.Object"), 0).getClass();
        Object[] args = new Object[1];
        args[0] = term33604;
        try {
            callMethod(klass, "printRecords", argTypes, term33840, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


