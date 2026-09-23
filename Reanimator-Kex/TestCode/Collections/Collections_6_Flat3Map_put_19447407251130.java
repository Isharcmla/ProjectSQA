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

public class Flat3Map_put_19447407251130 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term339325;
     Object term339619;
     Object term340653;
     Object term340663;

    public Flat3Map_put_19447407251130() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term339325 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term339417 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term339527 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractLinkedMap"));
        setField(term339325, term339325.getClass(), "delegateMap", null);
        setIntField(term339325, term339325.getClass(), "size", 3);
        setIntField(term339325, term339325.getClass(), "hash3", 1541167136);
        setField(term339417, term339417.getClass(), "delegateMap", null);
        setIntField(term339417, term339417.getClass(), "size", 3);
        setField(term339417, term339417.getClass(), "key3", term339527);
        setField(term339417, term339417.getClass(), "key2", null);
        setField(term339417, term339417.getClass(), "value2", null);
        setIntField(term339417, term339417.getClass(), "hash3", -2042888192);
        setField(term339417, term339417.getClass(), "value3", null);
        setIntField(term339417, term339417.getClass(), "hash2", 4464640);
        setIntField(term339417, term339417.getClass(), "hash1", 2080596992);
        setField(term339417, term339417.getClass(), "value1", null);
        setField(term339325, term339325.getClass(), "key3", term339417);
        setIntField(term339325, term339325.getClass(), "hash2", 1541167136);
        setField(term339325, term339325.getClass(), "key2", null);
        setIntField(term339325, term339325.getClass(), "hash1", 1541167136);
        setField(term339325, term339325.getClass(), "key1", null);
        setField(term339325, term339325.getClass(), "value3", term339527);
        setField(term339325, term339325.getClass(), "value2", null);
        setField(term339325, term339325.getClass(), "value1", null);
        term339619 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term339731 = newInstance(Class.forName("org.apache.commons.collections.map.CaseInsensitiveMap"));
        setField(term339619, term339619.getClass(), "delegateMap", null);
        setIntField(term339619, term339619.getClass(), "size", 3);
        setIntField(term339619, term339619.getClass(), "hash3", 475014176);
        setField(term339619, term339619.getClass(), "value3", null);
        setIntField(term339619, term339619.getClass(), "hash2", 1007157888);
        setIntField(term339731, term339731.getClass(), "size", 0);
        setField(term339619, term339619.getClass(), "value2", term339731);
        setIntField(term339619, term339619.getClass(), "hash1", 58995072);
        setField(term339619, term339619.getClass(), "value1", null);
        setField(term339619, term339619.getClass(), "key3", null);
        setField(term339619, term339619.getClass(), "key2", null);
        term340653 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term340654 = newInstance(Class.forName("org.apache.commons.collections.map.HashedMap"));
        Object[] term340655 = (Object[]) newArray("org.apache.commons.collections.map.AbstractHashedMap$HashEntry", 16);
        Object term340656 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap$HashEntry"));
        Object term340657 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term340658 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractLinkedMap"));
        Object term340659 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap$HashEntry"));
        Object term340660 = newInstance(Class.forName("java.lang.Object"));
        Object term340661 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap$HashEntry"));
        Object term340662 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setIntField(term340653, term340653.getClass(), "size", 0);
        setIntField(term340653, term340653.getClass(), "hash1", 0);
        setIntField(term340653, term340653.getClass(), "hash2", 0);
        setIntField(term340653, term340653.getClass(), "hash3", 0);
        setField(term340653, term340653.getClass(), "key1", null);
        setField(term340653, term340653.getClass(), "key2", null);
        setField(term340653, term340653.getClass(), "key3", null);
        setField(term340653, term340653.getClass(), "value1", null);
        setField(term340653, term340653.getClass(), "value2", null);
        setField(term340653, term340653.getClass(), "value3", null);
        setFloatField(term340654, term340654.getClass(), "loadFactor", 0.75F);
        setIntField(term340654, term340654.getClass(), "size", 3);
        setField(term340656, term340656.getClass(), "next", null);
        setIntField(term340657, term340657.getClass(), "size", 3);
        setIntField(term340657, term340657.getClass(), "hash1", 2080596992);
        setIntField(term340657, term340657.getClass(), "hash2", 4464640);
        setIntField(term340657, term340657.getClass(), "hash3", -2042888192);
        setField(term340657, term340657.getClass(), "key1", null);
        setField(term340657, term340657.getClass(), "key2", null);
        setField(term340657, term340657.getClass(), "key3", null);
        setField(term340657, term340657.getClass(), "value1", null);
        setField(term340657, term340657.getClass(), "value2", null);
        setField(term340657, term340657.getClass(), "value3", null);
        setField(term340657, term340657.getClass(), "delegateMap", null);
        setField(term340656, term340656.getClass(), "key", term340657);
        setField(term340658, term340658.getClass(), "header", null);
        setFloatField(term340658, term340658.getClass(), "loadFactor", 0.0F);
        setIntField(term340658, term340658.getClass(), "size", 0);
        setField(term340658, term340658.getClass(), "data", null);
        setIntField(term340658, term340658.getClass(), "threshold", 0);
        setIntField(term340658, term340658.getClass(), "modCount", 0);
        setField(term340658, term340658.getClass(), "entrySet", null);
        setField(term340658, term340658.getClass(), "keySet", null);
        setField(term340658, term340658.getClass(), "values", null);
        setField(term340658, term340658.getClass(), "keySet", null);
        setField(term340658, term340658.getClass(), "values", null);
        setField(term340656, term340656.getClass(), "value", term340658);
        setElement(term340655, 2, term340656);
        setField(term340659, term340659.getClass(), "next", null);
        setField(term340659, term340659.getClass(), "key", term340660);
        setField(term340659, term340659.getClass(), "value", null);
        setElement(term340655, 6, term340659);
        setField(term340661, term340661.getClass(), "next", null);
        setIntField(term340662, term340662.getClass(), "size", 3);
        setIntField(term340662, term340662.getClass(), "hash1", 58995072);
        setIntField(term340662, term340662.getClass(), "hash2", 1007157888);
        setIntField(term340662, term340662.getClass(), "hash3", 475014176);
        setField(term340662, term340662.getClass(), "key1", null);
        setField(term340662, term340662.getClass(), "key2", null);
        setField(term340662, term340662.getClass(), "key3", null);
        setField(term340662, term340662.getClass(), "value1", null);
        setField(term340662, term340662.getClass(), "value2", null);
        setField(term340662, term340662.getClass(), "value3", null);
        setField(term340662, term340662.getClass(), "delegateMap", null);
        setField(term340661, term340661.getClass(), "key", term340662);
        setField(term340661, term340661.getClass(), "value", null);
        setElement(term340655, 8, term340661);
        setField(term340654, term340654.getClass(), "data", term340655);
        setIntField(term340654, term340654.getClass(), "threshold", 12);
        setIntField(term340654, term340654.getClass(), "modCount", 3);
        setField(term340654, term340654.getClass(), "entrySet", null);
        setField(term340654, term340654.getClass(), "keySet", null);
        setField(term340654, term340654.getClass(), "values", null);
        setField(term340654, term340654.getClass(), "keySet", null);
        setField(term340654, term340654.getClass(), "values", null);
        setField(term340653, term340653.getClass(), "delegateMap", term340654);
        term340663 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setIntField(term340663, term340663.getClass(), "size", 3);
        setIntField(term340663, term340663.getClass(), "hash1", 58995072);
        setIntField(term340663, term340663.getClass(), "hash2", 1007157888);
        setIntField(term340663, term340663.getClass(), "hash3", 475014176);
        setField(term340663, term340663.getClass(), "key1", null);
        setField(term340663, term340663.getClass(), "key2", null);
        setField(term340663, term340663.getClass(), "key3", null);
        setField(term340663, term340663.getClass(), "value1", null);
        setField(term340663, term340663.getClass(), "value2", null);
        setField(term340663, term340663.getClass(), "value3", null);
        setField(term340663, term340663.getClass(), "delegateMap", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.map.Flat3Map");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.Object");
        argTypes[1] = Class.forName("java.lang.Object");
        Object[] args = new Object[2];
        args[0] = term339619;
        args[1] = null;
        Object retValue = callMethod(klass, "put", argTypes, term339325, args);
        assertTrue(recursiveEquals(term339325, term340653));
        assertTrue(recursiveEquals(term339619, term340663));
        assertTrue(recursiveEquals(retValue, null));
    }

};


