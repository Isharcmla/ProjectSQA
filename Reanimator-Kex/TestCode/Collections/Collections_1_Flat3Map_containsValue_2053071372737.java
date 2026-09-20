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

public class Flat3Map_containsValue_2053071372737 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term148114;
     Object term148318;
     Object term149175;
     Object term149177;

    public Flat3Map_containsValue_2053071372737() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term148114 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term148226 = newInstance(Class.forName("org.apache.commons.collections.map.CaseInsensitiveMap"));
        setField(term148114, term148114.getClass(), "delegateMap", null);
        setIntField(term148114, term148114.getClass(), "size", 1);
        setField(term148114, term148114.getClass(), "value1", term148226);
        term148318 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term148430 = newInstance(Class.forName("org.apache.commons.collections.map.CaseInsensitiveMap"));
        setField(term148318, term148318.getClass(), "delegateMap", term148430);
        term149175 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term149176 = newInstance(Class.forName("org.apache.commons.collections.map.CaseInsensitiveMap"));
        setIntField(term149175, term149175.getClass(), "size", 1);
        setIntField(term149175, term149175.getClass(), "hash1", 0);
        setIntField(term149175, term149175.getClass(), "hash2", 0);
        setIntField(term149175, term149175.getClass(), "hash3", 0);
        setField(term149175, term149175.getClass(), "key1", null);
        setField(term149175, term149175.getClass(), "key2", null);
        setField(term149175, term149175.getClass(), "key3", null);
        setFloatField(term149176, term149176.getClass(), "loadFactor", 0.0F);
        setIntField(term149176, term149176.getClass(), "size", 0);
        setField(term149176, term149176.getClass(), "data", null);
        setIntField(term149176, term149176.getClass(), "threshold", 0);
        setIntField(term149176, term149176.getClass(), "modCount", 0);
        setField(term149176, term149176.getClass(), "entrySet", null);
        setField(term149176, term149176.getClass(), "keySet", null);
        setField(term149176, term149176.getClass(), "values", null);
        setField(term149176, term149176.getClass(), "keySet", null);
        setField(term149176, term149176.getClass(), "values", null);
        setField(term149175, term149175.getClass(), "value1", term149176);
        setField(term149175, term149175.getClass(), "value2", null);
        setField(term149175, term149175.getClass(), "value3", null);
        setField(term149175, term149175.getClass(), "delegateMap", null);
        term149177 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term149178 = newInstance(Class.forName("org.apache.commons.collections.map.CaseInsensitiveMap"));
        setIntField(term149177, term149177.getClass(), "size", 0);
        setIntField(term149177, term149177.getClass(), "hash1", 0);
        setIntField(term149177, term149177.getClass(), "hash2", 0);
        setIntField(term149177, term149177.getClass(), "hash3", 0);
        setField(term149177, term149177.getClass(), "key1", null);
        setField(term149177, term149177.getClass(), "key2", null);
        setField(term149177, term149177.getClass(), "key3", null);
        setField(term149177, term149177.getClass(), "value1", null);
        setField(term149177, term149177.getClass(), "value2", null);
        setField(term149177, term149177.getClass(), "value3", null);
        setFloatField(term149178, term149178.getClass(), "loadFactor", 0.0F);
        setIntField(term149178, term149178.getClass(), "size", 0);
        setField(term149178, term149178.getClass(), "data", null);
        setIntField(term149178, term149178.getClass(), "threshold", 0);
        setIntField(term149178, term149178.getClass(), "modCount", 0);
        setField(term149178, term149178.getClass(), "entrySet", null);
        setField(term149178, term149178.getClass(), "keySet", null);
        setField(term149178, term149178.getClass(), "values", null);
        setField(term149178, term149178.getClass(), "keySet", null);
        setField(term149178, term149178.getClass(), "values", null);
        setField(term149177, term149177.getClass(), "delegateMap", term149178);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.map.Flat3Map");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term148318;
        callMethod(klass, "containsValue", argTypes, term148114, args);
        assertTrue(recursiveEquals(term148114, term149175));
        assertTrue(recursiveEquals(term148318, term149177));
    }

};
