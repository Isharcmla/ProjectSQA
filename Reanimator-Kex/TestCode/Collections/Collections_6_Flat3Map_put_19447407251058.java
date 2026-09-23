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

public class Flat3Map_put_19447407251058 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term305151;
     Object term305327;
     Object term306371;
     Object term306374;

    public Flat3Map_put_19447407251058() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term305151 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term305189 = newInstance(Class.forName("java.lang.Object"));
        term305327 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setField(term305151, term305151.getClass(), "delegateMap", null);
        setIntField(term305151, term305151.getClass(), "size", 3);
        setIntField(term305151, term305151.getClass(), "hash3", 0);
        setField(term305151, term305151.getClass(), "key3", term305189);
        setIntField(term305151, term305151.getClass(), "hash2", 0);
        setField(term305327, term305327.getClass(), "delegateMap", null);
        setIntField(term305327, term305327.getClass(), "size", 3);
        setIntField(term305327, term305327.getClass(), "hash3", 0);
        setField(term305327, term305327.getClass(), "value3", null);
        setIntField(term305327, term305327.getClass(), "hash2", 0);
        setField(term305327, term305327.getClass(), "value2", null);
        setIntField(term305327, term305327.getClass(), "hash1", 0);
        setField(term305327, term305327.getClass(), "value1", null);
        setField(term305151, term305151.getClass(), "key2", term305327);
        term306371 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term306372 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term306373 = newInstance(Class.forName("java.lang.Object"));
        setIntField(term306371, term306371.getClass(), "size", 3);
        setIntField(term306371, term306371.getClass(), "hash1", 0);
        setIntField(term306371, term306371.getClass(), "hash2", 0);
        setIntField(term306371, term306371.getClass(), "hash3", 0);
        setField(term306371, term306371.getClass(), "key1", null);
        setIntField(term306372, term306372.getClass(), "size", 3);
        setIntField(term306372, term306372.getClass(), "hash1", 0);
        setIntField(term306372, term306372.getClass(), "hash2", 0);
        setIntField(term306372, term306372.getClass(), "hash3", 0);
        setField(term306372, term306372.getClass(), "key1", null);
        setField(term306372, term306372.getClass(), "key2", null);
        setField(term306372, term306372.getClass(), "key3", null);
        setField(term306372, term306372.getClass(), "value1", null);
        setField(term306372, term306372.getClass(), "value2", null);
        setField(term306372, term306372.getClass(), "value3", null);
        setField(term306372, term306372.getClass(), "delegateMap", null);
        setField(term306371, term306371.getClass(), "key2", term306372);
        setField(term306371, term306371.getClass(), "key3", term306373);
        setField(term306371, term306371.getClass(), "value1", null);
        setField(term306371, term306371.getClass(), "value2", null);
        setField(term306371, term306371.getClass(), "value3", null);
        setField(term306371, term306371.getClass(), "delegateMap", null);
        term306374 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setIntField(term306374, term306374.getClass(), "size", 3);
        setIntField(term306374, term306374.getClass(), "hash1", 0);
        setIntField(term306374, term306374.getClass(), "hash2", 0);
        setIntField(term306374, term306374.getClass(), "hash3", 0);
        setField(term306374, term306374.getClass(), "key1", null);
        setField(term306374, term306374.getClass(), "key2", null);
        setField(term306374, term306374.getClass(), "key3", null);
        setField(term306374, term306374.getClass(), "value1", null);
        setField(term306374, term306374.getClass(), "value2", null);
        setField(term306374, term306374.getClass(), "value3", null);
        setField(term306374, term306374.getClass(), "delegateMap", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.map.Flat3Map");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.Object");
        argTypes[1] = Class.forName("java.lang.Object");
        Object[] args = new Object[2];
        args[0] = term305327;
        args[1] = null;
        Object retValue = callMethod(klass, "put", argTypes, term305151, args);
        assertTrue(recursiveEquals(term305151, term306371));
        assertTrue(recursiveEquals(term305327, term306374));
        assertTrue(recursiveEquals(retValue, null));
    }

};


