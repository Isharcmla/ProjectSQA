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

public class Flat3Map_remove_8406902791058 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term210675;
     Object term210707;
     Object term211056;
     Object term211057;

    public Flat3Map_remove_8406902791058() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term210675 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setField(term210675, term210675.getClass(), "delegateMap", null);
        setIntField(term210675, term210675.getClass(), "size", 3);
        setIntField(term210675, term210675.getClass(), "hash3", -1);
        setIntField(term210675, term210675.getClass(), "hash2", 0);
        term210707 = newInstance(Class.forName("java.nio.Bits"));
        term211056 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setIntField(term211056, term211056.getClass(), "size", 3);
        setIntField(term211056, term211056.getClass(), "hash1", 0);
        setIntField(term211056, term211056.getClass(), "hash2", 0);
        setIntField(term211056, term211056.getClass(), "hash3", -1);
        setField(term211056, term211056.getClass(), "key1", null);
        setField(term211056, term211056.getClass(), "key2", null);
        setField(term211056, term211056.getClass(), "key3", null);
        setField(term211056, term211056.getClass(), "value1", null);
        setField(term211056, term211056.getClass(), "value2", null);
        setField(term211056, term211056.getClass(), "value3", null);
        setField(term211056, term211056.getClass(), "delegateMap", null);
        term211057 = newInstance(Class.forName("java.nio.Bits"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.map.Flat3Map");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term210707;
        Object retValue = callMethod(klass, "remove", argTypes, term210675, args);
        assertTrue(recursiveEquals(term210675, term211056));
        assertTrue(recursiveEquals(term210707, term211057));
        assertTrue(recursiveEquals(retValue, null));
    }

};
