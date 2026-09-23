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

public class CSVFormat_withRecordSeparator_2095976618151 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term76958;

    public CSVFormat_withRecordSeparator_2095976618151() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term76958 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        setBooleanField(term76958, term76958.getClass(), "allowMissingColumnNames", false);
        setField(term76958, term76958.getClass(), "commentMarker", null);
        setCharField(term76958, term76958.getClass(), "delimiter", (char) 0);
        setField(term76958, term76958.getClass(), "escapeCharacter", null);
        setField(term76958, term76958.getClass(), "header", null);
        setField(term76958, term76958.getClass(), "headerComments", null);
        setBooleanField(term76958, term76958.getClass(), "ignoreEmptyLines", false);
        setBooleanField(term76958, term76958.getClass(), "ignoreHeaderCase", false);
        setBooleanField(term76958, term76958.getClass(), "ignoreSurroundingSpaces", false);
        setField(term76958, term76958.getClass(), "nullString", null);
        setField(term76958, term76958.getClass(), "quoteCharacter", null);
        setField(term76958, term76958.getClass(), "quoteMode", null);
        setField(term76958, term76958.getClass(), "recordSeparator", null);
        setBooleanField(term76958, term76958.getClass(), "skipHeaderRecord", false);
        setBooleanField(term76958, term76958.getClass(), "trailingDelimiter", false);
        setBooleanField(term76958, term76958.getClass(), "trim", false);
        setBooleanField(term76958, term76958.getClass(), "autoFlush", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.csv.CSVFormat");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "withRecordSeparator", argTypes, term76958, args);
    }

};


