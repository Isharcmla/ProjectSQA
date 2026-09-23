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

public class CSVFormat_isEscaping_1353953584103 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term50120;
     Object term50128;

    public CSVFormat_isEscaping_1353953584103() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term50120 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        setField(term50120, term50120.getClass(), "escape", null);
        term50128 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        setCharField(term50128, term50128.getClass(), "delimiter", (char) 0);
        setField(term50128, term50128.getClass(), "quoteChar", null);
        setField(term50128, term50128.getClass(), "quotePolicy", null);
        setField(term50128, term50128.getClass(), "commentStart", null);
        setField(term50128, term50128.getClass(), "escape", null);
        setBooleanField(term50128, term50128.getClass(), "ignoreSurroundingSpaces", false);
        setBooleanField(term50128, term50128.getClass(), "ignoreEmptyLines", false);
        setField(term50128, term50128.getClass(), "recordSeparator", null);
        setField(term50128, term50128.getClass(), "nullString", null);
        setField(term50128, term50128.getClass(), "header", null);
        setBooleanField(term50128, term50128.getClass(), "skipHeaderRecord", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.csv.CSVFormat");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "isEscaping", argTypes, term50120, args);
        assertTrue(recursiveEquals(term50120, term50128));
        assertTrue(recursiveEquals(retValue, false));
    }

};


