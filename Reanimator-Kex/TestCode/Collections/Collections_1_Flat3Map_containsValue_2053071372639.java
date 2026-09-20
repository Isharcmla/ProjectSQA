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

public class Flat3Map_containsValue_2053071372639 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term124785;
     Object term124905;
     Object term124908;

    public Flat3Map_containsValue_2053071372639() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term124785 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term124831 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term124886 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap"));
        setField(term124785, term124785.getClass(), "delegateMap", null);
        setIntField(term124785, term124785.getClass(), "size", 0);
        setField(term124831, term124831.getClass(), "delegateMap", term124886);
        setField(term124785, term124785.getClass(), "value3", term124831);
        term124905 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term124906 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term124907 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap"));
        setIntField(term124905, term124905.getClass(), "size", 0);
        setIntField(term124905, term124905.getClass(), "hash1", 0);
        setIntField(term124905, term124905.getClass(), "hash2", 0);
        setIntField(term124905, term124905.getClass(), "hash3", 0);
        setField(term124905, term124905.getClass(), "key1", null);
        setField(term124905, term124905.getClass(), "key2", null);
        setField(term124905, term124905.getClass(), "key3", null);
        setField(term124905, term124905.getClass(), "value1", null);
        setField(term124905, term124905.getClass(), "value2", null);
        setIntField(term124906, term124906.getClass(), "size", 0);
        setIntField(term124906, term124906.getClass(), "hash1", 0);
        setIntField(term124906, term124906.getClass(), "hash2", 0);
        setIntField(term124906, term124906.getClass(), "hash3", 0);
        setField(term124906, term124906.getClass(), "key1", null);
        setField(term124906, term124906.getClass(), "key2", null);
        setField(term124906, term124906.getClass(), "key3", null);
        setField(term124906, term124906.getClass(), "value1", null);
        setField(term124906, term124906.getClass(), "value2", null);
        setField(term124906, term124906.getClass(), "value3", null);
        setFloatField(term124907, term124907.getClass(), "loadFactor", 0.0F);
        setIntField(term124907, term124907.getClass(), "size", 0);
        setField(term124907, term124907.getClass(), "data", null);
        setIntField(term124907, term124907.getClass(), "threshold", 0);
        setIntField(term124907, term124907.getClass(), "modCount", 0);
        setField(term124907, term124907.getClass(), "entrySet", null);
        setField(term124907, term124907.getClass(), "keySet", null);
        setField(term124907, term124907.getClass(), "values", null);
        setField(term124907, term124907.getClass(), "keySet", null);
        setField(term124907, term124907.getClass(), "values", null);
        setField(term124906, term124906.getClass(), "delegateMap", term124907);
        setField(term124905, term124905.getClass(), "value3", term124906);
        setField(term124905, term124905.getClass(), "delegateMap", null);
        term124908 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term124909 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term124910 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap"));
        setIntField(term124908, term124908.getClass(), "size", 0);
        setIntField(term124908, term124908.getClass(), "hash1", 0);
        setIntField(term124908, term124908.getClass(), "hash2", 0);
        setIntField(term124908, term124908.getClass(), "hash3", 0);
        setField(term124908, term124908.getClass(), "key1", null);
        setField(term124908, term124908.getClass(), "key2", null);
        setField(term124908, term124908.getClass(), "key3", null);
        setField(term124908, term124908.getClass(), "value1", null);
        setField(term124908, term124908.getClass(), "value2", null);
        setIntField(term124909, term124909.getClass(), "size", 0);
        setIntField(term124909, term124909.getClass(), "hash1", 0);
        setIntField(term124909, term124909.getClass(), "hash2", 0);
        setIntField(term124909, term124909.getClass(), "hash3", 0);
        setField(term124909, term124909.getClass(), "key1", null);
        setField(term124909, term124909.getClass(), "key2", null);
        setField(term124909, term124909.getClass(), "key3", null);
        setField(term124909, term124909.getClass(), "value1", null);
        setField(term124909, term124909.getClass(), "value2", null);
        setField(term124909, term124909.getClass(), "value3", null);
        setFloatField(term124910, term124910.getClass(), "loadFactor", 0.0F);
        setIntField(term124910, term124910.getClass(), "size", 0);
        setField(term124910, term124910.getClass(), "data", null);
        setIntField(term124910, term124910.getClass(), "threshold", 0);
        setIntField(term124910, term124910.getClass(), "modCount", 0);
        setField(term124910, term124910.getClass(), "entrySet", null);
        setField(term124910, term124910.getClass(), "keySet", null);
        setField(term124910, term124910.getClass(), "values", null);
        setField(term124910, term124910.getClass(), "keySet", null);
        setField(term124910, term124910.getClass(), "values", null);
        setField(term124909, term124909.getClass(), "delegateMap", term124910);
        setField(term124908, term124908.getClass(), "value3", term124909);
        setField(term124908, term124908.getClass(), "delegateMap", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.map.Flat3Map");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term124785;
        callMethod(klass, "containsValue", argTypes, term124785, args);
        assertTrue(recursiveEquals(term124785, term124905));
        assertTrue(recursiveEquals(term124785, term124908));
    }

};
