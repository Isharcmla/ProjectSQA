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

public class Flat3Map_put_1944740725997 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term281016;
     Object term281476;

    public Flat3Map_put_1944740725997() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term281016 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term281108 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term281200 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term281292 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term281384 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setField(term281016, term281016.getClass(), "delegateMap", null);
        setIntField(term281016, term281016.getClass(), "size", 3);
        setIntField(term281016, term281016.getClass(), "hash3", 0);
        setField(term281108, term281108.getClass(), "delegateMap", null);
        setIntField(term281108, term281108.getClass(), "size", 3);
        setField(term281108, term281108.getClass(), "key3", term281200);
        setField(term281108, term281108.getClass(), "key2", null);
        setField(term281108, term281108.getClass(), "value2", null);
        setIntField(term281108, term281108.getClass(), "hash3", -1);
        setIntField(term281108, term281108.getClass(), "hash2", -1);
        setIntField(term281108, term281108.getClass(), "hash1", -1);
        setField(term281016, term281016.getClass(), "key3", term281108);
        setIntField(term281016, term281016.getClass(), "hash2", 0);
        setField(term281292, term281292.getClass(), "delegateMap", null);
        setIntField(term281292, term281292.getClass(), "size", -4);
        setField(term281016, term281016.getClass(), "key2", term281292);
        setIntField(term281016, term281016.getClass(), "hash1", 0);
        setField(term281016, term281016.getClass(), "key1", term281384);
        term281476 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term281516 = newInstance(Class.forName("java.io.Console$1"));
        setField(term281476, term281476.getClass(), "delegateMap", null);
        setIntField(term281476, term281476.getClass(), "size", 3);
        setIntField(term281476, term281476.getClass(), "hash3", 0);
        setField(term281476, term281476.getClass(), "value3", null);
        setIntField(term281476, term281476.getClass(), "hash2", 0);
        setField(term281476, term281476.getClass(), "value2", null);
        setIntField(term281476, term281476.getClass(), "hash1", 0);
        setField(term281476, term281476.getClass(), "value1", null);
        setField(term281476, term281476.getClass(), "key3", null);
        setField(term281476, term281476.getClass(), "key2", term281516);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.map.Flat3Map");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.Object");
        argTypes[1] = Class.forName("java.lang.Object");
        Object[] args = new Object[2];
        args[0] = term281476;
        args[1] = null;
        callMethod(klass, "put", argTypes, term281016, args);
    }

};


