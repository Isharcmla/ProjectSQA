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
import java.lang.IllegalArgumentException;
import static org.apache.commons.collections4.map.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class MultiValueMap_createCollection_1433041541125 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term20492;

    public MultiValueMap_createCollection_1433041541125() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term20492 = newInstance(Class.forName("org.apache.commons.collections4.map.MultiValueMap"));
        Object term20656 = newInstance(Class.forName("org.apache.commons.collections4.functors.PrototypeFactory$PrototypeCloneFactory"));
        Object term20820 = newInstance(Class.forName("org.apache.commons.collections4.functors.PrototypeFactory$PrototypeCloneFactory"));
        setField(term20656, term20656.getClass(), "iCloneMethod", null);
        setField(term20656, term20656.getClass(), "iPrototype", term20820);
        setField(term20492, term20492.getClass(), "collectionFactory", term20656);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections4.map.MultiValueMap");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = 0;
        try {
            callMethod(klass, "createCollection", argTypes, term20492, args);
            assertTrue(false);
        }
        catch (IllegalArgumentException e) {
        }

    }

};


