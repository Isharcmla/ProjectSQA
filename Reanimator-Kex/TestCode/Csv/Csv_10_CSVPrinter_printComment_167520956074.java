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
import java.nio.BufferOverflowException;
import static org.apache.commons.csv.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.lang.Character;

public class CSVPrinter_printComment_167520956074 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term30036;

    public CSVPrinter_printComment_167520956074() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Character term30158 = new Character((char) 0);
        term30036 = newInstance(Class.forName("org.apache.commons.csv.CSVPrinter"));
        Object term30106 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        Object term30210 = newInstance(Class.forName("java.nio.HeapCharBuffer"));
        setField(term30106, term30106.getClass(), "commentStart", term30158);
        setField(term30106, term30106.getClass(), "recordSeparator", null);
        setField(term30036, term30036.getClass(), "format", term30106);
        setBooleanField(term30036, term30036.getClass(), "newRecord", false);
        setField(term30036, term30036.getClass(), "out", term30210);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.csv.CSVPrinter");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = null;
        try {
            callMethod(klass, "printComment", argTypes, term30036, args);
            assertTrue(false);
        }
        catch (BufferOverflowException e) {
        }

    }

};


