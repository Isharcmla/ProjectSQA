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
import java.lang.Integer;

public class CSVFormat_printAndEscape_1339252854119 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term76610;
     Object term76620;
     Object term76622;

    public CSVFormat_printAndEscape_1339252854119() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term76610 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        setBooleanField(term76610, term76610.getClass(), "allowMissingColumnNames", false);
        setField(term76610, term76610.getClass(), "commentMarker", null);
        setCharField(term76610, term76610.getClass(), "delimiter", (char) 0);
        setField(term76610, term76610.getClass(), "escapeCharacter", null);
        setField(term76610, term76610.getClass(), "header", null);
        setField(term76610, term76610.getClass(), "headerComments", null);
        setBooleanField(term76610, term76610.getClass(), "ignoreEmptyLines", false);
        setBooleanField(term76610, term76610.getClass(), "ignoreHeaderCase", false);
        setBooleanField(term76610, term76610.getClass(), "ignoreSurroundingSpaces", false);
        setField(term76610, term76610.getClass(), "nullString", null);
        setField(term76610, term76610.getClass(), "quoteCharacter", null);
        setField(term76610, term76610.getClass(), "quoteMode", null);
        setField(term76610, term76610.getClass(), "recordSeparator", null);
        setBooleanField(term76610, term76610.getClass(), "skipHeaderRecord", false);
        setBooleanField(term76610, term76610.getClass(), "trailingDelimiter", false);
        setBooleanField(term76610, term76610.getClass(), "trim", false);
        setBooleanField(term76610, term76610.getClass(), "autoFlush", false);
        term76620 = new Integer(0);
        term76622 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.csv.CSVFormat");
        Class<?>[] argTypes = new Class<?>[4];
        argTypes[0] = Class.forName("java.lang.CharSequence");
        argTypes[1] = int.class;
        argTypes[2] = int.class;
        argTypes[3] = Class.forName("java.lang.Appendable");
        Object[] args = new Object[4];
        args[0] = null;
        args[1] = term76620;
        args[2] = term76622;
        args[3] = null;
        callMethod(klass, "printAndEscape", argTypes, term76610, args);
    }

};


