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
import java.io.IOException;
import static org.apache.commons.csv.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class CSVPrinter_printRecords_103548374156 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term23440;
     Object term23194;

    public CSVPrinter_printRecords_103548374156() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term23440 = newInstance(Class.forName("org.apache.commons.csv.CSVPrinter"));
        Object term23484 = newInstance(Class.forName("java.io.PipedWriter"));
        Object term23554 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        setBooleanField(term23440, term23440.getClass(), "newRecord", false);
        setField(term23440, term23440.getClass(), "out", term23484);
        setCharField(term23554, term23554.getClass(), "delimiter", (char) 0);
        setField(term23440, term23440.getClass(), "format", term23554);
        term23194 = (Object[]) newArray("java.lang.Object", 2);
        Object term23626 = newInstance(Class.forName("org.apache.commons.csv.CSVPrinter"));
        setElement(term23194, 0, term23626);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.csv.CSVPrinter");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(Class.forName("java.lang.Object"), 0).getClass();
        Object[] args = new Object[1];
        args[0] = term23194;
        try {
            callMethod(klass, "printRecords", argTypes, term23440, args);
            assertTrue(false);
        }
        catch (IOException e) {
        }

    }

};


