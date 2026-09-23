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
import java.lang.NullPointerException;
import static org.apache.commons.csv.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.util.HashMap;
import java.lang.Object;

public class CSVRecord_get_108772658217 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term159;

    public CSVRecord_get_108772658217() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term172 = new HashMap();
        term159 = newInstance(Class.forName("org.apache.commons.csv.CSVRecord"));
        Object[] term184 = (Object[]) newArray("java.lang.String", 0);
        setField(term159, term159.getClass(), "comment", "MjGYSRKTNF");
        setField(term159, term159.getClass(), "mapping", term172);
        setLongField(term159, term159.getClass(), "recordNumber", 6375119433582206027L);
        setField(term159, term159.getClass(), "values", term184);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.csv.CSVRecord");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Enum");
        Object[] args = new Object[1];
        args[0] = null;
        try {
            callMethod(klass, "get", argTypes, term159, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


