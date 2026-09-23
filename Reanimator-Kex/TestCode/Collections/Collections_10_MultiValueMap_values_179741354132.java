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

public class MultiValueMap_values_179741354132 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term438;
     Object term4275;
     Object term4274;

    public MultiValueMap_values_179741354132() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term438 = newInstance(Class.forName("org.apache.commons.collections.map.MultiValueMap"));
        setField(term438, term438.getClass(), "collectionFactory", null);
        setField(term438, term438.getClass(), "valuesView", null);
        setField(term438, term438.getClass(), "map", null);
        term4275 = newInstance(Class.forName("org.apache.commons.collections.map.MultiValueMap"));
        Object term4276 = newInstance(Class.forName("org.apache.commons.collections.map.MultiValueMap$Values"));
        setField(term4275, term4275.getClass(), "collectionFactory", null);
        setField(term4276, term4276.getClass(), "this$0", term4275);
        setField(term4275, term4275.getClass(), "valuesView", term4276);
        setField(term4275, term4275.getClass(), "map", null);
        term4274 = newInstance(Class.forName("org.apache.commons.collections.map.MultiValueMap$Values"));
        Object term4273 = newInstance(Class.forName("org.apache.commons.collections.map.MultiValueMap"));
        setField(term4273, term4273.getClass(), "collectionFactory", null);
        setField(term4273, term4273.getClass(), "valuesView", term4274);
        setField(term4273, term4273.getClass(), "map", null);
        setField(term4274, term4274.getClass(), "this$0", term4273);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.map.MultiValueMap");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "values", argTypes, term438, args);
        assertTrue(recursiveEquals(term438, term4275));
        assertTrue(recursiveEquals(retValue, term4274));
    }

};


