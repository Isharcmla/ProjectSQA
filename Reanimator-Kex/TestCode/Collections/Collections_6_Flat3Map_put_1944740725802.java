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

public class Flat3Map_put_1944740725802 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term201792;

    public Flat3Map_put_1944740725802() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term201792 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term201847 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap"));
        setField(term201792, term201792.getClass(), "delegateMap", null);
        setIntField(term201792, term201792.getClass(), "size", 1);
        setIntField(term201792, term201792.getClass(), "hash1", 0);
        setIntField(term201847, term201847.getClass(), "size", 0);
        setField(term201792, term201792.getClass(), "value1", term201847);
        setField(term201792, term201792.getClass(), "key1", term201792);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.map.Flat3Map");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.Object");
        argTypes[1] = Class.forName("java.lang.Object");
        Object[] args = new Object[2];
        args[0] = term201792;
        args[1] = null;
        Object retValue = callMethod(klass, "put", argTypes, term201792, args);
        assertTrue(recursiveEquals(term201792, (short) 2));
        assertTrue(recursiveEquals(retValue, (short) 2));
    }

};


