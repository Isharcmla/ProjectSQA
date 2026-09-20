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

public class Flat3Map_containsKey_76092510626 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term121627;
     Object term121719;
     Object term122088;
     Object term122089;

    public Flat3Map_containsKey_76092510626() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term121627 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setField(term121627, term121627.getClass(), "delegateMap", null);
        setIntField(term121627, term121627.getClass(), "size", 2);
        setIntField(term121627, term121627.getClass(), "hash2", 0);
        setField(term121627, term121627.getClass(), "key2", null);
        term121719 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setField(term121719, term121719.getClass(), "delegateMap", null);
        setIntField(term121719, term121719.getClass(), "size", 2);
        setIntField(term121719, term121719.getClass(), "hash2", 0);
        setField(term121719, term121719.getClass(), "value2", null);
        setIntField(term121719, term121719.getClass(), "hash1", 0);
        setField(term121719, term121719.getClass(), "value1", null);
        setField(term121719, term121719.getClass(), "key2", null);
        term122088 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setIntField(term122088, term122088.getClass(), "size", 2);
        setIntField(term122088, term122088.getClass(), "hash1", 0);
        setIntField(term122088, term122088.getClass(), "hash2", 0);
        setIntField(term122088, term122088.getClass(), "hash3", 0);
        setField(term122088, term122088.getClass(), "key1", null);
        setField(term122088, term122088.getClass(), "key2", null);
        setField(term122088, term122088.getClass(), "key3", null);
        setField(term122088, term122088.getClass(), "value1", null);
        setField(term122088, term122088.getClass(), "value2", null);
        setField(term122088, term122088.getClass(), "value3", null);
        setField(term122088, term122088.getClass(), "delegateMap", null);
        term122089 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setIntField(term122089, term122089.getClass(), "size", 2);
        setIntField(term122089, term122089.getClass(), "hash1", 0);
        setIntField(term122089, term122089.getClass(), "hash2", 0);
        setIntField(term122089, term122089.getClass(), "hash3", 0);
        setField(term122089, term122089.getClass(), "key1", null);
        setField(term122089, term122089.getClass(), "key2", null);
        setField(term122089, term122089.getClass(), "key3", null);
        setField(term122089, term122089.getClass(), "value1", null);
        setField(term122089, term122089.getClass(), "value2", null);
        setField(term122089, term122089.getClass(), "value3", null);
        setField(term122089, term122089.getClass(), "delegateMap", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.map.Flat3Map");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term121719;
        callMethod(klass, "containsKey", argTypes, term121627, args);
        assertTrue(recursiveEquals(term121627, term122088));
        assertTrue(recursiveEquals(term121719, term122089));
    }

};
