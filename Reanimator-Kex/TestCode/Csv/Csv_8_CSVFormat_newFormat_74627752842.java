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

public class CSVFormat_newFormat_74627752842 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5;
     Object term12234;

    public CSVFormat_newFormat_74627752842() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term5 = new Character('E');
        term12234 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        setCharField(term12234, term12234.getClass(), "delimiter", 'E');
        setField(term12234, term12234.getClass(), "quoteChar", null);
        setField(term12234, term12234.getClass(), "quotePolicy", null);
        setField(term12234, term12234.getClass(), "commentStart", null);
        setField(term12234, term12234.getClass(), "escape", null);
        setBooleanField(term12234, term12234.getClass(), "ignoreSurroundingSpaces", false);
        setBooleanField(term12234, term12234.getClass(), "ignoreEmptyLines", false);
        setField(term12234, term12234.getClass(), "recordSeparator", null);
        setField(term12234, term12234.getClass(), "nullString", null);
        setField(term12234, term12234.getClass(), "header", null);
        setBooleanField(term12234, term12234.getClass(), "skipHeaderRecord", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.csv.CSVFormat");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = char.class;
        Object[] args = new Object[1];
        args[0] = term5;
        Object retValue = callMethod(klass, "newFormat", argTypes, null, args);
        assertTrue(recursiveEquals(term5, 'E'));
        assertTrue(recursiveEquals(retValue, term12234));
    }

};


