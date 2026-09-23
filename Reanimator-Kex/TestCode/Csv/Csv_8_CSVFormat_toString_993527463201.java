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

public class CSVFormat_toString_993527463201 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term95503;
     Object term95624;

    public CSVFormat_toString_993527463201() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term95503 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        setCharField(term95503, term95503.getClass(), "delimiter", (char) 0);
        setField(term95503, term95503.getClass(), "escape", null);
        setField(term95503, term95503.getClass(), "quoteChar", null);
        setField(term95503, term95503.getClass(), "commentStart", null);
        setField(term95503, term95503.getClass(), "nullString", null);
        setField(term95503, term95503.getClass(), "recordSeparator", "");
        term95624 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        setCharField(term95624, term95624.getClass(), "delimiter", (char) 0);
        setField(term95624, term95624.getClass(), "quoteChar", null);
        setField(term95624, term95624.getClass(), "quotePolicy", null);
        setField(term95624, term95624.getClass(), "commentStart", null);
        setField(term95624, term95624.getClass(), "escape", null);
        setBooleanField(term95624, term95624.getClass(), "ignoreSurroundingSpaces", false);
        setBooleanField(term95624, term95624.getClass(), "ignoreEmptyLines", false);
        setField(term95624, term95624.getClass(), "recordSeparator", "");
        setField(term95624, term95624.getClass(), "nullString", null);
        setField(term95624, term95624.getClass(), "header", null);
        setBooleanField(term95624, term95624.getClass(), "skipHeaderRecord", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.csv.CSVFormat");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "toString", argTypes, term95503, args);
        assertTrue(recursiveEquals(term95503, term95624));
        assertTrue(recursiveEquals(retValue, "Delimiter=< > RecordSeparator=<> SkipHeaderRecord:false"));
    }

};


