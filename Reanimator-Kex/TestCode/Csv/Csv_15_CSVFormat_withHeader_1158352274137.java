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

public class CSVFormat_withHeader_1158352274137 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term76808;

    public CSVFormat_withHeader_1158352274137() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term76808 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        setBooleanField(term76808, term76808.getClass(), "allowMissingColumnNames", false);
        setField(term76808, term76808.getClass(), "commentMarker", null);
        setCharField(term76808, term76808.getClass(), "delimiter", (char) 0);
        setField(term76808, term76808.getClass(), "escapeCharacter", null);
        setField(term76808, term76808.getClass(), "header", null);
        setField(term76808, term76808.getClass(), "headerComments", null);
        setBooleanField(term76808, term76808.getClass(), "ignoreEmptyLines", false);
        setBooleanField(term76808, term76808.getClass(), "ignoreHeaderCase", false);
        setBooleanField(term76808, term76808.getClass(), "ignoreSurroundingSpaces", false);
        setField(term76808, term76808.getClass(), "nullString", null);
        setField(term76808, term76808.getClass(), "quoteCharacter", null);
        setField(term76808, term76808.getClass(), "quoteMode", null);
        setField(term76808, term76808.getClass(), "recordSeparator", null);
        setBooleanField(term76808, term76808.getClass(), "skipHeaderRecord", false);
        setBooleanField(term76808, term76808.getClass(), "trailingDelimiter", false);
        setBooleanField(term76808, term76808.getClass(), "trim", false);
        setBooleanField(term76808, term76808.getClass(), "autoFlush", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.csv.CSVFormat");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.sql.ResultSetMetaData");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "withHeader", argTypes, term76808, args);
    }

};


