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

public class Flat3Map_put_1944740725508 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term95396;
     Object term95690;
     Object term96487;
     Object term96496;

    public Flat3Map_put_1944740725508() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term95396 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term95488 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term95598 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap"));
        setField(term95396, term95396.getClass(), "delegateMap", null);
        setIntField(term95396, term95396.getClass(), "size", 3);
        setIntField(term95396, term95396.getClass(), "hash3", 0);
        setField(term95488, term95488.getClass(), "delegateMap", null);
        setIntField(term95488, term95488.getClass(), "size", 3);
        setField(term95488, term95488.getClass(), "key3", term95598);
        setField(term95488, term95488.getClass(), "key2", null);
        setField(term95488, term95488.getClass(), "value2", null);
        setIntField(term95488, term95488.getClass(), "hash3", -1);
        setField(term95396, term95396.getClass(), "key3", term95488);
        term95690 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term95782 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setField(term95690, term95690.getClass(), "delegateMap", null);
        setIntField(term95690, term95690.getClass(), "size", 3);
        setIntField(term95690, term95690.getClass(), "hash3", 0);
        setField(term95690, term95690.getClass(), "value3", null);
        setIntField(term95690, term95690.getClass(), "hash2", 0);
        setField(term95690, term95690.getClass(), "value2", null);
        setIntField(term95690, term95690.getClass(), "hash1", 0);
        setField(term95690, term95690.getClass(), "value1", null);
        setField(term95690, term95690.getClass(), "key3", null);
        setField(term95782, term95782.getClass(), "delegateMap", null);
        setIntField(term95782, term95782.getClass(), "size", 0);
        setField(term95690, term95690.getClass(), "key2", term95782);
        term96487 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term96488 = newInstance(Class.forName("org.apache.commons.collections.map.HashedMap"));
        Object[] term96489 = (Object[]) newArray("org.apache.commons.collections.map.AbstractHashedMap$HashEntry", 16);
        Object term96490 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap$HashEntry"));
        Object term96491 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term96492 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap$HashEntry"));
        Object term96493 = newInstance(Class.forName("java.lang.Object"));
        Object term96494 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap$HashEntry"));
        Object term96495 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setIntField(term96487, term96487.getClass(), "size", 0);
        setIntField(term96487, term96487.getClass(), "hash1", 0);
        setIntField(term96487, term96487.getClass(), "hash2", 0);
        setIntField(term96487, term96487.getClass(), "hash3", 0);
        setField(term96487, term96487.getClass(), "key1", null);
        setField(term96487, term96487.getClass(), "key2", null);
        setField(term96487, term96487.getClass(), "key3", null);
        setField(term96487, term96487.getClass(), "value1", null);
        setField(term96487, term96487.getClass(), "value2", null);
        setField(term96487, term96487.getClass(), "value3", null);
        setFloatField(term96488, term96488.getClass(), "loadFactor", 0.75F);
        setIntField(term96488, term96488.getClass(), "size", 3);
        setField(term96490, term96490.getClass(), "next", null);
        setIntField(term96491, term96491.getClass(), "size", 3);
        setIntField(term96491, term96491.getClass(), "hash1", 0);
        setIntField(term96491, term96491.getClass(), "hash2", 0);
        setIntField(term96491, term96491.getClass(), "hash3", 0);
        setField(term96491, term96491.getClass(), "key1", null);
        setField(term96491, term96491.getClass(), "key2", null);
        setField(term96491, term96491.getClass(), "key3", null);
        setField(term96491, term96491.getClass(), "value1", null);
        setField(term96491, term96491.getClass(), "value2", null);
        setField(term96491, term96491.getClass(), "value3", null);
        setField(term96491, term96491.getClass(), "delegateMap", null);
        setField(term96490, term96490.getClass(), "key", term96491);
        setField(term96490, term96490.getClass(), "value", null);
        setElement(term96489, 0, term96490);
        setField(term96492, term96492.getClass(), "next", null);
        setField(term96492, term96492.getClass(), "key", term96493);
        setField(term96492, term96492.getClass(), "value", null);
        setElement(term96489, 5, term96492);
        setField(term96494, term96494.getClass(), "next", null);
        setIntField(term96495, term96495.getClass(), "size", 3);
        setIntField(term96495, term96495.getClass(), "hash1", 0);
        setIntField(term96495, term96495.getClass(), "hash2", 0);
        setIntField(term96495, term96495.getClass(), "hash3", -1);
        setField(term96495, term96495.getClass(), "key1", null);
        setField(term96495, term96495.getClass(), "key2", null);
        setField(term96495, term96495.getClass(), "key3", null);
        setField(term96495, term96495.getClass(), "value1", null);
        setField(term96495, term96495.getClass(), "value2", null);
        setField(term96495, term96495.getClass(), "value3", null);
        setField(term96495, term96495.getClass(), "delegateMap", null);
        setField(term96494, term96494.getClass(), "key", term96495);
        setField(term96494, term96494.getClass(), "value", null);
        setElement(term96489, 6, term96494);
        setField(term96488, term96488.getClass(), "data", term96489);
        setIntField(term96488, term96488.getClass(), "threshold", 12);
        setIntField(term96488, term96488.getClass(), "modCount", 3);
        setField(term96488, term96488.getClass(), "entrySet", null);
        setField(term96488, term96488.getClass(), "keySet", null);
        setField(term96488, term96488.getClass(), "values", null);
        setField(term96488, term96488.getClass(), "keySet", null);
        setField(term96488, term96488.getClass(), "values", null);
        setField(term96487, term96487.getClass(), "delegateMap", term96488);
        term96496 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setIntField(term96496, term96496.getClass(), "size", 3);
        setIntField(term96496, term96496.getClass(), "hash1", 0);
        setIntField(term96496, term96496.getClass(), "hash2", 0);
        setIntField(term96496, term96496.getClass(), "hash3", 0);
        setField(term96496, term96496.getClass(), "key1", null);
        setField(term96496, term96496.getClass(), "key2", null);
        setField(term96496, term96496.getClass(), "key3", null);
        setField(term96496, term96496.getClass(), "value1", null);
        setField(term96496, term96496.getClass(), "value2", null);
        setField(term96496, term96496.getClass(), "value3", null);
        setField(term96496, term96496.getClass(), "delegateMap", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.map.Flat3Map");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.Object");
        argTypes[1] = Class.forName("java.lang.Object");
        Object[] args = new Object[2];
        args[0] = term95690;
        args[1] = null;
        Object retValue = callMethod(klass, "put", argTypes, term95396, args);
        assertTrue(recursiveEquals(term95396, term96487));
        assertTrue(recursiveEquals(term95690, term96496));
        assertTrue(recursiveEquals(retValue, null));
    }

};


