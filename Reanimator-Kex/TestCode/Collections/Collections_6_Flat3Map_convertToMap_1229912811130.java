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

public class Flat3Map_convertToMap_1229912811130 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term22777;
     Object term23483;

    public Flat3Map_convertToMap_1229912811130() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term23119 = new HashMap();
        term22777 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term22887 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap"));
        Object term22979 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term23071 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setField(term22777, term22777.getClass(), "delegateMap", term22887);
        setIntField(term22777, term22777.getClass(), "size", 3);
        setField(term22777, term22777.getClass(), "key3", null);
        setField(term22777, term22777.getClass(), "value3", term22979);
        setField(term22777, term22777.getClass(), "key2", null);
        setField(term22777, term22777.getClass(), "value2", null);
        setField(term22777, term22777.getClass(), "key1", term23071);
        setField(term22777, term22777.getClass(), "value1", term23119);
        HashMap term23488 = new HashMap();
        term23483 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term23484 = newInstance(Class.forName("org.apache.commons.collections.map.HashedMap"));
        Object[] term23485 = (Object[]) newArray("org.apache.commons.collections.map.AbstractHashedMap$HashEntry", 16);
        Object term23486 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap$HashEntry"));
        Object term23487 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term23489 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap$HashEntry"));
        Object term23490 = newInstance(Class.forName("java.lang.Object"));
        setIntField(term23483, term23483.getClass(), "size", 0);
        setIntField(term23483, term23483.getClass(), "hash1", 0);
        setIntField(term23483, term23483.getClass(), "hash2", 0);
        setIntField(term23483, term23483.getClass(), "hash3", 0);
        setField(term23483, term23483.getClass(), "key1", null);
        setField(term23483, term23483.getClass(), "key2", null);
        setField(term23483, term23483.getClass(), "key3", null);
        setField(term23483, term23483.getClass(), "value1", null);
        setField(term23483, term23483.getClass(), "value2", null);
        setField(term23483, term23483.getClass(), "value3", null);
        setFloatField(term23484, term23484.getClass(), "loadFactor", 0.75F);
        setIntField(term23484, term23484.getClass(), "size", 2);
        setField(term23486, term23486.getClass(), "next", null);
        setIntField(term23487, term23487.getClass(), "size", 0);
        setIntField(term23487, term23487.getClass(), "hash1", 0);
        setIntField(term23487, term23487.getClass(), "hash2", 0);
        setIntField(term23487, term23487.getClass(), "hash3", 0);
        setField(term23487, term23487.getClass(), "key1", null);
        setField(term23487, term23487.getClass(), "key2", null);
        setField(term23487, term23487.getClass(), "key3", null);
        setField(term23487, term23487.getClass(), "value1", null);
        setField(term23487, term23487.getClass(), "value2", null);
        setField(term23487, term23487.getClass(), "value3", null);
        setField(term23487, term23487.getClass(), "delegateMap", null);
        setField(term23486, term23486.getClass(), "key", term23487);
        setField(term23486, term23486.getClass(), "value", term23488);
        setElement(term23485, 0, term23486);
        setField(term23489, term23489.getClass(), "next", null);
        setField(term23489, term23489.getClass(), "key", term23490);
        setField(term23489, term23489.getClass(), "value", null);
        setElement(term23485, 5, term23489);
        setField(term23484, term23484.getClass(), "data", term23485);
        setIntField(term23484, term23484.getClass(), "threshold", 12);
        setIntField(term23484, term23484.getClass(), "modCount", 2);
        setField(term23484, term23484.getClass(), "entrySet", null);
        setField(term23484, term23484.getClass(), "keySet", null);
        setField(term23484, term23484.getClass(), "values", null);
        setField(term23484, term23484.getClass(), "keySet", null);
        setField(term23484, term23484.getClass(), "values", null);
        setField(term23483, term23483.getClass(), "delegateMap", term23484);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.map.Flat3Map");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "convertToMap", argTypes, term22777, args);
        assertTrue(recursiveEquals(term22777, term23483));
    }

};


