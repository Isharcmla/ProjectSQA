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

public class Flat3Map_put_1944740725537 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term105665;
     Object term105941;
     Object term106256;
     Object term106259;

    public Flat3Map_put_1944740725537() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term105665 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term105757 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term106079 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setField(term105665, term105665.getClass(), "delegateMap", null);
        setIntField(term105665, term105665.getClass(), "size", 3);
        setIntField(term105665, term105665.getClass(), "hash3", 0);
        setField(term105757, term105757.getClass(), "delegateMap", null);
        setIntField(term105757, term105757.getClass(), "size", 3);
        setField(term106079, term106079.getClass(), "delegateMap", null);
        setIntField(term106079, term106079.getClass(), "size", 0);
        setField(term105757, term105757.getClass(), "key3", term106079);
        setField(term105757, term105757.getClass(), "key2", null);
        setField(term105757, term105757.getClass(), "value2", null);
        setIntField(term105757, term105757.getClass(), "hash3", 0);
        setField(term105757, term105757.getClass(), "value3", null);
        setField(term105665, term105665.getClass(), "key3", term105757);
        term105941 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term106033 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setField(term105941, term105941.getClass(), "delegateMap", null);
        setIntField(term105941, term105941.getClass(), "size", 3);
        setIntField(term105941, term105941.getClass(), "hash3", 0);
        setField(term105941, term105941.getClass(), "value3", null);
        setIntField(term105941, term105941.getClass(), "hash2", 0);
        setField(term105941, term105941.getClass(), "value2", null);
        setIntField(term105941, term105941.getClass(), "hash1", 0);
        setField(term105941, term105941.getClass(), "value1", null);
        setField(term105941, term105941.getClass(), "key3", null);
        setField(term106033, term106033.getClass(), "delegateMap", null);
        setIntField(term106033, term106033.getClass(), "size", 0);
        setField(term105941, term105941.getClass(), "key2", term106033);
        setField(term105941, term105941.getClass(), "key1", term106079);
        term106256 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term106257 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term106258 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setIntField(term106256, term106256.getClass(), "size", 3);
        setIntField(term106256, term106256.getClass(), "hash1", 0);
        setIntField(term106256, term106256.getClass(), "hash2", 0);
        setIntField(term106256, term106256.getClass(), "hash3", 0);
        setField(term106256, term106256.getClass(), "key1", null);
        setField(term106256, term106256.getClass(), "key2", null);
        setIntField(term106257, term106257.getClass(), "size", 3);
        setIntField(term106257, term106257.getClass(), "hash1", 0);
        setIntField(term106257, term106257.getClass(), "hash2", 0);
        setIntField(term106257, term106257.getClass(), "hash3", 0);
        setField(term106257, term106257.getClass(), "key1", null);
        setField(term106257, term106257.getClass(), "key2", null);
        setIntField(term106258, term106258.getClass(), "size", 0);
        setIntField(term106258, term106258.getClass(), "hash1", 0);
        setIntField(term106258, term106258.getClass(), "hash2", 0);
        setIntField(term106258, term106258.getClass(), "hash3", 0);
        setField(term106258, term106258.getClass(), "key1", null);
        setField(term106258, term106258.getClass(), "key2", null);
        setField(term106258, term106258.getClass(), "key3", null);
        setField(term106258, term106258.getClass(), "value1", null);
        setField(term106258, term106258.getClass(), "value2", null);
        setField(term106258, term106258.getClass(), "value3", null);
        setField(term106258, term106258.getClass(), "delegateMap", null);
        setField(term106257, term106257.getClass(), "key3", term106258);
        setField(term106257, term106257.getClass(), "value1", null);
        setField(term106257, term106257.getClass(), "value2", null);
        setField(term106257, term106257.getClass(), "value3", null);
        setField(term106257, term106257.getClass(), "delegateMap", null);
        setField(term106256, term106256.getClass(), "key3", term106257);
        setField(term106256, term106256.getClass(), "value1", null);
        setField(term106256, term106256.getClass(), "value2", null);
        setField(term106256, term106256.getClass(), "value3", null);
        setField(term106256, term106256.getClass(), "delegateMap", null);
        term106259 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term106260 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term106261 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setIntField(term106259, term106259.getClass(), "size", 3);
        setIntField(term106259, term106259.getClass(), "hash1", 0);
        setIntField(term106259, term106259.getClass(), "hash2", 0);
        setIntField(term106259, term106259.getClass(), "hash3", 0);
        setIntField(term106260, term106260.getClass(), "size", 0);
        setIntField(term106260, term106260.getClass(), "hash1", 0);
        setIntField(term106260, term106260.getClass(), "hash2", 0);
        setIntField(term106260, term106260.getClass(), "hash3", 0);
        setField(term106260, term106260.getClass(), "key1", null);
        setField(term106260, term106260.getClass(), "key2", null);
        setField(term106260, term106260.getClass(), "key3", null);
        setField(term106260, term106260.getClass(), "value1", null);
        setField(term106260, term106260.getClass(), "value2", null);
        setField(term106260, term106260.getClass(), "value3", null);
        setField(term106260, term106260.getClass(), "delegateMap", null);
        setField(term106259, term106259.getClass(), "key1", term106260);
        setIntField(term106261, term106261.getClass(), "size", 0);
        setIntField(term106261, term106261.getClass(), "hash1", 0);
        setIntField(term106261, term106261.getClass(), "hash2", 0);
        setIntField(term106261, term106261.getClass(), "hash3", 0);
        setField(term106261, term106261.getClass(), "key1", null);
        setField(term106261, term106261.getClass(), "key2", null);
        setField(term106261, term106261.getClass(), "key3", null);
        setField(term106261, term106261.getClass(), "value1", null);
        setField(term106261, term106261.getClass(), "value2", null);
        setField(term106261, term106261.getClass(), "value3", null);
        setField(term106261, term106261.getClass(), "delegateMap", null);
        setField(term106259, term106259.getClass(), "key2", term106261);
        setField(term106259, term106259.getClass(), "key3", null);
        setField(term106259, term106259.getClass(), "value1", null);
        setField(term106259, term106259.getClass(), "value2", null);
        setField(term106259, term106259.getClass(), "value3", null);
        setField(term106259, term106259.getClass(), "delegateMap", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.map.Flat3Map");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.Object");
        argTypes[1] = Class.forName("java.lang.Object");
        Object[] args = new Object[2];
        args[0] = term105941;
        args[1] = null;
        Object retValue = callMethod(klass, "put", argTypes, term105665, args);
        assertTrue(recursiveEquals(term105665, term106256));
        assertTrue(recursiveEquals(term105941, term106259));
        assertTrue(recursiveEquals(retValue, null));
    }

};


