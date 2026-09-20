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

public class Flat3Map_put_1944740725902 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term181287;
     Object term181563;
     Object term181965;
     Object term181969;

    public Flat3Map_put_1944740725902() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term181287 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term181379 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term181471 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setField(term181287, term181287.getClass(), "delegateMap", null);
        setIntField(term181287, term181287.getClass(), "size", 2);
        setIntField(term181287, term181287.getClass(), "hash2", 0);
        setField(term181379, term181379.getClass(), "delegateMap", null);
        setIntField(term181379, term181379.getClass(), "size", -3);
        setField(term181287, term181287.getClass(), "key2", term181379);
        setIntField(term181287, term181287.getClass(), "hash1", 0);
        setField(term181287, term181287.getClass(), "key1", term181471);
        term181563 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setField(term181563, term181563.getClass(), "delegateMap", null);
        setIntField(term181563, term181563.getClass(), "size", 2);
        setIntField(term181563, term181563.getClass(), "hash2", 0);
        setField(term181563, term181563.getClass(), "value2", null);
        setIntField(term181563, term181563.getClass(), "hash1", 0);
        setField(term181563, term181563.getClass(), "value1", null);
        term181965 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term181966 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term181967 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term181968 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setIntField(term181965, term181965.getClass(), "size", 3);
        setIntField(term181965, term181965.getClass(), "hash1", 0);
        setIntField(term181965, term181965.getClass(), "hash2", 0);
        setIntField(term181965, term181965.getClass(), "hash3", 0);
        setIntField(term181966, term181966.getClass(), "size", 0);
        setIntField(term181966, term181966.getClass(), "hash1", 0);
        setIntField(term181966, term181966.getClass(), "hash2", 0);
        setIntField(term181966, term181966.getClass(), "hash3", 0);
        setField(term181966, term181966.getClass(), "key1", null);
        setField(term181966, term181966.getClass(), "key2", null);
        setField(term181966, term181966.getClass(), "key3", null);
        setField(term181966, term181966.getClass(), "value1", null);
        setField(term181966, term181966.getClass(), "value2", null);
        setField(term181966, term181966.getClass(), "value3", null);
        setField(term181966, term181966.getClass(), "delegateMap", null);
        setField(term181965, term181965.getClass(), "key1", term181966);
        setIntField(term181967, term181967.getClass(), "size", -3);
        setIntField(term181967, term181967.getClass(), "hash1", 0);
        setIntField(term181967, term181967.getClass(), "hash2", 0);
        setIntField(term181967, term181967.getClass(), "hash3", 0);
        setField(term181967, term181967.getClass(), "key1", null);
        setField(term181967, term181967.getClass(), "key2", null);
        setField(term181967, term181967.getClass(), "key3", null);
        setField(term181967, term181967.getClass(), "value1", null);
        setField(term181967, term181967.getClass(), "value2", null);
        setField(term181967, term181967.getClass(), "value3", null);
        setField(term181967, term181967.getClass(), "delegateMap", null);
        setField(term181965, term181965.getClass(), "key2", term181967);
        setIntField(term181968, term181968.getClass(), "size", 2);
        setIntField(term181968, term181968.getClass(), "hash1", 0);
        setIntField(term181968, term181968.getClass(), "hash2", 0);
        setIntField(term181968, term181968.getClass(), "hash3", 0);
        setField(term181968, term181968.getClass(), "key1", null);
        setField(term181968, term181968.getClass(), "key2", null);
        setField(term181968, term181968.getClass(), "key3", null);
        setField(term181968, term181968.getClass(), "value1", null);
        setField(term181968, term181968.getClass(), "value2", null);
        setField(term181968, term181968.getClass(), "value3", null);
        setField(term181968, term181968.getClass(), "delegateMap", null);
        setField(term181965, term181965.getClass(), "key3", term181968);
        setField(term181965, term181965.getClass(), "value1", null);
        setField(term181965, term181965.getClass(), "value2", null);
        setField(term181965, term181965.getClass(), "value3", null);
        setField(term181965, term181965.getClass(), "delegateMap", null);
        term181969 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setIntField(term181969, term181969.getClass(), "size", 2);
        setIntField(term181969, term181969.getClass(), "hash1", 0);
        setIntField(term181969, term181969.getClass(), "hash2", 0);
        setIntField(term181969, term181969.getClass(), "hash3", 0);
        setField(term181969, term181969.getClass(), "key1", null);
        setField(term181969, term181969.getClass(), "key2", null);
        setField(term181969, term181969.getClass(), "key3", null);
        setField(term181969, term181969.getClass(), "value1", null);
        setField(term181969, term181969.getClass(), "value2", null);
        setField(term181969, term181969.getClass(), "value3", null);
        setField(term181969, term181969.getClass(), "delegateMap", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.map.Flat3Map");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.Object");
        argTypes[1] = Class.forName("java.lang.Object");
        Object[] args = new Object[2];
        args[0] = term181563;
        args[1] = null;
        Object retValue = callMethod(klass, "put", argTypes, term181287, args);
        assertTrue(recursiveEquals(term181287, term181965));
        assertTrue(recursiveEquals(term181563, term181969));
        assertTrue(recursiveEquals(retValue, null));
    }

};
