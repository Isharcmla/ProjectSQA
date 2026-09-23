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

public class MultiValueMap_values_179741354128 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term344;
     Object term3707;
     Object term3706;

    public MultiValueMap_values_179741354128() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term344 = newInstance(Class.forName("org.apache.commons.collections.map.MultiValueMap"));
        setField(term344, term344.getClass(), "collectionFactory", null);
        setField(term344, term344.getClass(), "values", null);
        setField(term344, term344.getClass(), "map", null);
        term3707 = newInstance(Class.forName("org.apache.commons.collections.map.MultiValueMap"));
        Object term3708 = newInstance(Class.forName("org.apache.commons.collections.map.MultiValueMap$Values"));
        setField(term3707, term3707.getClass(), "collectionFactory", null);
        setField(term3708, term3708.getClass(), "this$0", term3707);
        setField(term3707, term3707.getClass(), "values", term3708);
        setField(term3707, term3707.getClass(), "map", null);
        term3706 = newInstance(Class.forName("org.apache.commons.collections.map.MultiValueMap$Values"));
        Object term3705 = newInstance(Class.forName("org.apache.commons.collections.map.MultiValueMap"));
        setField(term3705, term3705.getClass(), "collectionFactory", null);
        setField(term3705, term3705.getClass(), "values", term3706);
        setField(term3705, term3705.getClass(), "map", null);
        setField(term3706, term3706.getClass(), "this$0", term3705);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.map.MultiValueMap");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "values", argTypes, term344, args);
        assertTrue(recursiveEquals(term344, term3707));
        assertTrue(recursiveEquals(retValue, term3706));
    }

};


