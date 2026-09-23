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

public class CSVParser_initializeHeader_176341255133 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term25939;
     Object term27212;
     Object term27193;

    public CSVParser_initializeHeader_176341255133() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term25939 = newInstance(Class.forName("org.apache.commons.csv.CSVParser"));
        Object term26009 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        Object[] term25857 = (Object[]) newArray("java.lang.String", 498);
        setField(term26009, term26009.getClass(), "header", term25857);
        setField(term25939, term25939.getClass(), "format", term26009);
        term27212 = newInstance(Class.forName("org.apache.commons.csv.CSVParser"));
        Object term27213 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        Object[] term27214 = (Object[]) newArray("java.lang.String", 498);
        setCharField(term27213, term27213.getClass(), "delimiter", (char) 0);
        setField(term27213, term27213.getClass(), "quoteChar", null);
        setField(term27213, term27213.getClass(), "quotePolicy", null);
        setField(term27213, term27213.getClass(), "commentStart", null);
        setField(term27213, term27213.getClass(), "escape", null);
        setBooleanField(term27213, term27213.getClass(), "ignoreSurroundingSpaces", false);
        setBooleanField(term27213, term27213.getClass(), "ignoreEmptyLines", false);
        setField(term27213, term27213.getClass(), "recordSeparator", null);
        setField(term27213, term27213.getClass(), "nullString", null);
        setField(term27213, term27213.getClass(), "header", term27214);
        setBooleanField(term27213, term27213.getClass(), "skipHeaderRecord", false);
        setField(term27212, term27212.getClass(), "format", term27213);
        setField(term27212, term27212.getClass(), "headerMap", null);
        setField(term27212, term27212.getClass(), "lexer", null);
        setField(term27212, term27212.getClass(), "record", null);
        setLongField(term27212, term27212.getClass(), "recordNumber", 0L);
        setField(term27212, term27212.getClass(), "reusableToken", null);
        term27193 = new LinkedHashMap();
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.csv.CSVParser");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "initializeHeader", argTypes, term25939, args);
        assertTrue(recursiveEquals(term25939, term27212));
        assertTrue(recursiveEquals(retValue, term27193));
    }

};


