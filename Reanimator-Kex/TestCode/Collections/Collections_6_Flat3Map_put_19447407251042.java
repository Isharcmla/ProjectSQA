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

public class Flat3Map_put_19447407251042 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term297600;
     Object term298102;
     Object term299506;
     Object term299517;

    public Flat3Map_put_19447407251042() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term297600 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term297692 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object[] term297158 = (Object[]) newArray("org.apache.commons.collections.map.AbstractHashedMap$HashEntry", 0);
        Object term297784 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term297918 = newInstance(Class.forName("org.apache.commons.collections.iterators.UnmodifiableMapIterator"));
        Object term298010 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setField(term297600, term297600.getClass(), "delegateMap", null);
        setIntField(term297600, term297600.getClass(), "size", 3);
        setIntField(term297600, term297600.getClass(), "hash3", 1422116357);
        setField(term297692, term297692.getClass(), "delegateMap", null);
        setIntField(term297692, term297692.getClass(), "size", 3);
        setField(term297692, term297692.getClass(), "key3", term297158);
        setField(term297692, term297692.getClass(), "key2", null);
        setField(term297692, term297692.getClass(), "value2", null);
        setIntField(term297692, term297692.getClass(), "hash3", -904003478);
        setIntField(term297692, term297692.getClass(), "hash2", -419409730);
        setIntField(term297692, term297692.getClass(), "hash1", 73596965);
        setField(term297692, term297692.getClass(), "value3", null);
        setField(term297692, term297692.getClass(), "value1", null);
        setField(term297600, term297600.getClass(), "key3", term297692);
        setIntField(term297600, term297600.getClass(), "hash2", 1422116357);
        setField(term297600, term297600.getClass(), "key2", null);
        setIntField(term297600, term297600.getClass(), "hash1", 1422116357);
        setField(term297600, term297600.getClass(), "key1", null);
        setField(term297600, term297600.getClass(), "value3", term297784);
        setField(term297600, term297600.getClass(), "value2", term297918);
        setField(term297600, term297600.getClass(), "value1", term298010);
        term298102 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term298236 = newInstance(Class.forName("org.apache.commons.collections.iterators.UnmodifiableMapIterator"));
        setField(term298102, term298102.getClass(), "delegateMap", null);
        setIntField(term298102, term298102.getClass(), "size", 3);
        setIntField(term298102, term298102.getClass(), "hash3", -2069233664);
        setField(term298102, term298102.getClass(), "value3", null);
        setIntField(term298102, term298102.getClass(), "hash2", -937869307);
        setField(term298102, term298102.getClass(), "value2", null);
        setIntField(term298102, term298102.getClass(), "hash1", 134252032);
        setField(term298102, term298102.getClass(), "value1", null);
        setField(term298102, term298102.getClass(), "key3", null);
        setField(term298102, term298102.getClass(), "key2", null);
        setField(term298102, term298102.getClass(), "key1", term298236);
        term299506 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term299507 = newInstance(Class.forName("org.apache.commons.collections.map.HashedMap"));
        Object[] term299508 = (Object[]) newArray("org.apache.commons.collections.map.AbstractHashedMap$HashEntry", 16);
        Object term299509 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap$HashEntry"));
        Object term299510 = newInstance(Class.forName("java.lang.Object"));
        Object term299511 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term299512 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap$HashEntry"));
        Object term299513 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term299514 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term299515 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap$HashEntry"));
        Object term299516 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setIntField(term299506, term299506.getClass(), "size", 0);
        setIntField(term299506, term299506.getClass(), "hash1", 0);
        setIntField(term299506, term299506.getClass(), "hash2", 0);
        setIntField(term299506, term299506.getClass(), "hash3", 0);
        setField(term299506, term299506.getClass(), "key1", null);
        setField(term299506, term299506.getClass(), "key2", null);
        setField(term299506, term299506.getClass(), "key3", null);
        setField(term299506, term299506.getClass(), "value1", null);
        setField(term299506, term299506.getClass(), "value2", null);
        setField(term299506, term299506.getClass(), "value3", null);
        setFloatField(term299507, term299507.getClass(), "loadFactor", 0.75F);
        setIntField(term299507, term299507.getClass(), "size", 3);
        setField(term299509, term299509.getClass(), "next", null);
        setField(term299509, term299509.getClass(), "key", term299510);
        setIntField(term299511, term299511.getClass(), "size", 0);
        setIntField(term299511, term299511.getClass(), "hash1", 0);
        setIntField(term299511, term299511.getClass(), "hash2", 0);
        setIntField(term299511, term299511.getClass(), "hash3", 0);
        setField(term299511, term299511.getClass(), "key1", null);
        setField(term299511, term299511.getClass(), "key2", null);
        setField(term299511, term299511.getClass(), "key3", null);
        setField(term299511, term299511.getClass(), "value1", null);
        setField(term299511, term299511.getClass(), "value2", null);
        setField(term299511, term299511.getClass(), "value3", null);
        setField(term299511, term299511.getClass(), "delegateMap", null);
        setField(term299509, term299509.getClass(), "value", term299511);
        setElement(term299508, 6, term299509);
        setField(term299512, term299512.getClass(), "next", null);
        setIntField(term299513, term299513.getClass(), "size", 3);
        setIntField(term299513, term299513.getClass(), "hash1", 73596965);
        setIntField(term299513, term299513.getClass(), "hash2", -419409730);
        setIntField(term299513, term299513.getClass(), "hash3", -904003478);
        setField(term299513, term299513.getClass(), "key1", null);
        setField(term299513, term299513.getClass(), "key2", null);
        setField(term299513, term299513.getClass(), "key3", null);
        setField(term299513, term299513.getClass(), "value1", null);
        setField(term299513, term299513.getClass(), "value2", null);
        setField(term299513, term299513.getClass(), "value3", null);
        setField(term299513, term299513.getClass(), "delegateMap", null);
        setField(term299512, term299512.getClass(), "key", term299513);
        setIntField(term299514, term299514.getClass(), "size", 0);
        setIntField(term299514, term299514.getClass(), "hash1", 0);
        setIntField(term299514, term299514.getClass(), "hash2", 0);
        setIntField(term299514, term299514.getClass(), "hash3", 0);
        setField(term299514, term299514.getClass(), "key1", null);
        setField(term299514, term299514.getClass(), "key2", null);
        setField(term299514, term299514.getClass(), "key3", null);
        setField(term299514, term299514.getClass(), "value1", null);
        setField(term299514, term299514.getClass(), "value2", null);
        setField(term299514, term299514.getClass(), "value3", null);
        setField(term299514, term299514.getClass(), "delegateMap", null);
        setField(term299512, term299512.getClass(), "value", term299514);
        setElement(term299508, 9, term299512);
        setField(term299515, term299515.getClass(), "next", null);
        setIntField(term299516, term299516.getClass(), "size", 3);
        setIntField(term299516, term299516.getClass(), "hash1", 134252032);
        setIntField(term299516, term299516.getClass(), "hash2", -937869307);
        setIntField(term299516, term299516.getClass(), "hash3", -2069233664);
        setField(term299516, term299516.getClass(), "key1", null);
        setField(term299516, term299516.getClass(), "key2", null);
        setField(term299516, term299516.getClass(), "key3", null);
        setField(term299516, term299516.getClass(), "value1", null);
        setField(term299516, term299516.getClass(), "value2", null);
        setField(term299516, term299516.getClass(), "value3", null);
        setField(term299516, term299516.getClass(), "delegateMap", null);
        setField(term299515, term299515.getClass(), "key", term299516);
        setField(term299515, term299515.getClass(), "value", null);
        setElement(term299508, 15, term299515);
        setField(term299507, term299507.getClass(), "data", term299508);
        setIntField(term299507, term299507.getClass(), "threshold", 12);
        setIntField(term299507, term299507.getClass(), "modCount", 3);
        setField(term299507, term299507.getClass(), "entrySet", null);
        setField(term299507, term299507.getClass(), "keySet", null);
        setField(term299507, term299507.getClass(), "values", null);
        setField(term299507, term299507.getClass(), "keySet", null);
        setField(term299507, term299507.getClass(), "values", null);
        setField(term299506, term299506.getClass(), "delegateMap", term299507);
        term299517 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setIntField(term299517, term299517.getClass(), "size", 3);
        setIntField(term299517, term299517.getClass(), "hash1", 134252032);
        setIntField(term299517, term299517.getClass(), "hash2", -937869307);
        setIntField(term299517, term299517.getClass(), "hash3", -2069233664);
        setField(term299517, term299517.getClass(), "key1", null);
        setField(term299517, term299517.getClass(), "key2", null);
        setField(term299517, term299517.getClass(), "key3", null);
        setField(term299517, term299517.getClass(), "value1", null);
        setField(term299517, term299517.getClass(), "value2", null);
        setField(term299517, term299517.getClass(), "value3", null);
        setField(term299517, term299517.getClass(), "delegateMap", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.map.Flat3Map");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.Object");
        argTypes[1] = Class.forName("java.lang.Object");
        Object[] args = new Object[2];
        args[0] = term298102;
        args[1] = null;
        Object retValue = callMethod(klass, "put", argTypes, term297600, args);
        assertTrue(recursiveEquals(term297600, term299506));
        assertTrue(recursiveEquals(term298102, term299517));
        assertTrue(recursiveEquals(retValue, null));
    }

};


