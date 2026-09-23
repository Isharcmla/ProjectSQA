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

public class Flat3Map_put_19447407251081 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term315862;
     Object term316084;
     Object term316291;
     Object term316296;

    public Flat3Map_put_19447407251081() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term315862 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term315954 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term315992 = newInstance(Class.forName("java.lang.Object"));
        setField(term315862, term315862.getClass(), "delegateMap", null);
        setIntField(term315862, term315862.getClass(), "size", 2);
        setIntField(term315862, term315862.getClass(), "hash2", 0);
        setField(term315862, term315862.getClass(), "key2", null);
        setIntField(term315862, term315862.getClass(), "hash1", 0);
        setField(term315954, term315954.getClass(), "delegateMap", null);
        setIntField(term315954, term315954.getClass(), "size", 2);
        setField(term315954, term315954.getClass(), "key2", null);
        setField(term315954, term315954.getClass(), "value2", term315992);
        setField(term315862, term315862.getClass(), "key1", term315954);
        term316084 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term316194 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap"));
        setField(term316084, term316084.getClass(), "delegateMap", null);
        setIntField(term316084, term316084.getClass(), "size", 2);
        setIntField(term316084, term316084.getClass(), "hash2", 0);
        setField(term316084, term316084.getClass(), "value2", null);
        setIntField(term316084, term316084.getClass(), "hash1", 0);
        setIntField(term316194, term316194.getClass(), "size", 0);
        setField(term316084, term316084.getClass(), "value1", term316194);
        setField(term316084, term316084.getClass(), "key2", null);
        term316291 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term316292 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term316293 = newInstance(Class.forName("java.lang.Object"));
        Object term316294 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term316295 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap"));
        setIntField(term316291, term316291.getClass(), "size", 3);
        setIntField(term316291, term316291.getClass(), "hash1", 0);
        setIntField(term316291, term316291.getClass(), "hash2", 0);
        setIntField(term316291, term316291.getClass(), "hash3", 0);
        setIntField(term316292, term316292.getClass(), "size", 2);
        setIntField(term316292, term316292.getClass(), "hash1", 0);
        setIntField(term316292, term316292.getClass(), "hash2", 0);
        setIntField(term316292, term316292.getClass(), "hash3", 0);
        setField(term316292, term316292.getClass(), "key1", null);
        setField(term316292, term316292.getClass(), "key2", null);
        setField(term316292, term316292.getClass(), "key3", null);
        setField(term316292, term316292.getClass(), "value1", null);
        setField(term316292, term316292.getClass(), "value2", term316293);
        setField(term316292, term316292.getClass(), "value3", null);
        setField(term316292, term316292.getClass(), "delegateMap", null);
        setField(term316291, term316291.getClass(), "key1", term316292);
        setField(term316291, term316291.getClass(), "key2", null);
        setIntField(term316294, term316294.getClass(), "size", 2);
        setIntField(term316294, term316294.getClass(), "hash1", 0);
        setIntField(term316294, term316294.getClass(), "hash2", 0);
        setIntField(term316294, term316294.getClass(), "hash3", 0);
        setField(term316294, term316294.getClass(), "key1", null);
        setField(term316294, term316294.getClass(), "key2", null);
        setField(term316294, term316294.getClass(), "key3", null);
        setFloatField(term316295, term316295.getClass(), "loadFactor", 0.0F);
        setIntField(term316295, term316295.getClass(), "size", 0);
        setField(term316295, term316295.getClass(), "data", null);
        setIntField(term316295, term316295.getClass(), "threshold", 0);
        setIntField(term316295, term316295.getClass(), "modCount", 0);
        setField(term316295, term316295.getClass(), "entrySet", null);
        setField(term316295, term316295.getClass(), "keySet", null);
        setField(term316295, term316295.getClass(), "values", null);
        setField(term316295, term316295.getClass(), "keySet", null);
        setField(term316295, term316295.getClass(), "values", null);
        setField(term316294, term316294.getClass(), "value1", term316295);
        setField(term316294, term316294.getClass(), "value2", null);
        setField(term316294, term316294.getClass(), "value3", null);
        setField(term316294, term316294.getClass(), "delegateMap", null);
        setField(term316291, term316291.getClass(), "key3", term316294);
        setField(term316291, term316291.getClass(), "value1", null);
        setField(term316291, term316291.getClass(), "value2", null);
        setField(term316291, term316291.getClass(), "value3", null);
        setField(term316291, term316291.getClass(), "delegateMap", null);
        term316296 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term316297 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap"));
        setIntField(term316296, term316296.getClass(), "size", 2);
        setIntField(term316296, term316296.getClass(), "hash1", 0);
        setIntField(term316296, term316296.getClass(), "hash2", 0);
        setIntField(term316296, term316296.getClass(), "hash3", 0);
        setField(term316296, term316296.getClass(), "key1", null);
        setField(term316296, term316296.getClass(), "key2", null);
        setField(term316296, term316296.getClass(), "key3", null);
        setFloatField(term316297, term316297.getClass(), "loadFactor", 0.0F);
        setIntField(term316297, term316297.getClass(), "size", 0);
        setField(term316297, term316297.getClass(), "data", null);
        setIntField(term316297, term316297.getClass(), "threshold", 0);
        setIntField(term316297, term316297.getClass(), "modCount", 0);
        setField(term316297, term316297.getClass(), "entrySet", null);
        setField(term316297, term316297.getClass(), "keySet", null);
        setField(term316297, term316297.getClass(), "values", null);
        setField(term316297, term316297.getClass(), "keySet", null);
        setField(term316297, term316297.getClass(), "values", null);
        setField(term316296, term316296.getClass(), "value1", term316297);
        setField(term316296, term316296.getClass(), "value2", null);
        setField(term316296, term316296.getClass(), "value3", null);
        setField(term316296, term316296.getClass(), "delegateMap", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.map.Flat3Map");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.Object");
        argTypes[1] = Class.forName("java.lang.Object");
        Object[] args = new Object[2];
        args[0] = term316084;
        args[1] = null;
        Object retValue = callMethod(klass, "put", argTypes, term315862, args);
        assertTrue(recursiveEquals(term315862, term316291));
        assertTrue(recursiveEquals(term316084, term316296));
        assertTrue(recursiveEquals(retValue, null));
    }

};


