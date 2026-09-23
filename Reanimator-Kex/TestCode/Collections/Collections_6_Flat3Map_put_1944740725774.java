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

public class Flat3Map_put_1944740725774 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term198633;
     Object term199013;

    public Flat3Map_put_1944740725774() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term198773 = new HashMap();
        term198633 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term198725 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term198811 = newInstance(Class.forName("java.lang.Object"));
        Object term198921 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap"));
        setField(term198633, term198633.getClass(), "delegateMap", null);
        setIntField(term198633, term198633.getClass(), "size", 3);
        setIntField(term198633, term198633.getClass(), "hash3", 0);
        setField(term198725, term198725.getClass(), "delegateMap", null);
        setIntField(term198725, term198725.getClass(), "size", 3);
        setField(term198725, term198725.getClass(), "key3", term198773);
        setField(term198725, term198725.getClass(), "key2", null);
        setField(term198725, term198725.getClass(), "value2", null);
        setIntField(term198725, term198725.getClass(), "hash3", -1);
        setIntField(term198725, term198725.getClass(), "hash2", 0);
        setIntField(term198725, term198725.getClass(), "hash1", 0);
        setField(term198725, term198725.getClass(), "key1", term198811);
        setField(term198633, term198633.getClass(), "key3", term198725);
        setIntField(term198633, term198633.getClass(), "hash2", 0);
        setField(term198633, term198633.getClass(), "key2", term198921);
        term199013 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term199105 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setField(term199013, term199013.getClass(), "delegateMap", null);
        setIntField(term199013, term199013.getClass(), "size", 3);
        setIntField(term199013, term199013.getClass(), "hash3", 0);
        setField(term199013, term199013.getClass(), "value3", null);
        setIntField(term199013, term199013.getClass(), "hash2", 0);
        setField(term199013, term199013.getClass(), "value2", null);
        setIntField(term199013, term199013.getClass(), "hash1", 0);
        setField(term199013, term199013.getClass(), "value1", null);
        setField(term199013, term199013.getClass(), "key3", null);
        setField(term199013, term199013.getClass(), "key2", null);
        setField(term199105, term199105.getClass(), "delegateMap", null);
        setIntField(term199105, term199105.getClass(), "size", 0);
        setField(term199013, term199013.getClass(), "key1", term199105);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.map.Flat3Map");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.Object");
        argTypes[1] = Class.forName("java.lang.Object");
        Object[] args = new Object[2];
        args[0] = term199013;
        args[1] = null;
        callMethod(klass, "put", argTypes, term198633, args);
    }

};


