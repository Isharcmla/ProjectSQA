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

public class CSVFormat_withIgnoreHeaderCase_1929023860142 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term76860;

    public CSVFormat_withIgnoreHeaderCase_1929023860142() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term76860 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        setBooleanField(term76860, term76860.getClass(), "allowMissingColumnNames", false);
        setField(term76860, term76860.getClass(), "commentMarker", null);
        setCharField(term76860, term76860.getClass(), "delimiter", (char) 0);
        setField(term76860, term76860.getClass(), "escapeCharacter", null);
        setField(term76860, term76860.getClass(), "header", null);
        setField(term76860, term76860.getClass(), "headerComments", null);
        setBooleanField(term76860, term76860.getClass(), "ignoreEmptyLines", false);
        setBooleanField(term76860, term76860.getClass(), "ignoreHeaderCase", false);
        setBooleanField(term76860, term76860.getClass(), "ignoreSurroundingSpaces", false);
        setField(term76860, term76860.getClass(), "nullString", null);
        setField(term76860, term76860.getClass(), "quoteCharacter", null);
        setField(term76860, term76860.getClass(), "quoteMode", null);
        setField(term76860, term76860.getClass(), "recordSeparator", null);
        setBooleanField(term76860, term76860.getClass(), "skipHeaderRecord", false);
        setBooleanField(term76860, term76860.getClass(), "trailingDelimiter", false);
        setBooleanField(term76860, term76860.getClass(), "trim", false);
        setBooleanField(term76860, term76860.getClass(), "autoFlush", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.csv.CSVFormat");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "withIgnoreHeaderCase", argTypes, term76860, args);
    }

};


