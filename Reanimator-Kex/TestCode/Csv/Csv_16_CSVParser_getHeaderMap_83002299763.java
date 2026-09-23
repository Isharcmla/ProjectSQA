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

public class CSVParser_getHeaderMap_83002299763 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term218645;
     Object term218650;

    public CSVParser_getHeaderMap_83002299763() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term218645 = newInstance(Class.forName("org.apache.commons.csv.CSVParser"));
        setField(term218645, term218645.getClass(), "headerMap", null);
        term218650 = newInstance(Class.forName("org.apache.commons.csv.CSVParser"));
        setField(term218650, term218650.getClass(), "format", null);
        setField(term218650, term218650.getClass(), "headerMap", null);
        setField(term218650, term218650.getClass(), "lexer", null);
        setField(term218650, term218650.getClass(), "recordList", null);
        setLongField(term218650, term218650.getClass(), "recordNumber", 0L);
        setLongField(term218650, term218650.getClass(), "characterOffset", 0L);
        setField(term218650, term218650.getClass(), "reusableToken", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.csv.CSVParser");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "getHeaderMap", argTypes, term218645, args);
        assertTrue(recursiveEquals(term218645, term218650));
        assertTrue(recursiveEquals(retValue, null));
    }

};


