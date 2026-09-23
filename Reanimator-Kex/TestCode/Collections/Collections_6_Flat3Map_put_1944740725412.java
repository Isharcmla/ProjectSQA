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

public class Flat3Map_put_1944740725412 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term71589;
     Object term72033;
     Object term72723;
     Object term72731;

    public Flat3Map_put_1944740725412() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term71589 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term71681 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term71811 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap$HashEntry"));
        Object term71849 = newInstance(Class.forName("java.lang.Object"));
        Object term71941 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setField(term71589, term71589.getClass(), "delegateMap", null);
        setIntField(term71589, term71589.getClass(), "size", 3);
        setIntField(term71589, term71589.getClass(), "hash3", 0);
        setField(term71681, term71681.getClass(), "delegateMap", null);
        setIntField(term71681, term71681.getClass(), "size", 1);
        setField(term71589, term71589.getClass(), "key3", term71681);
        setIntField(term71589, term71589.getClass(), "hash2", 0);
        setField(term71589, term71589.getClass(), "key2", term71811);
        setIntField(term71589, term71589.getClass(), "hash1", 0);
        setField(term71589, term71589.getClass(), "key1", term71849);
        setField(term71589, term71589.getClass(), "value3", term71941);
        term72033 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setField(term72033, term72033.getClass(), "delegateMap", null);
        setIntField(term72033, term72033.getClass(), "size", 3);
        setIntField(term72033, term72033.getClass(), "hash3", 0);
        setField(term72033, term72033.getClass(), "value3", null);
        setIntField(term72033, term72033.getClass(), "hash2", 0);
        setField(term72033, term72033.getClass(), "value2", null);
        setIntField(term72033, term72033.getClass(), "hash1", 0);
        setField(term72033, term72033.getClass(), "value1", null);
        term72723 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term72724 = newInstance(Class.forName("org.apache.commons.collections.map.HashedMap"));
        Object[] term72725 = (Object[]) newArray("org.apache.commons.collections.map.AbstractHashedMap$HashEntry", 16);
        Object term72726 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap$HashEntry"));
        Object term72727 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap$HashEntry"));
        Object term72728 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term72729 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap$HashEntry"));
        Object term72730 = newInstance(Class.forName("java.lang.Object"));
        setIntField(term72723, term72723.getClass(), "size", 0);
        setIntField(term72723, term72723.getClass(), "hash1", 0);
        setIntField(term72723, term72723.getClass(), "hash2", 0);
        setIntField(term72723, term72723.getClass(), "hash3", 0);
        setField(term72723, term72723.getClass(), "key1", null);
        setField(term72723, term72723.getClass(), "key2", null);
        setField(term72723, term72723.getClass(), "key3", null);
        setField(term72723, term72723.getClass(), "value1", null);
        setField(term72723, term72723.getClass(), "value2", null);
        setField(term72723, term72723.getClass(), "value3", null);
        setFloatField(term72724, term72724.getClass(), "loadFactor", 0.75F);
        setIntField(term72724, term72724.getClass(), "size", 4);
        setField(term72727, term72727.getClass(), "next", null);
        setField(term72727, term72727.getClass(), "key", null);
        setField(term72727, term72727.getClass(), "value", null);
        setField(term72726, term72726.getClass(), "next", term72727);
        setIntField(term72728, term72728.getClass(), "size", 3);
        setIntField(term72728, term72728.getClass(), "hash1", 0);
        setIntField(term72728, term72728.getClass(), "hash2", 0);
        setIntField(term72728, term72728.getClass(), "hash3", 0);
        setField(term72728, term72728.getClass(), "key1", null);
        setField(term72728, term72728.getClass(), "key2", null);
        setField(term72728, term72728.getClass(), "key3", null);
        setField(term72728, term72728.getClass(), "value1", null);
        setField(term72728, term72728.getClass(), "value2", null);
        setField(term72728, term72728.getClass(), "value3", null);
        setField(term72728, term72728.getClass(), "delegateMap", null);
        setField(term72726, term72726.getClass(), "key", term72728);
        setField(term72726, term72726.getClass(), "value", null);
        setElement(term72725, 0, term72726);
        setField(term72729, term72729.getClass(), "next", null);
        setField(term72729, term72729.getClass(), "key", term72730);
        setField(term72729, term72729.getClass(), "value", null);
        setElement(term72725, 3, term72729);
        setField(term72724, term72724.getClass(), "data", term72725);
        setIntField(term72724, term72724.getClass(), "threshold", 12);
        setIntField(term72724, term72724.getClass(), "modCount", 4);
        setField(term72724, term72724.getClass(), "entrySet", null);
        setField(term72724, term72724.getClass(), "keySet", null);
        setField(term72724, term72724.getClass(), "values", null);
        setField(term72724, term72724.getClass(), "keySet", null);
        setField(term72724, term72724.getClass(), "values", null);
        setField(term72723, term72723.getClass(), "delegateMap", term72724);
        term72731 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setIntField(term72731, term72731.getClass(), "size", 3);
        setIntField(term72731, term72731.getClass(), "hash1", 0);
        setIntField(term72731, term72731.getClass(), "hash2", 0);
        setIntField(term72731, term72731.getClass(), "hash3", 0);
        setField(term72731, term72731.getClass(), "key1", null);
        setField(term72731, term72731.getClass(), "key2", null);
        setField(term72731, term72731.getClass(), "key3", null);
        setField(term72731, term72731.getClass(), "value1", null);
        setField(term72731, term72731.getClass(), "value2", null);
        setField(term72731, term72731.getClass(), "value3", null);
        setField(term72731, term72731.getClass(), "delegateMap", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.map.Flat3Map");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.Object");
        argTypes[1] = Class.forName("java.lang.Object");
        Object[] args = new Object[2];
        args[0] = term72033;
        args[1] = null;
        Object retValue = callMethod(klass, "put", argTypes, term71589, args);
        assertTrue(recursiveEquals(term71589, term72723));
        assertTrue(recursiveEquals(term72033, term72731));
        assertTrue(recursiveEquals(retValue, null));
    }

};


