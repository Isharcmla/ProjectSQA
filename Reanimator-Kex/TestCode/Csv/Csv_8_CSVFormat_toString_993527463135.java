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

public class CSVFormat_toString_993527463135 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term63638;
     Object term64098;

    public CSVFormat_toString_993527463135() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term63638 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        setCharField(term63638, term63638.getClass(), "delimiter", (char) 0);
        setField(term63638, term63638.getClass(), "escape", null);
        term64098 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        setCharField(term64098, term64098.getClass(), "delimiter", (char) 0);
        setField(term64098, term64098.getClass(), "quoteChar", null);
        setField(term64098, term64098.getClass(), "quotePolicy", null);
        setField(term64098, term64098.getClass(), "commentStart", null);
        setField(term64098, term64098.getClass(), "escape", null);
        setBooleanField(term64098, term64098.getClass(), "ignoreSurroundingSpaces", false);
        setBooleanField(term64098, term64098.getClass(), "ignoreEmptyLines", false);
        setField(term64098, term64098.getClass(), "recordSeparator", null);
        setField(term64098, term64098.getClass(), "nullString", null);
        setField(term64098, term64098.getClass(), "header", null);
        setBooleanField(term64098, term64098.getClass(), "skipHeaderRecord", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.csv.CSVFormat");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "toString", argTypes, term63638, args);
        assertTrue(recursiveEquals(term63638, term64098));
        assertTrue(recursiveEquals(retValue, "Delimiter=< > SkipHeaderRecord:false"));
    }

};


