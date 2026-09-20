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

public class Flat3Map_get_229621781677 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term132882;
     Object term132974;
     Object term133255;
     Object term133256;

    public Flat3Map_get_229621781677() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term132882 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setField(term132882, term132882.getClass(), "delegateMap", null);
        setIntField(term132882, term132882.getClass(), "size", 2);
        setIntField(term132882, term132882.getClass(), "hash2", 0);
        setField(term132882, term132882.getClass(), "key2", term132882);
        term132974 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term133084 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap"));
        Object term133176 = newInstance(Class.forName("java.util.stream.SpinedBuffer$OfInt$1Splitr"));
        setField(term132974, term132974.getClass(), "delegateMap", null);
        setIntField(term132974, term132974.getClass(), "size", 2);
        setIntField(term132974, term132974.getClass(), "hash2", 0);
        setIntField(term133084, term133084.getClass(), "size", 0);
        setField(term132974, term132974.getClass(), "value2", term133084);
        setIntField(term132974, term132974.getClass(), "hash1", 0);
        setField(term132974, term132974.getClass(), "value1", null);
        setField(term132974, term132974.getClass(), "key2", term133176);
        term133255 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setIntField(term133255, term133255.getClass(), "size", 2);
        setIntField(term133255, term133255.getClass(), "hash1", 0);
        setIntField(term133255, term133255.getClass(), "hash2", 0);
        setIntField(term133255, term133255.getClass(), "hash3", 0);
        setField(term133255, term133255.getClass(), "key1", null);
        setField(term133255, term133255.getClass(), "key2", term133255);
        setField(term133255, term133255.getClass(), "key3", null);
        setField(term133255, term133255.getClass(), "value1", null);
        setField(term133255, term133255.getClass(), "value2", null);
        setField(term133255, term133255.getClass(), "value3", null);
        setField(term133255, term133255.getClass(), "delegateMap", null);
        term133256 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term133257 = newInstance(Class.forName("java.util.stream.SpinedBuffer$OfInt$1Splitr"));
        Object term133258 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap"));
        setIntField(term133256, term133256.getClass(), "size", 2);
        setIntField(term133256, term133256.getClass(), "hash1", 0);
        setIntField(term133256, term133256.getClass(), "hash2", 0);
        setIntField(term133256, term133256.getClass(), "hash3", 0);
        setField(term133256, term133256.getClass(), "key1", null);
        setField(term133257, term133257.getClass(), "this$0", null);
        setIntField(term133257, term133257.getClass(), "splSpineIndex", 0);
        setIntField(term133257, term133257.getClass(), "lastSpineIndex", 0);
        setIntField(term133257, term133257.getClass(), "splElementIndex", 0);
        setIntField(term133257, term133257.getClass(), "lastSpineElementFence", 0);
        setField(term133257, term133257.getClass(), "splChunk", null);
        setField(term133257, term133257.getClass(), "this$0", null);
        setField(term133256, term133256.getClass(), "key2", term133257);
        setField(term133256, term133256.getClass(), "key3", null);
        setField(term133256, term133256.getClass(), "value1", null);
        setFloatField(term133258, term133258.getClass(), "loadFactor", 0.0F);
        setIntField(term133258, term133258.getClass(), "size", 0);
        setField(term133258, term133258.getClass(), "data", null);
        setIntField(term133258, term133258.getClass(), "threshold", 0);
        setIntField(term133258, term133258.getClass(), "modCount", 0);
        setField(term133258, term133258.getClass(), "entrySet", null);
        setField(term133258, term133258.getClass(), "keySet", null);
        setField(term133258, term133258.getClass(), "values", null);
        setField(term133258, term133258.getClass(), "keySet", null);
        setField(term133258, term133258.getClass(), "values", null);
        setField(term133256, term133256.getClass(), "value2", term133258);
        setField(term133256, term133256.getClass(), "value3", null);
        setField(term133256, term133256.getClass(), "delegateMap", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.map.Flat3Map");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term132974;
        Object retValue = callMethod(klass, "get", argTypes, term132882, args);
        assertTrue(recursiveEquals(term132882, term133255));
        assertTrue(recursiveEquals(term132974, term133256));
        assertTrue(recursiveEquals(retValue, null));
    }

};
