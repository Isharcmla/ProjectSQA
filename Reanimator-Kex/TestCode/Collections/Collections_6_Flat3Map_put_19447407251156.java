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

public class Flat3Map_put_19447407251156 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term352915;
     Object term354942;
     Object term354949;

    public Flat3Map_put_19447407251156() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term352915 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term352961 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term353008 = newInstance(Class.forName("org.apache.commons.collections.map.LinkedMap"));
        setField(term352915, term352915.getClass(), "delegateMap", null);
        setIntField(term352915, term352915.getClass(), "size", 3);
        setIntField(term352915, term352915.getClass(), "hash3", 0);
        setField(term352915, term352915.getClass(), "value3", null);
        setIntField(term352915, term352915.getClass(), "hash2", 0);
        setField(term352915, term352915.getClass(), "value2", null);
        setIntField(term352915, term352915.getClass(), "hash1", 0);
        setField(term352915, term352915.getClass(), "value1", null);
        setField(term352961, term352961.getClass(), "delegateMap", term353008);
        setField(term352915, term352915.getClass(), "key3", term352961);
        term354942 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term354943 = newInstance(Class.forName("org.apache.commons.collections.map.HashedMap"));
        Object[] term354944 = (Object[]) newArray("org.apache.commons.collections.map.AbstractHashedMap$HashEntry", 16);
        Object term354945 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap$HashEntry"));
        Object term354946 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap$HashEntry"));
        Object term354947 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap$HashEntry"));
        Object term354948 = newInstance(Class.forName("java.lang.Object"));
        setIntField(term354942, term354942.getClass(), "size", 0);
        setIntField(term354942, term354942.getClass(), "hash1", 0);
        setIntField(term354942, term354942.getClass(), "hash2", 0);
        setIntField(term354942, term354942.getClass(), "hash3", 0);
        setField(term354942, term354942.getClass(), "key1", null);
        setField(term354942, term354942.getClass(), "key2", null);
        setField(term354942, term354942.getClass(), "key3", null);
        setField(term354942, term354942.getClass(), "value1", null);
        setField(term354942, term354942.getClass(), "value2", null);
        setField(term354942, term354942.getClass(), "value3", null);
        setFloatField(term354943, term354943.getClass(), "loadFactor", 0.75F);
        setIntField(term354943, term354943.getClass(), "size", 3);
        setField(term354946, term354946.getClass(), "next", null);
        setField(term354946, term354946.getClass(), "key", null);
        setField(term354946, term354946.getClass(), "value", null);
        setField(term354945, term354945.getClass(), "next", term354946);
        setField(term354945, term354945.getClass(), "key", term354942);
        setField(term354945, term354945.getClass(), "value", null);
        setElement(term354944, 0, term354945);
        setField(term354947, term354947.getClass(), "next", null);
        setField(term354947, term354947.getClass(), "key", term354948);
        setField(term354947, term354947.getClass(), "value", null);
        setElement(term354944, 6, term354947);
        setField(term354943, term354943.getClass(), "data", term354944);
        setIntField(term354943, term354943.getClass(), "threshold", 12);
        setIntField(term354943, term354943.getClass(), "modCount", 3);
        setField(term354943, term354943.getClass(), "entrySet", null);
        setField(term354943, term354943.getClass(), "keySet", null);
        setField(term354943, term354943.getClass(), "values", null);
        setField(term354943, term354943.getClass(), "keySet", null);
        setField(term354943, term354943.getClass(), "values", null);
        setField(term354942, term354942.getClass(), "delegateMap", term354943);
        term354949 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term354950 = newInstance(Class.forName("org.apache.commons.collections.map.HashedMap"));
        Object[] term354951 = (Object[]) newArray("org.apache.commons.collections.map.AbstractHashedMap$HashEntry", 16);
        Object term354952 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap$HashEntry"));
        Object term354953 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap$HashEntry"));
        Object term354954 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap$HashEntry"));
        Object term354955 = newInstance(Class.forName("java.lang.Object"));
        setIntField(term354949, term354949.getClass(), "size", 0);
        setIntField(term354949, term354949.getClass(), "hash1", 0);
        setIntField(term354949, term354949.getClass(), "hash2", 0);
        setIntField(term354949, term354949.getClass(), "hash3", 0);
        setField(term354949, term354949.getClass(), "key1", null);
        setField(term354949, term354949.getClass(), "key2", null);
        setField(term354949, term354949.getClass(), "key3", null);
        setField(term354949, term354949.getClass(), "value1", null);
        setField(term354949, term354949.getClass(), "value2", null);
        setField(term354949, term354949.getClass(), "value3", null);
        setFloatField(term354950, term354950.getClass(), "loadFactor", 0.75F);
        setIntField(term354950, term354950.getClass(), "size", 3);
        setField(term354953, term354953.getClass(), "next", null);
        setField(term354953, term354953.getClass(), "key", null);
        setField(term354953, term354953.getClass(), "value", null);
        setField(term354952, term354952.getClass(), "next", term354953);
        setField(term354952, term354952.getClass(), "key", term354949);
        setField(term354952, term354952.getClass(), "value", null);
        setElement(term354951, 0, term354952);
        setField(term354954, term354954.getClass(), "next", null);
        setField(term354954, term354954.getClass(), "key", term354955);
        setField(term354954, term354954.getClass(), "value", null);
        setElement(term354951, 6, term354954);
        setField(term354950, term354950.getClass(), "data", term354951);
        setIntField(term354950, term354950.getClass(), "threshold", 12);
        setIntField(term354950, term354950.getClass(), "modCount", 3);
        setField(term354950, term354950.getClass(), "entrySet", null);
        setField(term354950, term354950.getClass(), "keySet", null);
        setField(term354950, term354950.getClass(), "values", null);
        setField(term354950, term354950.getClass(), "keySet", null);
        setField(term354950, term354950.getClass(), "values", null);
        setField(term354949, term354949.getClass(), "delegateMap", term354950);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.map.Flat3Map");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.Object");
        argTypes[1] = Class.forName("java.lang.Object");
        Object[] args = new Object[2];
        args[0] = term352915;
        args[1] = null;
        Object retValue = callMethod(klass, "put", argTypes, term352915, args);
        assertTrue(recursiveEquals(term352915, term354942));
        assertTrue(recursiveEquals(term352915, term354949));
        assertTrue(recursiveEquals(retValue, null));
    }

};


