package org.apache.commons.collections.map;

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
import static org.apache.commons.collections.map.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static org.apache.commons.collections.map.EqualityUtils.*;

public class Flat3Map_remove_8406902791019 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term204222;
     Object term204320;
     Object term204334;
     Object term204335;

    public Flat3Map_remove_8406902791019() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term204222 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setField(term204222, term204222.getClass(), "delegateMap", null);
        setIntField(term204222, term204222.getClass(), "size", 2);
        setIntField(term204222, term204222.getClass(), "hash2", -1);
        setIntField(term204222, term204222.getClass(), "hash1", 0);
        term204320 = newInstance(Class.forName("java.lang.reflect.MalformedParametersException"));
        term204334 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setIntField(term204334, term204334.getClass(), "size", 2);
        setIntField(term204334, term204334.getClass(), "hash1", 0);
        setIntField(term204334, term204334.getClass(), "hash2", -1);
        setIntField(term204334, term204334.getClass(), "hash3", 0);
        setField(term204334, term204334.getClass(), "key1", null);
        setField(term204334, term204334.getClass(), "key2", null);
        setField(term204334, term204334.getClass(), "key3", null);
        setField(term204334, term204334.getClass(), "value1", null);
        setField(term204334, term204334.getClass(), "value2", null);
        setField(term204334, term204334.getClass(), "value3", null);
        setField(term204334, term204334.getClass(), "delegateMap", null);
        term204335 = newInstance(Class.forName("java.lang.reflect.MalformedParametersException"));
        setField(term204335, term204335.getClass(), "backtrace", null);
        setField(term204335, term204335.getClass(), "detailMessage", null);
        setField(term204335, term204335.getClass(), "cause", null);
        setField(term204335, term204335.getClass(), "stackTrace", null);
        setIntField(term204335, term204335.getClass(), "depth", 0);
        setField(term204335, term204335.getClass(), "suppressedExceptions", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.map.Flat3Map");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term204320;
        Object retValue = callMethod(klass, "remove", argTypes, term204222, args);
        assertTrue(recursiveEquals(term204222, term204334));
        assertTrue(recursiveEquals(term204320, term204335));
        assertTrue(recursiveEquals(retValue, null));
    }

};
