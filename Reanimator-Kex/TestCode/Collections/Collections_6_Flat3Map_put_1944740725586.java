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

public class Flat3Map_put_1944740725586 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term121218;
     Object term121532;
     Object term122542;
     Object term122551;

    public Flat3Map_put_1944740725586() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term121218 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term121310 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term121440 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap$HashEntry"));
        setField(term121218, term121218.getClass(), "delegateMap", null);
        setIntField(term121218, term121218.getClass(), "size", 3);
        setIntField(term121218, term121218.getClass(), "hash3", 0);
        setField(term121218, term121218.getClass(), "key3", null);
        setIntField(term121218, term121218.getClass(), "hash2", 0);
        setField(term121218, term121218.getClass(), "key2", null);
        setIntField(term121218, term121218.getClass(), "hash1", 0);
        setField(term121310, term121310.getClass(), "delegateMap", null);
        setIntField(term121310, term121310.getClass(), "size", 3);
        setField(term121310, term121310.getClass(), "key3", null);
        setField(term121310, term121310.getClass(), "value3", null);
        setField(term121218, term121218.getClass(), "key1", term121310);
        setField(term121218, term121218.getClass(), "value3", null);
        setField(term121218, term121218.getClass(), "value2", term121440);
        term121532 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term121626 = newInstance(Class.forName("org.apache.commons.collections.map.LinkedMap"));
        setField(term121532, term121532.getClass(), "delegateMap", null);
        setIntField(term121532, term121532.getClass(), "size", 3);
        setIntField(term121532, term121532.getClass(), "hash3", 0);
        setField(term121532, term121532.getClass(), "value3", null);
        setIntField(term121532, term121532.getClass(), "hash2", 0);
        setField(term121532, term121532.getClass(), "value2", null);
        setIntField(term121532, term121532.getClass(), "hash1", 0);
        setIntField(term121626, term121626.getClass(), "size", 0);
        setField(term121532, term121532.getClass(), "value1", term121626);
        setField(term121532, term121532.getClass(), "key3", null);
        setField(term121532, term121532.getClass(), "key2", null);
        setField(term121532, term121532.getClass(), "key1", null);
        term122542 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term122543 = newInstance(Class.forName("org.apache.commons.collections.map.HashedMap"));
        Object[] term122544 = (Object[]) newArray("org.apache.commons.collections.map.AbstractHashedMap$HashEntry", 16);
        Object term122545 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap$HashEntry"));
        Object term122546 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap$HashEntry"));
        Object term122547 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term122548 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap$HashEntry"));
        Object term122549 = newInstance(Class.forName("java.lang.Object"));
        Object term122550 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap$HashEntry"));
        setIntField(term122542, term122542.getClass(), "size", 0);
        setIntField(term122542, term122542.getClass(), "hash1", 0);
        setIntField(term122542, term122542.getClass(), "hash2", 0);
        setIntField(term122542, term122542.getClass(), "hash3", 0);
        setField(term122542, term122542.getClass(), "key1", null);
        setField(term122542, term122542.getClass(), "key2", null);
        setField(term122542, term122542.getClass(), "key3", null);
        setField(term122542, term122542.getClass(), "value1", null);
        setField(term122542, term122542.getClass(), "value2", null);
        setField(term122542, term122542.getClass(), "value3", null);
        setFloatField(term122543, term122543.getClass(), "loadFactor", 0.75F);
        setIntField(term122543, term122543.getClass(), "size", 3);
        setField(term122546, term122546.getClass(), "next", null);
        setField(term122546, term122546.getClass(), "key", null);
        setField(term122546, term122546.getClass(), "value", null);
        setField(term122545, term122545.getClass(), "next", term122546);
        setIntField(term122547, term122547.getClass(), "size", 3);
        setIntField(term122547, term122547.getClass(), "hash1", 0);
        setIntField(term122547, term122547.getClass(), "hash2", 0);
        setIntField(term122547, term122547.getClass(), "hash3", 0);
        setField(term122547, term122547.getClass(), "key1", null);
        setField(term122547, term122547.getClass(), "key2", null);
        setField(term122547, term122547.getClass(), "key3", null);
        setField(term122547, term122547.getClass(), "value1", null);
        setField(term122547, term122547.getClass(), "value2", null);
        setField(term122547, term122547.getClass(), "value3", null);
        setField(term122547, term122547.getClass(), "delegateMap", null);
        setField(term122545, term122545.getClass(), "key", term122547);
        setField(term122545, term122545.getClass(), "value", null);
        setElement(term122544, 0, term122545);
        setField(term122548, term122548.getClass(), "next", null);
        setField(term122548, term122548.getClass(), "key", term122549);
        setField(term122550, term122550.getClass(), "next", null);
        setField(term122550, term122550.getClass(), "key", null);
        setField(term122550, term122550.getClass(), "value", null);
        setField(term122548, term122548.getClass(), "value", term122550);
        setElement(term122544, 5, term122548);
        setField(term122543, term122543.getClass(), "data", term122544);
        setIntField(term122543, term122543.getClass(), "threshold", 12);
        setIntField(term122543, term122543.getClass(), "modCount", 3);
        setField(term122543, term122543.getClass(), "entrySet", null);
        setField(term122543, term122543.getClass(), "keySet", null);
        setField(term122543, term122543.getClass(), "values", null);
        setField(term122543, term122543.getClass(), "keySet", null);
        setField(term122543, term122543.getClass(), "values", null);
        setField(term122542, term122542.getClass(), "delegateMap", term122543);
        term122551 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setIntField(term122551, term122551.getClass(), "size", 3);
        setIntField(term122551, term122551.getClass(), "hash1", 0);
        setIntField(term122551, term122551.getClass(), "hash2", 0);
        setIntField(term122551, term122551.getClass(), "hash3", 0);
        setField(term122551, term122551.getClass(), "key1", null);
        setField(term122551, term122551.getClass(), "key2", null);
        setField(term122551, term122551.getClass(), "key3", null);
        setField(term122551, term122551.getClass(), "value1", null);
        setField(term122551, term122551.getClass(), "value2", null);
        setField(term122551, term122551.getClass(), "value3", null);
        setField(term122551, term122551.getClass(), "delegateMap", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.map.Flat3Map");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.Object");
        argTypes[1] = Class.forName("java.lang.Object");
        Object[] args = new Object[2];
        args[0] = term121532;
        args[1] = null;
        Object retValue = callMethod(klass, "put", argTypes, term121218, args);
        assertTrue(recursiveEquals(term121218, term122542));
        assertTrue(recursiveEquals(term121532, term122551));
        assertTrue(recursiveEquals(retValue, null));
    }

};


