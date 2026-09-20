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

public class Flat3Map_equals_1826922527702 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term138607;
     Object term138943;
     Object term139554;
     Object term139557;

    public Flat3Map_equals_1826922527702() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term138607 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term138717 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap"));
        Object term138851 = newInstance(Class.forName("org.apache.commons.collections.FastArrayList$SubList$SubListIter"));
        setField(term138607, term138607.getClass(), "delegateMap", null);
        setIntField(term138607, term138607.getClass(), "size", 2);
        setField(term138607, term138607.getClass(), "key2", null);
        setIntField(term138717, term138717.getClass(), "size", 0);
        setField(term138607, term138607.getClass(), "value2", term138717);
        setField(term138607, term138607.getClass(), "key1", term138851);
        term138943 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term139053 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap"));
        setField(term138943, term138943.getClass(), "delegateMap", null);
        setIntField(term138943, term138943.getClass(), "size", 2);
        setField(term138943, term138943.getClass(), "key2", null);
        setIntField(term139053, term139053.getClass(), "size", 0);
        setField(term138943, term138943.getClass(), "value2", term139053);
        term139554 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term139555 = newInstance(Class.forName("org.apache.commons.collections.FastArrayList$SubList$SubListIter"));
        Object term139556 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap"));
        setIntField(term139554, term139554.getClass(), "size", 2);
        setIntField(term139554, term139554.getClass(), "hash1", 0);
        setIntField(term139554, term139554.getClass(), "hash2", 0);
        setIntField(term139554, term139554.getClass(), "hash3", 0);
        setField(term139555, term139555.getClass(), "expected", null);
        setField(term139555, term139555.getClass(), "iter", null);
        setIntField(term139555, term139555.getClass(), "lastReturnedIndex", 0);
        setField(term139555, term139555.getClass(), "this$1", null);
        setField(term139554, term139554.getClass(), "key1", term139555);
        setField(term139554, term139554.getClass(), "key2", null);
        setField(term139554, term139554.getClass(), "key3", null);
        setField(term139554, term139554.getClass(), "value1", null);
        setFloatField(term139556, term139556.getClass(), "loadFactor", 0.0F);
        setIntField(term139556, term139556.getClass(), "size", 0);
        setField(term139556, term139556.getClass(), "data", null);
        setIntField(term139556, term139556.getClass(), "threshold", 0);
        setIntField(term139556, term139556.getClass(), "modCount", 0);
        setField(term139556, term139556.getClass(), "entrySet", null);
        setField(term139556, term139556.getClass(), "keySet", null);
        setField(term139556, term139556.getClass(), "values", null);
        setField(term139556, term139556.getClass(), "keySet", null);
        setField(term139556, term139556.getClass(), "values", null);
        setField(term139554, term139554.getClass(), "value2", term139556);
        setField(term139554, term139554.getClass(), "value3", null);
        setField(term139554, term139554.getClass(), "delegateMap", null);
        term139557 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term139558 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap"));
        setIntField(term139557, term139557.getClass(), "size", 2);
        setIntField(term139557, term139557.getClass(), "hash1", 0);
        setIntField(term139557, term139557.getClass(), "hash2", 0);
        setIntField(term139557, term139557.getClass(), "hash3", 0);
        setField(term139557, term139557.getClass(), "key1", null);
        setField(term139557, term139557.getClass(), "key2", null);
        setField(term139557, term139557.getClass(), "key3", null);
        setField(term139557, term139557.getClass(), "value1", null);
        setFloatField(term139558, term139558.getClass(), "loadFactor", 0.0F);
        setIntField(term139558, term139558.getClass(), "size", 0);
        setField(term139558, term139558.getClass(), "data", null);
        setIntField(term139558, term139558.getClass(), "threshold", 0);
        setIntField(term139558, term139558.getClass(), "modCount", 0);
        setField(term139558, term139558.getClass(), "entrySet", null);
        setField(term139558, term139558.getClass(), "keySet", null);
        setField(term139558, term139558.getClass(), "values", null);
        setField(term139558, term139558.getClass(), "keySet", null);
        setField(term139558, term139558.getClass(), "values", null);
        setField(term139557, term139557.getClass(), "value2", term139558);
        setField(term139557, term139557.getClass(), "value3", null);
        setField(term139557, term139557.getClass(), "delegateMap", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.map.Flat3Map");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term138943;
        Object retValue = callMethod(klass, "equals", argTypes, term138607, args);
        assertTrue(recursiveEquals(term138607, term139554));
        assertTrue(recursiveEquals(term138943, term139557));
        assertTrue(recursiveEquals(retValue, false));
    }

};
