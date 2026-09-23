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

public class Flat3Map_put_1944740725693 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term163223;
     Object term164001;

    public Flat3Map_put_1944740725693() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term163223 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term163315 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term163353 = newInstance(Class.forName("java.lang.Object"));
        Object term163483 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap$HashEntry"));
        Object term163613 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap$HashEntry"));
        Object term163723 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap"));
        Object term163815 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term163909 = newInstance(Class.forName("org.apache.commons.collections.map.HashedMap"));
        setField(term163223, term163223.getClass(), "delegateMap", null);
        setIntField(term163223, term163223.getClass(), "size", 3);
        setIntField(term163223, term163223.getClass(), "hash3", 477880577);
        setField(term163315, term163315.getClass(), "delegateMap", null);
        setIntField(term163315, term163315.getClass(), "size", 3);
        setField(term163315, term163315.getClass(), "key3", term163353);
        setField(term163315, term163315.getClass(), "key2", null);
        setField(term163315, term163315.getClass(), "value2", null);
        setIntField(term163315, term163315.getClass(), "hash3", -662688702);
        setIntField(term163315, term163315.getClass(), "hash2", 1987581440);
        setIntField(term163315, term163315.getClass(), "hash1", 1627653120);
        setField(term163315, term163315.getClass(), "key1", term163483);
        setField(term163315, term163315.getClass(), "value3", null);
        setField(term163315, term163315.getClass(), "value1", null);
        setField(term163223, term163223.getClass(), "key3", term163315);
        setIntField(term163223, term163223.getClass(), "hash2", 477880577);
        setField(term163223, term163223.getClass(), "key2", null);
        setIntField(term163223, term163223.getClass(), "hash1", 477880577);
        setField(term163223, term163223.getClass(), "key1", null);
        setField(term163223, term163223.getClass(), "value3", term163613);
        setField(term163223, term163223.getClass(), "value2", term163723);
        setField(term163815, term163815.getClass(), "delegateMap", term163909);
        setField(term163223, term163223.getClass(), "value1", term163815);
        term164001 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term164093 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setField(term164001, term164001.getClass(), "delegateMap", null);
        setIntField(term164001, term164001.getClass(), "size", 3);
        setIntField(term164001, term164001.getClass(), "hash3", 1986912513);
        setField(term164001, term164001.getClass(), "value3", null);
        setIntField(term164001, term164001.getClass(), "hash2", 1695301632);
        setField(term164001, term164001.getClass(), "value2", null);
        setIntField(term164001, term164001.getClass(), "hash1", 1090633728);
        setField(term164001, term164001.getClass(), "value1", null);
        setField(term164001, term164001.getClass(), "key3", null);
        setField(term164093, term164093.getClass(), "delegateMap", null);
        setIntField(term164093, term164093.getClass(), "size", 2);
        setIntField(term164093, term164093.getClass(), "hash2", 536870912);
        setField(term164093, term164093.getClass(), "value2", null);
        setIntField(term164093, term164093.getClass(), "hash1", -662688702);
        setField(term164093, term164093.getClass(), "value1", null);
        setField(term164001, term164001.getClass(), "key2", term164093);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.map.Flat3Map");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.Object");
        argTypes[1] = Class.forName("java.lang.Object");
        Object[] args = new Object[2];
        args[0] = term164001;
        args[1] = null;
        callMethod(klass, "put", argTypes, term163223, args);
    }

};


