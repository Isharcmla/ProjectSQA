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

public class Flat3Map_containsKey_76092510636 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term123805;
     Object term123919;
     Object term124328;
     Object term124329;

    public Flat3Map_containsKey_76092510636() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term123805 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setField(term123805, term123805.getClass(), "delegateMap", null);
        setIntField(term123805, term123805.getClass(), "size", 3);
        term123919 = newInstance(Class.forName("org.apache.commons.collections.functors.NOPTransformer"));
        term124328 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setIntField(term124328, term124328.getClass(), "size", 3);
        setIntField(term124328, term124328.getClass(), "hash1", 0);
        setIntField(term124328, term124328.getClass(), "hash2", 0);
        setIntField(term124328, term124328.getClass(), "hash3", 0);
        setField(term124328, term124328.getClass(), "key1", null);
        setField(term124328, term124328.getClass(), "key2", null);
        setField(term124328, term124328.getClass(), "key3", null);
        setField(term124328, term124328.getClass(), "value1", null);
        setField(term124328, term124328.getClass(), "value2", null);
        setField(term124328, term124328.getClass(), "value3", null);
        setField(term124328, term124328.getClass(), "delegateMap", null);
        term124329 = newInstance(Class.forName("org.apache.commons.collections.functors.NOPTransformer"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.map.Flat3Map");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term123919;
        callMethod(klass, "containsKey", argTypes, term123805, args);
        assertTrue(recursiveEquals(term123805, term124328));
        assertTrue(recursiveEquals(term123919, term124329));
    }

};
