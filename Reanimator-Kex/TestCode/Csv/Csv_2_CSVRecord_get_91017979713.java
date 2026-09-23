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
import java.lang.ArrayIndexOutOfBoundsException;
import static org.apache.commons.csv.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.util.HashMap;
import java.lang.Integer;

public class CSVRecord_get_91017979713 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term159;
     Object term185;

    public CSVRecord_get_91017979713() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term161 = new HashMap();
        term159 = newInstance(Class.forName("org.apache.commons.csv.CSVRecord"));
        Object[] term160 = (Object[]) newArray("java.lang.String", 0);
        setField(term159, term159.getClass(), "values", term160);
        setField(term159, term159.getClass(), "mapping", term161);
        setField(term159, term159.getClass(), "comment", "hRNSzYYIrc");
        setLongField(term159, term159.getClass(), "recordNumber", 6375119433582206027L);
        term185 = new Integer(568599855);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.csv.CSVRecord");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term185;
        try {
            callMethod(klass, "get", argTypes, term159, args);
            assertTrue(false);
        }
        catch (ArrayIndexOutOfBoundsException e) {
        }

    }

};


