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

public class Flat3Map_equals_18269225271122 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term335338;
     Object term335542;
     Object term336626;
     Object term336628;

    public Flat3Map_equals_18269225271122() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term335338 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term335450 = newInstance(Class.forName("java.util.concurrent.CopyOnWriteArrayList$COWIterator"));
        setField(term335338, term335338.getClass(), "delegateMap", null);
        setIntField(term335338, term335338.getClass(), "size", 3);
        setField(term335338, term335338.getClass(), "key3", null);
        setField(term335338, term335338.getClass(), "value3", null);
        setField(term335338, term335338.getClass(), "key2", null);
        setField(term335338, term335338.getClass(), "value2", null);
        setField(term335338, term335338.getClass(), "key1", term335450);
        term335542 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term335654 = newInstance(Class.forName("java.util.concurrent.CopyOnWriteArrayList$COWIterator"));
        setField(term335542, term335542.getClass(), "delegateMap", null);
        setIntField(term335542, term335542.getClass(), "size", 3);
        setField(term335542, term335542.getClass(), "key3", term335654);
        setField(term335542, term335542.getClass(), "key2", null);
        setField(term335542, term335542.getClass(), "value2", null);
        term336626 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term336627 = newInstance(Class.forName("java.util.concurrent.CopyOnWriteArrayList$COWIterator"));
        setIntField(term336626, term336626.getClass(), "size", 3);
        setIntField(term336626, term336626.getClass(), "hash1", 0);
        setIntField(term336626, term336626.getClass(), "hash2", 0);
        setIntField(term336626, term336626.getClass(), "hash3", 0);
        setField(term336627, term336627.getClass(), "snapshot", null);
        setIntField(term336627, term336627.getClass(), "cursor", 0);
        setField(term336626, term336626.getClass(), "key1", term336627);
        setField(term336626, term336626.getClass(), "key2", null);
        setField(term336626, term336626.getClass(), "key3", null);
        setField(term336626, term336626.getClass(), "value1", null);
        setField(term336626, term336626.getClass(), "value2", null);
        setField(term336626, term336626.getClass(), "value3", null);
        setField(term336626, term336626.getClass(), "delegateMap", null);
        term336628 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term336629 = newInstance(Class.forName("java.util.concurrent.CopyOnWriteArrayList$COWIterator"));
        setIntField(term336628, term336628.getClass(), "size", 3);
        setIntField(term336628, term336628.getClass(), "hash1", 0);
        setIntField(term336628, term336628.getClass(), "hash2", 0);
        setIntField(term336628, term336628.getClass(), "hash3", 0);
        setField(term336628, term336628.getClass(), "key1", null);
        setField(term336628, term336628.getClass(), "key2", null);
        setField(term336629, term336629.getClass(), "snapshot", null);
        setIntField(term336629, term336629.getClass(), "cursor", 0);
        setField(term336628, term336628.getClass(), "key3", term336629);
        setField(term336628, term336628.getClass(), "value1", null);
        setField(term336628, term336628.getClass(), "value2", null);
        setField(term336628, term336628.getClass(), "value3", null);
        setField(term336628, term336628.getClass(), "delegateMap", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.map.Flat3Map");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term335542;
        Object retValue = callMethod(klass, "equals", argTypes, term335338, args);
        assertTrue(recursiveEquals(term335338, term336626));
        assertTrue(recursiveEquals(term335542, term336628));
        assertTrue(recursiveEquals(retValue, false));
    }

};


