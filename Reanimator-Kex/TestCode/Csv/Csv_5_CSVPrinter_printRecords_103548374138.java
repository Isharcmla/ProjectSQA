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

public class CSVPrinter_printRecords_103548374138 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term14952;
     Object term14716;

    public CSVPrinter_printRecords_103548374138() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term14952 = newInstance(Class.forName("org.apache.commons.csv.CSVPrinter"));
        setBooleanField(term14952, term14952.getClass(), "newRecord", true);
        term14716 = (Object[]) newArray("java.lang.Object", 498);
        Object term15024 = newInstance(Class.forName("org.apache.commons.csv.CSVPrinter"));
        setElement(term14716, 0, term15024);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.csv.CSVPrinter");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(Class.forName("java.lang.Object"), 0).getClass();
        Object[] args = new Object[1];
        args[0] = term14716;
        try {
            callMethod(klass, "printRecords", argTypes, term14952, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


