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
import java.lang.Object;
import java.util.HashMap;

public class CSVRecord_toMap_100707876343 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term7784;

    public CSVRecord_toMap_100707876343() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term7832 = new HashMap();
        ((HashMap) term7832).put((Object)null, (Object)null);
        term7784 = newInstance(Class.forName("org.apache.commons.csv.CSVRecord"));
        Object[] term7641 = (Object[]) newArray("java.lang.String", 0);
        setField(term7784, term7784.getClass(), "values", term7641);
        setField(term7784, term7784.getClass(), "mapping", term7832);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.csv.CSVRecord");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "toMap", argTypes, term7784, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


