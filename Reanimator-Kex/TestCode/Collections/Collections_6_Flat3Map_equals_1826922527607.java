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
import java.lang.Object;

public class Flat3Map_equals_1826922527607 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term127331;
     Object term127521;
     Object term128024;
     Object term128026;

    public Flat3Map_equals_1826922527607() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term127331 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term127429 = newInstance(Class.forName("java.util.stream.SortedOps$SizedIntSortingSink"));
        setField(term127331, term127331.getClass(), "delegateMap", null);
        setIntField(term127331, term127331.getClass(), "size", 3);
        setField(term127331, term127331.getClass(), "key3", null);
        setField(term127331, term127331.getClass(), "value3", null);
        setField(term127331, term127331.getClass(), "key2", term127429);
        term127521 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term127559 = newInstance(Class.forName("java.lang.Object"));
        setField(term127521, term127521.getClass(), "delegateMap", null);
        setIntField(term127521, term127521.getClass(), "size", 3);
        setField(term127521, term127521.getClass(), "key3", term127559);
        setField(term127521, term127521.getClass(), "key2", null);
        setField(term127521, term127521.getClass(), "value2", null);
        term128024 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term128025 = newInstance(Class.forName("java.util.stream.SortedOps$SizedIntSortingSink"));
        setIntField(term128024, term128024.getClass(), "size", 3);
        setIntField(term128024, term128024.getClass(), "hash1", 0);
        setIntField(term128024, term128024.getClass(), "hash2", 0);
        setIntField(term128024, term128024.getClass(), "hash3", 0);
        setField(term128024, term128024.getClass(), "key1", null);
        setField(term128025, term128025.getClass(), "array", null);
        setIntField(term128025, term128025.getClass(), "offset", 0);
        setBooleanField(term128025, term128025.getClass(), "cancellationRequestedCalled", false);
        setField(term128025, term128025.getClass(), "downstream", null);
        setField(term128024, term128024.getClass(), "key2", term128025);
        setField(term128024, term128024.getClass(), "key3", null);
        setField(term128024, term128024.getClass(), "value1", null);
        setField(term128024, term128024.getClass(), "value2", null);
        setField(term128024, term128024.getClass(), "value3", null);
        setField(term128024, term128024.getClass(), "delegateMap", null);
        term128026 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term128027 = newInstance(Class.forName("java.lang.Object"));
        setIntField(term128026, term128026.getClass(), "size", 3);
        setIntField(term128026, term128026.getClass(), "hash1", 0);
        setIntField(term128026, term128026.getClass(), "hash2", 0);
        setIntField(term128026, term128026.getClass(), "hash3", 0);
        setField(term128026, term128026.getClass(), "key1", null);
        setField(term128026, term128026.getClass(), "key2", null);
        setField(term128026, term128026.getClass(), "key3", term128027);
        setField(term128026, term128026.getClass(), "value1", null);
        setField(term128026, term128026.getClass(), "value2", null);
        setField(term128026, term128026.getClass(), "value3", null);
        setField(term128026, term128026.getClass(), "delegateMap", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.map.Flat3Map");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term127521;
        Object retValue = callMethod(klass, "equals", argTypes, term127331, args);
        assertTrue(recursiveEquals(term127331, term128024));
        assertTrue(recursiveEquals(term127521, term128026));
        assertTrue(recursiveEquals(retValue, false));
    }

};


