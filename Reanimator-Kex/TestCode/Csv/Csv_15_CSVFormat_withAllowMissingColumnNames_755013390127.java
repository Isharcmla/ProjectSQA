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

public class CSVFormat_withAllowMissingColumnNames_755013390127 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term76700;

    public CSVFormat_withAllowMissingColumnNames_755013390127() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term76700 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        setBooleanField(term76700, term76700.getClass(), "allowMissingColumnNames", false);
        setField(term76700, term76700.getClass(), "commentMarker", null);
        setCharField(term76700, term76700.getClass(), "delimiter", (char) 0);
        setField(term76700, term76700.getClass(), "escapeCharacter", null);
        setField(term76700, term76700.getClass(), "header", null);
        setField(term76700, term76700.getClass(), "headerComments", null);
        setBooleanField(term76700, term76700.getClass(), "ignoreEmptyLines", false);
        setBooleanField(term76700, term76700.getClass(), "ignoreHeaderCase", false);
        setBooleanField(term76700, term76700.getClass(), "ignoreSurroundingSpaces", false);
        setField(term76700, term76700.getClass(), "nullString", null);
        setField(term76700, term76700.getClass(), "quoteCharacter", null);
        setField(term76700, term76700.getClass(), "quoteMode", null);
        setField(term76700, term76700.getClass(), "recordSeparator", null);
        setBooleanField(term76700, term76700.getClass(), "skipHeaderRecord", false);
        setBooleanField(term76700, term76700.getClass(), "trailingDelimiter", false);
        setBooleanField(term76700, term76700.getClass(), "trim", false);
        setBooleanField(term76700, term76700.getClass(), "autoFlush", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.csv.CSVFormat");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "withAllowMissingColumnNames", argTypes, term76700, args);
    }

};


