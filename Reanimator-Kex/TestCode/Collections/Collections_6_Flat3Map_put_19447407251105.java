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

public class Flat3Map_put_19447407251105 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term328961;
     Object term329397;
     Object term329570;
     Object term329577;

    public Flat3Map_put_19447407251105() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term328961 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term329053 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term329091 = newInstance(Class.forName("java.lang.Object"));
        Object term329129 = newInstance(Class.forName("java.lang.Object"));
        Object term329167 = newInstance(Class.forName("java.lang.Object"));
        term329397 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term329443 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setField(term328961, term328961.getClass(), "delegateMap", null);
        setIntField(term328961, term328961.getClass(), "size", 3);
        setIntField(term328961, term328961.getClass(), "hash3", 0);
        setField(term329053, term329053.getClass(), "delegateMap", null);
        setIntField(term329053, term329053.getClass(), "size", 3);
        setField(term329053, term329053.getClass(), "key3", term329091);
        setField(term329053, term329053.getClass(), "key2", null);
        setField(term329053, term329053.getClass(), "value2", null);
        setIntField(term329053, term329053.getClass(), "hash3", -1);
        setIntField(term329053, term329053.getClass(), "hash2", 0);
        setIntField(term329053, term329053.getClass(), "hash1", 0);
        setField(term329053, term329053.getClass(), "key1", term329129);
        setField(term328961, term328961.getClass(), "key3", term329053);
        setIntField(term328961, term328961.getClass(), "hash2", 0);
        setField(term328961, term328961.getClass(), "key2", term329167);
        setIntField(term328961, term328961.getClass(), "hash1", 0);
        setField(term329397, term329397.getClass(), "delegateMap", null);
        setIntField(term329397, term329397.getClass(), "size", 3);
        setIntField(term329397, term329397.getClass(), "hash3", 0);
        setField(term329397, term329397.getClass(), "value3", null);
        setIntField(term329397, term329397.getClass(), "hash2", 0);
        setField(term329397, term329397.getClass(), "value2", null);
        setIntField(term329397, term329397.getClass(), "hash1", 0);
        setField(term329397, term329397.getClass(), "value1", null);
        setField(term329397, term329397.getClass(), "key3", null);
        setField(term329397, term329397.getClass(), "key2", null);
        setField(term329443, term329443.getClass(), "delegateMap", null);
        setIntField(term329443, term329443.getClass(), "size", 0);
        setField(term329397, term329397.getClass(), "key1", term329443);
        setField(term328961, term328961.getClass(), "key1", term329397);
        term329570 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term329571 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term329572 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term329573 = newInstance(Class.forName("java.lang.Object"));
        Object term329574 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term329575 = newInstance(Class.forName("java.lang.Object"));
        Object term329576 = newInstance(Class.forName("java.lang.Object"));
        setIntField(term329570, term329570.getClass(), "size", 3);
        setIntField(term329570, term329570.getClass(), "hash1", 0);
        setIntField(term329570, term329570.getClass(), "hash2", 0);
        setIntField(term329570, term329570.getClass(), "hash3", 0);
        setIntField(term329571, term329571.getClass(), "size", 3);
        setIntField(term329571, term329571.getClass(), "hash1", 0);
        setIntField(term329571, term329571.getClass(), "hash2", 0);
        setIntField(term329571, term329571.getClass(), "hash3", 0);
        setIntField(term329572, term329572.getClass(), "size", 0);
        setIntField(term329572, term329572.getClass(), "hash1", 0);
        setIntField(term329572, term329572.getClass(), "hash2", 0);
        setIntField(term329572, term329572.getClass(), "hash3", 0);
        setField(term329572, term329572.getClass(), "key1", null);
        setField(term329572, term329572.getClass(), "key2", null);
        setField(term329572, term329572.getClass(), "key3", null);
        setField(term329572, term329572.getClass(), "value1", null);
        setField(term329572, term329572.getClass(), "value2", null);
        setField(term329572, term329572.getClass(), "value3", null);
        setField(term329572, term329572.getClass(), "delegateMap", null);
        setField(term329571, term329571.getClass(), "key1", term329572);
        setField(term329571, term329571.getClass(), "key2", null);
        setField(term329571, term329571.getClass(), "key3", null);
        setField(term329571, term329571.getClass(), "value1", null);
        setField(term329571, term329571.getClass(), "value2", null);
        setField(term329571, term329571.getClass(), "value3", null);
        setField(term329571, term329571.getClass(), "delegateMap", null);
        setField(term329570, term329570.getClass(), "key1", term329571);
        setField(term329570, term329570.getClass(), "key2", term329573);
        setIntField(term329574, term329574.getClass(), "size", 3);
        setIntField(term329574, term329574.getClass(), "hash1", 0);
        setIntField(term329574, term329574.getClass(), "hash2", 0);
        setIntField(term329574, term329574.getClass(), "hash3", -1);
        setField(term329574, term329574.getClass(), "key1", term329575);
        setField(term329574, term329574.getClass(), "key2", null);
        setField(term329574, term329574.getClass(), "key3", term329576);
        setField(term329574, term329574.getClass(), "value1", null);
        setField(term329574, term329574.getClass(), "value2", null);
        setField(term329574, term329574.getClass(), "value3", null);
        setField(term329574, term329574.getClass(), "delegateMap", null);
        setField(term329570, term329570.getClass(), "key3", term329574);
        setField(term329570, term329570.getClass(), "value1", null);
        setField(term329570, term329570.getClass(), "value2", null);
        setField(term329570, term329570.getClass(), "value3", null);
        setField(term329570, term329570.getClass(), "delegateMap", null);
        term329577 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term329578 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setIntField(term329577, term329577.getClass(), "size", 3);
        setIntField(term329577, term329577.getClass(), "hash1", 0);
        setIntField(term329577, term329577.getClass(), "hash2", 0);
        setIntField(term329577, term329577.getClass(), "hash3", 0);
        setIntField(term329578, term329578.getClass(), "size", 0);
        setIntField(term329578, term329578.getClass(), "hash1", 0);
        setIntField(term329578, term329578.getClass(), "hash2", 0);
        setIntField(term329578, term329578.getClass(), "hash3", 0);
        setField(term329578, term329578.getClass(), "key1", null);
        setField(term329578, term329578.getClass(), "key2", null);
        setField(term329578, term329578.getClass(), "key3", null);
        setField(term329578, term329578.getClass(), "value1", null);
        setField(term329578, term329578.getClass(), "value2", null);
        setField(term329578, term329578.getClass(), "value3", null);
        setField(term329578, term329578.getClass(), "delegateMap", null);
        setField(term329577, term329577.getClass(), "key1", term329578);
        setField(term329577, term329577.getClass(), "key2", null);
        setField(term329577, term329577.getClass(), "key3", null);
        setField(term329577, term329577.getClass(), "value1", null);
        setField(term329577, term329577.getClass(), "value2", null);
        setField(term329577, term329577.getClass(), "value3", null);
        setField(term329577, term329577.getClass(), "delegateMap", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.map.Flat3Map");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.Object");
        argTypes[1] = Class.forName("java.lang.Object");
        Object[] args = new Object[2];
        args[0] = term329397;
        args[1] = null;
        Object retValue = callMethod(klass, "put", argTypes, term328961, args);
        assertTrue(recursiveEquals(term328961, term329570));
        assertTrue(recursiveEquals(term329397, term329577));
        assertTrue(recursiveEquals(retValue, null));
    }

};


