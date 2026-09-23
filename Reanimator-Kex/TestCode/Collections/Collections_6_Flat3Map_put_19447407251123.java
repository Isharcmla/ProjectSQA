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

public class Flat3Map_put_19447407251123 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term336096;
     Object term336428;
     Object term336957;
     Object term336966;

    public Flat3Map_put_19447407251123() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term336096 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term336188 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term336298 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap"));
        Object term336336 = newInstance(Class.forName("java.lang.Object"));
        setField(term336096, term336096.getClass(), "delegateMap", null);
        setIntField(term336096, term336096.getClass(), "size", 3);
        setIntField(term336096, term336096.getClass(), "hash3", 1435037696);
        setField(term336188, term336188.getClass(), "delegateMap", null);
        setIntField(term336188, term336188.getClass(), "size", 3);
        setField(term336188, term336188.getClass(), "key3", term336298);
        setField(term336188, term336188.getClass(), "key2", null);
        setField(term336188, term336188.getClass(), "value2", null);
        setIntField(term336188, term336188.getClass(), "hash3", 540020384);
        setIntField(term336188, term336188.getClass(), "hash2", 1818888868);
        setIntField(term336188, term336188.getClass(), "hash1", 369428224);
        setField(term336188, term336188.getClass(), "value3", null);
        setField(term336188, term336188.getClass(), "value1", null);
        setField(term336096, term336096.getClass(), "key3", term336188);
        setIntField(term336096, term336096.getClass(), "hash2", 1435037696);
        setField(term336096, term336096.getClass(), "key2", null);
        setIntField(term336096, term336096.getClass(), "hash1", 1435037696);
        setField(term336096, term336096.getClass(), "key1", null);
        setField(term336096, term336096.getClass(), "value3", null);
        setField(term336096, term336096.getClass(), "value2", term336336);
        setField(term336096, term336096.getClass(), "value1", null);
        term336428 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term336562 = newInstance(Class.forName("org.apache.commons.collections.iterators.UnmodifiableMapIterator"));
        setField(term336428, term336428.getClass(), "delegateMap", null);
        setIntField(term336428, term336428.getClass(), "size", 3);
        setIntField(term336428, term336428.getClass(), "hash3", -785088512);
        setField(term336428, term336428.getClass(), "value3", null);
        setIntField(term336428, term336428.getClass(), "hash2", -1873543168);
        setField(term336428, term336428.getClass(), "value2", null);
        setIntField(term336428, term336428.getClass(), "hash1", -201297920);
        setField(term336428, term336428.getClass(), "value1", null);
        setField(term336428, term336428.getClass(), "key3", null);
        setField(term336428, term336428.getClass(), "key2", null);
        setField(term336428, term336428.getClass(), "key1", term336562);
        term336957 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term336958 = newInstance(Class.forName("org.apache.commons.collections.map.HashedMap"));
        Object[] term336959 = (Object[]) newArray("org.apache.commons.collections.map.AbstractHashedMap$HashEntry", 16);
        Object term336960 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap$HashEntry"));
        Object term336961 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term336962 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap$HashEntry"));
        Object term336963 = newInstance(Class.forName("java.lang.Object"));
        Object term336964 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap$HashEntry"));
        Object term336965 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setIntField(term336957, term336957.getClass(), "size", 0);
        setIntField(term336957, term336957.getClass(), "hash1", 0);
        setIntField(term336957, term336957.getClass(), "hash2", 0);
        setIntField(term336957, term336957.getClass(), "hash3", 0);
        setField(term336957, term336957.getClass(), "key1", null);
        setField(term336957, term336957.getClass(), "key2", null);
        setField(term336957, term336957.getClass(), "key3", null);
        setField(term336957, term336957.getClass(), "value1", null);
        setField(term336957, term336957.getClass(), "value2", null);
        setField(term336957, term336957.getClass(), "value3", null);
        setFloatField(term336958, term336958.getClass(), "loadFactor", 0.75F);
        setIntField(term336958, term336958.getClass(), "size", 3);
        setField(term336960, term336960.getClass(), "next", null);
        setIntField(term336961, term336961.getClass(), "size", 3);
        setIntField(term336961, term336961.getClass(), "hash1", -201297920);
        setIntField(term336961, term336961.getClass(), "hash2", -1873543168);
        setIntField(term336961, term336961.getClass(), "hash3", -785088512);
        setField(term336961, term336961.getClass(), "key1", null);
        setField(term336961, term336961.getClass(), "key2", null);
        setField(term336961, term336961.getClass(), "key3", null);
        setField(term336961, term336961.getClass(), "value1", null);
        setField(term336961, term336961.getClass(), "value2", null);
        setField(term336961, term336961.getClass(), "value3", null);
        setField(term336961, term336961.getClass(), "delegateMap", null);
        setField(term336960, term336960.getClass(), "key", term336961);
        setField(term336960, term336960.getClass(), "value", null);
        setElement(term336959, 1, term336960);
        setField(term336962, term336962.getClass(), "next", null);
        setField(term336962, term336962.getClass(), "key", term336963);
        setField(term336962, term336962.getClass(), "value", null);
        setElement(term336959, 6, term336962);
        setField(term336964, term336964.getClass(), "next", null);
        setIntField(term336965, term336965.getClass(), "size", 3);
        setIntField(term336965, term336965.getClass(), "hash1", 369428224);
        setIntField(term336965, term336965.getClass(), "hash2", 1818888868);
        setIntField(term336965, term336965.getClass(), "hash3", 540020384);
        setField(term336965, term336965.getClass(), "key1", null);
        setField(term336965, term336965.getClass(), "key2", null);
        setField(term336965, term336965.getClass(), "key3", null);
        setField(term336965, term336965.getClass(), "value1", null);
        setField(term336965, term336965.getClass(), "value2", null);
        setField(term336965, term336965.getClass(), "value3", null);
        setField(term336965, term336965.getClass(), "delegateMap", null);
        setField(term336964, term336964.getClass(), "key", term336965);
        setField(term336964, term336964.getClass(), "value", null);
        setElement(term336959, 14, term336964);
        setField(term336958, term336958.getClass(), "data", term336959);
        setIntField(term336958, term336958.getClass(), "threshold", 12);
        setIntField(term336958, term336958.getClass(), "modCount", 3);
        setField(term336958, term336958.getClass(), "entrySet", null);
        setField(term336958, term336958.getClass(), "keySet", null);
        setField(term336958, term336958.getClass(), "values", null);
        setField(term336958, term336958.getClass(), "keySet", null);
        setField(term336958, term336958.getClass(), "values", null);
        setField(term336957, term336957.getClass(), "delegateMap", term336958);
        term336966 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setIntField(term336966, term336966.getClass(), "size", 3);
        setIntField(term336966, term336966.getClass(), "hash1", -201297920);
        setIntField(term336966, term336966.getClass(), "hash2", -1873543168);
        setIntField(term336966, term336966.getClass(), "hash3", -785088512);
        setField(term336966, term336966.getClass(), "key1", null);
        setField(term336966, term336966.getClass(), "key2", null);
        setField(term336966, term336966.getClass(), "key3", null);
        setField(term336966, term336966.getClass(), "value1", null);
        setField(term336966, term336966.getClass(), "value2", null);
        setField(term336966, term336966.getClass(), "value3", null);
        setField(term336966, term336966.getClass(), "delegateMap", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.map.Flat3Map");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.Object");
        argTypes[1] = Class.forName("java.lang.Object");
        Object[] args = new Object[2];
        args[0] = term336428;
        args[1] = null;
        Object retValue = callMethod(klass, "put", argTypes, term336096, args);
        assertTrue(recursiveEquals(term336096, term336957));
        assertTrue(recursiveEquals(term336428, term336966));
        assertTrue(recursiveEquals(retValue, null));
    }

};


