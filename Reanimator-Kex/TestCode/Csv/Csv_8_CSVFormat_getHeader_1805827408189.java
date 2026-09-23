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

public class CSVFormat_getHeader_1805827408189 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term90982;
     Object term90989;

    public CSVFormat_getHeader_1805827408189() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term90982 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        setField(term90982, term90982.getClass(), "header", null);
        term90989 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        setCharField(term90989, term90989.getClass(), "delimiter", (char) 0);
        setField(term90989, term90989.getClass(), "quoteChar", null);
        setField(term90989, term90989.getClass(), "quotePolicy", null);
        setField(term90989, term90989.getClass(), "commentStart", null);
        setField(term90989, term90989.getClass(), "escape", null);
        setBooleanField(term90989, term90989.getClass(), "ignoreSurroundingSpaces", false);
        setBooleanField(term90989, term90989.getClass(), "ignoreEmptyLines", false);
        setField(term90989, term90989.getClass(), "recordSeparator", null);
        setField(term90989, term90989.getClass(), "nullString", null);
        setField(term90989, term90989.getClass(), "header", null);
        setBooleanField(term90989, term90989.getClass(), "skipHeaderRecord", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.csv.CSVFormat");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "getHeader", argTypes, term90982, args);
        assertTrue(recursiveEquals(term90982, term90989));
        assertTrue(recursiveEquals(retValue, null));
    }

};


