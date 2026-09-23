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

public class MultiValueMap_createCollection_1754308673190 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term99721;

    public MultiValueMap_createCollection_1754308673190() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term99721 = newInstance(Class.forName("org.apache.commons.collections.map.MultiValueMap"));
        Object term99883 = newInstance(Class.forName("org.apache.commons.collections.functors.PrototypeFactory$PrototypeCloneFactory"));
        Object term99999 = newInstance(Class.forName("java.lang.invoke.MethodHandleImpl$IntrinsicMethodHandle"));
        setField(term99883, term99883.getClass(), "iCloneMethod", null);
        setField(term99883, term99883.getClass(), "iPrototype", term99999);
        setField(term99721, term99721.getClass(), "collectionFactory", term99883);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.map.MultiValueMap");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = 0;
        try {
            callMethod(klass, "createCollection", argTypes, term99721, args);
            assertTrue(false);
        }
        catch (IllegalArgumentException e) {
        }

    }

};


