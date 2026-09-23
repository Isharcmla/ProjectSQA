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
import java.lang.Object;

public class CSVRecord_get_91017979731 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5022;
     Object term5042;

    public CSVRecord_get_91017979731() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term5022 = newInstance(Class.forName("org.apache.commons.csv.CSVRecord"));
        Object[] term4941 = (Object[]) newArray("java.lang.String", 41);
        setField(term5022, term5022.getClass(), "values", term4941);
        term5042 = newInstance(Class.forName("org.apache.commons.csv.CSVRecord"));
        Object[] term5043 = (Object[]) newArray("java.lang.String", 41);
        setField(term5042, term5042.getClass(), "values", term5043);
        setField(term5042, term5042.getClass(), "mapping", null);
        setField(term5042, term5042.getClass(), "comment", null);
        setLongField(term5042, term5042.getClass(), "recordNumber", 0L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.csv.CSVRecord");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = 40;
        Object retValue = callMethod(klass, "get", argTypes, term5022, args);
        assertTrue(recursiveEquals(term5022, term5042));
        assertTrue(recursiveEquals(retValue, null));
    }

};


