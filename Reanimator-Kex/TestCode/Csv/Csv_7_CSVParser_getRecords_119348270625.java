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
import java.lang.NullPointerException;
import static org.apache.commons.csv.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class CSVParser_getRecords_119348270625 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term6266;

    public CSVParser_getRecords_119348270625() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term6266 = newInstance(Class.forName("org.apache.commons.csv.CSVParser"));
        setField(term6266, term6266.getClass(), "format", null);
        setField(term6266, term6266.getClass(), "headerMap", null);
        setField(term6266, term6266.getClass(), "lexer", null);
        setField(term6266, term6266.getClass(), "record", null);
        setLongField(term6266, term6266.getClass(), "recordNumber", 0L);
        setField(term6266, term6266.getClass(), "reusableToken", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.csv.CSVParser");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.Collection");
        Object[] args = new Object[1];
        args[0] = null;
        try {
            callMethod(klass, "getRecords", argTypes, term6266, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


