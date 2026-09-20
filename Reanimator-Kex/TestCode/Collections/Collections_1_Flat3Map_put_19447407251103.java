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

public class Flat3Map_put_19447407251103 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term218818;
     Object term219040;
     Object term219256;
     Object term219267;

    public Flat3Map_put_19447407251103() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term218818 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object[] term218597 = (Object[]) newArray("org.apache.commons.collections.map.AbstractHashedMap$HashEntry", 0);
        Object term218856 = newInstance(Class.forName("java.lang.Object"));
        Object term218948 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setField(term218818, term218818.getClass(), "delegateMap", null);
        setIntField(term218818, term218818.getClass(), "size", 3);
        setIntField(term218818, term218818.getClass(), "hash3", 0);
        setField(term218818, term218818.getClass(), "key3", null);
        setIntField(term218818, term218818.getClass(), "hash2", -1);
        setIntField(term218818, term218818.getClass(), "hash1", 0);
        setField(term218818, term218818.getClass(), "key1", term218597);
        setField(term218818, term218818.getClass(), "value3", null);
        setField(term218818, term218818.getClass(), "key2", term218856);
        setField(term218818, term218818.getClass(), "value2", term218948);
        term219040 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setField(term219040, term219040.getClass(), "delegateMap", null);
        setIntField(term219040, term219040.getClass(), "size", 3);
        setIntField(term219040, term219040.getClass(), "hash3", 0);
        setField(term219040, term219040.getClass(), "value3", null);
        setIntField(term219040, term219040.getClass(), "hash2", 0);
        setField(term219040, term219040.getClass(), "value2", null);
        setIntField(term219040, term219040.getClass(), "hash1", 0);
        setField(term219040, term219040.getClass(), "value1", null);
        term219256 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term219257 = newInstance(Class.forName("org.apache.commons.collections.map.HashedMap"));
        Object[] term219258 = (Object[]) newArray("org.apache.commons.collections.map.AbstractHashedMap$HashEntry", 16);
        Object term219259 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap$HashEntry"));
        Object term219260 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap$HashEntry"));
        Object term219261 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term219262 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap$HashEntry"));
        Object[] term219263 = (Object[]) newArray("org.apache.commons.collections.map.AbstractHashedMap$HashEntry", 0);
        Object term219264 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap$HashEntry"));
        Object term219265 = newInstance(Class.forName("java.lang.Object"));
        Object term219266 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setIntField(term219256, term219256.getClass(), "size", 0);
        setIntField(term219256, term219256.getClass(), "hash1", 0);
        setIntField(term219256, term219256.getClass(), "hash2", 0);
        setIntField(term219256, term219256.getClass(), "hash3", 0);
        setField(term219256, term219256.getClass(), "key1", null);
        setField(term219256, term219256.getClass(), "key2", null);
        setField(term219256, term219256.getClass(), "key3", null);
        setField(term219256, term219256.getClass(), "value1", null);
        setField(term219256, term219256.getClass(), "value2", null);
        setField(term219256, term219256.getClass(), "value3", null);
        setFloatField(term219257, term219257.getClass(), "loadFactor", 0.75F);
        setIntField(term219257, term219257.getClass(), "size", 4);
        setField(term219260, term219260.getClass(), "next", null);
        setField(term219260, term219260.getClass(), "key", null);
        setField(term219260, term219260.getClass(), "value", null);
        setField(term219259, term219259.getClass(), "next", term219260);
        setIntField(term219261, term219261.getClass(), "size", 3);
        setIntField(term219261, term219261.getClass(), "hash1", 0);
        setIntField(term219261, term219261.getClass(), "hash2", 0);
        setIntField(term219261, term219261.getClass(), "hash3", 0);
        setField(term219261, term219261.getClass(), "key1", null);
        setField(term219261, term219261.getClass(), "key2", null);
        setField(term219261, term219261.getClass(), "key3", null);
        setField(term219261, term219261.getClass(), "value1", null);
        setField(term219261, term219261.getClass(), "value2", null);
        setField(term219261, term219261.getClass(), "value3", null);
        setField(term219261, term219261.getClass(), "delegateMap", null);
        setField(term219259, term219259.getClass(), "key", term219261);
        setField(term219259, term219259.getClass(), "value", null);
        setElement(term219258, 0, term219259);
        setField(term219262, term219262.getClass(), "next", null);
        setField(term219262, term219262.getClass(), "key", term219263);
        setField(term219262, term219262.getClass(), "value", null);
        setElement(term219258, 4, term219262);
        setField(term219264, term219264.getClass(), "next", null);
        setField(term219264, term219264.getClass(), "key", term219265);
        setIntField(term219266, term219266.getClass(), "size", 0);
        setIntField(term219266, term219266.getClass(), "hash1", 0);
        setIntField(term219266, term219266.getClass(), "hash2", 0);
        setIntField(term219266, term219266.getClass(), "hash3", 0);
        setField(term219266, term219266.getClass(), "key1", null);
        setField(term219266, term219266.getClass(), "key2", null);
        setField(term219266, term219266.getClass(), "key3", null);
        setField(term219266, term219266.getClass(), "value1", null);
        setField(term219266, term219266.getClass(), "value2", null);
        setField(term219266, term219266.getClass(), "value3", null);
        setField(term219266, term219266.getClass(), "delegateMap", null);
        setField(term219264, term219264.getClass(), "value", term219266);
        setElement(term219258, 10, term219264);
        setField(term219257, term219257.getClass(), "data", term219258);
        setIntField(term219257, term219257.getClass(), "threshold", 12);
        setIntField(term219257, term219257.getClass(), "modCount", 4);
        setField(term219257, term219257.getClass(), "entrySet", null);
        setField(term219257, term219257.getClass(), "keySet", null);
        setField(term219257, term219257.getClass(), "values", null);
        setField(term219257, term219257.getClass(), "keySet", null);
        setField(term219257, term219257.getClass(), "values", null);
        setField(term219256, term219256.getClass(), "delegateMap", term219257);
        term219267 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setIntField(term219267, term219267.getClass(), "size", 3);
        setIntField(term219267, term219267.getClass(), "hash1", 0);
        setIntField(term219267, term219267.getClass(), "hash2", 0);
        setIntField(term219267, term219267.getClass(), "hash3", 0);
        setField(term219267, term219267.getClass(), "key1", null);
        setField(term219267, term219267.getClass(), "key2", null);
        setField(term219267, term219267.getClass(), "key3", null);
        setField(term219267, term219267.getClass(), "value1", null);
        setField(term219267, term219267.getClass(), "value2", null);
        setField(term219267, term219267.getClass(), "value3", null);
        setField(term219267, term219267.getClass(), "delegateMap", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.map.Flat3Map");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.Object");
        argTypes[1] = Class.forName("java.lang.Object");
        Object[] args = new Object[2];
        args[0] = term219040;
        args[1] = null;
        Object retValue = callMethod(klass, "put", argTypes, term218818, args);
        assertTrue(recursiveEquals(term218818, term219256));
        assertTrue(recursiveEquals(term219040, term219267));
        assertTrue(recursiveEquals(retValue, null));
    }

};
