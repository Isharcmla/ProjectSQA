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
import java.util.LinkedHashMap;

public class CSVParser_initializeHeader_176341255139 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term27789;
     Object term28908;
     Object term28889;

    public CSVParser_initializeHeader_176341255139() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term27789 = newInstance(Class.forName("org.apache.commons.csv.CSVParser"));
        Object term27859 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        Object[] term27707 = (Object[]) newArray("java.lang.String", 498);
        setField(term27859, term27859.getClass(), "header", term27707);
        setField(term27789, term27789.getClass(), "format", term27859);
        term28908 = newInstance(Class.forName("org.apache.commons.csv.CSVParser"));
        Object term28909 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        Object[] term28910 = (Object[]) newArray("java.lang.String", 498);
        setCharField(term28909, term28909.getClass(), "delimiter", (char) 0);
        setField(term28909, term28909.getClass(), "quoteChar", null);
        setField(term28909, term28909.getClass(), "quotePolicy", null);
        setField(term28909, term28909.getClass(), "commentStart", null);
        setField(term28909, term28909.getClass(), "escape", null);
        setBooleanField(term28909, term28909.getClass(), "ignoreSurroundingSpaces", false);
        setBooleanField(term28909, term28909.getClass(), "ignoreEmptyLines", false);
        setField(term28909, term28909.getClass(), "recordSeparator", null);
        setField(term28909, term28909.getClass(), "nullString", null);
        setField(term28909, term28909.getClass(), "header", term28910);
        setBooleanField(term28909, term28909.getClass(), "skipHeaderRecord", false);
        setField(term28908, term28908.getClass(), "format", term28909);
        setField(term28908, term28908.getClass(), "headerMap", null);
        setField(term28908, term28908.getClass(), "lexer", null);
        setField(term28908, term28908.getClass(), "record", null);
        setLongField(term28908, term28908.getClass(), "recordNumber", 0L);
        setField(term28908, term28908.getClass(), "reusableToken", null);
        term28889 = new LinkedHashMap();
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.csv.CSVParser");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "initializeHeader", argTypes, term27789, args);
        assertTrue(recursiveEquals(term27789, term28908));
        assertTrue(recursiveEquals(retValue, term28889));
    }

};


