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

public class CSVParser_initializeHeader_1763412551119 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term309096;
     Object term309183;

    public CSVParser_initializeHeader_1763412551119() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term309096 = newInstance(Class.forName("org.apache.commons.csv.CSVParser"));
        Object term309166 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        setField(term309166, term309166.getClass(), "header", null);
        setField(term309096, term309096.getClass(), "format", term309166);
        term309183 = newInstance(Class.forName("org.apache.commons.csv.CSVParser"));
        Object term309184 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        setCharField(term309184, term309184.getClass(), "delimiter", (char) 0);
        setField(term309184, term309184.getClass(), "quoteChar", null);
        setField(term309184, term309184.getClass(), "quotePolicy", null);
        setField(term309184, term309184.getClass(), "commentStart", null);
        setField(term309184, term309184.getClass(), "escape", null);
        setBooleanField(term309184, term309184.getClass(), "ignoreSurroundingSpaces", false);
        setBooleanField(term309184, term309184.getClass(), "ignoreEmptyHeaders", false);
        setBooleanField(term309184, term309184.getClass(), "ignoreEmptyLines", false);
        setField(term309184, term309184.getClass(), "recordSeparator", null);
        setField(term309184, term309184.getClass(), "nullString", null);
        setField(term309184, term309184.getClass(), "header", null);
        setBooleanField(term309184, term309184.getClass(), "skipHeaderRecord", false);
        setField(term309183, term309183.getClass(), "format", term309184);
        setField(term309183, term309183.getClass(), "headerMap", null);
        setField(term309183, term309183.getClass(), "lexer", null);
        setField(term309183, term309183.getClass(), "record", null);
        setLongField(term309183, term309183.getClass(), "recordNumber", 0L);
        setField(term309183, term309183.getClass(), "reusableToken", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.csv.CSVParser");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "initializeHeader", argTypes, term309096, args);
        assertTrue(recursiveEquals(term309096, term309183));
        assertTrue(recursiveEquals(retValue, null));
    }

};


