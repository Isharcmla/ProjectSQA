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

public class CSVFormat_validate_725288942149 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term71241;
     Object term71311;

    public CSVFormat_validate_725288942149() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Character term71293 = new Character((char) 0);
        term71241 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        setField(term71241, term71241.getClass(), "quoteChar", term71293);
        setCharField(term71241, term71241.getClass(), "delimiter", (char) 65535);
        setField(term71241, term71241.getClass(), "escape", null);
        Character term71312 = new Character((char) 0);
        term71311 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        setCharField(term71311, term71311.getClass(), "delimiter", (char) 65535);
        setField(term71311, term71311.getClass(), "quoteChar", term71312);
        setField(term71311, term71311.getClass(), "quotePolicy", null);
        setField(term71311, term71311.getClass(), "commentStart", null);
        setField(term71311, term71311.getClass(), "escape", null);
        setBooleanField(term71311, term71311.getClass(), "ignoreSurroundingSpaces", false);
        setBooleanField(term71311, term71311.getClass(), "ignoreEmptyLines", false);
        setField(term71311, term71311.getClass(), "recordSeparator", null);
        setField(term71311, term71311.getClass(), "nullString", null);
        setField(term71311, term71311.getClass(), "header", null);
        setBooleanField(term71311, term71311.getClass(), "skipHeaderRecord", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.csv.CSVFormat");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "validate", argTypes, term71241, args);
        assertTrue(recursiveEquals(term71241, term71311));
    }

};


