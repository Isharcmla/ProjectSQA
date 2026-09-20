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

public class Flat3Map_containsKey_76092510565 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term108540;
     Object term108654;
     Object term108683;
     Object term108684;

    public Flat3Map_containsKey_76092510565() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term108540 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setField(term108540, term108540.getClass(), "delegateMap", null);
        setIntField(term108540, term108540.getClass(), "size", 1);
        setIntField(term108540, term108540.getClass(), "hash1", 0);
        term108654 = newInstance(Class.forName("org.apache.commons.collections.functors.NOPTransformer"));
        term108683 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setIntField(term108683, term108683.getClass(), "size", 1);
        setIntField(term108683, term108683.getClass(), "hash1", 0);
        setIntField(term108683, term108683.getClass(), "hash2", 0);
        setIntField(term108683, term108683.getClass(), "hash3", 0);
        setField(term108683, term108683.getClass(), "key1", null);
        setField(term108683, term108683.getClass(), "key2", null);
        setField(term108683, term108683.getClass(), "key3", null);
        setField(term108683, term108683.getClass(), "value1", null);
        setField(term108683, term108683.getClass(), "value2", null);
        setField(term108683, term108683.getClass(), "value3", null);
        setField(term108683, term108683.getClass(), "delegateMap", null);
        term108684 = newInstance(Class.forName("org.apache.commons.collections.functors.NOPTransformer"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.map.Flat3Map");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term108654;
        callMethod(klass, "containsKey", argTypes, term108540, args);
        assertTrue(recursiveEquals(term108540, term108683));
        assertTrue(recursiveEquals(term108654, term108684));
    }

};
