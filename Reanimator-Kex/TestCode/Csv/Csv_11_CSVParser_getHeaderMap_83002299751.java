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

public class CSVParser_getHeaderMap_83002299751 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term190524;
     Object term190528;

    public CSVParser_getHeaderMap_83002299751() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term190524 = newInstance(Class.forName("org.apache.commons.csv.CSVParser"));
        setField(term190524, term190524.getClass(), "headerMap", null);
        term190528 = newInstance(Class.forName("org.apache.commons.csv.CSVParser"));
        setField(term190528, term190528.getClass(), "format", null);
        setField(term190528, term190528.getClass(), "headerMap", null);
        setField(term190528, term190528.getClass(), "lexer", null);
        setField(term190528, term190528.getClass(), "record", null);
        setLongField(term190528, term190528.getClass(), "recordNumber", 0L);
        setField(term190528, term190528.getClass(), "reusableToken", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.csv.CSVParser");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "getHeaderMap", argTypes, term190524, args);
        assertTrue(recursiveEquals(term190524, term190528));
        assertTrue(recursiveEquals(retValue, null));
    }

};


