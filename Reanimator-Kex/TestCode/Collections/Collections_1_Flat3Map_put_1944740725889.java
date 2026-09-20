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

public class Flat3Map_put_1944740725889 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term179210;
     Object term179794;
     Object term179796;

    public Flat3Map_put_1944740725889() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term179210 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term179249 = newInstance(Class.forName("java.lang.invoke.MethodHandleNatives"));
        setField(term179210, term179210.getClass(), "delegateMap", null);
        setIntField(term179210, term179210.getClass(), "size", 1);
        setIntField(term179210, term179210.getClass(), "hash1", 0);
        setField(term179210, term179210.getClass(), "value1", term179249);
        term179794 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term179795 = newInstance(Class.forName("java.lang.invoke.MethodHandleNatives"));
        setIntField(term179794, term179794.getClass(), "size", 2);
        setIntField(term179794, term179794.getClass(), "hash1", 0);
        setIntField(term179794, term179794.getClass(), "hash2", 678910540);
        setIntField(term179794, term179794.getClass(), "hash3", 0);
        setField(term179794, term179794.getClass(), "key1", null);
        setField(term179794, term179794.getClass(), "key2", term179794);
        setField(term179794, term179794.getClass(), "key3", null);
        setField(term179794, term179794.getClass(), "value1", term179795);
        setField(term179794, term179794.getClass(), "value2", null);
        setField(term179794, term179794.getClass(), "value3", null);
        setField(term179794, term179794.getClass(), "delegateMap", null);
        term179796 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term179797 = newInstance(Class.forName("java.lang.invoke.MethodHandleNatives"));
        setIntField(term179796, term179796.getClass(), "size", 2);
        setIntField(term179796, term179796.getClass(), "hash1", 0);
        setIntField(term179796, term179796.getClass(), "hash2", 678910540);
        setIntField(term179796, term179796.getClass(), "hash3", 0);
        setField(term179796, term179796.getClass(), "key1", null);
        setField(term179796, term179796.getClass(), "key2", term179796);
        setField(term179796, term179796.getClass(), "key3", null);
        setField(term179796, term179796.getClass(), "value1", term179797);
        setField(term179796, term179796.getClass(), "value2", null);
        setField(term179796, term179796.getClass(), "value3", null);
        setField(term179796, term179796.getClass(), "delegateMap", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.map.Flat3Map");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.Object");
        argTypes[1] = Class.forName("java.lang.Object");
        Object[] args = new Object[2];
        args[0] = term179210;
        args[1] = null;
        Object retValue = callMethod(klass, "put", argTypes, term179210, args);
        assertTrue(recursiveEquals(term179210, term179794));
        assertTrue(recursiveEquals(term179210, term179796));
        assertTrue(recursiveEquals(retValue, null));
    }

};
