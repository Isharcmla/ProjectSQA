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

public class Flat3Map_put_1944740725301 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term49748;
     Object term50945;
     Object term50952;

    public Flat3Map_put_1944740725301() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term49748 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term49794 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term49849 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap"));
        setField(term49748, term49748.getClass(), "delegateMap", null);
        setIntField(term49748, term49748.getClass(), "size", 3);
        setIntField(term49748, term49748.getClass(), "hash3", 0);
        setField(term49748, term49748.getClass(), "value3", null);
        setIntField(term49748, term49748.getClass(), "hash2", 0);
        setField(term49748, term49748.getClass(), "value2", null);
        setIntField(term49748, term49748.getClass(), "hash1", 0);
        setField(term49748, term49748.getClass(), "value1", null);
        setField(term49794, term49794.getClass(), "delegateMap", term49849);
        setField(term49748, term49748.getClass(), "key3", term49794);
        term50945 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term50946 = newInstance(Class.forName("org.apache.commons.collections.map.HashedMap"));
        Object[] term50947 = (Object[]) newArray("org.apache.commons.collections.map.AbstractHashedMap$HashEntry", 16);
        Object term50948 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap$HashEntry"));
        Object term50949 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap$HashEntry"));
        Object term50950 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap$HashEntry"));
        Object term50951 = newInstance(Class.forName("java.lang.Object"));
        setIntField(term50945, term50945.getClass(), "size", 0);
        setIntField(term50945, term50945.getClass(), "hash1", 0);
        setIntField(term50945, term50945.getClass(), "hash2", 0);
        setIntField(term50945, term50945.getClass(), "hash3", 0);
        setField(term50945, term50945.getClass(), "key1", null);
        setField(term50945, term50945.getClass(), "key2", null);
        setField(term50945, term50945.getClass(), "key3", null);
        setField(term50945, term50945.getClass(), "value1", null);
        setField(term50945, term50945.getClass(), "value2", null);
        setField(term50945, term50945.getClass(), "value3", null);
        setFloatField(term50946, term50946.getClass(), "loadFactor", 0.75F);
        setIntField(term50946, term50946.getClass(), "size", 3);
        setField(term50949, term50949.getClass(), "next", null);
        setField(term50949, term50949.getClass(), "key", null);
        setField(term50949, term50949.getClass(), "value", null);
        setField(term50948, term50948.getClass(), "next", term50949);
        setField(term50948, term50948.getClass(), "key", term50945);
        setField(term50948, term50948.getClass(), "value", null);
        setElement(term50947, 0, term50948);
        setField(term50950, term50950.getClass(), "next", null);
        setField(term50950, term50950.getClass(), "key", term50951);
        setField(term50950, term50950.getClass(), "value", null);
        setElement(term50947, 5, term50950);
        setField(term50946, term50946.getClass(), "data", term50947);
        setIntField(term50946, term50946.getClass(), "threshold", 12);
        setIntField(term50946, term50946.getClass(), "modCount", 3);
        setField(term50946, term50946.getClass(), "entrySet", null);
        setField(term50946, term50946.getClass(), "keySet", null);
        setField(term50946, term50946.getClass(), "values", null);
        setField(term50946, term50946.getClass(), "keySet", null);
        setField(term50946, term50946.getClass(), "values", null);
        setField(term50945, term50945.getClass(), "delegateMap", term50946);
        term50952 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term50953 = newInstance(Class.forName("org.apache.commons.collections.map.HashedMap"));
        Object[] term50954 = (Object[]) newArray("org.apache.commons.collections.map.AbstractHashedMap$HashEntry", 16);
        Object term50955 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap$HashEntry"));
        Object term50956 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap$HashEntry"));
        Object term50957 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap$HashEntry"));
        Object term50958 = newInstance(Class.forName("java.lang.Object"));
        setIntField(term50952, term50952.getClass(), "size", 0);
        setIntField(term50952, term50952.getClass(), "hash1", 0);
        setIntField(term50952, term50952.getClass(), "hash2", 0);
        setIntField(term50952, term50952.getClass(), "hash3", 0);
        setField(term50952, term50952.getClass(), "key1", null);
        setField(term50952, term50952.getClass(), "key2", null);
        setField(term50952, term50952.getClass(), "key3", null);
        setField(term50952, term50952.getClass(), "value1", null);
        setField(term50952, term50952.getClass(), "value2", null);
        setField(term50952, term50952.getClass(), "value3", null);
        setFloatField(term50953, term50953.getClass(), "loadFactor", 0.75F);
        setIntField(term50953, term50953.getClass(), "size", 3);
        setField(term50956, term50956.getClass(), "next", null);
        setField(term50956, term50956.getClass(), "key", null);
        setField(term50956, term50956.getClass(), "value", null);
        setField(term50955, term50955.getClass(), "next", term50956);
        setField(term50955, term50955.getClass(), "key", term50952);
        setField(term50955, term50955.getClass(), "value", null);
        setElement(term50954, 0, term50955);
        setField(term50957, term50957.getClass(), "next", null);
        setField(term50957, term50957.getClass(), "key", term50958);
        setField(term50957, term50957.getClass(), "value", null);
        setElement(term50954, 5, term50957);
        setField(term50953, term50953.getClass(), "data", term50954);
        setIntField(term50953, term50953.getClass(), "threshold", 12);
        setIntField(term50953, term50953.getClass(), "modCount", 3);
        setField(term50953, term50953.getClass(), "entrySet", null);
        setField(term50953, term50953.getClass(), "keySet", null);
        setField(term50953, term50953.getClass(), "values", null);
        setField(term50953, term50953.getClass(), "keySet", null);
        setField(term50953, term50953.getClass(), "values", null);
        setField(term50952, term50952.getClass(), "delegateMap", term50953);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.map.Flat3Map");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.Object");
        argTypes[1] = Class.forName("java.lang.Object");
        Object[] args = new Object[2];
        args[0] = term49748;
        args[1] = null;
        Object retValue = callMethod(klass, "put", argTypes, term49748, args);
        assertTrue(recursiveEquals(term49748, term50945));
        assertTrue(recursiveEquals(term49748, term50952));
        assertTrue(recursiveEquals(retValue, null));
    }

};


