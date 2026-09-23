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
import java.lang.ClassCastException;
import static org.apache.commons.collections.map.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class MultiValueMap_createCollection_175430867399 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term18983;

    public MultiValueMap_createCollection_175430867399() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term18983 = newInstance(Class.forName("org.apache.commons.collections.map.MultiValueMap"));
        Object term19099 = newInstance(Class.forName("org.apache.commons.collections.functors.ConstantFactory"));
        Object term19201 = newInstance(Class.forName("org.apache.commons.collections.map.MultiValueMap"));
        setField(term19099, term19099.getClass(), "iConstant", term19201);
        setField(term18983, term18983.getClass(), "collectionFactory", term19099);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.map.MultiValueMap");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = 0;
        try {
            callMethod(klass, "createCollection", argTypes, term18983, args);
            assertTrue(false);
        }
        catch (ClassCastException e) {
        }

    }

};


