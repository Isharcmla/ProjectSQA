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

public class Flat3Map_put_1944740725615 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term130334;
     Object term130426;
     Object term131159;
     Object term131167;

    public Flat3Map_put_1944740725615() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term130334 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setField(term130334, term130334.getClass(), "delegateMap", null);
        setIntField(term130334, term130334.getClass(), "size", 3);
        setIntField(term130334, term130334.getClass(), "hash3", 0);
        setField(term130334, term130334.getClass(), "key3", term130334);
        term130426 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term130536 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap"));
        setField(term130426, term130426.getClass(), "delegateMap", null);
        setIntField(term130426, term130426.getClass(), "size", 3);
        setIntField(term130426, term130426.getClass(), "hash3", 0);
        setField(term130426, term130426.getClass(), "value3", null);
        setIntField(term130426, term130426.getClass(), "hash2", 0);
        setIntField(term130536, term130536.getClass(), "size", 0);
        setField(term130426, term130426.getClass(), "value2", term130536);
        setIntField(term130426, term130426.getClass(), "hash1", 0);
        setField(term130426, term130426.getClass(), "value1", null);
        term131159 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term131160 = newInstance(Class.forName("org.apache.commons.collections.map.HashedMap"));
        Object[] term131161 = (Object[]) newArray("org.apache.commons.collections.map.AbstractHashedMap$HashEntry", 16);
        Object term131162 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap$HashEntry"));
        Object term131163 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap$HashEntry"));
        Object term131164 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term131165 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap$HashEntry"));
        Object term131166 = newInstance(Class.forName("java.lang.Object"));
        setIntField(term131159, term131159.getClass(), "size", 0);
        setIntField(term131159, term131159.getClass(), "hash1", 0);
        setIntField(term131159, term131159.getClass(), "hash2", 0);
        setIntField(term131159, term131159.getClass(), "hash3", 0);
        setField(term131159, term131159.getClass(), "key1", null);
        setField(term131159, term131159.getClass(), "key2", null);
        setField(term131159, term131159.getClass(), "key3", null);
        setField(term131159, term131159.getClass(), "value1", null);
        setField(term131159, term131159.getClass(), "value2", null);
        setField(term131159, term131159.getClass(), "value3", null);
        setFloatField(term131160, term131160.getClass(), "loadFactor", 0.75F);
        setIntField(term131160, term131160.getClass(), "size", 3);
        setField(term131163, term131163.getClass(), "next", null);
        setField(term131163, term131163.getClass(), "key", term131159);
        setField(term131163, term131163.getClass(), "value", null);
        setField(term131162, term131162.getClass(), "next", term131163);
        setIntField(term131164, term131164.getClass(), "size", 3);
        setIntField(term131164, term131164.getClass(), "hash1", 0);
        setIntField(term131164, term131164.getClass(), "hash2", 0);
        setIntField(term131164, term131164.getClass(), "hash3", 0);
        setField(term131164, term131164.getClass(), "key1", null);
        setField(term131164, term131164.getClass(), "key2", null);
        setField(term131164, term131164.getClass(), "key3", null);
        setField(term131164, term131164.getClass(), "value1", null);
        setField(term131164, term131164.getClass(), "value2", null);
        setField(term131164, term131164.getClass(), "value3", null);
        setField(term131164, term131164.getClass(), "delegateMap", null);
        setField(term131162, term131162.getClass(), "key", term131164);
        setField(term131162, term131162.getClass(), "value", null);
        setElement(term131161, 0, term131162);
        setField(term131165, term131165.getClass(), "next", null);
        setField(term131165, term131165.getClass(), "key", term131166);
        setField(term131165, term131165.getClass(), "value", null);
        setElement(term131161, 5, term131165);
        setField(term131160, term131160.getClass(), "data", term131161);
        setIntField(term131160, term131160.getClass(), "threshold", 12);
        setIntField(term131160, term131160.getClass(), "modCount", 3);
        setField(term131160, term131160.getClass(), "entrySet", null);
        setField(term131160, term131160.getClass(), "keySet", null);
        setField(term131160, term131160.getClass(), "values", null);
        setField(term131160, term131160.getClass(), "keySet", null);
        setField(term131160, term131160.getClass(), "values", null);
        setField(term131159, term131159.getClass(), "delegateMap", term131160);
        term131167 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setIntField(term131167, term131167.getClass(), "size", 3);
        setIntField(term131167, term131167.getClass(), "hash1", 0);
        setIntField(term131167, term131167.getClass(), "hash2", 0);
        setIntField(term131167, term131167.getClass(), "hash3", 0);
        setField(term131167, term131167.getClass(), "key1", null);
        setField(term131167, term131167.getClass(), "key2", null);
        setField(term131167, term131167.getClass(), "key3", null);
        setField(term131167, term131167.getClass(), "value1", null);
        setField(term131167, term131167.getClass(), "value2", null);
        setField(term131167, term131167.getClass(), "value3", null);
        setField(term131167, term131167.getClass(), "delegateMap", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.map.Flat3Map");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.Object");
        argTypes[1] = Class.forName("java.lang.Object");
        Object[] args = new Object[2];
        args[0] = term130426;
        args[1] = null;
        Object retValue = callMethod(klass, "put", argTypes, term130334, args);
        assertTrue(recursiveEquals(term130334, term131159));
        assertTrue(recursiveEquals(term130426, term131167));
        assertTrue(recursiveEquals(retValue, null));
    }

};


