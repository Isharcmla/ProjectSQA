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
import java.util.HashMap;

public class Flat3Map_put_1944740725574 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term116171;
     Object term116499;
     Object term117899;
     Object term117909;

    public Flat3Map_put_1944740725574() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term116311 = new HashMap();
        HashMap term116359 = new HashMap();
        HashMap term116407 = new HashMap();
        term116171 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term116263 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object[] term115751 = (Object[]) newArray("org.apache.commons.collections.map.AbstractHashedMap$HashEntry", 0);
        setField(term116171, term116171.getClass(), "delegateMap", null);
        setIntField(term116171, term116171.getClass(), "size", 3);
        setIntField(term116171, term116171.getClass(), "hash3", 591151148);
        setField(term116263, term116263.getClass(), "delegateMap", null);
        setIntField(term116263, term116263.getClass(), "size", 3);
        setField(term116263, term116263.getClass(), "key3", term115751);
        setField(term116263, term116263.getClass(), "key2", null);
        setField(term116263, term116263.getClass(), "value2", term116311);
        setIntField(term116263, term116263.getClass(), "hash3", 1491337216);
        setField(term116263, term116263.getClass(), "value3", null);
        setIntField(term116263, term116263.getClass(), "hash2", 536875088);
        setIntField(term116263, term116263.getClass(), "hash1", 33686016);
        setField(term116263, term116263.getClass(), "value1", null);
        setField(term116171, term116171.getClass(), "key3", term116263);
        setIntField(term116171, term116171.getClass(), "hash2", -591151149);
        setIntField(term116171, term116171.getClass(), "hash1", 591151148);
        setField(term116171, term116171.getClass(), "key1", null);
        setField(term116171, term116171.getClass(), "value3", null);
        setField(term116171, term116171.getClass(), "key2", null);
        setField(term116171, term116171.getClass(), "value2", term116359);
        setField(term116171, term116171.getClass(), "value1", term116407);
        term116499 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setField(term116499, term116499.getClass(), "delegateMap", null);
        setIntField(term116499, term116499.getClass(), "size", 3);
        setIntField(term116499, term116499.getClass(), "hash3", -168285660);
        setField(term116499, term116499.getClass(), "value3", null);
        setIntField(term116499, term116499.getClass(), "hash2", 1883246592);
        setField(term116499, term116499.getClass(), "value2", null);
        setIntField(term116499, term116499.getClass(), "hash1", -1123809784);
        setField(term116499, term116499.getClass(), "value1", null);
        setField(term116499, term116499.getClass(), "key3", null);
        HashMap term117904 = new HashMap();
        term117899 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term117900 = newInstance(Class.forName("org.apache.commons.collections.map.HashedMap"));
        Object[] term117901 = (Object[]) newArray("org.apache.commons.collections.map.AbstractHashedMap$HashEntry", 16);
        Object term117902 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap$HashEntry"));
        Object term117903 = newInstance(Class.forName("java.lang.Object"));
        Object term117905 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap$HashEntry"));
        Object term117906 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term117907 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap$HashEntry"));
        Object term117908 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setIntField(term117899, term117899.getClass(), "size", 0);
        setIntField(term117899, term117899.getClass(), "hash1", 0);
        setIntField(term117899, term117899.getClass(), "hash2", 0);
        setIntField(term117899, term117899.getClass(), "hash3", 0);
        setField(term117899, term117899.getClass(), "key1", null);
        setField(term117899, term117899.getClass(), "key2", null);
        setField(term117899, term117899.getClass(), "key3", null);
        setField(term117899, term117899.getClass(), "value1", null);
        setField(term117899, term117899.getClass(), "value2", null);
        setField(term117899, term117899.getClass(), "value3", null);
        setFloatField(term117900, term117900.getClass(), "loadFactor", 0.75F);
        setIntField(term117900, term117900.getClass(), "size", 3);
        setField(term117902, term117902.getClass(), "next", null);
        setField(term117902, term117902.getClass(), "key", term117903);
        setField(term117902, term117902.getClass(), "value", term117904);
        setElement(term117901, 5, term117902);
        setField(term117905, term117905.getClass(), "next", null);
        setIntField(term117906, term117906.getClass(), "size", 3);
        setIntField(term117906, term117906.getClass(), "hash1", 33686016);
        setIntField(term117906, term117906.getClass(), "hash2", 536875088);
        setIntField(term117906, term117906.getClass(), "hash3", 1491337216);
        setField(term117906, term117906.getClass(), "key1", null);
        setField(term117906, term117906.getClass(), "key2", null);
        setField(term117906, term117906.getClass(), "key3", null);
        setField(term117906, term117906.getClass(), "value1", null);
        setField(term117906, term117906.getClass(), "value2", null);
        setField(term117906, term117906.getClass(), "value3", null);
        setField(term117906, term117906.getClass(), "delegateMap", null);
        setField(term117905, term117905.getClass(), "key", term117906);
        setField(term117905, term117905.getClass(), "value", null);
        setElement(term117901, 13, term117905);
        setField(term117907, term117907.getClass(), "next", null);
        setIntField(term117908, term117908.getClass(), "size", 3);
        setIntField(term117908, term117908.getClass(), "hash1", -1123809784);
        setIntField(term117908, term117908.getClass(), "hash2", 1883246592);
        setIntField(term117908, term117908.getClass(), "hash3", -168285660);
        setField(term117908, term117908.getClass(), "key1", null);
        setField(term117908, term117908.getClass(), "key2", null);
        setField(term117908, term117908.getClass(), "key3", null);
        setField(term117908, term117908.getClass(), "value1", null);
        setField(term117908, term117908.getClass(), "value2", null);
        setField(term117908, term117908.getClass(), "value3", null);
        setField(term117908, term117908.getClass(), "delegateMap", null);
        setField(term117907, term117907.getClass(), "key", term117908);
        setField(term117907, term117907.getClass(), "value", null);
        setElement(term117901, 15, term117907);
        setField(term117900, term117900.getClass(), "data", term117901);
        setIntField(term117900, term117900.getClass(), "threshold", 12);
        setIntField(term117900, term117900.getClass(), "modCount", 3);
        setField(term117900, term117900.getClass(), "entrySet", null);
        setField(term117900, term117900.getClass(), "keySet", null);
        setField(term117900, term117900.getClass(), "values", null);
        setField(term117900, term117900.getClass(), "keySet", null);
        setField(term117900, term117900.getClass(), "values", null);
        setField(term117899, term117899.getClass(), "delegateMap", term117900);
        term117909 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setIntField(term117909, term117909.getClass(), "size", 3);
        setIntField(term117909, term117909.getClass(), "hash1", -1123809784);
        setIntField(term117909, term117909.getClass(), "hash2", 1883246592);
        setIntField(term117909, term117909.getClass(), "hash3", -168285660);
        setField(term117909, term117909.getClass(), "key1", null);
        setField(term117909, term117909.getClass(), "key2", null);
        setField(term117909, term117909.getClass(), "key3", null);
        setField(term117909, term117909.getClass(), "value1", null);
        setField(term117909, term117909.getClass(), "value2", null);
        setField(term117909, term117909.getClass(), "value3", null);
        setField(term117909, term117909.getClass(), "delegateMap", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.map.Flat3Map");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.Object");
        argTypes[1] = Class.forName("java.lang.Object");
        Object[] args = new Object[2];
        args[0] = term116499;
        args[1] = null;
        Object retValue = callMethod(klass, "put", argTypes, term116171, args);
        assertTrue(recursiveEquals(term116171, term117899));
        assertTrue(recursiveEquals(term116499, term117909));
        assertTrue(recursiveEquals(retValue, null));
    }

};


