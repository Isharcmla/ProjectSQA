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

public class Flat3Map_put_19447407251164 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term357832;
     Object term358728;
     Object term358734;

    public Flat3Map_put_19447407251164() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term357832 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term357887 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap"));
        Object term357933 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setField(term357832, term357832.getClass(), "delegateMap", null);
        setIntField(term357832, term357832.getClass(), "size", 3);
        setIntField(term357832, term357832.getClass(), "hash3", 0);
        setIntField(term357887, term357887.getClass(), "size", 0);
        setField(term357832, term357832.getClass(), "value3", term357887);
        setIntField(term357832, term357832.getClass(), "hash2", 0);
        setField(term357933, term357933.getClass(), "delegateMap", null);
        setIntField(term357933, term357933.getClass(), "size", 0);
        setField(term357832, term357832.getClass(), "value2", term357933);
        setIntField(term357832, term357832.getClass(), "hash1", 0);
        setField(term357832, term357832.getClass(), "value1", null);
        term358728 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term358729 = newInstance(Class.forName("org.apache.commons.collections.map.HashedMap"));
        Object[] term358730 = (Object[]) newArray("org.apache.commons.collections.map.AbstractHashedMap$HashEntry", 16);
        Object term358731 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap$HashEntry"));
        Object term358732 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap$HashEntry"));
        Object term358733 = newInstance(Class.forName("java.lang.Object"));
        setIntField(term358728, term358728.getClass(), "size", 0);
        setIntField(term358728, term358728.getClass(), "hash1", 0);
        setIntField(term358728, term358728.getClass(), "hash2", 0);
        setIntField(term358728, term358728.getClass(), "hash3", 0);
        setField(term358728, term358728.getClass(), "key1", null);
        setField(term358728, term358728.getClass(), "key2", null);
        setField(term358728, term358728.getClass(), "key3", null);
        setField(term358728, term358728.getClass(), "value1", null);
        setField(term358728, term358728.getClass(), "value2", null);
        setField(term358728, term358728.getClass(), "value3", null);
        setFloatField(term358729, term358729.getClass(), "loadFactor", 0.75F);
        setIntField(term358729, term358729.getClass(), "size", 2);
        setField(term358731, term358731.getClass(), "next", null);
        setField(term358731, term358731.getClass(), "key", term358728);
        setField(term358731, term358731.getClass(), "value", null);
        setElement(term358730, 0, term358731);
        setField(term358732, term358732.getClass(), "next", null);
        setField(term358732, term358732.getClass(), "key", term358733);
        setField(term358732, term358732.getClass(), "value", null);
        setElement(term358730, 6, term358732);
        setField(term358729, term358729.getClass(), "data", term358730);
        setIntField(term358729, term358729.getClass(), "threshold", 12);
        setIntField(term358729, term358729.getClass(), "modCount", 2);
        setField(term358729, term358729.getClass(), "entrySet", null);
        setField(term358729, term358729.getClass(), "keySet", null);
        setField(term358729, term358729.getClass(), "values", null);
        setField(term358729, term358729.getClass(), "keySet", null);
        setField(term358729, term358729.getClass(), "values", null);
        setField(term358728, term358728.getClass(), "delegateMap", term358729);
        term358734 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term358735 = newInstance(Class.forName("org.apache.commons.collections.map.HashedMap"));
        Object[] term358736 = (Object[]) newArray("org.apache.commons.collections.map.AbstractHashedMap$HashEntry", 16);
        Object term358737 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap$HashEntry"));
        Object term358738 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap$HashEntry"));
        Object term358739 = newInstance(Class.forName("java.lang.Object"));
        setIntField(term358734, term358734.getClass(), "size", 0);
        setIntField(term358734, term358734.getClass(), "hash1", 0);
        setIntField(term358734, term358734.getClass(), "hash2", 0);
        setIntField(term358734, term358734.getClass(), "hash3", 0);
        setField(term358734, term358734.getClass(), "key1", null);
        setField(term358734, term358734.getClass(), "key2", null);
        setField(term358734, term358734.getClass(), "key3", null);
        setField(term358734, term358734.getClass(), "value1", null);
        setField(term358734, term358734.getClass(), "value2", null);
        setField(term358734, term358734.getClass(), "value3", null);
        setFloatField(term358735, term358735.getClass(), "loadFactor", 0.75F);
        setIntField(term358735, term358735.getClass(), "size", 2);
        setField(term358737, term358737.getClass(), "next", null);
        setField(term358737, term358737.getClass(), "key", term358734);
        setField(term358737, term358737.getClass(), "value", null);
        setElement(term358736, 0, term358737);
        setField(term358738, term358738.getClass(), "next", null);
        setField(term358738, term358738.getClass(), "key", term358739);
        setField(term358738, term358738.getClass(), "value", null);
        setElement(term358736, 6, term358738);
        setField(term358735, term358735.getClass(), "data", term358736);
        setIntField(term358735, term358735.getClass(), "threshold", 12);
        setIntField(term358735, term358735.getClass(), "modCount", 2);
        setField(term358735, term358735.getClass(), "entrySet", null);
        setField(term358735, term358735.getClass(), "keySet", null);
        setField(term358735, term358735.getClass(), "values", null);
        setField(term358735, term358735.getClass(), "keySet", null);
        setField(term358735, term358735.getClass(), "values", null);
        setField(term358734, term358734.getClass(), "delegateMap", term358735);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.map.Flat3Map");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.Object");
        argTypes[1] = Class.forName("java.lang.Object");
        Object[] args = new Object[2];
        args[0] = term357832;
        args[1] = null;
        Object retValue = callMethod(klass, "put", argTypes, term357832, args);
        assertTrue(recursiveEquals(term357832, term358728));
        assertTrue(recursiveEquals(term357832, term358734));
        assertTrue(recursiveEquals(retValue, null));
    }

};


