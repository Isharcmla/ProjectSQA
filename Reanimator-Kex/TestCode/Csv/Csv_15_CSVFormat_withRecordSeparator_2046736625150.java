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
import java.lang.Character;

public class CSVFormat_withRecordSeparator_2046736625150 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term76946;
     Object term76956;

    public CSVFormat_withRecordSeparator_2046736625150() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term76946 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        setBooleanField(term76946, term76946.getClass(), "allowMissingColumnNames", false);
        setField(term76946, term76946.getClass(), "commentMarker", null);
        setCharField(term76946, term76946.getClass(), "delimiter", (char) 0);
        setField(term76946, term76946.getClass(), "escapeCharacter", null);
        setField(term76946, term76946.getClass(), "header", null);
        setField(term76946, term76946.getClass(), "headerComments", null);
        setBooleanField(term76946, term76946.getClass(), "ignoreEmptyLines", false);
        setBooleanField(term76946, term76946.getClass(), "ignoreHeaderCase", false);
        setBooleanField(term76946, term76946.getClass(), "ignoreSurroundingSpaces", false);
        setField(term76946, term76946.getClass(), "nullString", null);
        setField(term76946, term76946.getClass(), "quoteCharacter", null);
        setField(term76946, term76946.getClass(), "quoteMode", null);
        setField(term76946, term76946.getClass(), "recordSeparator", null);
        setBooleanField(term76946, term76946.getClass(), "skipHeaderRecord", false);
        setBooleanField(term76946, term76946.getClass(), "trailingDelimiter", false);
        setBooleanField(term76946, term76946.getClass(), "trim", false);
        setBooleanField(term76946, term76946.getClass(), "autoFlush", false);
        term76956 = new Character((char) 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.csv.CSVFormat");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = char.class;
        Object[] args = new Object[1];
        args[0] = term76956;
        callMethod(klass, "withRecordSeparator", argTypes, term76946, args);
    }

};


