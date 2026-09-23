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

public class CSVFormat_equals_34081098106 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term71403;
     Object term71413;

    public CSVFormat_equals_34081098106() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term71403 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        term71413 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        setCharField(term71413, term71413.getClass(), "delimiter", (char) 0);
        setField(term71413, term71413.getClass(), "quoteCharacter", null);
        setField(term71413, term71413.getClass(), "quoteMode", null);
        setField(term71413, term71413.getClass(), "commentMarker", null);
        setField(term71413, term71413.getClass(), "escapeCharacter", null);
        setBooleanField(term71413, term71413.getClass(), "ignoreSurroundingSpaces", false);
        setBooleanField(term71413, term71413.getClass(), "allowMissingColumnNames", false);
        setBooleanField(term71413, term71413.getClass(), "ignoreEmptyLines", false);
        setField(term71413, term71413.getClass(), "recordSeparator", null);
        setField(term71413, term71413.getClass(), "nullString", null);
        setField(term71413, term71413.getClass(), "header", null);
        setBooleanField(term71413, term71413.getClass(), "skipHeaderRecord", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.csv.CSVFormat");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = null;
        Object retValue = callMethod(klass, "equals", argTypes, term71403, args);
        assertTrue(recursiveEquals(term71403, term71413));
        assertTrue(recursiveEquals(retValue, false));
    }

};


