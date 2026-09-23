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

public class Flat3Map_put_19447407251111 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term331915;
     Object term332045;
     Object term332217;
     Object term332221;

    public Flat3Map_put_19447407251111() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term331915 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term331953 = newInstance(Class.forName("java.lang.Object"));
        setField(term331915, term331915.getClass(), "delegateMap", null);
        setIntField(term331915, term331915.getClass(), "size", 2);
        setIntField(term331915, term331915.getClass(), "hash2", -1);
        setIntField(term331915, term331915.getClass(), "hash1", 0);
        setField(term331915, term331915.getClass(), "key1", term331953);
        setField(term331915, term331915.getClass(), "key2", term331953);
        term332045 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term332155 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap"));
        setField(term332045, term332045.getClass(), "delegateMap", null);
        setIntField(term332045, term332045.getClass(), "size", 2);
        setIntField(term332045, term332045.getClass(), "hash2", 0);
        setField(term332045, term332045.getClass(), "value2", null);
        setIntField(term332045, term332045.getClass(), "hash1", 0);
        setIntField(term332155, term332155.getClass(), "size", 0);
        setField(term332045, term332045.getClass(), "value1", term332155);
        setField(term332045, term332045.getClass(), "key2", null);
        term332217 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term332218 = newInstance(Class.forName("java.lang.Object"));
        Object term332219 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term332220 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap"));
        setIntField(term332217, term332217.getClass(), "size", 3);
        setIntField(term332217, term332217.getClass(), "hash1", 0);
        setIntField(term332217, term332217.getClass(), "hash2", -1);
        setIntField(term332217, term332217.getClass(), "hash3", 0);
        setField(term332217, term332217.getClass(), "key1", term332218);
        setField(term332217, term332217.getClass(), "key2", term332218);
        setIntField(term332219, term332219.getClass(), "size", 2);
        setIntField(term332219, term332219.getClass(), "hash1", 0);
        setIntField(term332219, term332219.getClass(), "hash2", 0);
        setIntField(term332219, term332219.getClass(), "hash3", 0);
        setField(term332219, term332219.getClass(), "key1", null);
        setField(term332219, term332219.getClass(), "key2", null);
        setField(term332219, term332219.getClass(), "key3", null);
        setFloatField(term332220, term332220.getClass(), "loadFactor", 0.0F);
        setIntField(term332220, term332220.getClass(), "size", 0);
        setField(term332220, term332220.getClass(), "data", null);
        setIntField(term332220, term332220.getClass(), "threshold", 0);
        setIntField(term332220, term332220.getClass(), "modCount", 0);
        setField(term332220, term332220.getClass(), "entrySet", null);
        setField(term332220, term332220.getClass(), "keySet", null);
        setField(term332220, term332220.getClass(), "values", null);
        setField(term332220, term332220.getClass(), "keySet", null);
        setField(term332220, term332220.getClass(), "values", null);
        setField(term332219, term332219.getClass(), "value1", term332220);
        setField(term332219, term332219.getClass(), "value2", null);
        setField(term332219, term332219.getClass(), "value3", null);
        setField(term332219, term332219.getClass(), "delegateMap", null);
        setField(term332217, term332217.getClass(), "key3", term332219);
        setField(term332217, term332217.getClass(), "value1", null);
        setField(term332217, term332217.getClass(), "value2", null);
        setField(term332217, term332217.getClass(), "value3", null);
        setField(term332217, term332217.getClass(), "delegateMap", null);
        term332221 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term332222 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap"));
        setIntField(term332221, term332221.getClass(), "size", 2);
        setIntField(term332221, term332221.getClass(), "hash1", 0);
        setIntField(term332221, term332221.getClass(), "hash2", 0);
        setIntField(term332221, term332221.getClass(), "hash3", 0);
        setField(term332221, term332221.getClass(), "key1", null);
        setField(term332221, term332221.getClass(), "key2", null);
        setField(term332221, term332221.getClass(), "key3", null);
        setFloatField(term332222, term332222.getClass(), "loadFactor", 0.0F);
        setIntField(term332222, term332222.getClass(), "size", 0);
        setField(term332222, term332222.getClass(), "data", null);
        setIntField(term332222, term332222.getClass(), "threshold", 0);
        setIntField(term332222, term332222.getClass(), "modCount", 0);
        setField(term332222, term332222.getClass(), "entrySet", null);
        setField(term332222, term332222.getClass(), "keySet", null);
        setField(term332222, term332222.getClass(), "values", null);
        setField(term332222, term332222.getClass(), "keySet", null);
        setField(term332222, term332222.getClass(), "values", null);
        setField(term332221, term332221.getClass(), "value1", term332222);
        setField(term332221, term332221.getClass(), "value2", null);
        setField(term332221, term332221.getClass(), "value3", null);
        setField(term332221, term332221.getClass(), "delegateMap", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.map.Flat3Map");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.Object");
        argTypes[1] = Class.forName("java.lang.Object");
        Object[] args = new Object[2];
        args[0] = term332045;
        args[1] = null;
        Object retValue = callMethod(klass, "put", argTypes, term331915, args);
        assertTrue(recursiveEquals(term331915, term332217));
        assertTrue(recursiveEquals(term332045, term332221));
        assertTrue(recursiveEquals(retValue, null));
    }

};


