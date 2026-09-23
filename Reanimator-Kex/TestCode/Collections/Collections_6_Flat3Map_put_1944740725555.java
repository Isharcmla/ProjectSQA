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

public class Flat3Map_put_1944740725555 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term109826;
     Object term110048;
     Object term110762;
     Object term110772;

    public Flat3Map_put_1944740725555() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term109826 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term109918 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term109956 = newInstance(Class.forName("java.lang.Object"));
        setField(term109826, term109826.getClass(), "delegateMap", null);
        setIntField(term109826, term109826.getClass(), "size", 3);
        setIntField(term109826, term109826.getClass(), "hash3", 0);
        setField(term109918, term109918.getClass(), "delegateMap", null);
        setIntField(term109918, term109918.getClass(), "size", -4);
        setField(term109826, term109826.getClass(), "key3", term109918);
        setIntField(term109826, term109826.getClass(), "hash2", 0);
        setField(term109826, term109826.getClass(), "key2", term109956);
        setIntField(term109826, term109826.getClass(), "hash1", -1);
        term110048 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setField(term110048, term110048.getClass(), "delegateMap", null);
        setIntField(term110048, term110048.getClass(), "size", 3);
        setIntField(term110048, term110048.getClass(), "hash3", 0);
        setField(term110048, term110048.getClass(), "value3", null);
        setIntField(term110048, term110048.getClass(), "hash2", 0);
        setField(term110048, term110048.getClass(), "value2", null);
        setIntField(term110048, term110048.getClass(), "hash1", 0);
        setField(term110048, term110048.getClass(), "value1", null);
        term110762 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term110763 = newInstance(Class.forName("org.apache.commons.collections.map.HashedMap"));
        Object[] term110764 = (Object[]) newArray("org.apache.commons.collections.map.AbstractHashedMap$HashEntry", 16);
        Object term110765 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap$HashEntry"));
        Object term110766 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap$HashEntry"));
        Object term110767 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term110768 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap$HashEntry"));
        Object term110769 = newInstance(Class.forName("java.lang.Object"));
        Object term110770 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap$HashEntry"));
        Object term110771 = newInstance(Class.forName("java.lang.Object"));
        setIntField(term110762, term110762.getClass(), "size", 0);
        setIntField(term110762, term110762.getClass(), "hash1", 0);
        setIntField(term110762, term110762.getClass(), "hash2", 0);
        setIntField(term110762, term110762.getClass(), "hash3", 0);
        setField(term110762, term110762.getClass(), "key1", null);
        setField(term110762, term110762.getClass(), "key2", null);
        setField(term110762, term110762.getClass(), "key3", null);
        setField(term110762, term110762.getClass(), "value1", null);
        setField(term110762, term110762.getClass(), "value2", null);
        setField(term110762, term110762.getClass(), "value3", null);
        setFloatField(term110763, term110763.getClass(), "loadFactor", 0.75F);
        setIntField(term110763, term110763.getClass(), "size", 4);
        setField(term110766, term110766.getClass(), "next", null);
        setField(term110766, term110766.getClass(), "key", null);
        setField(term110766, term110766.getClass(), "value", null);
        setField(term110765, term110765.getClass(), "next", term110766);
        setIntField(term110767, term110767.getClass(), "size", 3);
        setIntField(term110767, term110767.getClass(), "hash1", 0);
        setIntField(term110767, term110767.getClass(), "hash2", 0);
        setIntField(term110767, term110767.getClass(), "hash3", 0);
        setField(term110767, term110767.getClass(), "key1", null);
        setField(term110767, term110767.getClass(), "key2", null);
        setField(term110767, term110767.getClass(), "key3", null);
        setField(term110767, term110767.getClass(), "value1", null);
        setField(term110767, term110767.getClass(), "value2", null);
        setField(term110767, term110767.getClass(), "value3", null);
        setField(term110767, term110767.getClass(), "delegateMap", null);
        setField(term110765, term110765.getClass(), "key", term110767);
        setField(term110765, term110765.getClass(), "value", null);
        setElement(term110764, 0, term110765);
        setField(term110768, term110768.getClass(), "next", null);
        setField(term110768, term110768.getClass(), "key", term110769);
        setField(term110768, term110768.getClass(), "value", null);
        setElement(term110764, 2, term110768);
        setField(term110770, term110770.getClass(), "next", null);
        setField(term110770, term110770.getClass(), "key", term110771);
        setField(term110770, term110770.getClass(), "value", null);
        setElement(term110764, 5, term110770);
        setField(term110763, term110763.getClass(), "data", term110764);
        setIntField(term110763, term110763.getClass(), "threshold", 12);
        setIntField(term110763, term110763.getClass(), "modCount", 4);
        setField(term110763, term110763.getClass(), "entrySet", null);
        setField(term110763, term110763.getClass(), "keySet", null);
        setField(term110763, term110763.getClass(), "values", null);
        setField(term110763, term110763.getClass(), "keySet", null);
        setField(term110763, term110763.getClass(), "values", null);
        setField(term110762, term110762.getClass(), "delegateMap", term110763);
        term110772 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setIntField(term110772, term110772.getClass(), "size", 3);
        setIntField(term110772, term110772.getClass(), "hash1", 0);
        setIntField(term110772, term110772.getClass(), "hash2", 0);
        setIntField(term110772, term110772.getClass(), "hash3", 0);
        setField(term110772, term110772.getClass(), "key1", null);
        setField(term110772, term110772.getClass(), "key2", null);
        setField(term110772, term110772.getClass(), "key3", null);
        setField(term110772, term110772.getClass(), "value1", null);
        setField(term110772, term110772.getClass(), "value2", null);
        setField(term110772, term110772.getClass(), "value3", null);
        setField(term110772, term110772.getClass(), "delegateMap", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.map.Flat3Map");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.Object");
        argTypes[1] = Class.forName("java.lang.Object");
        Object[] args = new Object[2];
        args[0] = term110048;
        args[1] = null;
        Object retValue = callMethod(klass, "put", argTypes, term109826, args);
        assertTrue(recursiveEquals(term109826, term110762));
        assertTrue(recursiveEquals(term110048, term110772));
        assertTrue(recursiveEquals(retValue, null));
    }

};


