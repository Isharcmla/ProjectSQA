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

public class Flat3Map_get_229621781321 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term53871;
     Object term53927;
     Object term53940;
     Object term53941;

    public Flat3Map_get_229621781321() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term53871 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setField(term53871, term53871.getClass(), "delegateMap", null);
        setIntField(term53871, term53871.getClass(), "size", 1);
        term53927 = newInstance(Class.forName("java.util.ServiceLoader$3"));
        term53940 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setIntField(term53940, term53940.getClass(), "size", 1);
        setIntField(term53940, term53940.getClass(), "hash1", 0);
        setIntField(term53940, term53940.getClass(), "hash2", 0);
        setIntField(term53940, term53940.getClass(), "hash3", 0);
        setField(term53940, term53940.getClass(), "key1", null);
        setField(term53940, term53940.getClass(), "key2", null);
        setField(term53940, term53940.getClass(), "key3", null);
        setField(term53940, term53940.getClass(), "value1", null);
        setField(term53940, term53940.getClass(), "value2", null);
        setField(term53940, term53940.getClass(), "value3", null);
        setField(term53940, term53940.getClass(), "delegateMap", null);
        term53941 = newInstance(Class.forName("java.util.ServiceLoader$3"));
        setIntField(term53941, term53941.getClass(), "expectedReloadCount", 0);
        setIntField(term53941, term53941.getClass(), "index", 0);
        setField(term53941, term53941.getClass(), "this$0", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.map.Flat3Map");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term53927;
        Object retValue = callMethod(klass, "get", argTypes, term53871, args);
        assertTrue(recursiveEquals(term53871, term53940));
        assertTrue(recursiveEquals(term53927, term53941));
        assertTrue(recursiveEquals(retValue, null));
    }

};


