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

public class CSVPrinter_printRecord_209248393095 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term41109;
     Object term41022;
     Object term41195;
     Object term41197;

    public CSVPrinter_printRecord_209248393095() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term41109 = newInstance(Class.forName("org.apache.commons.csv.CSVPrinter"));
        Object term41179 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        setField(term41109, term41109.getClass(), "format", term41179);
        term41022 = (Object[]) newArray("java.lang.Object", 0);
        term41195 = newInstance(Class.forName("org.apache.commons.csv.CSVPrinter"));
        Object term41196 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        setField(term41195, term41195.getClass(), "out", null);
        setCharField(term41196, term41196.getClass(), "delimiter", (char) 0);
        setField(term41196, term41196.getClass(), "quoteChar", null);
        setField(term41196, term41196.getClass(), "quotePolicy", null);
        setField(term41196, term41196.getClass(), "commentStart", null);
        setField(term41196, term41196.getClass(), "escape", null);
        setBooleanField(term41196, term41196.getClass(), "ignoreSurroundingSpaces", false);
        setBooleanField(term41196, term41196.getClass(), "ignoreEmptyLines", false);
        setField(term41196, term41196.getClass(), "recordSeparator", null);
        setField(term41196, term41196.getClass(), "nullString", null);
        setField(term41196, term41196.getClass(), "header", null);
        setBooleanField(term41196, term41196.getClass(), "skipHeaderRecord", false);
        setField(term41195, term41195.getClass(), "format", term41196);
        setBooleanField(term41195, term41195.getClass(), "newRecord", true);
        term41197 = (Object[]) newArray("java.lang.Object", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.csv.CSVPrinter");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(Class.forName("java.lang.Object"), 0).getClass();
        Object[] args = new Object[1];
        args[0] = term41022;
        callMethod(klass, "printRecord", argTypes, term41109, args);
        assertTrue(recursiveEquals(term41109, term41195));
        assertTrue(recursiveEquals(term41022, term41197));
    }

};


