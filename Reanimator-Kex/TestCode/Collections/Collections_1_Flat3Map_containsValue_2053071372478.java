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

public class Flat3Map_containsValue_2053071372478 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term90175;
     Object term90498;
     Object term90501;

    public Flat3Map_containsValue_2053071372478() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term90175 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term90221 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term90267 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setField(term90175, term90175.getClass(), "delegateMap", null);
        setIntField(term90175, term90175.getClass(), "size", -1);
        setField(term90221, term90221.getClass(), "delegateMap", null);
        setIntField(term90221, term90221.getClass(), "size", 0);
        setField(term90175, term90175.getClass(), "value2", term90221);
        setField(term90175, term90175.getClass(), "value1", term90267);
        term90498 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term90499 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term90500 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setIntField(term90498, term90498.getClass(), "size", -1);
        setIntField(term90498, term90498.getClass(), "hash1", 0);
        setIntField(term90498, term90498.getClass(), "hash2", 0);
        setIntField(term90498, term90498.getClass(), "hash3", 0);
        setField(term90498, term90498.getClass(), "key1", null);
        setField(term90498, term90498.getClass(), "key2", null);
        setField(term90498, term90498.getClass(), "key3", null);
        setIntField(term90499, term90499.getClass(), "size", 0);
        setIntField(term90499, term90499.getClass(), "hash1", 0);
        setIntField(term90499, term90499.getClass(), "hash2", 0);
        setIntField(term90499, term90499.getClass(), "hash3", 0);
        setField(term90499, term90499.getClass(), "key1", null);
        setField(term90499, term90499.getClass(), "key2", null);
        setField(term90499, term90499.getClass(), "key3", null);
        setField(term90499, term90499.getClass(), "value1", null);
        setField(term90499, term90499.getClass(), "value2", null);
        setField(term90499, term90499.getClass(), "value3", null);
        setField(term90499, term90499.getClass(), "delegateMap", null);
        setField(term90498, term90498.getClass(), "value1", term90499);
        setIntField(term90500, term90500.getClass(), "size", 0);
        setIntField(term90500, term90500.getClass(), "hash1", 0);
        setIntField(term90500, term90500.getClass(), "hash2", 0);
        setIntField(term90500, term90500.getClass(), "hash3", 0);
        setField(term90500, term90500.getClass(), "key1", null);
        setField(term90500, term90500.getClass(), "key2", null);
        setField(term90500, term90500.getClass(), "key3", null);
        setField(term90500, term90500.getClass(), "value1", null);
        setField(term90500, term90500.getClass(), "value2", null);
        setField(term90500, term90500.getClass(), "value3", null);
        setField(term90500, term90500.getClass(), "delegateMap", null);
        setField(term90498, term90498.getClass(), "value2", term90500);
        setField(term90498, term90498.getClass(), "value3", null);
        setField(term90498, term90498.getClass(), "delegateMap", null);
        term90501 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term90502 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term90503 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setIntField(term90501, term90501.getClass(), "size", -1);
        setIntField(term90501, term90501.getClass(), "hash1", 0);
        setIntField(term90501, term90501.getClass(), "hash2", 0);
        setIntField(term90501, term90501.getClass(), "hash3", 0);
        setField(term90501, term90501.getClass(), "key1", null);
        setField(term90501, term90501.getClass(), "key2", null);
        setField(term90501, term90501.getClass(), "key3", null);
        setIntField(term90502, term90502.getClass(), "size", 0);
        setIntField(term90502, term90502.getClass(), "hash1", 0);
        setIntField(term90502, term90502.getClass(), "hash2", 0);
        setIntField(term90502, term90502.getClass(), "hash3", 0);
        setField(term90502, term90502.getClass(), "key1", null);
        setField(term90502, term90502.getClass(), "key2", null);
        setField(term90502, term90502.getClass(), "key3", null);
        setField(term90502, term90502.getClass(), "value1", null);
        setField(term90502, term90502.getClass(), "value2", null);
        setField(term90502, term90502.getClass(), "value3", null);
        setField(term90502, term90502.getClass(), "delegateMap", null);
        setField(term90501, term90501.getClass(), "value1", term90502);
        setIntField(term90503, term90503.getClass(), "size", 0);
        setIntField(term90503, term90503.getClass(), "hash1", 0);
        setIntField(term90503, term90503.getClass(), "hash2", 0);
        setIntField(term90503, term90503.getClass(), "hash3", 0);
        setField(term90503, term90503.getClass(), "key1", null);
        setField(term90503, term90503.getClass(), "key2", null);
        setField(term90503, term90503.getClass(), "key3", null);
        setField(term90503, term90503.getClass(), "value1", null);
        setField(term90503, term90503.getClass(), "value2", null);
        setField(term90503, term90503.getClass(), "value3", null);
        setField(term90503, term90503.getClass(), "delegateMap", null);
        setField(term90501, term90501.getClass(), "value2", term90503);
        setField(term90501, term90501.getClass(), "value3", null);
        setField(term90501, term90501.getClass(), "delegateMap", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.map.Flat3Map");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term90175;
        callMethod(klass, "containsValue", argTypes, term90175, args);
        assertTrue(recursiveEquals(term90175, term90498));
        assertTrue(recursiveEquals(term90175, term90501));
    }

};
