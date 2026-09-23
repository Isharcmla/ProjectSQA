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

public class Flat3Map_put_1944740725619 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term132022;
     Object term132448;
     Object term133335;
     Object term133345;

    public Flat3Map_put_1944740725619() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term132022 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term132114 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term132208 = newInstance(Class.forName("org.apache.commons.collections.map.HashedMap"));
        Object term132246 = newInstance(Class.forName("java.lang.Object"));
        Object[] term131529 = (Object[]) newArray("org.apache.commons.collections.map.AbstractHashedMap$HashEntry", 0);
        Object term132356 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap"));
        setField(term132022, term132022.getClass(), "delegateMap", null);
        setIntField(term132022, term132022.getClass(), "size", 3);
        setIntField(term132022, term132022.getClass(), "hash3", 1928282112);
        setField(term132114, term132114.getClass(), "delegateMap", null);
        setIntField(term132114, term132114.getClass(), "size", 3);
        setIntField(term132208, term132208.getClass(), "size", 0);
        setField(term132114, term132114.getClass(), "key3", term132208);
        setField(term132114, term132114.getClass(), "key2", null);
        setField(term132114, term132114.getClass(), "value2", null);
        setIntField(term132114, term132114.getClass(), "hash3", 403177490);
        setIntField(term132114, term132114.getClass(), "hash2", -160200169);
        setIntField(term132114, term132114.getClass(), "hash1", 1628864545);
        setField(term132114, term132114.getClass(), "key1", term132246);
        setField(term132114, term132114.getClass(), "value3", null);
        setField(term132114, term132114.getClass(), "value1", null);
        setField(term132022, term132022.getClass(), "key3", term132114);
        setIntField(term132022, term132022.getClass(), "hash2", 1928282112);
        setField(term132022, term132022.getClass(), "key2", null);
        setIntField(term132022, term132022.getClass(), "hash1", 1928282112);
        setField(term132022, term132022.getClass(), "key1", null);
        setField(term132022, term132022.getClass(), "value3", term131529);
        setField(term132022, term132022.getClass(), "value2", term132356);
        setField(term132022, term132022.getClass(), "value1", null);
        term132448 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term132540 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setField(term132448, term132448.getClass(), "delegateMap", null);
        setIntField(term132448, term132448.getClass(), "size", 3);
        setIntField(term132448, term132448.getClass(), "hash3", -873594880);
        setField(term132448, term132448.getClass(), "value3", null);
        setIntField(term132448, term132448.getClass(), "hash2", 218120192);
        setField(term132448, term132448.getClass(), "value2", null);
        setIntField(term132448, term132448.getClass(), "hash1", -1711210496);
        setField(term132448, term132448.getClass(), "value1", null);
        setField(term132448, term132448.getClass(), "key3", null);
        setField(term132540, term132540.getClass(), "delegateMap", null);
        setIntField(term132540, term132540.getClass(), "size", 2);
        setIntField(term132540, term132540.getClass(), "hash2", 27347008);
        setField(term132540, term132540.getClass(), "value2", null);
        setIntField(term132540, term132540.getClass(), "hash1", 76198560);
        setField(term132540, term132540.getClass(), "value1", null);
        setField(term132448, term132448.getClass(), "key2", term132540);
        term133335 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term133336 = newInstance(Class.forName("org.apache.commons.collections.map.HashedMap"));
        Object[] term133337 = (Object[]) newArray("org.apache.commons.collections.map.AbstractHashedMap$HashEntry", 16);
        Object term133338 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap$HashEntry"));
        Object term133339 = newInstance(Class.forName("java.lang.Object"));
        Object term133340 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap$HashEntry"));
        Object term133341 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term133342 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap$HashEntry"));
        Object term133343 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object[] term133344 = (Object[]) newArray("org.apache.commons.collections.map.AbstractHashedMap$HashEntry", 0);
        setIntField(term133335, term133335.getClass(), "size", 0);
        setIntField(term133335, term133335.getClass(), "hash1", 0);
        setIntField(term133335, term133335.getClass(), "hash2", 0);
        setIntField(term133335, term133335.getClass(), "hash3", 0);
        setField(term133335, term133335.getClass(), "key1", null);
        setField(term133335, term133335.getClass(), "key2", null);
        setField(term133335, term133335.getClass(), "key3", null);
        setField(term133335, term133335.getClass(), "value1", null);
        setField(term133335, term133335.getClass(), "value2", null);
        setField(term133335, term133335.getClass(), "value3", null);
        setFloatField(term133336, term133336.getClass(), "loadFactor", 0.75F);
        setIntField(term133336, term133336.getClass(), "size", 3);
        setField(term133338, term133338.getClass(), "next", null);
        setField(term133338, term133338.getClass(), "key", term133339);
        setField(term133338, term133338.getClass(), "value", null);
        setElement(term133337, 5, term133338);
        setField(term133340, term133340.getClass(), "next", null);
        setIntField(term133341, term133341.getClass(), "size", 3);
        setIntField(term133341, term133341.getClass(), "hash1", -1711210496);
        setIntField(term133341, term133341.getClass(), "hash2", 218120192);
        setIntField(term133341, term133341.getClass(), "hash3", -873594880);
        setField(term133341, term133341.getClass(), "key1", null);
        setField(term133341, term133341.getClass(), "key2", null);
        setField(term133341, term133341.getClass(), "key3", null);
        setField(term133341, term133341.getClass(), "value1", null);
        setField(term133341, term133341.getClass(), "value2", null);
        setField(term133341, term133341.getClass(), "value3", null);
        setField(term133341, term133341.getClass(), "delegateMap", null);
        setField(term133340, term133340.getClass(), "key", term133341);
        setField(term133340, term133340.getClass(), "value", null);
        setElement(term133337, 7, term133340);
        setField(term133342, term133342.getClass(), "next", null);
        setIntField(term133343, term133343.getClass(), "size", 3);
        setIntField(term133343, term133343.getClass(), "hash1", 1628864545);
        setIntField(term133343, term133343.getClass(), "hash2", -160200169);
        setIntField(term133343, term133343.getClass(), "hash3", 403177490);
        setField(term133343, term133343.getClass(), "key1", null);
        setField(term133343, term133343.getClass(), "key2", null);
        setField(term133343, term133343.getClass(), "key3", null);
        setField(term133343, term133343.getClass(), "value1", null);
        setField(term133343, term133343.getClass(), "value2", null);
        setField(term133343, term133343.getClass(), "value3", null);
        setField(term133343, term133343.getClass(), "delegateMap", null);
        setField(term133342, term133342.getClass(), "key", term133343);
        setField(term133342, term133342.getClass(), "value", term133344);
        setElement(term133337, 9, term133342);
        setField(term133336, term133336.getClass(), "data", term133337);
        setIntField(term133336, term133336.getClass(), "threshold", 12);
        setIntField(term133336, term133336.getClass(), "modCount", 3);
        setField(term133336, term133336.getClass(), "entrySet", null);
        setField(term133336, term133336.getClass(), "keySet", null);
        setField(term133336, term133336.getClass(), "values", null);
        setField(term133336, term133336.getClass(), "keySet", null);
        setField(term133336, term133336.getClass(), "values", null);
        setField(term133335, term133335.getClass(), "delegateMap", term133336);
        term133345 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setIntField(term133345, term133345.getClass(), "size", 3);
        setIntField(term133345, term133345.getClass(), "hash1", -1711210496);
        setIntField(term133345, term133345.getClass(), "hash2", 218120192);
        setIntField(term133345, term133345.getClass(), "hash3", -873594880);
        setField(term133345, term133345.getClass(), "key1", null);
        setField(term133345, term133345.getClass(), "key2", null);
        setField(term133345, term133345.getClass(), "key3", null);
        setField(term133345, term133345.getClass(), "value1", null);
        setField(term133345, term133345.getClass(), "value2", null);
        setField(term133345, term133345.getClass(), "value3", null);
        setField(term133345, term133345.getClass(), "delegateMap", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.map.Flat3Map");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.Object");
        argTypes[1] = Class.forName("java.lang.Object");
        Object[] args = new Object[2];
        args[0] = term132448;
        args[1] = null;
        Object retValue = callMethod(klass, "put", argTypes, term132022, args);
        assertTrue(recursiveEquals(term132022, term133335));
        assertTrue(recursiveEquals(term132448, term133345));
        assertTrue(recursiveEquals(retValue, null));
    }

};


