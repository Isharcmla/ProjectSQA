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

public class Flat3Map_put_19447407251196 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term378077;
     Object term378445;

    public Flat3Map_put_19447407251196() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term378077 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term378169 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term378261 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term378353 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setField(term378077, term378077.getClass(), "delegateMap", null);
        setIntField(term378077, term378077.getClass(), "size", 3);
        setIntField(term378077, term378077.getClass(), "hash3", 0);
        setField(term378169, term378169.getClass(), "delegateMap", null);
        setIntField(term378169, term378169.getClass(), "size", 3);
        setField(term378169, term378169.getClass(), "key3", term378261);
        setField(term378169, term378169.getClass(), "key2", null);
        setField(term378169, term378169.getClass(), "value2", null);
        setIntField(term378169, term378169.getClass(), "hash3", -1);
        setIntField(term378169, term378169.getClass(), "hash2", -1);
        setIntField(term378169, term378169.getClass(), "hash1", -1);
        setField(term378077, term378077.getClass(), "key3", term378169);
        setIntField(term378077, term378077.getClass(), "hash2", 0);
        setField(term378077, term378077.getClass(), "key2", term378353);
        term378445 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term378537 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setField(term378445, term378445.getClass(), "delegateMap", null);
        setIntField(term378445, term378445.getClass(), "size", 3);
        setIntField(term378445, term378445.getClass(), "hash3", 0);
        setField(term378445, term378445.getClass(), "value3", null);
        setIntField(term378445, term378445.getClass(), "hash2", 0);
        setField(term378445, term378445.getClass(), "value2", null);
        setIntField(term378445, term378445.getClass(), "hash1", 0);
        setField(term378445, term378445.getClass(), "value1", null);
        setField(term378445, term378445.getClass(), "key3", null);
        setField(term378445, term378445.getClass(), "key2", null);
        setField(term378537, term378537.getClass(), "delegateMap", null);
        setIntField(term378537, term378537.getClass(), "size", 2);
        setIntField(term378537, term378537.getClass(), "hash2", 0);
        setField(term378537, term378537.getClass(), "value2", null);
        setIntField(term378537, term378537.getClass(), "hash1", 0);
        setField(term378537, term378537.getClass(), "value1", null);
        setField(term378445, term378445.getClass(), "key1", term378537);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.map.Flat3Map");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.Object");
        argTypes[1] = Class.forName("java.lang.Object");
        Object[] args = new Object[2];
        args[0] = term378445;
        args[1] = null;
        callMethod(klass, "put", argTypes, term378077, args);
    }

};


