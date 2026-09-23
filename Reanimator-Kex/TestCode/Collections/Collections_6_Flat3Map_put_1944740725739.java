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
import java.lang.Object;

public class Flat3Map_put_1944740725739 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term176040;
     Object term176334;

    public Flat3Map_put_1944740725739() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term176040 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term176132 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term176242 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap"));
        setField(term176040, term176040.getClass(), "delegateMap", null);
        setIntField(term176040, term176040.getClass(), "size", 3);
        setIntField(term176040, term176040.getClass(), "hash3", 0);
        setField(term176132, term176132.getClass(), "delegateMap", null);
        setIntField(term176132, term176132.getClass(), "size", 3);
        setField(term176132, term176132.getClass(), "key3", term176242);
        setField(term176132, term176132.getClass(), "key2", null);
        setField(term176132, term176132.getClass(), "value2", null);
        setIntField(term176132, term176132.getClass(), "hash3", -1);
        setIntField(term176132, term176132.getClass(), "hash2", -1);
        setIntField(term176132, term176132.getClass(), "hash1", -1);
        setField(term176040, term176040.getClass(), "key3", term176132);
        setIntField(term176040, term176040.getClass(), "hash2", -1);
        term176334 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term176426 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setField(term176334, term176334.getClass(), "delegateMap", null);
        setIntField(term176334, term176334.getClass(), "size", 3);
        setIntField(term176334, term176334.getClass(), "hash3", 0);
        setField(term176334, term176334.getClass(), "value3", null);
        setIntField(term176334, term176334.getClass(), "hash2", 0);
        setField(term176334, term176334.getClass(), "value2", null);
        setIntField(term176334, term176334.getClass(), "hash1", 0);
        setField(term176334, term176334.getClass(), "value1", null);
        setField(term176334, term176334.getClass(), "key3", null);
        setField(term176426, term176426.getClass(), "delegateMap", null);
        setIntField(term176426, term176426.getClass(), "size", 2);
        setIntField(term176426, term176426.getClass(), "hash2", 0);
        setField(term176426, term176426.getClass(), "value2", null);
        setIntField(term176426, term176426.getClass(), "hash1", 0);
        setField(term176426, term176426.getClass(), "value1", null);
        setField(term176334, term176334.getClass(), "key2", term176426);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.map.Flat3Map");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.Object");
        argTypes[1] = Class.forName("java.lang.Object");
        Object[] args = new Object[2];
        args[0] = term176334;
        args[1] = null;
        Object retValue = callMethod(klass, "put", argTypes, term176040, args);
        assertTrue(recursiveEquals(term176334, false));
        assertTrue(recursiveEquals(retValue, null));
    }

};


