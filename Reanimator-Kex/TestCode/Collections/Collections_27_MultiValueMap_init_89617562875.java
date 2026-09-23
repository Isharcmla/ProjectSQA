package org.apache.commons.collections4.map;

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
import static org.apache.commons.collections4.map.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static org.apache.commons.collections4.map.EqualityUtils.*;
import java.lang.Object;
import java.util.HashMap;

public class MultiValueMap_init_89617562875 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term12915;
     Object term13079;
     Object term13098;
     Object term13101;
     Object term13102;

    public MultiValueMap_init_89617562875() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term12811 = new HashMap();
        Object term12763 = newInstance(Class.forName("org.apache.commons.collections4.map.MultiValueMap"));
        setField(term12763, term12763.getClass(), "map", term12811);
        term12915 = newInstance(Class.forName("org.apache.commons.collections4.map.MultiValueMap"));
        term13079 = newInstance(Class.forName("org.apache.commons.collections4.functors.PrototypeFactory$PrototypeCloneFactory"));
        term13098 = newInstance(Class.forName("org.apache.commons.collections4.map.MultiValueMap"));
        Object term13099 = newInstance(Class.forName("org.apache.commons.collections4.functors.PrototypeFactory$PrototypeCloneFactory"));
        Object term13100 = newInstance(Class.forName("org.apache.commons.collections4.map.MultiValueMap"));
        setField(term13099, term13099.getClass(), "iPrototype", null);
        setField(term13099, term13099.getClass(), "iCloneMethod", null);
        setField(term13098, term13098.getClass(), "collectionFactory", term13099);
        setField(term13098, term13098.getClass(), "valuesView", null);
        setField(term13100, term13100.getClass(), "collectionFactory", null);
        setField(term13100, term13100.getClass(), "valuesView", null);
        setField(term13100, term13100.getClass(), "map", null);
        setField(term13098, term13098.getClass(), "map", term13100);
        term13101 = newInstance(Class.forName("org.apache.commons.collections4.map.MultiValueMap"));
        setField(term13101, term13101.getClass(), "collectionFactory", null);
        setField(term13101, term13101.getClass(), "valuesView", null);
        setField(term13101, term13101.getClass(), "map", null);
        term13102 = newInstance(Class.forName("org.apache.commons.collections4.functors.PrototypeFactory$PrototypeCloneFactory"));
        setField(term13102, term13102.getClass(), "iPrototype", null);
        setField(term13102, term13102.getClass(), "iCloneMethod", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections4.map.MultiValueMap");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.util.Map");
        argTypes[1] = Class.forName("org.apache.commons.collections4.Factory");
        Object[] args = new Object[2];
        args[0] = term12915;
        args[1] = term13079;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term13098));
        assertTrue(recursiveEquals(term12915, term13101));
        assertTrue(recursiveEquals(term13079, term13102));
    }

};


