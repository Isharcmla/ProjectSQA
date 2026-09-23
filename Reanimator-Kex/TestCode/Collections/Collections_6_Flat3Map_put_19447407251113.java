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

public class Flat3Map_put_19447407251113 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term332390;
     Object term332482;
     Object term332791;
     Object term332798;

    public Flat3Map_put_19447407251113() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term332390 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setField(term332390, term332390.getClass(), "delegateMap", null);
        setIntField(term332390, term332390.getClass(), "size", 3);
        setIntField(term332390, term332390.getClass(), "hash3", 0);
        setField(term332390, term332390.getClass(), "key3", null);
        setIntField(term332390, term332390.getClass(), "hash2", 0);
        setField(term332390, term332390.getClass(), "key2", null);
        setIntField(term332390, term332390.getClass(), "hash1", -1);
        term332482 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term332576 = newInstance(Class.forName("org.apache.commons.collections.map.LinkedMap"));
        setField(term332482, term332482.getClass(), "delegateMap", null);
        setIntField(term332482, term332482.getClass(), "size", 3);
        setIntField(term332482, term332482.getClass(), "hash3", 0);
        setField(term332482, term332482.getClass(), "value3", null);
        setIntField(term332482, term332482.getClass(), "hash2", 0);
        setField(term332482, term332482.getClass(), "value2", null);
        setIntField(term332482, term332482.getClass(), "hash1", 0);
        setIntField(term332576, term332576.getClass(), "size", 0);
        setField(term332482, term332482.getClass(), "value1", term332576);
        term332791 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term332792 = newInstance(Class.forName("org.apache.commons.collections.map.HashedMap"));
        Object[] term332793 = (Object[]) newArray("org.apache.commons.collections.map.AbstractHashedMap$HashEntry", 16);
        Object term332794 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap$HashEntry"));
        Object term332795 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term332796 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap$HashEntry"));
        Object term332797 = newInstance(Class.forName("java.lang.Object"));
        setIntField(term332791, term332791.getClass(), "size", 0);
        setIntField(term332791, term332791.getClass(), "hash1", 0);
        setIntField(term332791, term332791.getClass(), "hash2", 0);
        setIntField(term332791, term332791.getClass(), "hash3", 0);
        setField(term332791, term332791.getClass(), "key1", null);
        setField(term332791, term332791.getClass(), "key2", null);
        setField(term332791, term332791.getClass(), "key3", null);
        setField(term332791, term332791.getClass(), "value1", null);
        setField(term332791, term332791.getClass(), "value2", null);
        setField(term332791, term332791.getClass(), "value3", null);
        setFloatField(term332792, term332792.getClass(), "loadFactor", 0.75F);
        setIntField(term332792, term332792.getClass(), "size", 2);
        setField(term332794, term332794.getClass(), "next", null);
        setIntField(term332795, term332795.getClass(), "size", 3);
        setIntField(term332795, term332795.getClass(), "hash1", 0);
        setIntField(term332795, term332795.getClass(), "hash2", 0);
        setIntField(term332795, term332795.getClass(), "hash3", 0);
        setField(term332795, term332795.getClass(), "key1", null);
        setField(term332795, term332795.getClass(), "key2", null);
        setField(term332795, term332795.getClass(), "key3", null);
        setField(term332795, term332795.getClass(), "value1", null);
        setField(term332795, term332795.getClass(), "value2", null);
        setField(term332795, term332795.getClass(), "value3", null);
        setField(term332795, term332795.getClass(), "delegateMap", null);
        setField(term332794, term332794.getClass(), "key", term332795);
        setField(term332794, term332794.getClass(), "value", null);
        setElement(term332793, 0, term332794);
        setField(term332796, term332796.getClass(), "next", null);
        setField(term332796, term332796.getClass(), "key", term332797);
        setField(term332796, term332796.getClass(), "value", null);
        setElement(term332793, 6, term332796);
        setField(term332792, term332792.getClass(), "data", term332793);
        setIntField(term332792, term332792.getClass(), "threshold", 12);
        setIntField(term332792, term332792.getClass(), "modCount", 2);
        setField(term332792, term332792.getClass(), "entrySet", null);
        setField(term332792, term332792.getClass(), "keySet", null);
        setField(term332792, term332792.getClass(), "values", null);
        setField(term332792, term332792.getClass(), "keySet", null);
        setField(term332792, term332792.getClass(), "values", null);
        setField(term332791, term332791.getClass(), "delegateMap", term332792);
        term332798 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setIntField(term332798, term332798.getClass(), "size", 3);
        setIntField(term332798, term332798.getClass(), "hash1", 0);
        setIntField(term332798, term332798.getClass(), "hash2", 0);
        setIntField(term332798, term332798.getClass(), "hash3", 0);
        setField(term332798, term332798.getClass(), "key1", null);
        setField(term332798, term332798.getClass(), "key2", null);
        setField(term332798, term332798.getClass(), "key3", null);
        setField(term332798, term332798.getClass(), "value1", null);
        setField(term332798, term332798.getClass(), "value2", null);
        setField(term332798, term332798.getClass(), "value3", null);
        setField(term332798, term332798.getClass(), "delegateMap", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.map.Flat3Map");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.Object");
        argTypes[1] = Class.forName("java.lang.Object");
        Object[] args = new Object[2];
        args[0] = term332482;
        args[1] = null;
        Object retValue = callMethod(klass, "put", argTypes, term332390, args);
        assertTrue(recursiveEquals(term332390, term332791));
        assertTrue(recursiveEquals(term332482, term332798));
        assertTrue(recursiveEquals(retValue, null));
    }

};


