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

public class Flat3Map_put_1944740725687 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term160270;

    public Flat3Map_put_1944740725687() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term160270 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term160316 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setField(term160270, term160270.getClass(), "delegateMap", null);
        setIntField(term160270, term160270.getClass(), "size", 3);
        setIntField(term160270, term160270.getClass(), "hash3", 0);
        setField(term160270, term160270.getClass(), "value3", null);
        setIntField(term160270, term160270.getClass(), "hash2", -1);
        setField(term160270, term160270.getClass(), "value2", null);
        setIntField(term160270, term160270.getClass(), "hash1", 0);
        setField(term160270, term160270.getClass(), "value1", null);
        setField(term160270, term160270.getClass(), "key3", null);
        setField(term160316, term160316.getClass(), "delegateMap", null);
        setIntField(term160316, term160316.getClass(), "size", 0);
        setField(term160270, term160270.getClass(), "key2", term160316);
        setField(term160270, term160270.getClass(), "key1", term160270);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.map.Flat3Map");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.Object");
        argTypes[1] = Class.forName("java.lang.Object");
        Object[] args = new Object[2];
        args[0] = term160270;
        args[1] = null;
        callMethod(klass, "put", argTypes, term160270, args);
    }

};


