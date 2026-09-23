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

public class CSVFormat_validate_725288942123 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term57030;
     Object term57155;

    public CSVFormat_validate_725288942123() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Character term57082 = new Character((char) 0);
        Character term57134 = new Character((char) 0);
        term57030 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        setField(term57030, term57030.getClass(), "quoteChar", term57082);
        setCharField(term57030, term57030.getClass(), "delimiter", (char) 65535);
        setField(term57030, term57030.getClass(), "escape", term57134);
        setField(term57030, term57030.getClass(), "commentStart", null);
        Character term57156 = new Character((char) 0);
        Character term57157 = new Character((char) 0);
        term57155 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        setCharField(term57155, term57155.getClass(), "delimiter", (char) 65535);
        setField(term57155, term57155.getClass(), "quoteChar", term57156);
        setField(term57155, term57155.getClass(), "quotePolicy", null);
        setField(term57155, term57155.getClass(), "commentStart", null);
        setField(term57155, term57155.getClass(), "escape", term57157);
        setBooleanField(term57155, term57155.getClass(), "ignoreSurroundingSpaces", false);
        setBooleanField(term57155, term57155.getClass(), "ignoreEmptyLines", false);
        setField(term57155, term57155.getClass(), "recordSeparator", null);
        setField(term57155, term57155.getClass(), "nullString", null);
        setField(term57155, term57155.getClass(), "header", null);
        setBooleanField(term57155, term57155.getClass(), "skipHeaderRecord", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.csv.CSVFormat");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "validate", argTypes, term57030, args);
        assertTrue(recursiveEquals(term57030, term57155));
    }

};


