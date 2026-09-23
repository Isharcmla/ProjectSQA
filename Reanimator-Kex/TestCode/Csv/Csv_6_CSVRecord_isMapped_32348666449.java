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

public class CSVRecord_isMapped_32348666449 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term9281;
     Object term9286;

    public CSVRecord_isMapped_32348666449() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term9281 = newInstance(Class.forName("org.apache.commons.csv.CSVRecord"));
        setField(term9281, term9281.getClass(), "mapping", null);
        term9286 = newInstance(Class.forName("org.apache.commons.csv.CSVRecord"));
        setField(term9286, term9286.getClass(), "comment", null);
        setField(term9286, term9286.getClass(), "mapping", null);
        setLongField(term9286, term9286.getClass(), "recordNumber", 0L);
        setField(term9286, term9286.getClass(), "values", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.csv.CSVRecord");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = null;
        Object retValue = callMethod(klass, "isMapped", argTypes, term9281, args);
        assertTrue(recursiveEquals(term9281, term9286));
        assertTrue(recursiveEquals(retValue, false));
    }

};


