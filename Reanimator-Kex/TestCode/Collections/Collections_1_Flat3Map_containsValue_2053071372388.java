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

public class Flat3Map_containsValue_2053071372388 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term71428;
     Object term71520;
     Object term71843;
     Object term71844;

    public Flat3Map_containsValue_2053071372388() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term71428 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setField(term71428, term71428.getClass(), "delegateMap", null);
        setIntField(term71428, term71428.getClass(), "size", 0);
        setField(term71428, term71428.getClass(), "value1", term71428);
        term71520 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setField(term71520, term71520.getClass(), "delegateMap", null);
        setIntField(term71520, term71520.getClass(), "size", 0);
        term71843 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setIntField(term71843, term71843.getClass(), "size", 0);
        setIntField(term71843, term71843.getClass(), "hash1", 0);
        setIntField(term71843, term71843.getClass(), "hash2", 0);
        setIntField(term71843, term71843.getClass(), "hash3", 0);
        setField(term71843, term71843.getClass(), "key1", null);
        setField(term71843, term71843.getClass(), "key2", null);
        setField(term71843, term71843.getClass(), "key3", null);
        setField(term71843, term71843.getClass(), "value1", term71843);
        setField(term71843, term71843.getClass(), "value2", null);
        setField(term71843, term71843.getClass(), "value3", null);
        setField(term71843, term71843.getClass(), "delegateMap", null);
        term71844 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setIntField(term71844, term71844.getClass(), "size", 0);
        setIntField(term71844, term71844.getClass(), "hash1", 0);
        setIntField(term71844, term71844.getClass(), "hash2", 0);
        setIntField(term71844, term71844.getClass(), "hash3", 0);
        setField(term71844, term71844.getClass(), "key1", null);
        setField(term71844, term71844.getClass(), "key2", null);
        setField(term71844, term71844.getClass(), "key3", null);
        setField(term71844, term71844.getClass(), "value1", null);
        setField(term71844, term71844.getClass(), "value2", null);
        setField(term71844, term71844.getClass(), "value3", null);
        setField(term71844, term71844.getClass(), "delegateMap", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.map.Flat3Map");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term71520;
        callMethod(klass, "containsValue", argTypes, term71428, args);
        assertTrue(recursiveEquals(term71428, term71843));
        assertTrue(recursiveEquals(term71520, term71844));
    }

};
