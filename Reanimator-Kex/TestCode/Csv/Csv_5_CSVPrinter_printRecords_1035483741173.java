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

public class CSVPrinter_printRecords_1035483741173 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term173973;
     Object term173727;
     Object term174290;
     Object term174293;

    public CSVPrinter_printRecords_1035483741173() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term173973 = newInstance(Class.forName("org.apache.commons.csv.CSVPrinter"));
        Object term174011 = newInstance(Class.forName("java.io.Writer$1"));
        Object term174081 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        setBooleanField(term173973, term173973.getClass(), "newRecord", false);
        setField(term173973, term173973.getClass(), "out", term174011);
        setCharField(term174081, term174081.getClass(), "delimiter", (char) 0);
        setField(term173973, term173973.getClass(), "format", term174081);
        term173727 = (Object[]) newArray("java.lang.Object", 2);
        Object term174153 = newInstance(Class.forName("org.apache.commons.csv.CSVPrinter"));
        setElement(term173727, 0, term174153);
        term174290 = newInstance(Class.forName("org.apache.commons.csv.CSVPrinter"));
        Object term174291 = newInstance(Class.forName("java.io.Writer$1"));
        Object term174292 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        setBooleanField(term174291, term174291.getClass(), "closed", false);
        setField(term174291, term174291.getClass(), "writeBuffer", null);
        setField(term174291, term174291.getClass(), "lock", null);
        setField(term174290, term174290.getClass(), "out", term174291);
        setCharField(term174292, term174292.getClass(), "delimiter", (char) 0);
        setField(term174292, term174292.getClass(), "quoteChar", null);
        setField(term174292, term174292.getClass(), "quotePolicy", null);
        setField(term174292, term174292.getClass(), "commentStart", null);
        setField(term174292, term174292.getClass(), "escape", null);
        setBooleanField(term174292, term174292.getClass(), "ignoreSurroundingSpaces", false);
        setBooleanField(term174292, term174292.getClass(), "ignoreEmptyLines", false);
        setField(term174292, term174292.getClass(), "recordSeparator", null);
        setField(term174292, term174292.getClass(), "nullString", null);
        setField(term174292, term174292.getClass(), "header", null);
        setBooleanField(term174292, term174292.getClass(), "skipHeaderRecord", false);
        setField(term174290, term174290.getClass(), "format", term174292);
        setBooleanField(term174290, term174290.getClass(), "newRecord", true);
        term174293 = (Object[]) newArray("java.lang.Object", 2);
        Object term174294 = newInstance(Class.forName("org.apache.commons.csv.CSVPrinter"));
        setField(term174294, term174294.getClass(), "out", null);
        setField(term174294, term174294.getClass(), "format", null);
        setBooleanField(term174294, term174294.getClass(), "newRecord", false);
        setElement(term174293, 0, term174294);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.csv.CSVPrinter");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(Class.forName("java.lang.Object"), 0).getClass();
        Object[] args = new Object[1];
        args[0] = term173727;
        callMethod(klass, "printRecords", argTypes, term173973, args);
        assertTrue(recursiveEquals(term173973, term174290));
        assertTrue(recursiveEquals(term173727, term174293));
    }

};


