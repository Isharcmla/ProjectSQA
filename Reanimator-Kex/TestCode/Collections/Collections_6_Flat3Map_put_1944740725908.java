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

public class Flat3Map_put_1944740725908 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term240921;
     Object term241105;

    public Flat3Map_put_1944740725908() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term240921 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term241151 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setField(term240921, term240921.getClass(), "delegateMap", null);
        setIntField(term240921, term240921.getClass(), "size", 3);
        setIntField(term240921, term240921.getClass(), "hash3", 0);
        setField(term241151, term241151.getClass(), "delegateMap", null);
        setIntField(term241151, term241151.getClass(), "size", 2);
        setField(term241151, term241151.getClass(), "key3", term241151);
        setField(term241151, term241151.getClass(), "key2", null);
        setField(term241151, term241151.getClass(), "value2", null);
        setIntField(term241151, term241151.getClass(), "hash2", 0);
        setIntField(term241151, term241151.getClass(), "hash1", 0);
        setField(term241151, term241151.getClass(), "value1", null);
        setIntField(term241151, term241151.getClass(), "hash3", 0);
        setField(term240921, term240921.getClass(), "key3", term241151);
        term241105 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setField(term241105, term241105.getClass(), "delegateMap", null);
        setIntField(term241105, term241105.getClass(), "size", 3);
        setIntField(term241105, term241105.getClass(), "hash3", 0);
        setField(term241105, term241105.getClass(), "value3", null);
        setIntField(term241105, term241105.getClass(), "hash2", 0);
        setField(term241105, term241105.getClass(), "value2", null);
        setIntField(term241105, term241105.getClass(), "hash1", 0);
        setField(term241105, term241105.getClass(), "value1", null);
        setField(term241105, term241105.getClass(), "key3", null);
        setField(term241105, term241105.getClass(), "key2", term241151);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.map.Flat3Map");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.Object");
        argTypes[1] = Class.forName("java.lang.Object");
        Object[] args = new Object[2];
        args[0] = term241105;
        args[1] = null;
        callMethod(klass, "put", argTypes, term240921, args);
    }

};


