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

public class Flat3Map_containsKey_76092510439 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term80624;
     Object term80738;
     Object term80750;
     Object term80751;

    public Flat3Map_containsKey_76092510439() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term80624 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setField(term80624, term80624.getClass(), "delegateMap", null);
        setIntField(term80624, term80624.getClass(), "size", 1);
        term80738 = newInstance(Class.forName("org.apache.commons.collections.functors.NOPTransformer"));
        term80750 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setIntField(term80750, term80750.getClass(), "size", 1);
        setIntField(term80750, term80750.getClass(), "hash1", 0);
        setIntField(term80750, term80750.getClass(), "hash2", 0);
        setIntField(term80750, term80750.getClass(), "hash3", 0);
        setField(term80750, term80750.getClass(), "key1", null);
        setField(term80750, term80750.getClass(), "key2", null);
        setField(term80750, term80750.getClass(), "key3", null);
        setField(term80750, term80750.getClass(), "value1", null);
        setField(term80750, term80750.getClass(), "value2", null);
        setField(term80750, term80750.getClass(), "value3", null);
        setField(term80750, term80750.getClass(), "delegateMap", null);
        term80751 = newInstance(Class.forName("org.apache.commons.collections.functors.NOPTransformer"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.map.Flat3Map");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term80738;
        callMethod(klass, "containsKey", argTypes, term80624, args);
        assertTrue(recursiveEquals(term80624, term80750));
        assertTrue(recursiveEquals(term80738, term80751));
    }

};
