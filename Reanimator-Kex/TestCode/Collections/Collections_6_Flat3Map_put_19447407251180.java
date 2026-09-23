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

public class Flat3Map_put_19447407251180 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term365979;
     Object term366163;
     Object term367169;
     Object term367177;

    public Flat3Map_put_19447407251180() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term365979 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term366071 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object[] term365631 = (Object[]) newArray("org.apache.commons.collections.map.AbstractHashedMap$HashEntry", 0);
        setField(term365979, term365979.getClass(), "delegateMap", null);
        setIntField(term365979, term365979.getClass(), "size", 3);
        setIntField(term365979, term365979.getClass(), "hash3", -190774521);
        setField(term366071, term366071.getClass(), "delegateMap", null);
        setIntField(term366071, term366071.getClass(), "size", 0);
        setField(term365979, term365979.getClass(), "key3", term366071);
        setIntField(term365979, term365979.getClass(), "hash2", -190774521);
        setField(term365979, term365979.getClass(), "key2", null);
        setIntField(term365979, term365979.getClass(), "hash1", -190774521);
        setField(term365979, term365979.getClass(), "key1", null);
        setField(term365979, term365979.getClass(), "value3", term365631);
        setField(term365979, term365979.getClass(), "value2", null);
        setField(term365979, term365979.getClass(), "value1", null);
        term366163 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setField(term366163, term366163.getClass(), "delegateMap", null);
        setIntField(term366163, term366163.getClass(), "size", 3);
        setIntField(term366163, term366163.getClass(), "hash3", 1613791490);
        setField(term366163, term366163.getClass(), "value3", null);
        setIntField(term366163, term366163.getClass(), "hash2", -1805615099);
        setField(term366163, term366163.getClass(), "value2", null);
        setIntField(term366163, term366163.getClass(), "hash1", 1049088);
        setField(term366163, term366163.getClass(), "value1", null);
        term367169 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term367170 = newInstance(Class.forName("org.apache.commons.collections.map.HashedMap"));
        Object[] term367171 = (Object[]) newArray("org.apache.commons.collections.map.AbstractHashedMap$HashEntry", 16);
        Object term367172 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap$HashEntry"));
        Object term367173 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap$HashEntry"));
        Object term367174 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term367175 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap$HashEntry"));
        Object term367176 = newInstance(Class.forName("java.lang.Object"));
        setIntField(term367169, term367169.getClass(), "size", 0);
        setIntField(term367169, term367169.getClass(), "hash1", 0);
        setIntField(term367169, term367169.getClass(), "hash2", 0);
        setIntField(term367169, term367169.getClass(), "hash3", 0);
        setField(term367169, term367169.getClass(), "key1", null);
        setField(term367169, term367169.getClass(), "key2", null);
        setField(term367169, term367169.getClass(), "key3", null);
        setField(term367169, term367169.getClass(), "value1", null);
        setField(term367169, term367169.getClass(), "value2", null);
        setField(term367169, term367169.getClass(), "value3", null);
        setFloatField(term367170, term367170.getClass(), "loadFactor", 0.75F);
        setIntField(term367170, term367170.getClass(), "size", 3);
        setField(term367173, term367173.getClass(), "next", null);
        setField(term367173, term367173.getClass(), "key", null);
        setField(term367173, term367173.getClass(), "value", null);
        setField(term367172, term367172.getClass(), "next", term367173);
        setIntField(term367174, term367174.getClass(), "size", 3);
        setIntField(term367174, term367174.getClass(), "hash1", 1049088);
        setIntField(term367174, term367174.getClass(), "hash2", -1805615099);
        setIntField(term367174, term367174.getClass(), "hash3", 1613791490);
        setField(term367174, term367174.getClass(), "key1", null);
        setField(term367174, term367174.getClass(), "key2", null);
        setField(term367174, term367174.getClass(), "key3", null);
        setField(term367174, term367174.getClass(), "value1", null);
        setField(term367174, term367174.getClass(), "value2", null);
        setField(term367174, term367174.getClass(), "value3", null);
        setField(term367174, term367174.getClass(), "delegateMap", null);
        setField(term367172, term367172.getClass(), "key", term367174);
        setField(term367172, term367172.getClass(), "value", null);
        setElement(term367171, 0, term367172);
        setField(term367175, term367175.getClass(), "next", null);
        setField(term367175, term367175.getClass(), "key", term367176);
        setField(term367175, term367175.getClass(), "value", null);
        setElement(term367171, 6, term367175);
        setField(term367170, term367170.getClass(), "data", term367171);
        setIntField(term367170, term367170.getClass(), "threshold", 12);
        setIntField(term367170, term367170.getClass(), "modCount", 3);
        setField(term367170, term367170.getClass(), "entrySet", null);
        setField(term367170, term367170.getClass(), "keySet", null);
        setField(term367170, term367170.getClass(), "values", null);
        setField(term367170, term367170.getClass(), "keySet", null);
        setField(term367170, term367170.getClass(), "values", null);
        setField(term367169, term367169.getClass(), "delegateMap", term367170);
        term367177 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setIntField(term367177, term367177.getClass(), "size", 3);
        setIntField(term367177, term367177.getClass(), "hash1", 1049088);
        setIntField(term367177, term367177.getClass(), "hash2", -1805615099);
        setIntField(term367177, term367177.getClass(), "hash3", 1613791490);
        setField(term367177, term367177.getClass(), "key1", null);
        setField(term367177, term367177.getClass(), "key2", null);
        setField(term367177, term367177.getClass(), "key3", null);
        setField(term367177, term367177.getClass(), "value1", null);
        setField(term367177, term367177.getClass(), "value2", null);
        setField(term367177, term367177.getClass(), "value3", null);
        setField(term367177, term367177.getClass(), "delegateMap", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.map.Flat3Map");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.Object");
        argTypes[1] = Class.forName("java.lang.Object");
        Object[] args = new Object[2];
        args[0] = term366163;
        args[1] = null;
        Object retValue = callMethod(klass, "put", argTypes, term365979, args);
        assertTrue(recursiveEquals(term365979, term367169));
        assertTrue(recursiveEquals(term366163, term367177));
        assertTrue(recursiveEquals(retValue, null));
    }

};


