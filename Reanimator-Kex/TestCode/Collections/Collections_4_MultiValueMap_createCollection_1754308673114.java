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

public class MultiValueMap_createCollection_1754308673114 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term25547;
     Object term25668;

    public MultiValueMap_createCollection_1754308673114() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term25547 = newInstance(Class.forName("org.apache.commons.collections.map.MultiValueMap"));
        Object term25663 = newInstance(Class.forName("org.apache.commons.collections.functors.ConstantFactory"));
        setField(term25547, term25547.getClass(), "collectionFactory", term25663);
        term25668 = newInstance(Class.forName("org.apache.commons.collections.map.MultiValueMap"));
        Object term25669 = newInstance(Class.forName("org.apache.commons.collections.functors.ConstantFactory"));
        setField(term25669, term25669.getClass(), "iConstant", null);
        setField(term25668, term25668.getClass(), "collectionFactory", term25669);
        setField(term25668, term25668.getClass(), "values", null);
        setField(term25668, term25668.getClass(), "map", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.map.MultiValueMap");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = 0;
        Object retValue = callMethod(klass, "createCollection", argTypes, term25547, args);
        assertTrue(recursiveEquals(term25547, term25668));
        assertTrue(recursiveEquals(retValue, null));
    }

};


