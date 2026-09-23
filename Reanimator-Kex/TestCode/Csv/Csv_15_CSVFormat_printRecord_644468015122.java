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

public class CSVFormat_printRecord_644468015122 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term76650;

    public CSVFormat_printRecord_644468015122() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term76650 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        setBooleanField(term76650, term76650.getClass(), "allowMissingColumnNames", false);
        setField(term76650, term76650.getClass(), "commentMarker", null);
        setCharField(term76650, term76650.getClass(), "delimiter", (char) 0);
        setField(term76650, term76650.getClass(), "escapeCharacter", null);
        setField(term76650, term76650.getClass(), "header", null);
        setField(term76650, term76650.getClass(), "headerComments", null);
        setBooleanField(term76650, term76650.getClass(), "ignoreEmptyLines", false);
        setBooleanField(term76650, term76650.getClass(), "ignoreHeaderCase", false);
        setBooleanField(term76650, term76650.getClass(), "ignoreSurroundingSpaces", false);
        setField(term76650, term76650.getClass(), "nullString", null);
        setField(term76650, term76650.getClass(), "quoteCharacter", null);
        setField(term76650, term76650.getClass(), "quoteMode", null);
        setField(term76650, term76650.getClass(), "recordSeparator", null);
        setBooleanField(term76650, term76650.getClass(), "skipHeaderRecord", false);
        setBooleanField(term76650, term76650.getClass(), "trailingDelimiter", false);
        setBooleanField(term76650, term76650.getClass(), "trim", false);
        setBooleanField(term76650, term76650.getClass(), "autoFlush", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.csv.CSVFormat");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.Appendable");
        argTypes[1] = Array.newInstance(Class.forName("java.lang.Object"), 0).getClass();
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = null;
        callMethod(klass, "printRecord", argTypes, term76650, args);
    }

};


