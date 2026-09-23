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

public class Flat3Map_put_1944740725708 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term172914;
     Object term173098;

    public Flat3Map_put_1944740725708() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term172914 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term173006 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setField(term172914, term172914.getClass(), "delegateMap", null);
        setIntField(term172914, term172914.getClass(), "size", 1);
        setIntField(term172914, term172914.getClass(), "hash1", 0);
        setField(term173006, term173006.getClass(), "delegateMap", null);
        setIntField(term173006, term173006.getClass(), "size", 1);
        setField(term172914, term172914.getClass(), "key1", term173006);
        HashMap term173146 = new HashMap();
        term173098 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setField(term173098, term173098.getClass(), "delegateMap", null);
        setIntField(term173098, term173098.getClass(), "size", 1);
        setIntField(term173098, term173098.getClass(), "hash1", 0);
        setField(term173098, term173098.getClass(), "value1", null);
        setField(term173098, term173098.getClass(), "key1", term173146);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.map.Flat3Map");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.Object");
        argTypes[1] = Class.forName("java.lang.Object");
        Object[] args = new Object[2];
        args[0] = term173098;
        args[1] = null;
        callMethod(klass, "put", argTypes, term172914, args);
    }

};


