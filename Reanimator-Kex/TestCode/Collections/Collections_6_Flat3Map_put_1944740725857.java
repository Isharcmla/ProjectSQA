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

public class Flat3Map_put_1944740725857 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term224700;

    public Flat3Map_put_1944740725857() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term224700 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term224755 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap"));
        Object term224796 = newInstance(Class.forName("java.util.Collections$UnmodifiableList"));
        setField(term224700, term224700.getClass(), "delegateMap", null);
        setIntField(term224700, term224700.getClass(), "size", 3);
        setIntField(term224700, term224700.getClass(), "hash3", 0);
        setField(term224700, term224700.getClass(), "value3", null);
        setIntField(term224700, term224700.getClass(), "hash2", 0);
        setIntField(term224755, term224755.getClass(), "size", 0);
        setField(term224700, term224700.getClass(), "value2", term224755);
        setIntField(term224700, term224700.getClass(), "hash1", 0);
        setField(term224700, term224700.getClass(), "value1", term224796);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.map.Flat3Map");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.Object");
        argTypes[1] = Class.forName("java.lang.Object");
        Object[] args = new Object[2];
        args[0] = term224700;
        args[1] = null;
        callMethod(klass, "put", argTypes, term224700, args);
    }

};


