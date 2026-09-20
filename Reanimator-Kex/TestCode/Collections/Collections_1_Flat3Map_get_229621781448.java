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

public class Flat3Map_get_229621781448 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term82560;

    public Flat3Map_get_229621781448() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term82560 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term82606 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term82655 = newInstance(Class.forName("org.apache.commons.collections.map.IdentityMap"));
        setField(term82560, term82560.getClass(), "delegateMap", null);
        setIntField(term82560, term82560.getClass(), "size", 2);
        setIntField(term82560, term82560.getClass(), "hash2", 0);
        setField(term82560, term82560.getClass(), "value2", null);
        setIntField(term82560, term82560.getClass(), "hash1", 0);
        setField(term82560, term82560.getClass(), "value1", null);
        setField(term82560, term82560.getClass(), "key2", null);
        setIntField(term82655, term82655.getClass(), "size", 2);
        setField(term82606, term82606.getClass(), "delegateMap", term82655);
        setField(term82560, term82560.getClass(), "key1", term82606);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.map.Flat3Map");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term82560;
        try {
            callMethod(klass, "get", argTypes, term82560, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};
