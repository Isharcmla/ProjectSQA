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

public class Flat3Map_put_1944740725614 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term129666;
     Object term129834;
     Object term130722;
     Object term130732;

    public Flat3Map_put_1944740725614() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term129666 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term129704 = newInstance(Class.forName("java.lang.Object"));
        Object term129742 = newInstance(Class.forName("java.lang.Object"));
        setField(term129666, term129666.getClass(), "delegateMap", null);
        setIntField(term129666, term129666.getClass(), "size", 3);
        setIntField(term129666, term129666.getClass(), "hash3", 0);
        setField(term129666, term129666.getClass(), "key3", term129704);
        setIntField(term129666, term129666.getClass(), "hash2", 0);
        setField(term129666, term129666.getClass(), "key2", term129742);
        setIntField(term129666, term129666.getClass(), "hash1", -1);
        term129834 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setField(term129834, term129834.getClass(), "delegateMap", null);
        setIntField(term129834, term129834.getClass(), "size", 3);
        setIntField(term129834, term129834.getClass(), "hash3", 0);
        setField(term129834, term129834.getClass(), "value3", null);
        setIntField(term129834, term129834.getClass(), "hash2", 0);
        setField(term129834, term129834.getClass(), "value2", null);
        setIntField(term129834, term129834.getClass(), "hash1", 0);
        setField(term129834, term129834.getClass(), "value1", null);
        term130722 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term130723 = newInstance(Class.forName("org.apache.commons.collections.map.HashedMap"));
        Object[] term130724 = (Object[]) newArray("org.apache.commons.collections.map.AbstractHashedMap$HashEntry", 16);
        Object term130725 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap$HashEntry"));
        Object term130726 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term130727 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap$HashEntry"));
        Object term130728 = newInstance(Class.forName("java.lang.Object"));
        Object term130729 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap$HashEntry"));
        Object term130730 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap$HashEntry"));
        Object term130731 = newInstance(Class.forName("java.lang.Object"));
        setIntField(term130722, term130722.getClass(), "size", 0);
        setIntField(term130722, term130722.getClass(), "hash1", 0);
        setIntField(term130722, term130722.getClass(), "hash2", 0);
        setIntField(term130722, term130722.getClass(), "hash3", 0);
        setField(term130722, term130722.getClass(), "key1", null);
        setField(term130722, term130722.getClass(), "key2", null);
        setField(term130722, term130722.getClass(), "key3", null);
        setField(term130722, term130722.getClass(), "value1", null);
        setField(term130722, term130722.getClass(), "value2", null);
        setField(term130722, term130722.getClass(), "value3", null);
        setFloatField(term130723, term130723.getClass(), "loadFactor", 0.75F);
        setIntField(term130723, term130723.getClass(), "size", 4);
        setField(term130725, term130725.getClass(), "next", null);
        setIntField(term130726, term130726.getClass(), "size", 3);
        setIntField(term130726, term130726.getClass(), "hash1", 0);
        setIntField(term130726, term130726.getClass(), "hash2", 0);
        setIntField(term130726, term130726.getClass(), "hash3", 0);
        setField(term130726, term130726.getClass(), "key1", null);
        setField(term130726, term130726.getClass(), "key2", null);
        setField(term130726, term130726.getClass(), "key3", null);
        setField(term130726, term130726.getClass(), "value1", null);
        setField(term130726, term130726.getClass(), "value2", null);
        setField(term130726, term130726.getClass(), "value3", null);
        setField(term130726, term130726.getClass(), "delegateMap", null);
        setField(term130725, term130725.getClass(), "key", term130726);
        setField(term130725, term130725.getClass(), "value", null);
        setElement(term130724, 0, term130725);
        setField(term130727, term130727.getClass(), "next", null);
        setField(term130727, term130727.getClass(), "key", term130728);
        setField(term130727, term130727.getClass(), "value", null);
        setElement(term130724, 5, term130727);
        setField(term130730, term130730.getClass(), "next", null);
        setField(term130730, term130730.getClass(), "key", null);
        setField(term130730, term130730.getClass(), "value", null);
        setField(term130729, term130729.getClass(), "next", term130730);
        setField(term130729, term130729.getClass(), "key", term130731);
        setField(term130729, term130729.getClass(), "value", null);
        setElement(term130724, 8, term130729);
        setField(term130723, term130723.getClass(), "data", term130724);
        setIntField(term130723, term130723.getClass(), "threshold", 12);
        setIntField(term130723, term130723.getClass(), "modCount", 4);
        setField(term130723, term130723.getClass(), "entrySet", null);
        setField(term130723, term130723.getClass(), "keySet", null);
        setField(term130723, term130723.getClass(), "values", null);
        setField(term130723, term130723.getClass(), "keySet", null);
        setField(term130723, term130723.getClass(), "values", null);
        setField(term130722, term130722.getClass(), "delegateMap", term130723);
        term130732 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setIntField(term130732, term130732.getClass(), "size", 3);
        setIntField(term130732, term130732.getClass(), "hash1", 0);
        setIntField(term130732, term130732.getClass(), "hash2", 0);
        setIntField(term130732, term130732.getClass(), "hash3", 0);
        setField(term130732, term130732.getClass(), "key1", null);
        setField(term130732, term130732.getClass(), "key2", null);
        setField(term130732, term130732.getClass(), "key3", null);
        setField(term130732, term130732.getClass(), "value1", null);
        setField(term130732, term130732.getClass(), "value2", null);
        setField(term130732, term130732.getClass(), "value3", null);
        setField(term130732, term130732.getClass(), "delegateMap", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.map.Flat3Map");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.Object");
        argTypes[1] = Class.forName("java.lang.Object");
        Object[] args = new Object[2];
        args[0] = term129834;
        args[1] = null;
        Object retValue = callMethod(klass, "put", argTypes, term129666, args);
        assertTrue(recursiveEquals(term129666, term130722));
        assertTrue(recursiveEquals(term129834, term130732));
        assertTrue(recursiveEquals(retValue, null));
    }

};


