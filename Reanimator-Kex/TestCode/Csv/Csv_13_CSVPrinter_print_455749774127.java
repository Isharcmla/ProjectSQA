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

public class CSVPrinter_print_455749774127 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term102487;

    public CSVPrinter_print_455749774127() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term102487 = newInstance(Class.forName("org.apache.commons.csv.CSVPrinter"));
        Object term102557 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        Object term102601 = newInstance(Class.forName("java.io.PipedWriter"));
        setBooleanField(term102487, term102487.getClass(), "newRecord", true);
        setField(term102557, term102557.getClass(), "quoteCharacter", null);
        setField(term102557, term102557.getClass(), "escapeCharacter", null);
        setField(term102487, term102487.getClass(), "format", term102557);
        setField(term102487, term102487.getClass(), "out", term102601);
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
            callMethod(klass, "print", argTypes, term102487, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


