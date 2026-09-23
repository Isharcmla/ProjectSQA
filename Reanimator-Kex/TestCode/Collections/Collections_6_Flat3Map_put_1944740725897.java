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

public class Flat3Map_put_1944740725897 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term237778;
     Object term238000;

    public Flat3Map_put_1944740725897() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term237778 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term237870 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term237908 = newInstance(Class.forName("java.lang.Object"));
        setField(term237778, term237778.getClass(), "delegateMap", null);
        setIntField(term237778, term237778.getClass(), "size", 2);
        setIntField(term237778, term237778.getClass(), "hash2", -1);
        setIntField(term237778, term237778.getClass(), "hash1", 0);
        setField(term237870, term237870.getClass(), "delegateMap", null);
        setIntField(term237870, term237870.getClass(), "size", 2);
        setField(term237870, term237870.getClass(), "key2", term237908);
        setField(term237778, term237778.getClass(), "key1", term237870);
        term238000 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term238110 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap"));
        setField(term238000, term238000.getClass(), "delegateMap", null);
        setIntField(term238000, term238000.getClass(), "size", 2);
        setIntField(term238000, term238000.getClass(), "hash2", 0);
        setField(term238000, term238000.getClass(), "value2", null);
        setIntField(term238000, term238000.getClass(), "hash1", 0);
        setIntField(term238110, term238110.getClass(), "size", 0);
        setField(term238000, term238000.getClass(), "value1", term238110);
        setField(term238000, term238000.getClass(), "key2", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.map.Flat3Map");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.Object");
        argTypes[1] = Class.forName("java.lang.Object");
        Object[] args = new Object[2];
        args[0] = term238000;
        args[1] = null;
        callMethod(klass, "put", argTypes, term237778, args);
    }

};


