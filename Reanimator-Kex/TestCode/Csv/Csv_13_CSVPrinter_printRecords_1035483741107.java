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

public class CSVPrinter_printRecords_1035483741107 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term83224;
     Object term82508;

    public CSVPrinter_printRecords_1035483741107() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term83224 = newInstance(Class.forName("org.apache.commons.csv.CSVPrinter"));
        setBooleanField(term83224, term83224.getClass(), "newRecord", true);
        term82508 = (Object[]) newArray("java.lang.Object", 50);
        Object term83296 = newInstance(Class.forName("org.apache.commons.csv.CSVPrinter"));
        Object term83334 = newInstance(Class.forName("java.lang.Object"));
        setElement(term82508, 0, term83296);
        setElement(term82508, 1, term83334);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.csv.CSVPrinter");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(Class.forName("java.lang.Object"), 0).getClass();
        Object[] args = new Object[1];
        args[0] = term82508;
        try {
            callMethod(klass, "printRecords", argTypes, term83224, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


