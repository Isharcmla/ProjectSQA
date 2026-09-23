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

public class Flat3Map_put_1944740725738 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term175385;
     Object term175661;

    public Flat3Map_put_1944740725738() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term175385 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term175477 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term175569 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setField(term175385, term175385.getClass(), "delegateMap", null);
        setIntField(term175385, term175385.getClass(), "size", 3);
        setIntField(term175385, term175385.getClass(), "hash3", 0);
        setField(term175477, term175477.getClass(), "delegateMap", null);
        setIntField(term175477, term175477.getClass(), "size", 3);
        setField(term175569, term175569.getClass(), "delegateMap", null);
        setIntField(term175569, term175569.getClass(), "size", 0);
        setField(term175477, term175477.getClass(), "key3", term175569);
        setField(term175477, term175477.getClass(), "key2", null);
        setField(term175477, term175477.getClass(), "value2", null);
        setIntField(term175477, term175477.getClass(), "hash3", 0);
        setField(term175477, term175477.getClass(), "value3", null);
        setField(term175385, term175385.getClass(), "key3", term175477);
        term175661 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term175753 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term175833 = newInstance(Class.forName("java.util.stream.ReduceOps$ReduceTask"));
        setField(term175661, term175661.getClass(), "delegateMap", null);
        setIntField(term175661, term175661.getClass(), "size", 3);
        setIntField(term175661, term175661.getClass(), "hash3", 0);
        setField(term175661, term175661.getClass(), "value3", null);
        setIntField(term175661, term175661.getClass(), "hash2", 0);
        setField(term175661, term175661.getClass(), "value2", null);
        setIntField(term175661, term175661.getClass(), "hash1", 0);
        setField(term175661, term175661.getClass(), "value1", null);
        setField(term175661, term175661.getClass(), "key3", null);
        setField(term175753, term175753.getClass(), "delegateMap", null);
        setIntField(term175753, term175753.getClass(), "size", 0);
        setField(term175661, term175661.getClass(), "key2", term175753);
        setField(term175661, term175661.getClass(), "key1", term175833);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.map.Flat3Map");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.Object");
        argTypes[1] = Class.forName("java.lang.Object");
        Object[] args = new Object[2];
        args[0] = term175661;
        args[1] = null;
        Object retValue = callMethod(klass, "put", argTypes, term175385, args);
        assertTrue(recursiveEquals(term175661, 0));
        assertTrue(recursiveEquals(retValue, null));
    }

};


