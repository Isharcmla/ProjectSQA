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
import java.lang.NullPointerException;
import static org.apache.commons.collections4.map.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class MultiValueMap_createCollection_1433041541151 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term50333;

    public MultiValueMap_createCollection_1433041541151() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term50333 = newInstance(Class.forName("org.apache.commons.collections4.map.MultiValueMap"));
        Object term50457 = newInstance(Class.forName("org.apache.commons.collections4.functors.InstantiateFactory"));
        Object term50521 = newInstance(Class.forName("java.lang.reflect.Constructor"));
        setField(term50457, term50457.getClass(), "iConstructor", term50521);
        setField(term50333, term50333.getClass(), "collectionFactory", term50457);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections4.map.MultiValueMap");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = 0;
        try {
            callMethod(klass, "createCollection", argTypes, term50333, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


