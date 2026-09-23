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

public class MultiValueMap_createCollection_175430867359 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term9313;
     Object term9688;

    public MultiValueMap_createCollection_175430867359() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term9313 = newInstance(Class.forName("org.apache.commons.collections.map.MultiValueMap"));
        Object term9429 = newInstance(Class.forName("org.apache.commons.collections.functors.ConstantFactory"));
        setField(term9313, term9313.getClass(), "collectionFactory", term9429);
        term9688 = newInstance(Class.forName("org.apache.commons.collections.map.MultiValueMap"));
        Object term9689 = newInstance(Class.forName("org.apache.commons.collections.functors.ConstantFactory"));
        setField(term9689, term9689.getClass(), "iConstant", null);
        setField(term9688, term9688.getClass(), "collectionFactory", term9689);
        setField(term9688, term9688.getClass(), "valuesView", null);
        setField(term9688, term9688.getClass(), "map", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.map.MultiValueMap");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = 0;
        Object retValue = callMethod(klass, "createCollection", argTypes, term9313, args);
        assertTrue(recursiveEquals(term9313, term9688));
        assertTrue(recursiveEquals(retValue, null));
    }

};


