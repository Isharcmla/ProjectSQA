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

public class CSVPrinter_printAndEscape_33453609167 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term28066;
     Object term28219;

    public CSVPrinter_printAndEscape_33453609167() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Character term28188 = new Character((char) 0);
        term28066 = newInstance(Class.forName("org.apache.commons.csv.CSVPrinter"));
        Object term28136 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        setCharField(term28136, term28136.getClass(), "delimiter", (char) 0);
        setField(term28136, term28136.getClass(), "escape", term28188);
        setField(term28066, term28066.getClass(), "format", term28136);
        Character term28221 = new Character((char) 0);
        term28219 = newInstance(Class.forName("org.apache.commons.csv.CSVPrinter"));
        Object term28220 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        setField(term28219, term28219.getClass(), "out", null);
        setCharField(term28220, term28220.getClass(), "delimiter", (char) 0);
        setField(term28220, term28220.getClass(), "quoteChar", null);
        setField(term28220, term28220.getClass(), "quotePolicy", null);
        setField(term28220, term28220.getClass(), "commentStart", null);
        setField(term28220, term28220.getClass(), "escape", term28221);
        setBooleanField(term28220, term28220.getClass(), "ignoreSurroundingSpaces", false);
        setBooleanField(term28220, term28220.getClass(), "ignoreEmptyLines", false);
        setField(term28220, term28220.getClass(), "recordSeparator", null);
        setField(term28220, term28220.getClass(), "nullString", null);
        setField(term28220, term28220.getClass(), "header", null);
        setBooleanField(term28220, term28220.getClass(), "skipHeaderRecord", false);
        setField(term28219, term28219.getClass(), "format", term28220);
        setBooleanField(term28219, term28219.getClass(), "newRecord", false);
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
        callMethod(klass, "printAndEscape", argTypes, term28066, args);
        assertTrue(recursiveEquals(term28066, term28219));
    }

};


