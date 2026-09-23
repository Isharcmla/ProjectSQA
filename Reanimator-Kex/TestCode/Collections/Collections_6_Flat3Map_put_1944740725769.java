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

public class Flat3Map_put_1944740725769 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term194653;
     Object term194929;

    public Flat3Map_put_1944740725769() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term194653 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term194745 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term194837 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setField(term194653, term194653.getClass(), "delegateMap", null);
        setIntField(term194653, term194653.getClass(), "size", 2);
        setIntField(term194653, term194653.getClass(), "hash2", 0);
        setField(term194745, term194745.getClass(), "delegateMap", null);
        setIntField(term194745, term194745.getClass(), "size", 0);
        setField(term194653, term194653.getClass(), "key2", term194745);
        setIntField(term194653, term194653.getClass(), "hash1", 0);
        setField(term194837, term194837.getClass(), "delegateMap", null);
        setIntField(term194837, term194837.getClass(), "size", 2);
        setIntField(term194837, term194837.getClass(), "hash2", -1);
        setField(term194653, term194653.getClass(), "key1", term194837);
        term194929 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term195039 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap"));
        setField(term194929, term194929.getClass(), "delegateMap", null);
        setIntField(term194929, term194929.getClass(), "size", 2);
        setIntField(term194929, term194929.getClass(), "hash2", 0);
        setField(term194929, term194929.getClass(), "value2", null);
        setIntField(term194929, term194929.getClass(), "hash1", 0);
        setField(term194929, term194929.getClass(), "value1", null);
        setIntField(term195039, term195039.getClass(), "size", 0);
        setField(term194929, term194929.getClass(), "key2", term195039);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.map.Flat3Map");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.Object");
        argTypes[1] = Class.forName("java.lang.Object");
        Object[] args = new Object[2];
        args[0] = term194929;
        args[1] = null;
        callMethod(klass, "put", argTypes, term194653, args);
    }

};


