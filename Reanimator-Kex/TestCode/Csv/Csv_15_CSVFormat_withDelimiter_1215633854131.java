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

public class CSVFormat_withDelimiter_1215633854131 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term76744;
     Object term76754;

    public CSVFormat_withDelimiter_1215633854131() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term76744 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        setBooleanField(term76744, term76744.getClass(), "allowMissingColumnNames", false);
        setField(term76744, term76744.getClass(), "commentMarker", null);
        setCharField(term76744, term76744.getClass(), "delimiter", (char) 0);
        setField(term76744, term76744.getClass(), "escapeCharacter", null);
        setField(term76744, term76744.getClass(), "header", null);
        setField(term76744, term76744.getClass(), "headerComments", null);
        setBooleanField(term76744, term76744.getClass(), "ignoreEmptyLines", false);
        setBooleanField(term76744, term76744.getClass(), "ignoreHeaderCase", false);
        setBooleanField(term76744, term76744.getClass(), "ignoreSurroundingSpaces", false);
        setField(term76744, term76744.getClass(), "nullString", null);
        setField(term76744, term76744.getClass(), "quoteCharacter", null);
        setField(term76744, term76744.getClass(), "quoteMode", null);
        setField(term76744, term76744.getClass(), "recordSeparator", null);
        setBooleanField(term76744, term76744.getClass(), "skipHeaderRecord", false);
        setBooleanField(term76744, term76744.getClass(), "trailingDelimiter", false);
        setBooleanField(term76744, term76744.getClass(), "trim", false);
        setBooleanField(term76744, term76744.getClass(), "autoFlush", false);
        term76754 = new Character((char) 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.csv.CSVFormat");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = char.class;
        Object[] args = new Object[1];
        args[0] = term76754;
        callMethod(klass, "withDelimiter", argTypes, term76744, args);
    }

};


