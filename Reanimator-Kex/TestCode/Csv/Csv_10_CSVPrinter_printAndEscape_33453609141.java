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
import java.lang.Character;

public class CSVPrinter_printAndEscape_33453609141 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term17161;
     Object term17314;

    public CSVPrinter_printAndEscape_33453609141() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Character term17283 = new Character((char) 0);
        term17161 = newInstance(Class.forName("org.apache.commons.csv.CSVPrinter"));
        Object term17231 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        setCharField(term17231, term17231.getClass(), "delimiter", (char) 0);
        setField(term17231, term17231.getClass(), "escape", term17283);
        setField(term17161, term17161.getClass(), "format", term17231);
        Character term17316 = new Character((char) 0);
        term17314 = newInstance(Class.forName("org.apache.commons.csv.CSVPrinter"));
        Object term17315 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        setField(term17314, term17314.getClass(), "out", null);
        setCharField(term17315, term17315.getClass(), "delimiter", (char) 0);
        setField(term17315, term17315.getClass(), "quoteChar", null);
        setField(term17315, term17315.getClass(), "quotePolicy", null);
        setField(term17315, term17315.getClass(), "commentStart", null);
        setField(term17315, term17315.getClass(), "escape", term17316);
        setBooleanField(term17315, term17315.getClass(), "ignoreSurroundingSpaces", false);
        setBooleanField(term17315, term17315.getClass(), "ignoreEmptyLines", false);
        setField(term17315, term17315.getClass(), "recordSeparator", null);
        setField(term17315, term17315.getClass(), "nullString", null);
        setField(term17315, term17315.getClass(), "header", null);
        setBooleanField(term17315, term17315.getClass(), "skipHeaderRecord", false);
        setField(term17314, term17314.getClass(), "format", term17315);
        setBooleanField(term17314, term17314.getClass(), "newRecord", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.csv.CSVPrinter");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("java.lang.CharSequence");
        argTypes[1] = int.class;
        argTypes[2] = int.class;
        Object[] args = new Object[3];
        args[0] = null;
        args[1] = -2147483648;
        args[2] = 0;
        callMethod(klass, "printAndEscape", argTypes, term17161, args);
        assertTrue(recursiveEquals(term17161, term17314));
    }

};


