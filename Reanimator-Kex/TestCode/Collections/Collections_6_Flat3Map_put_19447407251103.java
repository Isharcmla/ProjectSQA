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
     Object term327805;
     Object term328081;
     Object term328718;
     Object term328726;

    public Flat3Map_put_19447407251103() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term327805 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term327897 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term327989 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setField(term327805, term327805.getClass(), "delegateMap", null);
        setIntField(term327805, term327805.getClass(), "size", 3);
        setIntField(term327805, term327805.getClass(), "hash3", 0);
        setField(term327897, term327897.getClass(), "delegateMap", null);
        setIntField(term327897, term327897.getClass(), "size", 3);
        setField(term327989, term327989.getClass(), "delegateMap", null);
        setIntField(term327989, term327989.getClass(), "size", 0);
        setField(term327897, term327897.getClass(), "key3", term327989);
        setField(term327897, term327897.getClass(), "key2", null);
        setField(term327897, term327897.getClass(), "value2", null);
        setIntField(term327897, term327897.getClass(), "hash3", 0);
        setField(term327897, term327897.getClass(), "value3", null);
        setIntField(term327897, term327897.getClass(), "hash2", 0);
        setIntField(term327897, term327897.getClass(), "hash1", -1);
        setField(term327805, term327805.getClass(), "key3", term327897);
        term328081 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term328173 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term328265 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setField(term328081, term328081.getClass(), "delegateMap", null);
        setIntField(term328081, term328081.getClass(), "size", 3);
        setIntField(term328081, term328081.getClass(), "hash3", 0);
        setField(term328081, term328081.getClass(), "value3", null);
        setIntField(term328081, term328081.getClass(), "hash2", 0);
        setField(term328081, term328081.getClass(), "value2", null);
        setIntField(term328081, term328081.getClass(), "hash1", 0);
        setField(term328081, term328081.getClass(), "value1", null);
        setField(term328081, term328081.getClass(), "key3", null);
        setField(term328173, term328173.getClass(), "delegateMap", null);
        setIntField(term328173, term328173.getClass(), "size", 0);
        setField(term328081, term328081.getClass(), "key2", term328173);
        setField(term328265, term328265.getClass(), "delegateMap", null);
        setIntField(term328265, term328265.getClass(), "size", 1);
        setIntField(term328265, term328265.getClass(), "hash1", 0);
        setField(term328265, term328265.getClass(), "value1", null);
        setField(term328081, term328081.getClass(), "key1", term328265);
        term328718 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term328719 = newInstance(Class.forName("org.apache.commons.collections.map.HashedMap"));
        Object[] term328720 = (Object[]) newArray("org.apache.commons.collections.map.AbstractHashedMap$HashEntry", 16);
        Object term328721 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap$HashEntry"));
        Object term328722 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term328723 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap$HashEntry"));
        Object term328724 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap$HashEntry"));
        Object term328725 = newInstance(Class.forName("java.lang.Object"));
        setIntField(term328718, term328718.getClass(), "size", 0);
        setIntField(term328718, term328718.getClass(), "hash1", 0);
        setIntField(term328718, term328718.getClass(), "hash2", 0);
        setIntField(term328718, term328718.getClass(), "hash3", 0);
        setField(term328718, term328718.getClass(), "key1", null);
        setField(term328718, term328718.getClass(), "key2", null);
        setField(term328718, term328718.getClass(), "key3", null);
        setField(term328718, term328718.getClass(), "value1", null);
        setField(term328718, term328718.getClass(), "value2", null);
        setField(term328718, term328718.getClass(), "value3", null);
        setFloatField(term328719, term328719.getClass(), "loadFactor", 0.75F);
        setIntField(term328719, term328719.getClass(), "size", 3);
        setField(term328721, term328721.getClass(), "next", null);
        setIntField(term328722, term328722.getClass(), "size", 3);
        setIntField(term328722, term328722.getClass(), "hash1", 0);
        setIntField(term328722, term328722.getClass(), "hash2", 0);
        setIntField(term328722, term328722.getClass(), "hash3", 0);
        setField(term328722, term328722.getClass(), "key1", null);
        setField(term328722, term328722.getClass(), "key2", null);
        setField(term328722, term328722.getClass(), "key3", null);
        setField(term328722, term328722.getClass(), "value1", null);
        setField(term328722, term328722.getClass(), "value2", null);
        setField(term328722, term328722.getClass(), "value3", null);
        setField(term328722, term328722.getClass(), "delegateMap", null);
        setField(term328721, term328721.getClass(), "key", term328722);
        setField(term328721, term328721.getClass(), "value", null);
        setElement(term328720, 0, term328721);
        setField(term328724, term328724.getClass(), "next", null);
        setField(term328724, term328724.getClass(), "key", null);
        setField(term328724, term328724.getClass(), "value", null);
        setField(term328723, term328723.getClass(), "next", term328724);
        setField(term328723, term328723.getClass(), "key", term328725);
        setField(term328723, term328723.getClass(), "value", null);
        setElement(term328720, 6, term328723);
        setField(term328719, term328719.getClass(), "data", term328720);
        setIntField(term328719, term328719.getClass(), "threshold", 12);
        setIntField(term328719, term328719.getClass(), "modCount", 3);
        setField(term328719, term328719.getClass(), "entrySet", null);
        setField(term328719, term328719.getClass(), "keySet", null);
        setField(term328719, term328719.getClass(), "values", null);
        setField(term328719, term328719.getClass(), "keySet", null);
        setField(term328719, term328719.getClass(), "values", null);
        setField(term328718, term328718.getClass(), "delegateMap", term328719);
        term328726 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setIntField(term328726, term328726.getClass(), "size", 3);
        setIntField(term328726, term328726.getClass(), "hash1", 0);
        setIntField(term328726, term328726.getClass(), "hash2", 0);
        setIntField(term328726, term328726.getClass(), "hash3", 0);
        setField(term328726, term328726.getClass(), "key1", null);
        setField(term328726, term328726.getClass(), "key2", null);
        setField(term328726, term328726.getClass(), "key3", null);
        setField(term328726, term328726.getClass(), "value1", null);
        setField(term328726, term328726.getClass(), "value2", null);
        setField(term328726, term328726.getClass(), "value3", null);
        setField(term328726, term328726.getClass(), "delegateMap", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.map.Flat3Map");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.Object");
        argTypes[1] = Class.forName("java.lang.Object");
        Object[] args = new Object[2];
        args[0] = term328081;
        args[1] = null;
        Object retValue = callMethod(klass, "put", argTypes, term327805, args);
        assertTrue(recursiveEquals(term327805, term328718));
        assertTrue(recursiveEquals(term328081, term328726));
        assertTrue(recursiveEquals(retValue, null));
    }

};


