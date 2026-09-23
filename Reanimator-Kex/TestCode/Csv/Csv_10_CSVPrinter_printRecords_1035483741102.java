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

public class CSVPrinter_printRecords_1035483741102 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term46004;
     Object term45537;

    public CSVPrinter_printRecords_1035483741102() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term46004 = newInstance(Class.forName("org.apache.commons.csv.CSVPrinter"));
        Object term46074 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        setBooleanField(term46004, term46004.getClass(), "newRecord", true);
        setField(term46004, term46004.getClass(), "format", term46074);
        term45537 = (Object[]) newArray("java.lang.Object", 17);
        Object term46146 = newInstance(Class.forName("org.apache.commons.csv.CSVPrinter"));
        Object term46184 = newInstance(Class.forName("java.lang.Object"));
        setElement(term45537, 0, term46146);
        setElement(term45537, 1, term46184);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.csv.CSVPrinter");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(Class.forName("java.lang.Object"), 0).getClass();
        Object[] args = new Object[1];
        args[0] = term45537;
        try {
            callMethod(klass, "printRecords", argTypes, term46004, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


