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
import java.util.ArrayList;

public class MultiValueMap_createCollection_1754308673129 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term28221;
     Object term28402;
     Object term28395;

    public MultiValueMap_createCollection_1754308673129() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term28389 = new ArrayList();
        term28221 = newInstance(Class.forName("org.apache.commons.collections.map.MultiValueMap"));
        Object term28337 = newInstance(Class.forName("org.apache.commons.collections.functors.ConstantFactory"));
        setField(term28337, term28337.getClass(), "iConstant", term28389);
        setField(term28221, term28221.getClass(), "collectionFactory", term28337);
        ArrayList term28404 = new ArrayList();
        term28402 = newInstance(Class.forName("org.apache.commons.collections.map.MultiValueMap"));
        Object term28403 = newInstance(Class.forName("org.apache.commons.collections.functors.ConstantFactory"));
        setField(term28403, term28403.getClass(), "iConstant", term28404);
        setField(term28402, term28402.getClass(), "collectionFactory", term28403);
        setField(term28402, term28402.getClass(), "valuesView", null);
        setField(term28402, term28402.getClass(), "map", null);
        term28395 = new ArrayList();
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.map.MultiValueMap");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = 0;
        Object retValue = callMethod(klass, "createCollection", argTypes, term28221, args);
        assertTrue(recursiveEquals(term28221, term28402));
        assertTrue(recursiveEquals(retValue, term28395));
    }

};


