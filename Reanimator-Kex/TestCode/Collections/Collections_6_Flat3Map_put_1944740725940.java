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
import java.lang.Object;

public class Flat3Map_put_1944740725940 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term255136;
     Object term255522;

    public Flat3Map_put_1944740725940() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term255136 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term255228 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term255320 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term255430 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap"));
        setField(term255136, term255136.getClass(), "delegateMap", null);
        setIntField(term255136, term255136.getClass(), "size", 3);
        setIntField(term255136, term255136.getClass(), "hash3", 0);
        setField(term255228, term255228.getClass(), "delegateMap", null);
        setIntField(term255228, term255228.getClass(), "size", 3);
        setField(term255320, term255320.getClass(), "delegateMap", null);
        setIntField(term255320, term255320.getClass(), "size", 0);
        setField(term255228, term255228.getClass(), "key3", term255320);
        setField(term255228, term255228.getClass(), "key2", null);
        setField(term255228, term255228.getClass(), "value2", null);
        setIntField(term255228, term255228.getClass(), "hash3", 0);
        setField(term255228, term255228.getClass(), "value3", null);
        setIntField(term255228, term255228.getClass(), "hash2", 0);
        setIntField(term255228, term255228.getClass(), "hash1", 0);
        setField(term255228, term255228.getClass(), "key1", term255430);
        setField(term255136, term255136.getClass(), "key3", term255228);
        term255522 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term255614 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term255706 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setField(term255522, term255522.getClass(), "delegateMap", null);
        setIntField(term255522, term255522.getClass(), "size", 3);
        setIntField(term255522, term255522.getClass(), "hash3", 0);
        setField(term255522, term255522.getClass(), "value3", null);
        setIntField(term255522, term255522.getClass(), "hash2", 0);
        setField(term255522, term255522.getClass(), "value2", null);
        setIntField(term255522, term255522.getClass(), "hash1", 0);
        setField(term255522, term255522.getClass(), "value1", null);
        setField(term255522, term255522.getClass(), "key3", null);
        setField(term255614, term255614.getClass(), "delegateMap", null);
        setIntField(term255614, term255614.getClass(), "size", 0);
        setField(term255522, term255522.getClass(), "key2", term255614);
        setField(term255706, term255706.getClass(), "delegateMap", null);
        setIntField(term255706, term255706.getClass(), "size", 1);
        setIntField(term255706, term255706.getClass(), "hash1", 0);
        setField(term255706, term255706.getClass(), "value1", null);
        setField(term255522, term255522.getClass(), "key1", term255706);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.map.Flat3Map");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.Object");
        argTypes[1] = Class.forName("java.lang.Object");
        Object[] args = new Object[2];
        args[0] = term255522;
        args[1] = null;
        callMethod(klass, "put", argTypes, term255136, args);
    }

};


