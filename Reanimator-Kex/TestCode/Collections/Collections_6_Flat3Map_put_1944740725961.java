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

public class Flat3Map_put_1944740725961 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term266002;
     Object term266434;

    public Flat3Map_put_1944740725961() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term266002 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term266094 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term266204 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap"));
        term266434 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term266480 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setField(term266002, term266002.getClass(), "delegateMap", null);
        setIntField(term266002, term266002.getClass(), "size", 3);
        setIntField(term266002, term266002.getClass(), "hash3", 0);
        setField(term266094, term266094.getClass(), "delegateMap", null);
        setIntField(term266094, term266094.getClass(), "size", 3);
        setField(term266094, term266094.getClass(), "key3", term266204);
        setField(term266094, term266094.getClass(), "key2", null);
        setField(term266094, term266094.getClass(), "value2", null);
        setIntField(term266094, term266094.getClass(), "hash3", -1);
        setIntField(term266094, term266094.getClass(), "hash2", -1);
        setIntField(term266094, term266094.getClass(), "hash1", -1);
        setField(term266002, term266002.getClass(), "key3", term266094);
        setIntField(term266002, term266002.getClass(), "hash2", 0);
        setField(term266434, term266434.getClass(), "delegateMap", null);
        setIntField(term266434, term266434.getClass(), "size", 3);
        setIntField(term266434, term266434.getClass(), "hash3", 0);
        setField(term266434, term266434.getClass(), "value3", null);
        setIntField(term266434, term266434.getClass(), "hash2", 0);
        setField(term266434, term266434.getClass(), "value2", null);
        setIntField(term266434, term266434.getClass(), "hash1", 0);
        setField(term266434, term266434.getClass(), "value1", null);
        setField(term266434, term266434.getClass(), "key3", null);
        setField(term266480, term266480.getClass(), "delegateMap", null);
        setIntField(term266480, term266480.getClass(), "size", 2);
        setIntField(term266480, term266480.getClass(), "hash2", 0);
        setField(term266480, term266480.getClass(), "value2", null);
        setIntField(term266480, term266480.getClass(), "hash1", 0);
        setField(term266480, term266480.getClass(), "value1", null);
        setField(term266434, term266434.getClass(), "key2", term266480);
        setField(term266002, term266002.getClass(), "key2", term266434);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.map.Flat3Map");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.Object");
        argTypes[1] = Class.forName("java.lang.Object");
        Object[] args = new Object[2];
        args[0] = term266434;
        args[1] = null;
        callMethod(klass, "put", argTypes, term266002, args);
    }

};


