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
import java.util.HashMap;

public class Flat3Map_put_19447407251033 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term294201;
     Object term294527;
     Object term294916;

    public Flat3Map_put_19447407251033() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term294341 = new HashMap();
        term294201 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term294293 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term294435 = newInstance(Class.forName("org.apache.commons.collections.map.LinkedMap"));
        setField(term294201, term294201.getClass(), "delegateMap", null);
        setIntField(term294201, term294201.getClass(), "size", 3);
        setIntField(term294201, term294201.getClass(), "hash3", 681517056);
        setField(term294201, term294201.getClass(), "key3", null);
        setIntField(term294201, term294201.getClass(), "hash2", 681517056);
        setField(term294293, term294293.getClass(), "delegateMap", null);
        setIntField(term294293, term294293.getClass(), "size", 3);
        setField(term294293, term294293.getClass(), "key3", null);
        setField(term294293, term294293.getClass(), "value3", null);
        setIntField(term294293, term294293.getClass(), "hash3", 1073752081);
        setIntField(term294293, term294293.getClass(), "hash2", -1872494591);
        setIntField(term294293, term294293.getClass(), "hash1", 402657280);
        setField(term294293, term294293.getClass(), "value2", null);
        setField(term294293, term294293.getClass(), "value1", null);
        setField(term294201, term294201.getClass(), "key2", term294293);
        setIntField(term294201, term294201.getClass(), "hash1", 681517056);
        setField(term294201, term294201.getClass(), "key1", null);
        setField(term294201, term294201.getClass(), "value3", null);
        setField(term294201, term294201.getClass(), "value2", term294341);
        setField(term294201, term294201.getClass(), "value1", term294435);
        term294527 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term294621 = newInstance(Class.forName("org.apache.commons.collections.map.LinkedMap"));
        Object term294749 = newInstance(Class.forName("org.apache.commons.collections.iterators.EmptyOrderedIterator"));
        setField(term294527, term294527.getClass(), "delegateMap", null);
        setIntField(term294527, term294527.getClass(), "size", 3);
        setIntField(term294527, term294527.getClass(), "hash3", -214269952);
        setField(term294527, term294527.getClass(), "value3", null);
        setIntField(term294527, term294527.getClass(), "hash2", 541130752);
        setField(term294527, term294527.getClass(), "value2", null);
        setIntField(term294527, term294527.getClass(), "hash1", 354656256);
        setIntField(term294621, term294621.getClass(), "size", 0);
        setField(term294527, term294527.getClass(), "value1", term294621);
        setField(term294527, term294527.getClass(), "key3", null);
        setField(term294527, term294527.getClass(), "key2", null);
        setField(term294527, term294527.getClass(), "key1", term294749);
        term294916 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setIntField(term294916, term294916.getClass(), "size", 3);
        setIntField(term294916, term294916.getClass(), "hash1", 354656256);
        setIntField(term294916, term294916.getClass(), "hash2", 541130752);
        setIntField(term294916, term294916.getClass(), "hash3", -214269952);
        setField(term294916, term294916.getClass(), "key1", null);
        setField(term294916, term294916.getClass(), "key2", null);
        setField(term294916, term294916.getClass(), "key3", null);
        setField(term294916, term294916.getClass(), "value1", null);
        setField(term294916, term294916.getClass(), "value2", null);
        setField(term294916, term294916.getClass(), "value3", null);
        setField(term294916, term294916.getClass(), "delegateMap", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.map.Flat3Map");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.Object");
        argTypes[1] = Class.forName("java.lang.Object");
        Object[] args = new Object[2];
        args[0] = term294527;
        args[1] = null;
        Object retValue = callMethod(klass, "put", argTypes, term294201, args);
        assertTrue(recursiveEquals(term294527, term294916));
        assertTrue(recursiveEquals(retValue, null));
    }

};


