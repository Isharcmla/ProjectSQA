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
import static org.apache.commons.csv.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static org.apache.commons.csv.EqualityUtils.*;
import java.lang.Object;

public class CSVPrinter_printComment_1675209560207 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term268555;
     Object term268641;

    public CSVPrinter_printComment_1675209560207() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term268555 = newInstance(Class.forName("org.apache.commons.csv.CSVPrinter"));
        Object term268625 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        setField(term268625, term268625.getClass(), "commentStart", null);
        setField(term268555, term268555.getClass(), "format", term268625);
        term268641 = newInstance(Class.forName("org.apache.commons.csv.CSVPrinter"));
        Object term268642 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        setField(term268641, term268641.getClass(), "out", null);
        setCharField(term268642, term268642.getClass(), "delimiter", (char) 0);
        setField(term268642, term268642.getClass(), "quoteChar", null);
        setField(term268642, term268642.getClass(), "quotePolicy", null);
        setField(term268642, term268642.getClass(), "commentStart", null);
        setField(term268642, term268642.getClass(), "escape", null);
        setBooleanField(term268642, term268642.getClass(), "ignoreSurroundingSpaces", false);
        setBooleanField(term268642, term268642.getClass(), "ignoreEmptyLines", false);
        setField(term268642, term268642.getClass(), "recordSeparator", null);
        setField(term268642, term268642.getClass(), "nullString", null);
        setField(term268642, term268642.getClass(), "header", null);
        setBooleanField(term268642, term268642.getClass(), "skipHeaderRecord", false);
        setField(term268641, term268641.getClass(), "format", term268642);
        setBooleanField(term268641, term268641.getClass(), "newRecord", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.csv.CSVPrinter");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "printComment", argTypes, term268555, args);
        assertTrue(recursiveEquals(term268555, term268641));
    }

};


