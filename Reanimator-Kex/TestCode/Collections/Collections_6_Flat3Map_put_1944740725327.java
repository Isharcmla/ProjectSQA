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

public class Flat3Map_put_1944740725327 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term54515;
     Object term54537;
     Object term54538;

    public Flat3Map_put_1944740725327() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term54515 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setField(term54515, term54515.getClass(), "delegateMap", null);
        setIntField(term54515, term54515.getClass(), "size", 1);
        setIntField(term54515, term54515.getClass(), "hash1", -1);
        setField(term54515, term54515.getClass(), "value1", null);
        term54537 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setIntField(term54537, term54537.getClass(), "size", 2);
        setIntField(term54537, term54537.getClass(), "hash1", -1);
        setIntField(term54537, term54537.getClass(), "hash2", -1);
        setIntField(term54537, term54537.getClass(), "hash3", 0);
        setField(term54537, term54537.getClass(), "key1", null);
        setField(term54537, term54537.getClass(), "key2", term54537);
        setField(term54537, term54537.getClass(), "key3", null);
        setField(term54537, term54537.getClass(), "value1", null);
        setField(term54537, term54537.getClass(), "value2", null);
        setField(term54537, term54537.getClass(), "value3", null);
        setField(term54537, term54537.getClass(), "delegateMap", null);
        term54538 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setIntField(term54538, term54538.getClass(), "size", 2);
        setIntField(term54538, term54538.getClass(), "hash1", -1);
        setIntField(term54538, term54538.getClass(), "hash2", -1);
        setIntField(term54538, term54538.getClass(), "hash3", 0);
        setField(term54538, term54538.getClass(), "key1", null);
        setField(term54538, term54538.getClass(), "key2", term54538);
        setField(term54538, term54538.getClass(), "key3", null);
        setField(term54538, term54538.getClass(), "value1", null);
        setField(term54538, term54538.getClass(), "value2", null);
        setField(term54538, term54538.getClass(), "value3", null);
        setField(term54538, term54538.getClass(), "delegateMap", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.map.Flat3Map");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.Object");
        argTypes[1] = Class.forName("java.lang.Object");
        Object[] args = new Object[2];
        args[0] = term54515;
        args[1] = null;
        Object retValue = callMethod(klass, "put", argTypes, term54515, args);
        assertTrue(recursiveEquals(term54515, term54537));
        assertTrue(recursiveEquals(term54515, term54538));
        assertTrue(recursiveEquals(retValue, null));
    }

};


