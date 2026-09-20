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

public class Flat3Map_get_229621781407 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term75066;
     Object term75178;
     Object term75451;
     Object term75452;

    public Flat3Map_get_229621781407() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term75066 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setField(term75066, term75066.getClass(), "delegateMap", null);
        setIntField(term75066, term75066.getClass(), "size", 3);
        term75178 = newInstance(Class.forName("org.apache.commons.collections.functors.TruePredicate"));
        term75451 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setIntField(term75451, term75451.getClass(), "size", 3);
        setIntField(term75451, term75451.getClass(), "hash1", 0);
        setIntField(term75451, term75451.getClass(), "hash2", 0);
        setIntField(term75451, term75451.getClass(), "hash3", 0);
        setField(term75451, term75451.getClass(), "key1", null);
        setField(term75451, term75451.getClass(), "key2", null);
        setField(term75451, term75451.getClass(), "key3", null);
        setField(term75451, term75451.getClass(), "value1", null);
        setField(term75451, term75451.getClass(), "value2", null);
        setField(term75451, term75451.getClass(), "value3", null);
        setField(term75451, term75451.getClass(), "delegateMap", null);
        term75452 = newInstance(Class.forName("org.apache.commons.collections.functors.TruePredicate"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.map.Flat3Map");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term75178;
        Object retValue = callMethod(klass, "get", argTypes, term75066, args);
        assertTrue(recursiveEquals(term75066, term75451));
        assertTrue(recursiveEquals(term75178, term75452));
        assertTrue(recursiveEquals(retValue, null));
    }

};
