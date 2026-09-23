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

public class Flat3Map_put_19447407251191 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term375512;

    public Flat3Map_put_19447407251191() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term375512 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term375558 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term375604 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setField(term375512, term375512.getClass(), "delegateMap", null);
        setIntField(term375512, term375512.getClass(), "size", 3);
        setIntField(term375512, term375512.getClass(), "hash3", 0);
        setField(term375512, term375512.getClass(), "value3", null);
        setIntField(term375512, term375512.getClass(), "hash2", 0);
        setField(term375512, term375512.getClass(), "value2", null);
        setIntField(term375512, term375512.getClass(), "hash1", 0);
        setField(term375512, term375512.getClass(), "value1", null);
        setField(term375512, term375512.getClass(), "key3", null);
        setField(term375558, term375558.getClass(), "delegateMap", null);
        setIntField(term375558, term375558.getClass(), "size", 3);
        setField(term375558, term375558.getClass(), "key3", term375604);
        setField(term375512, term375512.getClass(), "key2", term375558);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.map.Flat3Map");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.Object");
        argTypes[1] = Class.forName("java.lang.Object");
        Object[] args = new Object[2];
        args[0] = term375512;
        args[1] = null;
        callMethod(klass, "put", argTypes, term375512, args);
    }

};


