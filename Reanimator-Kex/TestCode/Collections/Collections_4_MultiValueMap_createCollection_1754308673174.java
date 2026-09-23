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

public class MultiValueMap_createCollection_1754308673174 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term42462;

    public MultiValueMap_createCollection_1754308673174() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term42462 = newInstance(Class.forName("org.apache.commons.collections.map.MultiValueMap"));
        Object term42624 = newInstance(Class.forName("org.apache.commons.collections.functors.PrototypeFactory$PrototypeCloneFactory"));
        Object term42682 = newInstance(Class.forName("java.util.stream.SortedOps"));
        setField(term42624, term42624.getClass(), "iCloneMethod", null);
        setField(term42624, term42624.getClass(), "iPrototype", term42682);
        setField(term42462, term42462.getClass(), "collectionFactory", term42624);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.map.MultiValueMap");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = 0;
        try {
            callMethod(klass, "createCollection", argTypes, term42462, args);
            assertTrue(false);
        }
        catch (IllegalArgumentException e) {
        }

    }

};


