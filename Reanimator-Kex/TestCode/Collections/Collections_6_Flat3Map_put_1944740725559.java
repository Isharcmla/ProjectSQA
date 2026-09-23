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

public class Flat3Map_put_1944740725559 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term111695;
     Object term111955;
     Object term112944;
     Object term112955;

    public Flat3Map_put_1944740725559() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term111695 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term111787 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term111825 = newInstance(Class.forName("java.lang.Object"));
        Object term111863 = newInstance(Class.forName("java.lang.Object"));
        setField(term111695, term111695.getClass(), "delegateMap", null);
        setIntField(term111695, term111695.getClass(), "size", 3);
        setIntField(term111695, term111695.getClass(), "hash3", 0);
        setField(term111787, term111787.getClass(), "delegateMap", null);
        setIntField(term111787, term111787.getClass(), "size", 3);
        setField(term111787, term111787.getClass(), "key3", term111825);
        setField(term111787, term111787.getClass(), "key2", null);
        setField(term111787, term111787.getClass(), "value2", null);
        setIntField(term111787, term111787.getClass(), "hash3", -1);
        setIntField(term111787, term111787.getClass(), "hash2", 0);
        setIntField(term111787, term111787.getClass(), "hash1", 0);
        setField(term111787, term111787.getClass(), "key1", term111863);
        setField(term111695, term111695.getClass(), "key3", term111787);
        setIntField(term111695, term111695.getClass(), "hash2", 0);
        setField(term111695, term111695.getClass(), "key2", term111863);
        setIntField(term111695, term111695.getClass(), "hash1", -1);
        term111955 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term112047 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setField(term111955, term111955.getClass(), "delegateMap", null);
        setIntField(term111955, term111955.getClass(), "size", 3);
        setIntField(term111955, term111955.getClass(), "hash3", 0);
        setField(term111955, term111955.getClass(), "value3", null);
        setIntField(term111955, term111955.getClass(), "hash2", 0);
        setField(term111955, term111955.getClass(), "value2", null);
        setIntField(term111955, term111955.getClass(), "hash1", 0);
        setField(term111955, term111955.getClass(), "value1", null);
        setField(term111955, term111955.getClass(), "key3", null);
        setField(term112047, term112047.getClass(), "delegateMap", null);
        setIntField(term112047, term112047.getClass(), "size", 0);
        setField(term111955, term111955.getClass(), "key2", term112047);
        term112944 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term112945 = newInstance(Class.forName("org.apache.commons.collections.map.HashedMap"));
        Object[] term112946 = (Object[]) newArray("org.apache.commons.collections.map.AbstractHashedMap$HashEntry", 16);
        Object term112947 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap$HashEntry"));
        Object term112948 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term112949 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap$HashEntry"));
        Object term112950 = newInstance(Class.forName("java.lang.Object"));
        Object term112951 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap$HashEntry"));
        Object term112952 = newInstance(Class.forName("java.lang.Object"));
        Object term112953 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap$HashEntry"));
        Object term112954 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setIntField(term112944, term112944.getClass(), "size", 0);
        setIntField(term112944, term112944.getClass(), "hash1", 0);
        setIntField(term112944, term112944.getClass(), "hash2", 0);
        setIntField(term112944, term112944.getClass(), "hash3", 0);
        setField(term112944, term112944.getClass(), "key1", null);
        setField(term112944, term112944.getClass(), "key2", null);
        setField(term112944, term112944.getClass(), "key3", null);
        setField(term112944, term112944.getClass(), "value1", null);
        setField(term112944, term112944.getClass(), "value2", null);
        setField(term112944, term112944.getClass(), "value3", null);
        setFloatField(term112945, term112945.getClass(), "loadFactor", 0.75F);
        setIntField(term112945, term112945.getClass(), "size", 4);
        setField(term112947, term112947.getClass(), "next", null);
        setIntField(term112948, term112948.getClass(), "size", 3);
        setIntField(term112948, term112948.getClass(), "hash1", 0);
        setIntField(term112948, term112948.getClass(), "hash2", 0);
        setIntField(term112948, term112948.getClass(), "hash3", 0);
        setField(term112948, term112948.getClass(), "key1", null);
        setField(term112948, term112948.getClass(), "key2", null);
        setField(term112948, term112948.getClass(), "key3", null);
        setField(term112948, term112948.getClass(), "value1", null);
        setField(term112948, term112948.getClass(), "value2", null);
        setField(term112948, term112948.getClass(), "value3", null);
        setField(term112948, term112948.getClass(), "delegateMap", null);
        setField(term112947, term112947.getClass(), "key", term112948);
        setField(term112947, term112947.getClass(), "value", null);
        setElement(term112946, 0, term112947);
        setField(term112949, term112949.getClass(), "next", null);
        setField(term112949, term112949.getClass(), "key", term112950);
        setField(term112949, term112949.getClass(), "value", null);
        setElement(term112946, 4, term112949);
        setField(term112951, term112951.getClass(), "next", null);
        setField(term112951, term112951.getClass(), "key", term112952);
        setField(term112951, term112951.getClass(), "value", null);
        setElement(term112946, 5, term112951);
        setField(term112953, term112953.getClass(), "next", null);
        setIntField(term112954, term112954.getClass(), "size", 3);
        setIntField(term112954, term112954.getClass(), "hash1", 0);
        setIntField(term112954, term112954.getClass(), "hash2", 0);
        setIntField(term112954, term112954.getClass(), "hash3", -1);
        setField(term112954, term112954.getClass(), "key1", term112950);
        setField(term112954, term112954.getClass(), "key2", null);
        setField(term112954, term112954.getClass(), "key3", null);
        setField(term112954, term112954.getClass(), "value1", null);
        setField(term112954, term112954.getClass(), "value2", null);
        setField(term112954, term112954.getClass(), "value3", null);
        setField(term112954, term112954.getClass(), "delegateMap", null);
        setField(term112953, term112953.getClass(), "key", term112954);
        setField(term112953, term112953.getClass(), "value", null);
        setElement(term112946, 6, term112953);
        setField(term112945, term112945.getClass(), "data", term112946);
        setIntField(term112945, term112945.getClass(), "threshold", 12);
        setIntField(term112945, term112945.getClass(), "modCount", 4);
        setField(term112945, term112945.getClass(), "entrySet", null);
        setField(term112945, term112945.getClass(), "keySet", null);
        setField(term112945, term112945.getClass(), "values", null);
        setField(term112945, term112945.getClass(), "keySet", null);
        setField(term112945, term112945.getClass(), "values", null);
        setField(term112944, term112944.getClass(), "delegateMap", term112945);
        term112955 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setIntField(term112955, term112955.getClass(), "size", 3);
        setIntField(term112955, term112955.getClass(), "hash1", 0);
        setIntField(term112955, term112955.getClass(), "hash2", 0);
        setIntField(term112955, term112955.getClass(), "hash3", 0);
        setField(term112955, term112955.getClass(), "key1", null);
        setField(term112955, term112955.getClass(), "key2", null);
        setField(term112955, term112955.getClass(), "key3", null);
        setField(term112955, term112955.getClass(), "value1", null);
        setField(term112955, term112955.getClass(), "value2", null);
        setField(term112955, term112955.getClass(), "value3", null);
        setField(term112955, term112955.getClass(), "delegateMap", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.map.Flat3Map");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.Object");
        argTypes[1] = Class.forName("java.lang.Object");
        Object[] args = new Object[2];
        args[0] = term111955;
        args[1] = null;
        Object retValue = callMethod(klass, "put", argTypes, term111695, args);
        assertTrue(recursiveEquals(term111695, term112944));
        assertTrue(recursiveEquals(term111955, term112955));
        assertTrue(recursiveEquals(retValue, null));
    }

};


