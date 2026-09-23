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

public class CSVRecord_isConsistent_148187396225 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4772;
     Object term4777;

    public CSVRecord_isConsistent_148187396225() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term4772 = newInstance(Class.forName("org.apache.commons.csv.CSVRecord"));
        setField(term4772, term4772.getClass(), "mapping", null);
        term4777 = newInstance(Class.forName("org.apache.commons.csv.CSVRecord"));
        setField(term4777, term4777.getClass(), "values", null);
        setField(term4777, term4777.getClass(), "mapping", null);
        setField(term4777, term4777.getClass(), "comment", null);
        setLongField(term4777, term4777.getClass(), "recordNumber", 0L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.csv.CSVRecord");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "isConsistent", argTypes, term4772, args);
        assertTrue(recursiveEquals(term4772, term4777));
        assertTrue(recursiveEquals(retValue, true));
    }

};


