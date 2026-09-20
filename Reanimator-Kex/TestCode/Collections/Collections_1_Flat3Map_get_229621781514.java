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

public class Flat3Map_get_229621781514 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term96782;
     Object term96984;

    public Flat3Map_get_229621781514() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term96782 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term97039 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap"));
        setIntField(term97039, term97039.getClass(), "size", 0);
        setField(term96782, term96782.getClass(), "delegateMap", term97039);
        setIntField(term96782, term96782.getClass(), "size", 2);
        setIntField(term96782, term96782.getClass(), "hash2", 0);
        setField(term96782, term96782.getClass(), "key2", null);
        setIntField(term96782, term96782.getClass(), "hash1", 0);
        setField(term96782, term96782.getClass(), "key1", term96782);
        term96984 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setField(term96984, term96984.getClass(), "delegateMap", null);
        setIntField(term96984, term96984.getClass(), "size", 2);
        setIntField(term96984, term96984.getClass(), "hash2", 0);
        setField(term96984, term96984.getClass(), "value2", term97039);
        setIntField(term96984, term96984.getClass(), "hash1", 0);
        setField(term96984, term96984.getClass(), "value1", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.map.Flat3Map");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term96984;
        try {
            callMethod(klass, "get", argTypes, term96782, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};
