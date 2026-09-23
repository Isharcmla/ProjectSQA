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

public class Flat3Map_put_1944740725861 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term225742;
     Object term225928;

    public Flat3Map_put_1944740725861() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term225742 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term225836 = newInstance(Class.forName("org.apache.commons.collections.map.HashedMap"));
        setIntField(term225836, term225836.getClass(), "size", -4);
        setField(term225742, term225742.getClass(), "delegateMap", term225836);
        setIntField(term225742, term225742.getClass(), "size", 3);
        setIntField(term225742, term225742.getClass(), "hash3", 0);
        setField(term225742, term225742.getClass(), "key3", null);
        setIntField(term225742, term225742.getClass(), "hash2", 0);
        setField(term225742, term225742.getClass(), "key2", term225742);
        setIntField(term225742, term225742.getClass(), "hash1", 0);
        setField(term225742, term225742.getClass(), "key1", term225742);
        term225928 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term226022 = newInstance(Class.forName("org.apache.commons.collections.map.LinkedMap"));
        setField(term225928, term225928.getClass(), "delegateMap", null);
        setIntField(term225928, term225928.getClass(), "size", 3);
        setIntField(term225928, term225928.getClass(), "hash3", 0);
        setField(term225928, term225928.getClass(), "value3", null);
        setIntField(term225928, term225928.getClass(), "hash2", 0);
        setField(term225928, term225928.getClass(), "value2", null);
        setIntField(term225928, term225928.getClass(), "hash1", 0);
        setIntField(term226022, term226022.getClass(), "size", 0);
        setField(term225928, term225928.getClass(), "value1", term226022);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.map.Flat3Map");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.Object");
        argTypes[1] = Class.forName("java.lang.Object");
        Object[] args = new Object[2];
        args[0] = term225928;
        args[1] = null;
        callMethod(klass, "put", argTypes, term225742, args);
    }

};


