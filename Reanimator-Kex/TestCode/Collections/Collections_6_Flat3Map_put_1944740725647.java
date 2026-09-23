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

public class Flat3Map_put_1944740725647 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term143860;
     Object term144192;
     Object term144294;
     Object term144299;

    public Flat3Map_put_1944740725647() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term143860 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term143898 = newInstance(Class.forName("java.lang.Object"));
        Object term143936 = newInstance(Class.forName("java.lang.Object"));
        Object term143974 = newInstance(Class.forName("java.lang.Object"));
        Object[] term143730 = (Object[]) newArray("org.apache.commons.collections.map.AbstractHashedMap$HashEntry", 16);
        Object term144012 = newInstance(Class.forName("java.lang.Object"));
        Object term144050 = newInstance(Class.forName("java.lang.Object"));
        setField(term143860, term143860.getClass(), "delegateMap", null);
        setIntField(term143860, term143860.getClass(), "size", -4);
        setIntField(term143860, term143860.getClass(), "hash3", 0);
        setIntField(term143860, term143860.getClass(), "hash2", 0);
        setIntField(term143860, term143860.getClass(), "hash1", 0);
        setField(term143860, term143860.getClass(), "key3", term143898);
        setField(term143860, term143860.getClass(), "key2", term143936);
        setField(term143860, term143860.getClass(), "key1", term143974);
        setField(term143860, term143860.getClass(), "value3", term143730);
        setField(term143860, term143860.getClass(), "value2", term144012);
        setField(term143860, term143860.getClass(), "value1", term144050);
        term144192 = newInstance(Class.forName("java.util.concurrent.ConcurrentHashMap$MapReduceMappingsToDoubleTask"));
        term144294 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term144295 = newInstance(Class.forName("org.apache.commons.collections.map.HashedMap"));
        Object[] term144296 = (Object[]) newArray("org.apache.commons.collections.map.AbstractHashedMap$HashEntry", 16);
        Object term144297 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap$HashEntry"));
        Object term144298 = newInstance(Class.forName("java.util.concurrent.ConcurrentHashMap$MapReduceMappingsToDoubleTask"));
        setIntField(term144294, term144294.getClass(), "size", 0);
        setIntField(term144294, term144294.getClass(), "hash1", 0);
        setIntField(term144294, term144294.getClass(), "hash2", 0);
        setIntField(term144294, term144294.getClass(), "hash3", 0);
        setField(term144294, term144294.getClass(), "key1", null);
        setField(term144294, term144294.getClass(), "key2", null);
        setField(term144294, term144294.getClass(), "key3", null);
        setField(term144294, term144294.getClass(), "value1", null);
        setField(term144294, term144294.getClass(), "value2", null);
        setField(term144294, term144294.getClass(), "value3", null);
        setFloatField(term144295, term144295.getClass(), "loadFactor", 0.75F);
        setIntField(term144295, term144295.getClass(), "size", 1);
        setField(term144297, term144297.getClass(), "next", null);
        setField(term144298, term144298.getClass(), "transformer", null);
        setField(term144298, term144298.getClass(), "reducer", null);
        setDoubleField(term144298, term144298.getClass(), "basis", 0.0);
        setDoubleField(term144298, term144298.getClass(), "result", 0.0);
        setField(term144298, term144298.getClass(), "rights", null);
        setField(term144298, term144298.getClass(), "nextRight", null);
        setField(term144298, term144298.getClass(), "tab", null);
        setField(term144298, term144298.getClass(), "next", null);
        setField(term144298, term144298.getClass(), "stack", null);
        setField(term144298, term144298.getClass(), "spare", null);
        setIntField(term144298, term144298.getClass(), "index", 0);
        setIntField(term144298, term144298.getClass(), "baseIndex", 0);
        setIntField(term144298, term144298.getClass(), "baseLimit", 0);
        setIntField(term144298, term144298.getClass(), "baseSize", 0);
        setIntField(term144298, term144298.getClass(), "batch", 0);
        setField(term144298, term144298.getClass(), "completer", null);
        setIntField(term144298, term144298.getClass(), "pending", 0);
        setIntField(term144298, term144298.getClass(), "status", 0);
        setField(term144297, term144297.getClass(), "key", term144298);
        setField(term144297, term144297.getClass(), "value", null);
        setElement(term144296, 8, term144297);
        setField(term144295, term144295.getClass(), "data", term144296);
        setIntField(term144295, term144295.getClass(), "threshold", 12);
        setIntField(term144295, term144295.getClass(), "modCount", 1);
        setField(term144295, term144295.getClass(), "entrySet", null);
        setField(term144295, term144295.getClass(), "keySet", null);
        setField(term144295, term144295.getClass(), "values", null);
        setField(term144295, term144295.getClass(), "keySet", null);
        setField(term144295, term144295.getClass(), "values", null);
        setField(term144294, term144294.getClass(), "delegateMap", term144295);
        term144299 = newInstance(Class.forName("java.util.concurrent.ConcurrentHashMap$MapReduceMappingsToDoubleTask"));
        setField(term144299, term144299.getClass(), "transformer", null);
        setField(term144299, term144299.getClass(), "reducer", null);
        setDoubleField(term144299, term144299.getClass(), "basis", 0.0);
        setDoubleField(term144299, term144299.getClass(), "result", 0.0);
        setField(term144299, term144299.getClass(), "rights", null);
        setField(term144299, term144299.getClass(), "nextRight", null);
        setField(term144299, term144299.getClass(), "tab", null);
        setField(term144299, term144299.getClass(), "next", null);
        setField(term144299, term144299.getClass(), "stack", null);
        setField(term144299, term144299.getClass(), "spare", null);
        setIntField(term144299, term144299.getClass(), "index", 0);
        setIntField(term144299, term144299.getClass(), "baseIndex", 0);
        setIntField(term144299, term144299.getClass(), "baseLimit", 0);
        setIntField(term144299, term144299.getClass(), "baseSize", 0);
        setIntField(term144299, term144299.getClass(), "batch", 0);
        setField(term144299, term144299.getClass(), "completer", null);
        setIntField(term144299, term144299.getClass(), "pending", 0);
        setIntField(term144299, term144299.getClass(), "status", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.map.Flat3Map");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.Object");
        argTypes[1] = Class.forName("java.lang.Object");
        Object[] args = new Object[2];
        args[0] = term144192;
        args[1] = null;
        Object retValue = callMethod(klass, "put", argTypes, term143860, args);
        assertTrue(recursiveEquals(term143860, term144294));
        assertTrue(recursiveEquals(term144192, term144299));
        assertTrue(recursiveEquals(retValue, null));
    }

};


