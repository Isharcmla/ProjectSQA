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

public class CSVRecord_isConsistent_148187396241 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term8448;
     Object term8464;

    public CSVRecord_isConsistent_148187396241() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term8448 = newInstance(Class.forName("org.apache.commons.csv.CSVRecord"));
        setField(term8448, term8448.getClass(), "mapping", null);
        term8464 = newInstance(Class.forName("org.apache.commons.csv.CSVRecord"));
        setField(term8464, term8464.getClass(), "comment", null);
        setField(term8464, term8464.getClass(), "mapping", null);
        setLongField(term8464, term8464.getClass(), "recordNumber", 0L);
        setField(term8464, term8464.getClass(), "values", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.csv.CSVRecord");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "isConsistent", argTypes, term8448, args);
        assertTrue(recursiveEquals(term8448, term8464));
        assertTrue(recursiveEquals(retValue, true));
    }

};


