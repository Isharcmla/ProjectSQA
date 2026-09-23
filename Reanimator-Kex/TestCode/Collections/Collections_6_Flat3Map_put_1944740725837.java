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

public class Flat3Map_put_1944740725837 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term217359;
     Object term217653;
     Object term217837;

    public Flat3Map_put_1944740725837() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term217359 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term217451 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term217561 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap"));
        setField(term217359, term217359.getClass(), "delegateMap", null);
        setIntField(term217359, term217359.getClass(), "size", 3);
        setIntField(term217359, term217359.getClass(), "hash3", 0);
        setField(term217451, term217451.getClass(), "delegateMap", null);
        setIntField(term217451, term217451.getClass(), "size", 3);
        setField(term217451, term217451.getClass(), "key3", term217561);
        setField(term217451, term217451.getClass(), "key2", null);
        setField(term217451, term217451.getClass(), "value2", null);
        setIntField(term217451, term217451.getClass(), "hash3", -1);
        setIntField(term217451, term217451.getClass(), "hash2", 0);
        setIntField(term217451, term217451.getClass(), "hash1", -1);
        setField(term217359, term217359.getClass(), "key3", term217451);
        setIntField(term217359, term217359.getClass(), "hash2", 0);
        term217653 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term217745 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setField(term217653, term217653.getClass(), "delegateMap", null);
        setIntField(term217653, term217653.getClass(), "size", 3);
        setIntField(term217653, term217653.getClass(), "hash3", 0);
        setField(term217653, term217653.getClass(), "value3", null);
        setIntField(term217653, term217653.getClass(), "hash2", 0);
        setField(term217653, term217653.getClass(), "value2", null);
        setIntField(term217653, term217653.getClass(), "hash1", 0);
        setField(term217653, term217653.getClass(), "value1", null);
        setField(term217653, term217653.getClass(), "key3", null);
        setField(term217745, term217745.getClass(), "delegateMap", null);
        setIntField(term217745, term217745.getClass(), "size", 0);
        setField(term217653, term217653.getClass(), "key2", term217745);
        term217837 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setIntField(term217837, term217837.getClass(), "size", 3);
        setIntField(term217837, term217837.getClass(), "hash1", 0);
        setIntField(term217837, term217837.getClass(), "hash2", 0);
        setIntField(term217837, term217837.getClass(), "hash3", 0);
        setField(term217837, term217837.getClass(), "key1", null);
        setField(term217837, term217837.getClass(), "key2", null);
        setField(term217837, term217837.getClass(), "key3", null);
        setField(term217837, term217837.getClass(), "value1", null);
        setField(term217837, term217837.getClass(), "value2", null);
        setField(term217837, term217837.getClass(), "value3", null);
        setField(term217837, term217837.getClass(), "delegateMap", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.map.Flat3Map");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.Object");
        argTypes[1] = Class.forName("java.lang.Object");
        Object[] args = new Object[2];
        args[0] = term217653;
        args[1] = null;
        Object retValue = callMethod(klass, "put", argTypes, term217359, args);
        assertTrue(recursiveEquals(term217653, term217837));
        assertTrue(recursiveEquals(retValue, null));
    }

};


