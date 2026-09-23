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

public class CSVRecord_isConsistent_148187396268 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term15825;
     Object term15830;

    public CSVRecord_isConsistent_148187396268() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term15825 = newInstance(Class.forName("org.apache.commons.csv.CSVRecord"));
        setField(term15825, term15825.getClass(), "mapping", null);
        term15830 = newInstance(Class.forName("org.apache.commons.csv.CSVRecord"));
        setField(term15830, term15830.getClass(), "comment", null);
        setField(term15830, term15830.getClass(), "mapping", null);
        setLongField(term15830, term15830.getClass(), "recordNumber", 0L);
        setField(term15830, term15830.getClass(), "values", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.csv.CSVRecord");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "isConsistent", argTypes, term15825, args);
        assertTrue(recursiveEquals(term15825, term15830));
        assertTrue(recursiveEquals(retValue, true));
    }

};


