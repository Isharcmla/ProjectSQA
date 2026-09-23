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

public class Flat3Map_put_1944740725589 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term122750;
     Object term122955;

    public Flat3Map_put_1944740725589() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term122750 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term122842 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term122934 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setField(term122750, term122750.getClass(), "delegateMap", null);
        setIntField(term122750, term122750.getClass(), "size", 2);
        setField(term122750, term122750.getClass(), "key2", term122842);
        setField(term122750, term122750.getClass(), "key1", term122934);
        term122955 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term122956 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term122957 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setIntField(term122955, term122955.getClass(), "size", 3);
        setIntField(term122955, term122955.getClass(), "hash1", 0);
        setIntField(term122955, term122955.getClass(), "hash2", 0);
        setIntField(term122955, term122955.getClass(), "hash3", 0);
        setIntField(term122956, term122956.getClass(), "size", 0);
        setIntField(term122956, term122956.getClass(), "hash1", 0);
        setIntField(term122956, term122956.getClass(), "hash2", 0);
        setIntField(term122956, term122956.getClass(), "hash3", 0);
        setField(term122956, term122956.getClass(), "key1", null);
        setField(term122956, term122956.getClass(), "key2", null);
        setField(term122956, term122956.getClass(), "key3", null);
        setField(term122956, term122956.getClass(), "value1", null);
        setField(term122956, term122956.getClass(), "value2", null);
        setField(term122956, term122956.getClass(), "value3", null);
        setField(term122956, term122956.getClass(), "delegateMap", null);
        setField(term122955, term122955.getClass(), "key1", term122956);
        setIntField(term122957, term122957.getClass(), "size", 0);
        setIntField(term122957, term122957.getClass(), "hash1", 0);
        setIntField(term122957, term122957.getClass(), "hash2", 0);
        setIntField(term122957, term122957.getClass(), "hash3", 0);
        setField(term122957, term122957.getClass(), "key1", null);
        setField(term122957, term122957.getClass(), "key2", null);
        setField(term122957, term122957.getClass(), "key3", null);
        setField(term122957, term122957.getClass(), "value1", null);
        setField(term122957, term122957.getClass(), "value2", null);
        setField(term122957, term122957.getClass(), "value3", null);
        setField(term122957, term122957.getClass(), "delegateMap", null);
        setField(term122955, term122955.getClass(), "key2", term122957);
        setField(term122955, term122955.getClass(), "key3", null);
        setField(term122955, term122955.getClass(), "value1", null);
        setField(term122955, term122955.getClass(), "value2", null);
        setField(term122955, term122955.getClass(), "value3", null);
        setField(term122955, term122955.getClass(), "delegateMap", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.map.Flat3Map");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.Object");
        argTypes[1] = Class.forName("java.lang.Object");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = null;
        Object retValue = callMethod(klass, "put", argTypes, term122750, args);
        assertTrue(recursiveEquals(term122750, term122955));
        assertTrue(recursiveEquals(retValue, null));
    }

};


