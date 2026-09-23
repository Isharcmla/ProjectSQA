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

public class Flat3Map_put_1944740725633 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term139079;
     Object term139833;

    public Flat3Map_put_1944740725633() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term139079 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term139171 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term139263 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term139355 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term139447 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term139539 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object[] term138816 = (Object[]) newArray("org.apache.commons.collections.map.AbstractHashedMap$HashEntry", 0);
        setField(term139079, term139079.getClass(), "delegateMap", null);
        setIntField(term139079, term139079.getClass(), "size", 3);
        setField(term139171, term139171.getClass(), "delegateMap", null);
        setIntField(term139171, term139171.getClass(), "size", 0);
        setField(term139079, term139079.getClass(), "key3", term139171);
        setField(term139263, term139263.getClass(), "delegateMap", null);
        setIntField(term139263, term139263.getClass(), "size", 0);
        setField(term139079, term139079.getClass(), "key2", term139263);
        setField(term139355, term139355.getClass(), "delegateMap", null);
        setIntField(term139355, term139355.getClass(), "size", 0);
        setField(term139079, term139079.getClass(), "key1", term139355);
        setField(term139079, term139079.getClass(), "value3", term139447);
        setField(term139079, term139079.getClass(), "value2", term139539);
        setField(term139079, term139079.getClass(), "value1", term138816);
        setIntField(term139079, term139079.getClass(), "hash3", 0);
        setIntField(term139079, term139079.getClass(), "hash2", 0);
        setIntField(term139079, term139079.getClass(), "hash1", 0);
        term139833 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term139834 = newInstance(Class.forName("org.apache.commons.collections.map.HashedMap"));
        Object[] term139835 = (Object[]) newArray("org.apache.commons.collections.map.AbstractHashedMap$HashEntry", 16);
        Object term139836 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap$HashEntry"));
        Object term139837 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object[] term139838 = (Object[]) newArray("org.apache.commons.collections.map.AbstractHashedMap$HashEntry", 0);
        Object term139839 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap$HashEntry"));
        Object term139840 = newInstance(Class.forName("java.lang.Object"));
        setIntField(term139833, term139833.getClass(), "size", 0);
        setIntField(term139833, term139833.getClass(), "hash1", 0);
        setIntField(term139833, term139833.getClass(), "hash2", 0);
        setIntField(term139833, term139833.getClass(), "hash3", 0);
        setField(term139833, term139833.getClass(), "key1", null);
        setField(term139833, term139833.getClass(), "key2", null);
        setField(term139833, term139833.getClass(), "key3", null);
        setField(term139833, term139833.getClass(), "value1", null);
        setField(term139833, term139833.getClass(), "value2", null);
        setField(term139833, term139833.getClass(), "value3", null);
        setFloatField(term139834, term139834.getClass(), "loadFactor", 0.75F);
        setIntField(term139834, term139834.getClass(), "size", 2);
        setField(term139836, term139836.getClass(), "next", null);
        setIntField(term139837, term139837.getClass(), "size", 0);
        setIntField(term139837, term139837.getClass(), "hash1", 0);
        setIntField(term139837, term139837.getClass(), "hash2", 0);
        setIntField(term139837, term139837.getClass(), "hash3", 0);
        setField(term139837, term139837.getClass(), "key1", null);
        setField(term139837, term139837.getClass(), "key2", null);
        setField(term139837, term139837.getClass(), "key3", null);
        setField(term139837, term139837.getClass(), "value1", null);
        setField(term139837, term139837.getClass(), "value2", null);
        setField(term139837, term139837.getClass(), "value3", null);
        setField(term139837, term139837.getClass(), "delegateMap", null);
        setField(term139836, term139836.getClass(), "key", term139837);
        setField(term139836, term139836.getClass(), "value", term139838);
        setElement(term139835, 0, term139836);
        setField(term139839, term139839.getClass(), "next", null);
        setField(term139839, term139839.getClass(), "key", term139840);
        setField(term139839, term139839.getClass(), "value", null);
        setElement(term139835, 5, term139839);
        setField(term139834, term139834.getClass(), "data", term139835);
        setIntField(term139834, term139834.getClass(), "threshold", 12);
        setIntField(term139834, term139834.getClass(), "modCount", 2);
        setField(term139834, term139834.getClass(), "entrySet", null);
        setField(term139834, term139834.getClass(), "keySet", null);
        setField(term139834, term139834.getClass(), "values", null);
        setField(term139834, term139834.getClass(), "keySet", null);
        setField(term139834, term139834.getClass(), "values", null);
        setField(term139833, term139833.getClass(), "delegateMap", term139834);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.map.Flat3Map");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.Object");
        argTypes[1] = Class.forName("java.lang.Object");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = null;
        Object retValue = callMethod(klass, "put", argTypes, term139079, args);
        assertTrue(recursiveEquals(term139079, term139833));
        assertTrue(recursiveEquals(retValue, null));
    }

};


