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

public class CSVRecord_isMapped_32348666464 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term14641;
     Object term14646;

    public CSVRecord_isMapped_32348666464() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term14641 = newInstance(Class.forName("org.apache.commons.csv.CSVRecord"));
        setField(term14641, term14641.getClass(), "mapping", null);
        term14646 = newInstance(Class.forName("org.apache.commons.csv.CSVRecord"));
        setField(term14646, term14646.getClass(), "comment", null);
        setField(term14646, term14646.getClass(), "mapping", null);
        setLongField(term14646, term14646.getClass(), "recordNumber", 0L);
        setField(term14646, term14646.getClass(), "values", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.csv.CSVRecord");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = null;
        Object retValue = callMethod(klass, "isMapped", argTypes, term14641, args);
        assertTrue(recursiveEquals(term14641, term14646));
        assertTrue(recursiveEquals(retValue, false));
    }

};


