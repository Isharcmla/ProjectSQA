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

public class Flat3Map_put_19447407251192 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term375786;
     Object term376064;

    public Flat3Map_put_19447407251192() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term375786 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term375878 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term375972 = newInstance(Class.forName("org.apache.commons.collections.map.HashedMap"));
        setField(term375786, term375786.getClass(), "delegateMap", null);
        setIntField(term375786, term375786.getClass(), "size", 3);
        setIntField(term375786, term375786.getClass(), "hash3", 0);
        setField(term375786, term375786.getClass(), "key3", null);
        setIntField(term375786, term375786.getClass(), "hash2", 0);
        setField(term375786, term375786.getClass(), "key2", null);
        setIntField(term375786, term375786.getClass(), "hash1", 0);
        setIntField(term375972, term375972.getClass(), "size", 3);
        setField(term375878, term375878.getClass(), "delegateMap", term375972);
        setField(term375786, term375786.getClass(), "key1", term375878);
        term376064 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term376158 = newInstance(Class.forName("org.apache.commons.collections.map.LinkedMap"));
        setField(term376064, term376064.getClass(), "delegateMap", null);
        setIntField(term376064, term376064.getClass(), "size", 3);
        setIntField(term376064, term376064.getClass(), "hash3", 0);
        setField(term376064, term376064.getClass(), "value3", null);
        setIntField(term376064, term376064.getClass(), "hash2", 0);
        setField(term376064, term376064.getClass(), "value2", null);
        setIntField(term376064, term376064.getClass(), "hash1", 0);
        setIntField(term376158, term376158.getClass(), "size", 0);
        setField(term376064, term376064.getClass(), "value1", term376158);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.map.Flat3Map");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.Object");
        argTypes[1] = Class.forName("java.lang.Object");
        Object[] args = new Object[2];
        args[0] = term376064;
        args[1] = null;
        callMethod(klass, "put", argTypes, term375786, args);
    }

};


