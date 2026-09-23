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

public class Flat3Map_put_1944740725775 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term199414;

    public Flat3Map_put_1944740725775() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term199414 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term199469 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap"));
        setField(term199414, term199414.getClass(), "delegateMap", null);
        setIntField(term199414, term199414.getClass(), "size", 2);
        setIntField(term199414, term199414.getClass(), "hash2", -1);
        setField(term199414, term199414.getClass(), "value2", null);
        setIntField(term199414, term199414.getClass(), "hash1", 0);
        setIntField(term199469, term199469.getClass(), "size", 0);
        setField(term199414, term199414.getClass(), "value1", term199469);
        setField(term199414, term199414.getClass(), "key1", term199414);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.map.Flat3Map");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.Object");
        argTypes[1] = Class.forName("java.lang.Object");
        Object[] args = new Object[2];
        args[0] = term199414;
        args[1] = null;
        callMethod(klass, "put", argTypes, term199414, args);
    }

};


