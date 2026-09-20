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

public class Flat3Map_put_1944740725958 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term191635;
     Object term191727;
     Object term192704;
     Object term192710;

    public Flat3Map_put_1944740725958() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term191635 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setField(term191635, term191635.getClass(), "delegateMap", null);
        setIntField(term191635, term191635.getClass(), "size", 3);
        setIntField(term191635, term191635.getClass(), "hash3", 0);
        setField(term191635, term191635.getClass(), "key3", null);
        setIntField(term191635, term191635.getClass(), "hash2", 0);
        setField(term191635, term191635.getClass(), "key2", null);
        setIntField(term191635, term191635.getClass(), "hash1", 0);
        setField(term191635, term191635.getClass(), "key1", term191635);
        term191727 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term191837 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap"));
        setField(term191727, term191727.getClass(), "delegateMap", null);
        setIntField(term191727, term191727.getClass(), "size", 3);
        setIntField(term191727, term191727.getClass(), "hash3", 0);
        setField(term191727, term191727.getClass(), "value3", null);
        setIntField(term191727, term191727.getClass(), "hash2", 0);
        setIntField(term191837, term191837.getClass(), "size", 0);
        setField(term191727, term191727.getClass(), "value2", term191837);
        setIntField(term191727, term191727.getClass(), "hash1", 0);
        setField(term191727, term191727.getClass(), "value1", null);
        term192704 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term192705 = newInstance(Class.forName("org.apache.commons.collections.map.HashedMap"));
        Object[] term192706 = (Object[]) newArray("org.apache.commons.collections.map.AbstractHashedMap$HashEntry", 16);
        Object term192707 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap$HashEntry"));
        Object term192708 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap$HashEntry"));
        Object term192709 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setIntField(term192704, term192704.getClass(), "size", 0);
        setIntField(term192704, term192704.getClass(), "hash1", 0);
        setIntField(term192704, term192704.getClass(), "hash2", 0);
        setIntField(term192704, term192704.getClass(), "hash3", 0);
        setField(term192704, term192704.getClass(), "key1", null);
        setField(term192704, term192704.getClass(), "key2", null);
        setField(term192704, term192704.getClass(), "key3", null);
        setField(term192704, term192704.getClass(), "value1", null);
        setField(term192704, term192704.getClass(), "value2", null);
        setField(term192704, term192704.getClass(), "value3", null);
        setFloatField(term192705, term192705.getClass(), "loadFactor", 0.75F);
        setIntField(term192705, term192705.getClass(), "size", 3);
        setField(term192708, term192708.getClass(), "next", null);
        setField(term192708, term192708.getClass(), "key", term192704);
        setField(term192708, term192708.getClass(), "value", null);
        setField(term192707, term192707.getClass(), "next", term192708);
        setIntField(term192709, term192709.getClass(), "size", 3);
        setIntField(term192709, term192709.getClass(), "hash1", 0);
        setIntField(term192709, term192709.getClass(), "hash2", 0);
        setIntField(term192709, term192709.getClass(), "hash3", 0);
        setField(term192709, term192709.getClass(), "key1", null);
        setField(term192709, term192709.getClass(), "key2", null);
        setField(term192709, term192709.getClass(), "key3", null);
        setField(term192709, term192709.getClass(), "value1", null);
        setField(term192709, term192709.getClass(), "value2", null);
        setField(term192709, term192709.getClass(), "value3", null);
        setField(term192709, term192709.getClass(), "delegateMap", null);
        setField(term192707, term192707.getClass(), "key", term192709);
        setField(term192707, term192707.getClass(), "value", null);
        setElement(term192706, 0, term192707);
        setField(term192705, term192705.getClass(), "data", term192706);
        setIntField(term192705, term192705.getClass(), "threshold", 12);
        setIntField(term192705, term192705.getClass(), "modCount", 3);
        setField(term192705, term192705.getClass(), "entrySet", null);
        setField(term192705, term192705.getClass(), "keySet", null);
        setField(term192705, term192705.getClass(), "values", null);
        setField(term192705, term192705.getClass(), "keySet", null);
        setField(term192705, term192705.getClass(), "values", null);
        setField(term192704, term192704.getClass(), "delegateMap", term192705);
        term192710 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setIntField(term192710, term192710.getClass(), "size", 3);
        setIntField(term192710, term192710.getClass(), "hash1", 0);
        setIntField(term192710, term192710.getClass(), "hash2", 0);
        setIntField(term192710, term192710.getClass(), "hash3", 0);
        setField(term192710, term192710.getClass(), "key1", null);
        setField(term192710, term192710.getClass(), "key2", null);
        setField(term192710, term192710.getClass(), "key3", null);
        setField(term192710, term192710.getClass(), "value1", null);
        setField(term192710, term192710.getClass(), "value2", null);
        setField(term192710, term192710.getClass(), "value3", null);
        setField(term192710, term192710.getClass(), "delegateMap", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.map.Flat3Map");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.Object");
        argTypes[1] = Class.forName("java.lang.Object");
        Object[] args = new Object[2];
        args[0] = term191727;
        args[1] = null;
        Object retValue = callMethod(klass, "put", argTypes, term191635, args);
        assertTrue(recursiveEquals(term191635, term192704));
        assertTrue(recursiveEquals(term191727, term192710));
        assertTrue(recursiveEquals(retValue, null));
    }

};
