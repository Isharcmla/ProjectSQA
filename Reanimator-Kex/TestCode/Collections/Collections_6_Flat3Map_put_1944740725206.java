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

public class Flat3Map_put_1944740725206 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term34033;
     Object term34404;
     Object term34405;

    public Flat3Map_put_1944740725206() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term34033 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setField(term34033, term34033.getClass(), "delegateMap", null);
        setIntField(term34033, term34033.getClass(), "size", 2);
        term34404 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setIntField(term34404, term34404.getClass(), "size", 3);
        setIntField(term34404, term34404.getClass(), "hash1", 0);
        setIntField(term34404, term34404.getClass(), "hash2", 0);
        setIntField(term34404, term34404.getClass(), "hash3", 0);
        setField(term34404, term34404.getClass(), "key1", null);
        setField(term34404, term34404.getClass(), "key2", null);
        setField(term34404, term34404.getClass(), "key3", term34404);
        setField(term34404, term34404.getClass(), "value1", null);
        setField(term34404, term34404.getClass(), "value2", null);
        setField(term34404, term34404.getClass(), "value3", null);
        setField(term34404, term34404.getClass(), "delegateMap", null);
        term34405 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setIntField(term34405, term34405.getClass(), "size", 3);
        setIntField(term34405, term34405.getClass(), "hash1", 0);
        setIntField(term34405, term34405.getClass(), "hash2", 0);
        setIntField(term34405, term34405.getClass(), "hash3", 0);
        setField(term34405, term34405.getClass(), "key1", null);
        setField(term34405, term34405.getClass(), "key2", null);
        setField(term34405, term34405.getClass(), "key3", term34405);
        setField(term34405, term34405.getClass(), "value1", null);
        setField(term34405, term34405.getClass(), "value2", null);
        setField(term34405, term34405.getClass(), "value3", null);
        setField(term34405, term34405.getClass(), "delegateMap", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.map.Flat3Map");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.Object");
        argTypes[1] = Class.forName("java.lang.Object");
        Object[] args = new Object[2];
        args[0] = term34033;
        args[1] = null;
        Object retValue = callMethod(klass, "put", argTypes, term34033, args);
        assertTrue(recursiveEquals(term34033, term34404));
        assertTrue(recursiveEquals(term34033, term34405));
        assertTrue(recursiveEquals(retValue, null));
    }

};


