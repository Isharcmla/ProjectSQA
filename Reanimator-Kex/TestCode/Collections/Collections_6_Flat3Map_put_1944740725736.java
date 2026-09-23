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

public class Flat3Map_put_1944740725736 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term174950;
     Object term175042;

    public Flat3Map_put_1944740725736() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term174950 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setField(term174950, term174950.getClass(), "delegateMap", null);
        setIntField(term174950, term174950.getClass(), "size", -4);
        setIntField(term174950, term174950.getClass(), "hash3", 0);
        setField(term174950, term174950.getClass(), "key3", null);
        setIntField(term174950, term174950.getClass(), "hash2", 0);
        setField(term174950, term174950.getClass(), "key2", null);
        setIntField(term174950, term174950.getClass(), "hash1", 0);
        setField(term174950, term174950.getClass(), "key1", term174950);
        term175042 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term175152 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap"));
        setField(term175042, term175042.getClass(), "delegateMap", null);
        setIntField(term175042, term175042.getClass(), "size", 3);
        setIntField(term175042, term175042.getClass(), "hash3", 0);
        setField(term175042, term175042.getClass(), "value3", null);
        setIntField(term175042, term175042.getClass(), "hash2", 0);
        setField(term175042, term175042.getClass(), "value2", null);
        setIntField(term175042, term175042.getClass(), "hash1", 0);
        setIntField(term175152, term175152.getClass(), "size", 0);
        setField(term175042, term175042.getClass(), "value1", term175152);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.map.Flat3Map");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.Object");
        argTypes[1] = Class.forName("java.lang.Object");
        Object[] args = new Object[2];
        args[0] = term175042;
        args[1] = null;
        Object retValue = callMethod(klass, "put", argTypes, term174950, args);
        assertTrue(recursiveEquals(term175042, (short) 2));
        assertTrue(recursiveEquals(retValue, null));
    }

};


