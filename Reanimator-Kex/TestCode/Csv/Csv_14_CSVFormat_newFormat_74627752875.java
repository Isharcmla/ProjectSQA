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
import java.lang.Character;

public class CSVFormat_newFormat_74627752875 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5;
     Object term31417;

    public CSVFormat_newFormat_74627752875() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term5 = new Character('E');
        term31417 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        setBooleanField(term31417, term31417.getClass(), "allowMissingColumnNames", false);
        setField(term31417, term31417.getClass(), "commentMarker", null);
        setCharField(term31417, term31417.getClass(), "delimiter", 'E');
        setField(term31417, term31417.getClass(), "escapeCharacter", null);
        setField(term31417, term31417.getClass(), "header", null);
        setField(term31417, term31417.getClass(), "headerComments", null);
        setBooleanField(term31417, term31417.getClass(), "ignoreEmptyLines", false);
        setBooleanField(term31417, term31417.getClass(), "ignoreHeaderCase", false);
        setBooleanField(term31417, term31417.getClass(), "ignoreSurroundingSpaces", false);
        setField(term31417, term31417.getClass(), "nullString", null);
        setField(term31417, term31417.getClass(), "quoteCharacter", null);
        setField(term31417, term31417.getClass(), "quoteMode", null);
        setField(term31417, term31417.getClass(), "recordSeparator", null);
        setBooleanField(term31417, term31417.getClass(), "skipHeaderRecord", false);
        setBooleanField(term31417, term31417.getClass(), "trailingDelimiter", false);
        setBooleanField(term31417, term31417.getClass(), "trim", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.csv.CSVFormat");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = char.class;
        Object[] args = new Object[1];
        args[0] = term5;
        Object retValue = callMethod(klass, "newFormat", argTypes, null, args);
        assertTrue(recursiveEquals(term5, 'E'));
        assertTrue(recursiveEquals(retValue, term31417));
    }

};


