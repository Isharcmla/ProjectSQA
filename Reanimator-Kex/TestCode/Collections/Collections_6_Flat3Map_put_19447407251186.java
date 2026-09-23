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

public class Flat3Map_put_19447407251186 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term371064;
     Object term371462;

    public Flat3Map_put_19447407251186() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term371064 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term371156 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term371194 = newInstance(Class.forName("java.lang.Object"));
        Object term371232 = newInstance(Class.forName("java.lang.Object"));
        term371462 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term371508 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setField(term371064, term371064.getClass(), "delegateMap", null);
        setIntField(term371064, term371064.getClass(), "size", 3);
        setIntField(term371064, term371064.getClass(), "hash3", 0);
        setField(term371156, term371156.getClass(), "delegateMap", null);
        setIntField(term371156, term371156.getClass(), "size", 3);
        setField(term371156, term371156.getClass(), "key3", term371194);
        setField(term371156, term371156.getClass(), "key2", null);
        setField(term371156, term371156.getClass(), "value2", null);
        setIntField(term371156, term371156.getClass(), "hash3", -1);
        setIntField(term371156, term371156.getClass(), "hash2", -1);
        setIntField(term371156, term371156.getClass(), "hash1", -1);
        setField(term371064, term371064.getClass(), "key3", term371156);
        setIntField(term371064, term371064.getClass(), "hash2", 0);
        setField(term371064, term371064.getClass(), "key2", term371232);
        setIntField(term371064, term371064.getClass(), "hash1", 0);
        setField(term371462, term371462.getClass(), "delegateMap", null);
        setIntField(term371462, term371462.getClass(), "size", 3);
        setIntField(term371462, term371462.getClass(), "hash3", 0);
        setField(term371462, term371462.getClass(), "value3", null);
        setIntField(term371462, term371462.getClass(), "hash2", 0);
        setField(term371462, term371462.getClass(), "value2", null);
        setIntField(term371462, term371462.getClass(), "hash1", 0);
        setField(term371462, term371462.getClass(), "value1", null);
        setField(term371462, term371462.getClass(), "key3", null);
        setField(term371462, term371462.getClass(), "key2", null);
        setField(term371508, term371508.getClass(), "delegateMap", null);
        setIntField(term371508, term371508.getClass(), "size", 2);
        setIntField(term371508, term371508.getClass(), "hash2", 0);
        setField(term371508, term371508.getClass(), "value2", null);
        setIntField(term371508, term371508.getClass(), "hash1", 0);
        setField(term371508, term371508.getClass(), "value1", null);
        setField(term371462, term371462.getClass(), "key1", term371508);
        setField(term371064, term371064.getClass(), "key1", term371462);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.map.Flat3Map");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.Object");
        argTypes[1] = Class.forName("java.lang.Object");
        Object[] args = new Object[2];
        args[0] = term371462;
        args[1] = null;
        callMethod(klass, "put", argTypes, term371064, args);
    }

};


