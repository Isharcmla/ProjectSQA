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
import java.lang.Character;

public class CSVFormat_validate_725288942243 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term123749;
     Object term123818;

    public CSVFormat_validate_725288942243() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Character term123801 = new Character((char) 0);
        term123749 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        setField(term123749, term123749.getClass(), "quoteChar", null);
        setField(term123749, term123749.getClass(), "escape", term123801);
        setCharField(term123749, term123749.getClass(), "delimiter", (char) 65535);
        Character term123819 = new Character((char) 0);
        term123818 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        setCharField(term123818, term123818.getClass(), "delimiter", (char) 65535);
        setField(term123818, term123818.getClass(), "quoteChar", null);
        setField(term123818, term123818.getClass(), "quotePolicy", null);
        setField(term123818, term123818.getClass(), "commentStart", null);
        setField(term123818, term123818.getClass(), "escape", term123819);
        setBooleanField(term123818, term123818.getClass(), "ignoreSurroundingSpaces", false);
        setBooleanField(term123818, term123818.getClass(), "ignoreEmptyLines", false);
        setField(term123818, term123818.getClass(), "recordSeparator", null);
        setField(term123818, term123818.getClass(), "nullString", null);
        setField(term123818, term123818.getClass(), "header", null);
        setBooleanField(term123818, term123818.getClass(), "skipHeaderRecord", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.csv.CSVFormat");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "validate", argTypes, term123749, args);
        assertTrue(recursiveEquals(term123749, term123818));
    }

};


