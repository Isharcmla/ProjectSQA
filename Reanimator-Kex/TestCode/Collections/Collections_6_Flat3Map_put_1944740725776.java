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

public class Flat3Map_put_1944740725776 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term199785;

    public Flat3Map_put_1944740725776() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term199785 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term199840 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractLinkedMap"));
        setField(term199785, term199785.getClass(), "delegateMap", null);
        setIntField(term199785, term199785.getClass(), "size", 3);
        setIntField(term199785, term199785.getClass(), "hash3", 0);
        setField(term199785, term199785.getClass(), "value3", null);
        setIntField(term199785, term199785.getClass(), "hash2", 0);
        setField(term199785, term199785.getClass(), "value2", null);
        setIntField(term199785, term199785.getClass(), "hash1", 0);
        setIntField(term199840, term199840.getClass(), "size", 0);
        setField(term199785, term199785.getClass(), "value1", term199840);
        setField(term199785, term199785.getClass(), "key3", null);
        setField(term199785, term199785.getClass(), "key2", term199785);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.map.Flat3Map");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.Object");
        argTypes[1] = Class.forName("java.lang.Object");
        Object[] args = new Object[2];
        args[0] = term199785;
        args[1] = null;
        callMethod(klass, "put", argTypes, term199785, args);
    }

};


