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

public class Flat3Map_remove_8406902791010 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term201379;
     Object term201411;
     Object term203317;
     Object term203318;

    public Flat3Map_remove_8406902791010() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term201379 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setField(term201379, term201379.getClass(), "delegateMap", null);
        setIntField(term201379, term201379.getClass(), "size", 1);
        term201411 = newInstance(Class.forName("java.nio.Bits"));
        term203317 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setIntField(term203317, term203317.getClass(), "size", 1);
        setIntField(term203317, term203317.getClass(), "hash1", 0);
        setIntField(term203317, term203317.getClass(), "hash2", 0);
        setIntField(term203317, term203317.getClass(), "hash3", 0);
        setField(term203317, term203317.getClass(), "key1", null);
        setField(term203317, term203317.getClass(), "key2", null);
        setField(term203317, term203317.getClass(), "key3", null);
        setField(term203317, term203317.getClass(), "value1", null);
        setField(term203317, term203317.getClass(), "value2", null);
        setField(term203317, term203317.getClass(), "value3", null);
        setField(term203317, term203317.getClass(), "delegateMap", null);
        term203318 = newInstance(Class.forName("java.nio.Bits"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.map.Flat3Map");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term201411;
        Object retValue = callMethod(klass, "remove", argTypes, term201379, args);
        assertTrue(recursiveEquals(term201379, term203317));
        assertTrue(recursiveEquals(term201411, term203318));
        assertTrue(recursiveEquals(retValue, null));
    }

};
