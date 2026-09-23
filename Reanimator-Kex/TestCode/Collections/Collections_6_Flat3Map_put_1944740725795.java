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
import java.lang.Object;
import java.util.HashMap;

public class Flat3Map_put_1944740725795 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term209221;
     Object term209569;

    public Flat3Map_put_1944740725795() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term209477 = new HashMap();
        term209221 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term209313 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term209429 = newInstance(Class.forName("org.apache.commons.collections.map.ReferenceIdentityMap"));
        setField(term209221, term209221.getClass(), "delegateMap", null);
        setIntField(term209221, term209221.getClass(), "size", 3);
        setIntField(term209221, term209221.getClass(), "hash3", 0);
        setField(term209313, term209313.getClass(), "delegateMap", null);
        setIntField(term209313, term209313.getClass(), "size", 3);
        setField(term209313, term209313.getClass(), "key3", term209429);
        setField(term209313, term209313.getClass(), "key2", null);
        setField(term209313, term209313.getClass(), "value2", null);
        setField(term209221, term209221.getClass(), "key3", term209313);
        setIntField(term209221, term209221.getClass(), "hash2", 0);
        setField(term209221, term209221.getClass(), "key2", null);
        setIntField(term209221, term209221.getClass(), "hash1", 0);
        setField(term209221, term209221.getClass(), "key1", null);
        setField(term209221, term209221.getClass(), "value3", null);
        setField(term209221, term209221.getClass(), "value2", null);
        setField(term209221, term209221.getClass(), "value1", term209477);
        term209569 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term209679 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap"));
        setField(term209569, term209569.getClass(), "delegateMap", null);
        setIntField(term209569, term209569.getClass(), "size", 3);
        setIntField(term209569, term209569.getClass(), "hash3", -2097152000);
        setField(term209569, term209569.getClass(), "value3", null);
        setIntField(term209569, term209569.getClass(), "hash2", 419430400);
        setIntField(term209679, term209679.getClass(), "size", 0);
        setField(term209569, term209569.getClass(), "value2", term209679);
        setIntField(term209569, term209569.getClass(), "hash1", 1677721600);
        setField(term209569, term209569.getClass(), "value1", null);
        setField(term209569, term209569.getClass(), "key3", null);
        setField(term209569, term209569.getClass(), "key2", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.map.Flat3Map");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.Object");
        argTypes[1] = Class.forName("java.lang.Object");
        Object[] args = new Object[2];
        args[0] = term209569;
        args[1] = null;
        callMethod(klass, "put", argTypes, term209221, args);
    }

};


