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
import java.util.HashMap;

public class MultiValueMap_init_186184693266 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term10639;
     Object term10801;
     Object term11083;
     Object term11086;
     Object term11087;

    public MultiValueMap_init_186184693266() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term10537 = new HashMap();
        Object term10489 = newInstance(Class.forName("org.apache.commons.collections.map.MultiValueMap"));
        setField(term10489, term10489.getClass(), "map", term10537);
        term10639 = newInstance(Class.forName("org.apache.commons.collections.map.MultiValueMap"));
        term10801 = newInstance(Class.forName("org.apache.commons.collections.functors.PrototypeFactory$PrototypeCloneFactory"));
        term11083 = newInstance(Class.forName("org.apache.commons.collections.map.MultiValueMap"));
        Object term11084 = newInstance(Class.forName("org.apache.commons.collections.functors.PrototypeFactory$PrototypeCloneFactory"));
        Object term11085 = newInstance(Class.forName("org.apache.commons.collections.map.MultiValueMap"));
        setField(term11084, term11084.getClass(), "iPrototype", null);
        setField(term11084, term11084.getClass(), "iCloneMethod", null);
        setField(term11083, term11083.getClass(), "collectionFactory", term11084);
        setField(term11083, term11083.getClass(), "valuesView", null);
        setField(term11085, term11085.getClass(), "collectionFactory", null);
        setField(term11085, term11085.getClass(), "valuesView", null);
        setField(term11085, term11085.getClass(), "map", null);
        setField(term11083, term11083.getClass(), "map", term11085);
        term11086 = newInstance(Class.forName("org.apache.commons.collections.map.MultiValueMap"));
        setField(term11086, term11086.getClass(), "collectionFactory", null);
        setField(term11086, term11086.getClass(), "valuesView", null);
        setField(term11086, term11086.getClass(), "map", null);
        term11087 = newInstance(Class.forName("org.apache.commons.collections.functors.PrototypeFactory$PrototypeCloneFactory"));
        setField(term11087, term11087.getClass(), "iPrototype", null);
        setField(term11087, term11087.getClass(), "iCloneMethod", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.map.MultiValueMap");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.util.Map");
        argTypes[1] = Class.forName("org.apache.commons.collections.Factory");
        Object[] args = new Object[2];
        args[0] = term10639;
        args[1] = term10801;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term11083));
        assertTrue(recursiveEquals(term10639, term11086));
        assertTrue(recursiveEquals(term10801, term11087));
    }

};


