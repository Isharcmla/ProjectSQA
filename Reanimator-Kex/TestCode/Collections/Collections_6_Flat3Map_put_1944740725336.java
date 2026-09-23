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

public class Flat3Map_put_1944740725336 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term55796;
     Object term56094;
     Object term56095;

    public Flat3Map_put_1944740725336() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term55796 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setField(term55796, term55796.getClass(), "delegateMap", null);
        setIntField(term55796, term55796.getClass(), "size", 0);
        setIntField(term55796, term55796.getClass(), "hash1", -1);
        term56094 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setIntField(term56094, term56094.getClass(), "size", 1);
        setIntField(term56094, term56094.getClass(), "hash1", 0);
        setIntField(term56094, term56094.getClass(), "hash2", 0);
        setIntField(term56094, term56094.getClass(), "hash3", 0);
        setField(term56094, term56094.getClass(), "key1", term56094);
        setField(term56094, term56094.getClass(), "key2", null);
        setField(term56094, term56094.getClass(), "key3", null);
        setField(term56094, term56094.getClass(), "value1", null);
        setField(term56094, term56094.getClass(), "value2", null);
        setField(term56094, term56094.getClass(), "value3", null);
        setField(term56094, term56094.getClass(), "delegateMap", null);
        term56095 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setIntField(term56095, term56095.getClass(), "size", 1);
        setIntField(term56095, term56095.getClass(), "hash1", 0);
        setIntField(term56095, term56095.getClass(), "hash2", 0);
        setIntField(term56095, term56095.getClass(), "hash3", 0);
        setField(term56095, term56095.getClass(), "key1", term56095);
        setField(term56095, term56095.getClass(), "key2", null);
        setField(term56095, term56095.getClass(), "key3", null);
        setField(term56095, term56095.getClass(), "value1", null);
        setField(term56095, term56095.getClass(), "value2", null);
        setField(term56095, term56095.getClass(), "value3", null);
        setField(term56095, term56095.getClass(), "delegateMap", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.map.Flat3Map");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.Object");
        argTypes[1] = Class.forName("java.lang.Object");
        Object[] args = new Object[2];
        args[0] = term55796;
        args[1] = null;
        Object retValue = callMethod(klass, "put", argTypes, term55796, args);
        assertTrue(recursiveEquals(term55796, term56094));
        assertTrue(recursiveEquals(term55796, term56095));
        assertTrue(recursiveEquals(retValue, null));
    }

};


