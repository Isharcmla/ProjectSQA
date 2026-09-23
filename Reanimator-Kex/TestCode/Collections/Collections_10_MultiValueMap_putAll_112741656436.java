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

public class MultiValueMap_putAll_112741656436 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term583;
     Object term5030;

    public MultiValueMap_putAll_112741656436() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term583 = newInstance(Class.forName("org.apache.commons.collections.map.MultiValueMap"));
        setField(term583, term583.getClass(), "collectionFactory", null);
        setField(term583, term583.getClass(), "valuesView", null);
        setField(term583, term583.getClass(), "map", null);
        term5030 = newInstance(Class.forName("org.apache.commons.collections.map.MultiValueMap"));
        setField(term5030, term5030.getClass(), "collectionFactory", null);
        setField(term5030, term5030.getClass(), "valuesView", null);
        setField(term5030, term5030.getClass(), "map", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.map.MultiValueMap");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.Object");
        argTypes[1] = Class.forName("java.util.Collection");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = null;
        Object retValue = callMethod(klass, "putAll", argTypes, term583, args);
        assertTrue(recursiveEquals(term583, term5030));
        assertTrue(recursiveEquals(retValue, false));
    }

};


