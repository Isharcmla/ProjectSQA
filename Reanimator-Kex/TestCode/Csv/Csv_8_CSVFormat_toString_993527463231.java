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

public class CSVFormat_toString_993527463231 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term117709;
     Object term118413;

    public CSVFormat_toString_993527463231() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term117709 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        setCharField(term117709, term117709.getClass(), "delimiter", (char) 0);
        setField(term117709, term117709.getClass(), "escape", null);
        setField(term117709, term117709.getClass(), "quoteChar", null);
        setField(term117709, term117709.getClass(), "commentStart", null);
        setField(term117709, term117709.getClass(), "nullString", "");
        term118413 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        setCharField(term118413, term118413.getClass(), "delimiter", (char) 0);
        setField(term118413, term118413.getClass(), "quoteChar", null);
        setField(term118413, term118413.getClass(), "quotePolicy", null);
        setField(term118413, term118413.getClass(), "commentStart", null);
        setField(term118413, term118413.getClass(), "escape", null);
        setBooleanField(term118413, term118413.getClass(), "ignoreSurroundingSpaces", false);
        setBooleanField(term118413, term118413.getClass(), "ignoreEmptyLines", false);
        setField(term118413, term118413.getClass(), "recordSeparator", null);
        setField(term118413, term118413.getClass(), "nullString", "");
        setField(term118413, term118413.getClass(), "header", null);
        setBooleanField(term118413, term118413.getClass(), "skipHeaderRecord", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.csv.CSVFormat");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "toString", argTypes, term117709, args);
        assertTrue(recursiveEquals(term117709, term118413));
        assertTrue(recursiveEquals(retValue, "Delimiter=< > NullString=<> SkipHeaderRecord:false"));
    }

};


