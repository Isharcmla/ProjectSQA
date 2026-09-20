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

public class Flat3Map_remove_840690279896 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term180395;
     Object term180895;
     Object term180896;

    public Flat3Map_remove_840690279896() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term180395 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setField(term180395, term180395.getClass(), "delegateMap", null);
        setIntField(term180395, term180395.getClass(), "size", 1);
        setIntField(term180395, term180395.getClass(), "hash1", 0);
        setField(term180395, term180395.getClass(), "value1", null);
        term180895 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setIntField(term180895, term180895.getClass(), "size", 1);
        setIntField(term180895, term180895.getClass(), "hash1", 0);
        setIntField(term180895, term180895.getClass(), "hash2", 0);
        setIntField(term180895, term180895.getClass(), "hash3", 0);
        setField(term180895, term180895.getClass(), "key1", null);
        setField(term180895, term180895.getClass(), "key2", null);
        setField(term180895, term180895.getClass(), "key3", null);
        setField(term180895, term180895.getClass(), "value1", null);
        setField(term180895, term180895.getClass(), "value2", null);
        setField(term180895, term180895.getClass(), "value3", null);
        setField(term180895, term180895.getClass(), "delegateMap", null);
        term180896 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setIntField(term180896, term180896.getClass(), "size", 1);
        setIntField(term180896, term180896.getClass(), "hash1", 0);
        setIntField(term180896, term180896.getClass(), "hash2", 0);
        setIntField(term180896, term180896.getClass(), "hash3", 0);
        setField(term180896, term180896.getClass(), "key1", null);
        setField(term180896, term180896.getClass(), "key2", null);
        setField(term180896, term180896.getClass(), "key3", null);
        setField(term180896, term180896.getClass(), "value1", null);
        setField(term180896, term180896.getClass(), "value2", null);
        setField(term180896, term180896.getClass(), "value3", null);
        setField(term180896, term180896.getClass(), "delegateMap", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.map.Flat3Map");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term180395;
        Object retValue = callMethod(klass, "remove", argTypes, term180395, args);
        assertTrue(recursiveEquals(term180395, term180895));
        assertTrue(recursiveEquals(term180395, term180896));
        assertTrue(recursiveEquals(retValue, null));
    }

};
