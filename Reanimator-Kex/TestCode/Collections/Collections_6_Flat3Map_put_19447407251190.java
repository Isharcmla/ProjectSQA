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

public class Flat3Map_put_19447407251190 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term374662;
     Object term374976;

    public Flat3Map_put_19447407251190() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term374662 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term374754 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term374884 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap$HashEntry"));
        setField(term374662, term374662.getClass(), "delegateMap", null);
        setIntField(term374662, term374662.getClass(), "size", 3);
        setIntField(term374662, term374662.getClass(), "hash3", 406012034);
        setField(term374662, term374662.getClass(), "key3", null);
        setIntField(term374662, term374662.getClass(), "hash2", 406012034);
        setField(term374662, term374662.getClass(), "key2", null);
        setIntField(term374662, term374662.getClass(), "hash1", 406012034);
        setField(term374754, term374754.getClass(), "delegateMap", null);
        setIntField(term374754, term374754.getClass(), "size", 3);
        setField(term374754, term374754.getClass(), "key3", null);
        setField(term374754, term374754.getClass(), "value3", null);
        setIntField(term374754, term374754.getClass(), "hash3", -2012966912);
        setIntField(term374754, term374754.getClass(), "hash2", 1076887552);
        setField(term374754, term374754.getClass(), "value2", null);
        setIntField(term374754, term374754.getClass(), "hash1", -489226240);
        setField(term374754, term374754.getClass(), "value1", null);
        setField(term374662, term374662.getClass(), "key1", term374754);
        setField(term374662, term374662.getClass(), "value3", null);
        setField(term374662, term374662.getClass(), "value2", null);
        setField(term374662, term374662.getClass(), "value1", term374884);
        term374976 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term375070 = newInstance(Class.forName("org.apache.commons.collections.map.LinkedMap"));
        setField(term374976, term374976.getClass(), "delegateMap", null);
        setIntField(term374976, term374976.getClass(), "size", 3);
        setIntField(term374976, term374976.getClass(), "hash3", 641728514);
        setField(term374976, term374976.getClass(), "value3", null);
        setIntField(term374976, term374976.getClass(), "hash2", -1074642816);
        setField(term374976, term374976.getClass(), "value2", null);
        setIntField(term374976, term374976.getClass(), "hash1", 838926336);
        setIntField(term375070, term375070.getClass(), "size", 0);
        setField(term374976, term374976.getClass(), "value1", term375070);
        setField(term374976, term374976.getClass(), "key3", null);
        setField(term374976, term374976.getClass(), "key2", null);
        setField(term374976, term374976.getClass(), "key1", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.map.Flat3Map");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.Object");
        argTypes[1] = Class.forName("java.lang.Object");
        Object[] args = new Object[2];
        args[0] = term374976;
        args[1] = null;
        callMethod(klass, "put", argTypes, term374662, args);
    }

};


