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
import java.lang.IllegalArgumentException;
import static org.apache.commons.collections.map.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class MultiValueMap_createCollection_1754308673178 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term43936;

    public MultiValueMap_createCollection_1754308673178() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term43936 = newInstance(Class.forName("org.apache.commons.collections.map.MultiValueMap"));
        Object term44098 = newInstance(Class.forName("org.apache.commons.collections.functors.PrototypeFactory$PrototypeCloneFactory"));
        Object term44168 = newInstance(Class.forName("java.lang.invoke.VarHandleFloats"));
        setField(term44098, term44098.getClass(), "iCloneMethod", null);
        setField(term44098, term44098.getClass(), "iPrototype", term44168);
        setField(term43936, term43936.getClass(), "collectionFactory", term44098);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.map.MultiValueMap");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = 0;
        try {
            callMethod(klass, "createCollection", argTypes, term43936, args);
            assertTrue(false);
        }
        catch (IllegalArgumentException e) {
        }

    }

};


