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
import java.lang.NullPointerException;
import static org.apache.commons.collections.map.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class Flat3Map_get_229621781803 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term163303;

    public Flat3Map_get_229621781803() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term163303 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term163349 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term163404 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractLinkedMap"));
        setField(term163303, term163303.getClass(), "delegateMap", null);
        setIntField(term163303, term163303.getClass(), "size", 3);
        setIntField(term163303, term163303.getClass(), "hash3", 0);
        setField(term163303, term163303.getClass(), "value3", null);
        setIntField(term163303, term163303.getClass(), "hash2", 0);
        setField(term163303, term163303.getClass(), "value2", null);
        setIntField(term163303, term163303.getClass(), "hash1", 0);
        setField(term163303, term163303.getClass(), "value1", null);
        setIntField(term163404, term163404.getClass(), "size", 3);
        setField(term163349, term163349.getClass(), "delegateMap", term163404);
        setField(term163303, term163303.getClass(), "key3", term163349);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.map.Flat3Map");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term163303;
        try {
            callMethod(klass, "get", argTypes, term163303, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};
