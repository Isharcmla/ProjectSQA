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

public class CSVParser_close_6929134043 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term51826;
     Object term51830;

    public CSVParser_close_6929134043() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term51826 = newInstance(Class.forName("org.apache.commons.csv.CSVParser"));
        setField(term51826, term51826.getClass(), "lexer", null);
        term51830 = newInstance(Class.forName("org.apache.commons.csv.CSVParser"));
        setField(term51830, term51830.getClass(), "format", null);
        setField(term51830, term51830.getClass(), "headerMap", null);
        setField(term51830, term51830.getClass(), "lexer", null);
        setField(term51830, term51830.getClass(), "record", null);
        setLongField(term51830, term51830.getClass(), "recordNumber", 0L);
        setField(term51830, term51830.getClass(), "reusableToken", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.csv.CSVParser");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "close", argTypes, term51826, args);
        assertTrue(recursiveEquals(term51826, term51830));
    }

};


