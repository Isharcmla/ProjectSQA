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

public class Flat3Map_put_1944740725927 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term248408;
     Object term248538;

    public Flat3Map_put_1944740725927() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term248408 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term248667 = newInstance(Class.forName("java.lang.Object"));
        setField(term248408, term248408.getClass(), "delegateMap", null);
        setIntField(term248408, term248408.getClass(), "size", 3);
        setIntField(term248408, term248408.getClass(), "hash3", 0);
        setField(term248408, term248408.getClass(), "key3", term248667);
        setField(term248408, term248408.getClass(), "key2", null);
        setField(term248408, term248408.getClass(), "value2", null);
        term248538 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term248648 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap"));
        setField(term248538, term248538.getClass(), "delegateMap", null);
        setIntField(term248538, term248538.getClass(), "size", 3);
        setIntField(term248538, term248538.getClass(), "hash3", 0);
        setField(term248538, term248538.getClass(), "value3", null);
        setIntField(term248538, term248538.getClass(), "hash2", 0);
        setIntField(term248648, term248648.getClass(), "size", 0);
        setField(term248538, term248538.getClass(), "value2", term248648);
        setIntField(term248538, term248538.getClass(), "hash1", 0);
        setField(term248538, term248538.getClass(), "value1", null);
        setField(term248538, term248538.getClass(), "key3", null);
        setField(term248538, term248538.getClass(), "key2", term248667);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.map.Flat3Map");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.Object");
        argTypes[1] = Class.forName("java.lang.Object");
        Object[] args = new Object[2];
        args[0] = term248538;
        args[1] = null;
        Object retValue = callMethod(klass, "put", argTypes, term248408, args);
        assertTrue(recursiveEquals(term248538, true));
        assertTrue(recursiveEquals(retValue, null));
    }

};


