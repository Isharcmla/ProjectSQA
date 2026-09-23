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

public class Flat3Map_put_1944740725741 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term188412;
     Object term188504;

    public Flat3Map_put_1944740725741() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term188412 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setField(term188412, term188412.getClass(), "delegateMap", null);
        setIntField(term188412, term188412.getClass(), "size", 2);
        setIntField(term188412, term188412.getClass(), "hash2", 0);
        setField(term188412, term188412.getClass(), "key2", term188412);
        setIntField(term188412, term188412.getClass(), "hash1", 0);
        setField(term188412, term188412.getClass(), "key1", term188412);
        term188504 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term188614 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap"));
        setField(term188504, term188504.getClass(), "delegateMap", null);
        setIntField(term188504, term188504.getClass(), "size", 2);
        setIntField(term188504, term188504.getClass(), "hash2", 0);
        setField(term188504, term188504.getClass(), "value2", null);
        setIntField(term188504, term188504.getClass(), "hash1", 0);
        setField(term188504, term188504.getClass(), "value1", null);
        setIntField(term188614, term188614.getClass(), "size", 0);
        setField(term188504, term188504.getClass(), "key2", term188614);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.map.Flat3Map");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.Object");
        argTypes[1] = Class.forName("java.lang.Object");
        Object[] args = new Object[2];
        args[0] = term188504;
        args[1] = null;
        callMethod(klass, "put", argTypes, term188412, args);
    }

};


