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

public class CSVPrinter_print_165247380339 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term15131;
     Object term15026;

    public CSVPrinter_print_165247380339() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term15131 = newInstance(Class.forName("org.apache.commons.csv.CSVPrinter"));
        Object term15173 = newInstance(Class.forName("java.io.FileWriter"));
        Object term15243 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        setBooleanField(term15131, term15131.getClass(), "newRecord", false);
        setField(term15131, term15131.getClass(), "out", term15173);
        setCharField(term15243, term15243.getClass(), "delimiter", (char) 0);
        setField(term15131, term15131.getClass(), "format", term15243);
        term15026 = (byte[]) newByteArray(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.csv.CSVPrinter");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term15026;
        try {
            callMethod(klass, "print", argTypes, term15131, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


