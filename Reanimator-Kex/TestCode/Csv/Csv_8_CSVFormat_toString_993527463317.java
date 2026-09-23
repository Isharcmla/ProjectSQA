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

public class CSVFormat_toString_993527463317 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term196496;
     Object term196595;

    public CSVFormat_toString_993527463317() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term196496 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        Object[] term196373 = (Object[]) newArray("java.lang.String", 0);
        setCharField(term196496, term196496.getClass(), "delimiter", (char) 0);
        setField(term196496, term196496.getClass(), "escape", null);
        setField(term196496, term196496.getClass(), "quoteChar", null);
        setField(term196496, term196496.getClass(), "commentStart", null);
        setField(term196496, term196496.getClass(), "nullString", null);
        setField(term196496, term196496.getClass(), "recordSeparator", null);
        setBooleanField(term196496, term196496.getClass(), "ignoreEmptyLines", false);
        setBooleanField(term196496, term196496.getClass(), "ignoreSurroundingSpaces", true);
        setBooleanField(term196496, term196496.getClass(), "skipHeaderRecord", false);
        setField(term196496, term196496.getClass(), "header", term196373);
        term196595 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        Object[] term196596 = (Object[]) newArray("java.lang.String", 0);
        setCharField(term196595, term196595.getClass(), "delimiter", (char) 0);
        setField(term196595, term196595.getClass(), "quoteChar", null);
        setField(term196595, term196595.getClass(), "quotePolicy", null);
        setField(term196595, term196595.getClass(), "commentStart", null);
        setField(term196595, term196595.getClass(), "escape", null);
        setBooleanField(term196595, term196595.getClass(), "ignoreSurroundingSpaces", true);
        setBooleanField(term196595, term196595.getClass(), "ignoreEmptyLines", false);
        setField(term196595, term196595.getClass(), "recordSeparator", null);
        setField(term196595, term196595.getClass(), "nullString", null);
        setField(term196595, term196595.getClass(), "header", term196596);
        setBooleanField(term196595, term196595.getClass(), "skipHeaderRecord", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.csv.CSVFormat");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "toString", argTypes, term196496, args);
        assertTrue(recursiveEquals(term196496, term196595));
        assertTrue(recursiveEquals(retValue, "Delimiter=< > SurroundingSpaces:ignored SkipHeaderRecord:false Header:[]"));
    }

};


