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

public class Flat3Map_put_1944740725965 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term193969;
     Object term194061;
     Object term194176;
     Object term194177;

    public Flat3Map_put_1944740725965() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term193969 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setField(term193969, term193969.getClass(), "delegateMap", null);
        setIntField(term193969, term193969.getClass(), "size", 3);
        setIntField(term193969, term193969.getClass(), "hash3", 0);
        setField(term193969, term193969.getClass(), "key3", term193969);
        term194061 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setField(term194061, term194061.getClass(), "delegateMap", null);
        setIntField(term194061, term194061.getClass(), "size", 3);
        setIntField(term194061, term194061.getClass(), "hash3", 0);
        setField(term194061, term194061.getClass(), "value3", null);
        setIntField(term194061, term194061.getClass(), "hash2", 0);
        setField(term194061, term194061.getClass(), "value2", null);
        setIntField(term194061, term194061.getClass(), "hash1", 0);
        setField(term194061, term194061.getClass(), "value1", null);
        term194176 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setIntField(term194176, term194176.getClass(), "size", 3);
        setIntField(term194176, term194176.getClass(), "hash1", 0);
        setIntField(term194176, term194176.getClass(), "hash2", 0);
        setIntField(term194176, term194176.getClass(), "hash3", 0);
        setField(term194176, term194176.getClass(), "key1", null);
        setField(term194176, term194176.getClass(), "key2", null);
        setField(term194176, term194176.getClass(), "key3", term194176);
        setField(term194176, term194176.getClass(), "value1", null);
        setField(term194176, term194176.getClass(), "value2", null);
        setField(term194176, term194176.getClass(), "value3", null);
        setField(term194176, term194176.getClass(), "delegateMap", null);
        term194177 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setIntField(term194177, term194177.getClass(), "size", 3);
        setIntField(term194177, term194177.getClass(), "hash1", 0);
        setIntField(term194177, term194177.getClass(), "hash2", 0);
        setIntField(term194177, term194177.getClass(), "hash3", 0);
        setField(term194177, term194177.getClass(), "key1", null);
        setField(term194177, term194177.getClass(), "key2", null);
        setField(term194177, term194177.getClass(), "key3", null);
        setField(term194177, term194177.getClass(), "value1", null);
        setField(term194177, term194177.getClass(), "value2", null);
        setField(term194177, term194177.getClass(), "value3", null);
        setField(term194177, term194177.getClass(), "delegateMap", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.map.Flat3Map");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.Object");
        argTypes[1] = Class.forName("java.lang.Object");
        Object[] args = new Object[2];
        args[0] = term194061;
        args[1] = null;
        Object retValue = callMethod(klass, "put", argTypes, term193969, args);
        assertTrue(recursiveEquals(term193969, term194176));
        assertTrue(recursiveEquals(term194061, term194177));
        assertTrue(recursiveEquals(retValue, null));
    }

};
