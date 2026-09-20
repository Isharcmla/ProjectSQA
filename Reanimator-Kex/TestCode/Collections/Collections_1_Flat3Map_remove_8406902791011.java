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

public class Flat3Map_remove_8406902791011 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term201525;
     Object term201557;
     Object term203332;
     Object term203333;

    public Flat3Map_remove_8406902791011() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term201525 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setField(term201525, term201525.getClass(), "delegateMap", null);
        setIntField(term201525, term201525.getClass(), "size", 3);
        term201557 = newInstance(Class.forName("java.nio.Bits"));
        term203332 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setIntField(term203332, term203332.getClass(), "size", 3);
        setIntField(term203332, term203332.getClass(), "hash1", 0);
        setIntField(term203332, term203332.getClass(), "hash2", 0);
        setIntField(term203332, term203332.getClass(), "hash3", 0);
        setField(term203332, term203332.getClass(), "key1", null);
        setField(term203332, term203332.getClass(), "key2", null);
        setField(term203332, term203332.getClass(), "key3", null);
        setField(term203332, term203332.getClass(), "value1", null);
        setField(term203332, term203332.getClass(), "value2", null);
        setField(term203332, term203332.getClass(), "value3", null);
        setField(term203332, term203332.getClass(), "delegateMap", null);
        term203333 = newInstance(Class.forName("java.nio.Bits"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.map.Flat3Map");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term201557;
        Object retValue = callMethod(klass, "remove", argTypes, term201525, args);
        assertTrue(recursiveEquals(term201525, term203332));
        assertTrue(recursiveEquals(term201557, term203333));
        assertTrue(recursiveEquals(retValue, null));
    }

};
