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

public class Flat3Map_containsKey_76092510521 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term98532;
     Object term98838;
     Object term98839;

    public Flat3Map_containsKey_76092510521() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term98532 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setField(term98532, term98532.getClass(), "delegateMap", null);
        setIntField(term98532, term98532.getClass(), "size", 2);
        setIntField(term98532, term98532.getClass(), "hash2", -1);
        setField(term98532, term98532.getClass(), "value2", null);
        setIntField(term98532, term98532.getClass(), "hash1", 0);
        setField(term98532, term98532.getClass(), "value1", null);
        term98838 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setIntField(term98838, term98838.getClass(), "size", 2);
        setIntField(term98838, term98838.getClass(), "hash1", 0);
        setIntField(term98838, term98838.getClass(), "hash2", -1);
        setIntField(term98838, term98838.getClass(), "hash3", 0);
        setField(term98838, term98838.getClass(), "key1", null);
        setField(term98838, term98838.getClass(), "key2", null);
        setField(term98838, term98838.getClass(), "key3", null);
        setField(term98838, term98838.getClass(), "value1", null);
        setField(term98838, term98838.getClass(), "value2", null);
        setField(term98838, term98838.getClass(), "value3", null);
        setField(term98838, term98838.getClass(), "delegateMap", null);
        term98839 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setIntField(term98839, term98839.getClass(), "size", 2);
        setIntField(term98839, term98839.getClass(), "hash1", 0);
        setIntField(term98839, term98839.getClass(), "hash2", -1);
        setIntField(term98839, term98839.getClass(), "hash3", 0);
        setField(term98839, term98839.getClass(), "key1", null);
        setField(term98839, term98839.getClass(), "key2", null);
        setField(term98839, term98839.getClass(), "key3", null);
        setField(term98839, term98839.getClass(), "value1", null);
        setField(term98839, term98839.getClass(), "value2", null);
        setField(term98839, term98839.getClass(), "value3", null);
        setField(term98839, term98839.getClass(), "delegateMap", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.map.Flat3Map");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term98532;
        callMethod(klass, "containsKey", argTypes, term98532, args);
        assertTrue(recursiveEquals(term98532, term98838));
        assertTrue(recursiveEquals(term98532, term98839));
    }

};
