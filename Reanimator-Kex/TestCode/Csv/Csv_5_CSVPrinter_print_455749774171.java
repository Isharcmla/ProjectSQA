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

public class CSVPrinter_print_455749774171 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term172351;

    public CSVPrinter_print_455749774171() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term172351 = newInstance(Class.forName("org.apache.commons.csv.CSVPrinter"));
        Object term172401 = newInstance(Class.forName("java.io.BufferedWriter"));
        Object term172471 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        setBooleanField(term172351, term172351.getClass(), "newRecord", false);
        setField(term172351, term172351.getClass(), "out", term172401);
        setCharField(term172471, term172471.getClass(), "delimiter", (char) 0);
        setField(term172351, term172351.getClass(), "format", term172471);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.csv.CSVPrinter");
        Class<?>[] argTypes = new Class<?>[4];
        argTypes[0] = Class.forName("java.lang.Object");
        argTypes[1] = Class.forName("java.lang.CharSequence");
        argTypes[2] = int.class;
        argTypes[3] = int.class;
        Object[] args = new Object[4];
        args[0] = null;
        args[1] = null;
        args[2] = 0;
        args[3] = 0;
        try {
            callMethod(klass, "print", argTypes, term172351, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


