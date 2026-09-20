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

public class Flat3Map_containsKey_76092510571 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term109532;
     Object term109558;
     Object term109559;

    public Flat3Map_containsKey_76092510571() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term109532 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setField(term109532, term109532.getClass(), "delegateMap", null);
        setIntField(term109532, term109532.getClass(), "size", 2);
        setIntField(term109532, term109532.getClass(), "hash2", 0);
        setField(term109532, term109532.getClass(), "value2", null);
        setIntField(term109532, term109532.getClass(), "hash1", 0);
        setField(term109532, term109532.getClass(), "value1", null);
        term109558 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setIntField(term109558, term109558.getClass(), "size", 2);
        setIntField(term109558, term109558.getClass(), "hash1", 0);
        setIntField(term109558, term109558.getClass(), "hash2", 0);
        setIntField(term109558, term109558.getClass(), "hash3", 0);
        setField(term109558, term109558.getClass(), "key1", null);
        setField(term109558, term109558.getClass(), "key2", null);
        setField(term109558, term109558.getClass(), "key3", null);
        setField(term109558, term109558.getClass(), "value1", null);
        setField(term109558, term109558.getClass(), "value2", null);
        setField(term109558, term109558.getClass(), "value3", null);
        setField(term109558, term109558.getClass(), "delegateMap", null);
        term109559 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setIntField(term109559, term109559.getClass(), "size", 2);
        setIntField(term109559, term109559.getClass(), "hash1", 0);
        setIntField(term109559, term109559.getClass(), "hash2", 0);
        setIntField(term109559, term109559.getClass(), "hash3", 0);
        setField(term109559, term109559.getClass(), "key1", null);
        setField(term109559, term109559.getClass(), "key2", null);
        setField(term109559, term109559.getClass(), "key3", null);
        setField(term109559, term109559.getClass(), "value1", null);
        setField(term109559, term109559.getClass(), "value2", null);
        setField(term109559, term109559.getClass(), "value3", null);
        setField(term109559, term109559.getClass(), "delegateMap", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.map.Flat3Map");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term109532;
        callMethod(klass, "containsKey", argTypes, term109532, args);
        assertTrue(recursiveEquals(term109532, term109558));
        assertTrue(recursiveEquals(term109532, term109559));
    }

};
