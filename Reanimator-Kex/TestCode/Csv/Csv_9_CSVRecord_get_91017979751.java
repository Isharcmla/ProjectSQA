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

public class CSVRecord_get_91017979751 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term9703;
     Object term9987;

    public CSVRecord_get_91017979751() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term9703 = newInstance(Class.forName("org.apache.commons.csv.CSVRecord"));
        Object[] term9622 = (Object[]) newArray("java.lang.String", 41);
        setField(term9703, term9703.getClass(), "values", term9622);
        term9987 = newInstance(Class.forName("org.apache.commons.csv.CSVRecord"));
        Object[] term9988 = (Object[]) newArray("java.lang.String", 41);
        setField(term9987, term9987.getClass(), "comment", null);
        setField(term9987, term9987.getClass(), "mapping", null);
        setLongField(term9987, term9987.getClass(), "recordNumber", 0L);
        setField(term9987, term9987.getClass(), "values", term9988);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.csv.CSVRecord");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = 40;
        Object retValue = callMethod(klass, "get", argTypes, term9703, args);
        assertTrue(recursiveEquals(term9703, term9987));
        assertTrue(recursiveEquals(retValue, null));
    }

};


