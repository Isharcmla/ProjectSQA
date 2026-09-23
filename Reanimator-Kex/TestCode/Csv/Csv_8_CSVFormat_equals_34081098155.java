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

public class CSVFormat_equals_34081098155 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term72673;
     Object term72757;
     Object term72768;
     Object term72769;

    public CSVFormat_equals_34081098155() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term72673 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        term72757 = newInstance(Class.forName("java.util.stream.ReferencePipeline$11$1"));
        term72768 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        setCharField(term72768, term72768.getClass(), "delimiter", (char) 0);
        setField(term72768, term72768.getClass(), "quoteChar", null);
        setField(term72768, term72768.getClass(), "quotePolicy", null);
        setField(term72768, term72768.getClass(), "commentStart", null);
        setField(term72768, term72768.getClass(), "escape", null);
        setBooleanField(term72768, term72768.getClass(), "ignoreSurroundingSpaces", false);
        setBooleanField(term72768, term72768.getClass(), "ignoreEmptyLines", false);
        setField(term72768, term72768.getClass(), "recordSeparator", null);
        setField(term72768, term72768.getClass(), "nullString", null);
        setField(term72768, term72768.getClass(), "header", null);
        setBooleanField(term72768, term72768.getClass(), "skipHeaderRecord", false);
        term72769 = newInstance(Class.forName("java.util.stream.ReferencePipeline$11$1"));
        setField(term72769, term72769.getClass(), "this$1", null);
        setField(term72769, term72769.getClass(), "downstream", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.csv.CSVFormat");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term72757;
        Object retValue = callMethod(klass, "equals", argTypes, term72673, args);
        assertTrue(recursiveEquals(term72673, term72768));
        assertTrue(recursiveEquals(term72757, term72769));
        assertTrue(recursiveEquals(retValue, false));
    }

};


