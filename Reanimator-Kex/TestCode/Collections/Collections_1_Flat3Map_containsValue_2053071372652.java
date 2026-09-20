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

public class Flat3Map_containsValue_2053071372652 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term127419;
     Object term127887;
     Object term127890;

    public Flat3Map_containsValue_2053071372652() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term127419 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term127465 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term127520 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap"));
        setField(term127419, term127419.getClass(), "delegateMap", null);
        setIntField(term127419, term127419.getClass(), "size", 0);
        setField(term127465, term127465.getClass(), "delegateMap", term127520);
        setField(term127419, term127419.getClass(), "value1", term127465);
        term127887 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term127888 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term127889 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap"));
        setIntField(term127887, term127887.getClass(), "size", 0);
        setIntField(term127887, term127887.getClass(), "hash1", 0);
        setIntField(term127887, term127887.getClass(), "hash2", 0);
        setIntField(term127887, term127887.getClass(), "hash3", 0);
        setField(term127887, term127887.getClass(), "key1", null);
        setField(term127887, term127887.getClass(), "key2", null);
        setField(term127887, term127887.getClass(), "key3", null);
        setIntField(term127888, term127888.getClass(), "size", 0);
        setIntField(term127888, term127888.getClass(), "hash1", 0);
        setIntField(term127888, term127888.getClass(), "hash2", 0);
        setIntField(term127888, term127888.getClass(), "hash3", 0);
        setField(term127888, term127888.getClass(), "key1", null);
        setField(term127888, term127888.getClass(), "key2", null);
        setField(term127888, term127888.getClass(), "key3", null);
        setField(term127888, term127888.getClass(), "value1", null);
        setField(term127888, term127888.getClass(), "value2", null);
        setField(term127888, term127888.getClass(), "value3", null);
        setFloatField(term127889, term127889.getClass(), "loadFactor", 0.0F);
        setIntField(term127889, term127889.getClass(), "size", 0);
        setField(term127889, term127889.getClass(), "data", null);
        setIntField(term127889, term127889.getClass(), "threshold", 0);
        setIntField(term127889, term127889.getClass(), "modCount", 0);
        setField(term127889, term127889.getClass(), "entrySet", null);
        setField(term127889, term127889.getClass(), "keySet", null);
        setField(term127889, term127889.getClass(), "values", null);
        setField(term127889, term127889.getClass(), "keySet", null);
        setField(term127889, term127889.getClass(), "values", null);
        setField(term127888, term127888.getClass(), "delegateMap", term127889);
        setField(term127887, term127887.getClass(), "value1", term127888);
        setField(term127887, term127887.getClass(), "value2", null);
        setField(term127887, term127887.getClass(), "value3", null);
        setField(term127887, term127887.getClass(), "delegateMap", null);
        term127890 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term127891 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term127892 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap"));
        setIntField(term127890, term127890.getClass(), "size", 0);
        setIntField(term127890, term127890.getClass(), "hash1", 0);
        setIntField(term127890, term127890.getClass(), "hash2", 0);
        setIntField(term127890, term127890.getClass(), "hash3", 0);
        setField(term127890, term127890.getClass(), "key1", null);
        setField(term127890, term127890.getClass(), "key2", null);
        setField(term127890, term127890.getClass(), "key3", null);
        setIntField(term127891, term127891.getClass(), "size", 0);
        setIntField(term127891, term127891.getClass(), "hash1", 0);
        setIntField(term127891, term127891.getClass(), "hash2", 0);
        setIntField(term127891, term127891.getClass(), "hash3", 0);
        setField(term127891, term127891.getClass(), "key1", null);
        setField(term127891, term127891.getClass(), "key2", null);
        setField(term127891, term127891.getClass(), "key3", null);
        setField(term127891, term127891.getClass(), "value1", null);
        setField(term127891, term127891.getClass(), "value2", null);
        setField(term127891, term127891.getClass(), "value3", null);
        setFloatField(term127892, term127892.getClass(), "loadFactor", 0.0F);
        setIntField(term127892, term127892.getClass(), "size", 0);
        setField(term127892, term127892.getClass(), "data", null);
        setIntField(term127892, term127892.getClass(), "threshold", 0);
        setIntField(term127892, term127892.getClass(), "modCount", 0);
        setField(term127892, term127892.getClass(), "entrySet", null);
        setField(term127892, term127892.getClass(), "keySet", null);
        setField(term127892, term127892.getClass(), "values", null);
        setField(term127892, term127892.getClass(), "keySet", null);
        setField(term127892, term127892.getClass(), "values", null);
        setField(term127891, term127891.getClass(), "delegateMap", term127892);
        setField(term127890, term127890.getClass(), "value1", term127891);
        setField(term127890, term127890.getClass(), "value2", null);
        setField(term127890, term127890.getClass(), "value3", null);
        setField(term127890, term127890.getClass(), "delegateMap", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.map.Flat3Map");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term127419;
        callMethod(klass, "containsValue", argTypes, term127419, args);
        assertTrue(recursiveEquals(term127419, term127887));
        assertTrue(recursiveEquals(term127419, term127890));
    }

};
