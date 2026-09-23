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

public class Flat3Map_put_1944740725762 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term191312;
     Object term191582;

    public Flat3Map_put_1944740725762() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term191312 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term191398 = newInstance(Class.forName("java.lang.ProcessBuilder$NullInputStream"));
        Object term191490 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setField(term191312, term191312.getClass(), "delegateMap", null);
        setIntField(term191312, term191312.getClass(), "size", 2);
        setIntField(term191312, term191312.getClass(), "hash2", 0);
        setField(term191312, term191312.getClass(), "key2", term191398);
        setIntField(term191312, term191312.getClass(), "hash1", 0);
        setField(term191490, term191490.getClass(), "delegateMap", null);
        setIntField(term191490, term191490.getClass(), "size", 2);
        setField(term191312, term191312.getClass(), "key1", term191490);
        term191582 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term191668 = newInstance(Class.forName("java.lang.ProcessBuilder$NullInputStream"));
        setField(term191582, term191582.getClass(), "delegateMap", null);
        setIntField(term191582, term191582.getClass(), "size", 2);
        setIntField(term191582, term191582.getClass(), "hash2", 0);
        setField(term191582, term191582.getClass(), "value2", null);
        setIntField(term191582, term191582.getClass(), "hash1", 0);
        setField(term191582, term191582.getClass(), "value1", null);
        setField(term191582, term191582.getClass(), "key2", term191668);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.map.Flat3Map");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.Object");
        argTypes[1] = Class.forName("java.lang.Object");
        Object[] args = new Object[2];
        args[0] = term191582;
        args[1] = null;
        callMethod(klass, "put", argTypes, term191312, args);
    }

};


