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
import static org.apache.commons.collections.map.EqualityUtils.*;

public class Flat3Map_put_1944740725759 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term154154;
     Object term154176;
     Object term154177;

    public Flat3Map_put_1944740725759() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term154154 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setField(term154154, term154154.getClass(), "delegateMap", null);
        setIntField(term154154, term154154.getClass(), "size", 1);
        term154176 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setIntField(term154176, term154176.getClass(), "size", 2);
        setIntField(term154176, term154176.getClass(), "hash1", 0);
        setIntField(term154176, term154176.getClass(), "hash2", 0);
        setIntField(term154176, term154176.getClass(), "hash3", 0);
        setField(term154176, term154176.getClass(), "key1", null);
        setField(term154176, term154176.getClass(), "key2", term154176);
        setField(term154176, term154176.getClass(), "key3", null);
        setField(term154176, term154176.getClass(), "value1", null);
        setField(term154176, term154176.getClass(), "value2", null);
        setField(term154176, term154176.getClass(), "value3", null);
        setField(term154176, term154176.getClass(), "delegateMap", null);
        term154177 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setIntField(term154177, term154177.getClass(), "size", 2);
        setIntField(term154177, term154177.getClass(), "hash1", 0);
        setIntField(term154177, term154177.getClass(), "hash2", 0);
        setIntField(term154177, term154177.getClass(), "hash3", 0);
        setField(term154177, term154177.getClass(), "key1", null);
        setField(term154177, term154177.getClass(), "key2", term154177);
        setField(term154177, term154177.getClass(), "key3", null);
        setField(term154177, term154177.getClass(), "value1", null);
        setField(term154177, term154177.getClass(), "value2", null);
        setField(term154177, term154177.getClass(), "value3", null);
        setField(term154177, term154177.getClass(), "delegateMap", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.map.Flat3Map");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.Object");
        argTypes[1] = Class.forName("java.lang.Object");
        Object[] args = new Object[2];
        args[0] = term154154;
        args[1] = null;
        Object retValue = callMethod(klass, "put", argTypes, term154154, args);
        assertTrue(recursiveEquals(term154154, term154176));
        assertTrue(recursiveEquals(term154154, term154177));
        assertTrue(recursiveEquals(retValue, null));
    }

};
