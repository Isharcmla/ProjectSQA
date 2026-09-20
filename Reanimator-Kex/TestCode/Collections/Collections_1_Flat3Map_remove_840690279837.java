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

public class Flat3Map_remove_840690279837 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term169124;
     Object term169156;
     Object term169231;
     Object term169232;

    public Flat3Map_remove_840690279837() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term169124 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setField(term169124, term169124.getClass(), "delegateMap", null);
        setIntField(term169124, term169124.getClass(), "size", 1073741824);
        term169156 = newInstance(Class.forName("java.nio.Bits"));
        term169231 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setIntField(term169231, term169231.getClass(), "size", 1073741824);
        setIntField(term169231, term169231.getClass(), "hash1", 0);
        setIntField(term169231, term169231.getClass(), "hash2", 0);
        setIntField(term169231, term169231.getClass(), "hash3", 0);
        setField(term169231, term169231.getClass(), "key1", null);
        setField(term169231, term169231.getClass(), "key2", null);
        setField(term169231, term169231.getClass(), "key3", null);
        setField(term169231, term169231.getClass(), "value1", null);
        setField(term169231, term169231.getClass(), "value2", null);
        setField(term169231, term169231.getClass(), "value3", null);
        setField(term169231, term169231.getClass(), "delegateMap", null);
        term169232 = newInstance(Class.forName("java.nio.Bits"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.map.Flat3Map");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term169156;
        Object retValue = callMethod(klass, "remove", argTypes, term169124, args);
        assertTrue(recursiveEquals(term169124, term169231));
        assertTrue(recursiveEquals(term169156, term169232));
        assertTrue(recursiveEquals(retValue, null));
    }

};
