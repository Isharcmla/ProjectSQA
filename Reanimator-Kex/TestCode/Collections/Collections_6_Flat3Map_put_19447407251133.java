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

public class Flat3Map_put_19447407251133 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term341263;
     Object term341807;
     Object term342111;
     Object term342118;

    public Flat3Map_put_19447407251133() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term341263 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term341355 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term341447 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term341485 = newInstance(Class.forName("java.lang.Object"));
        term341807 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term341853 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term341899 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setField(term341263, term341263.getClass(), "delegateMap", null);
        setIntField(term341263, term341263.getClass(), "size", 3);
        setIntField(term341263, term341263.getClass(), "hash3", 0);
        setField(term341355, term341355.getClass(), "delegateMap", null);
        setIntField(term341355, term341355.getClass(), "size", 3);
        setField(term341447, term341447.getClass(), "delegateMap", null);
        setIntField(term341447, term341447.getClass(), "size", 0);
        setField(term341355, term341355.getClass(), "key3", term341447);
        setField(term341355, term341355.getClass(), "key2", null);
        setField(term341355, term341355.getClass(), "value2", null);
        setIntField(term341355, term341355.getClass(), "hash3", 0);
        setField(term341355, term341355.getClass(), "value3", null);
        setIntField(term341355, term341355.getClass(), "hash2", 0);
        setIntField(term341355, term341355.getClass(), "hash1", 0);
        setField(term341355, term341355.getClass(), "key1", term341485);
        setField(term341263, term341263.getClass(), "key3", term341355);
        setIntField(term341263, term341263.getClass(), "hash2", 0);
        setField(term341807, term341807.getClass(), "delegateMap", null);
        setIntField(term341807, term341807.getClass(), "size", 3);
        setIntField(term341807, term341807.getClass(), "hash3", 0);
        setField(term341807, term341807.getClass(), "value3", null);
        setIntField(term341807, term341807.getClass(), "hash2", 0);
        setField(term341807, term341807.getClass(), "value2", null);
        setIntField(term341807, term341807.getClass(), "hash1", 0);
        setField(term341807, term341807.getClass(), "value1", null);
        setField(term341807, term341807.getClass(), "key3", null);
        setField(term341853, term341853.getClass(), "delegateMap", null);
        setIntField(term341853, term341853.getClass(), "size", 0);
        setField(term341807, term341807.getClass(), "key2", term341853);
        setField(term341899, term341899.getClass(), "delegateMap", null);
        setIntField(term341899, term341899.getClass(), "size", 1);
        setIntField(term341899, term341899.getClass(), "hash1", 0);
        setField(term341899, term341899.getClass(), "value1", null);
        setField(term341807, term341807.getClass(), "key1", term341899);
        setField(term341263, term341263.getClass(), "key2", term341807);
        term342111 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term342112 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term342113 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term342114 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term342115 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term342116 = newInstance(Class.forName("java.lang.Object"));
        Object term342117 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setIntField(term342111, term342111.getClass(), "size", 3);
        setIntField(term342111, term342111.getClass(), "hash1", 0);
        setIntField(term342111, term342111.getClass(), "hash2", 0);
        setIntField(term342111, term342111.getClass(), "hash3", 0);
        setField(term342111, term342111.getClass(), "key1", null);
        setIntField(term342112, term342112.getClass(), "size", 3);
        setIntField(term342112, term342112.getClass(), "hash1", 0);
        setIntField(term342112, term342112.getClass(), "hash2", 0);
        setIntField(term342112, term342112.getClass(), "hash3", 0);
        setIntField(term342113, term342113.getClass(), "size", 1);
        setIntField(term342113, term342113.getClass(), "hash1", 0);
        setIntField(term342113, term342113.getClass(), "hash2", 0);
        setIntField(term342113, term342113.getClass(), "hash3", 0);
        setField(term342113, term342113.getClass(), "key1", null);
        setField(term342113, term342113.getClass(), "key2", null);
        setField(term342113, term342113.getClass(), "key3", null);
        setField(term342113, term342113.getClass(), "value1", null);
        setField(term342113, term342113.getClass(), "value2", null);
        setField(term342113, term342113.getClass(), "value3", null);
        setField(term342113, term342113.getClass(), "delegateMap", null);
        setField(term342112, term342112.getClass(), "key1", term342113);
        setIntField(term342114, term342114.getClass(), "size", 0);
        setIntField(term342114, term342114.getClass(), "hash1", 0);
        setIntField(term342114, term342114.getClass(), "hash2", 0);
        setIntField(term342114, term342114.getClass(), "hash3", 0);
        setField(term342114, term342114.getClass(), "key1", null);
        setField(term342114, term342114.getClass(), "key2", null);
        setField(term342114, term342114.getClass(), "key3", null);
        setField(term342114, term342114.getClass(), "value1", null);
        setField(term342114, term342114.getClass(), "value2", null);
        setField(term342114, term342114.getClass(), "value3", null);
        setField(term342114, term342114.getClass(), "delegateMap", null);
        setField(term342112, term342112.getClass(), "key2", term342114);
        setField(term342112, term342112.getClass(), "key3", null);
        setField(term342112, term342112.getClass(), "value1", null);
        setField(term342112, term342112.getClass(), "value2", null);
        setField(term342112, term342112.getClass(), "value3", null);
        setField(term342112, term342112.getClass(), "delegateMap", null);
        setField(term342111, term342111.getClass(), "key2", term342112);
        setIntField(term342115, term342115.getClass(), "size", 3);
        setIntField(term342115, term342115.getClass(), "hash1", 0);
        setIntField(term342115, term342115.getClass(), "hash2", 0);
        setIntField(term342115, term342115.getClass(), "hash3", 0);
        setField(term342115, term342115.getClass(), "key1", term342116);
        setField(term342115, term342115.getClass(), "key2", null);
        setIntField(term342117, term342117.getClass(), "size", 0);
        setIntField(term342117, term342117.getClass(), "hash1", 0);
        setIntField(term342117, term342117.getClass(), "hash2", 0);
        setIntField(term342117, term342117.getClass(), "hash3", 0);
        setField(term342117, term342117.getClass(), "key1", null);
        setField(term342117, term342117.getClass(), "key2", null);
        setField(term342117, term342117.getClass(), "key3", null);
        setField(term342117, term342117.getClass(), "value1", null);
        setField(term342117, term342117.getClass(), "value2", null);
        setField(term342117, term342117.getClass(), "value3", null);
        setField(term342117, term342117.getClass(), "delegateMap", null);
        setField(term342115, term342115.getClass(), "key3", term342117);
        setField(term342115, term342115.getClass(), "value1", null);
        setField(term342115, term342115.getClass(), "value2", null);
        setField(term342115, term342115.getClass(), "value3", null);
        setField(term342115, term342115.getClass(), "delegateMap", null);
        setField(term342111, term342111.getClass(), "key3", term342115);
        setField(term342111, term342111.getClass(), "value1", null);
        setField(term342111, term342111.getClass(), "value2", null);
        setField(term342111, term342111.getClass(), "value3", null);
        setField(term342111, term342111.getClass(), "delegateMap", null);
        term342118 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term342119 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term342120 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setIntField(term342118, term342118.getClass(), "size", 3);
        setIntField(term342118, term342118.getClass(), "hash1", 0);
        setIntField(term342118, term342118.getClass(), "hash2", 0);
        setIntField(term342118, term342118.getClass(), "hash3", 0);
        setIntField(term342119, term342119.getClass(), "size", 1);
        setIntField(term342119, term342119.getClass(), "hash1", 0);
        setIntField(term342119, term342119.getClass(), "hash2", 0);
        setIntField(term342119, term342119.getClass(), "hash3", 0);
        setField(term342119, term342119.getClass(), "key1", null);
        setField(term342119, term342119.getClass(), "key2", null);
        setField(term342119, term342119.getClass(), "key3", null);
        setField(term342119, term342119.getClass(), "value1", null);
        setField(term342119, term342119.getClass(), "value2", null);
        setField(term342119, term342119.getClass(), "value3", null);
        setField(term342119, term342119.getClass(), "delegateMap", null);
        setField(term342118, term342118.getClass(), "key1", term342119);
        setIntField(term342120, term342120.getClass(), "size", 0);
        setIntField(term342120, term342120.getClass(), "hash1", 0);
        setIntField(term342120, term342120.getClass(), "hash2", 0);
        setIntField(term342120, term342120.getClass(), "hash3", 0);
        setField(term342120, term342120.getClass(), "key1", null);
        setField(term342120, term342120.getClass(), "key2", null);
        setField(term342120, term342120.getClass(), "key3", null);
        setField(term342120, term342120.getClass(), "value1", null);
        setField(term342120, term342120.getClass(), "value2", null);
        setField(term342120, term342120.getClass(), "value3", null);
        setField(term342120, term342120.getClass(), "delegateMap", null);
        setField(term342118, term342118.getClass(), "key2", term342120);
        setField(term342118, term342118.getClass(), "key3", null);
        setField(term342118, term342118.getClass(), "value1", null);
        setField(term342118, term342118.getClass(), "value2", null);
        setField(term342118, term342118.getClass(), "value3", null);
        setField(term342118, term342118.getClass(), "delegateMap", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.map.Flat3Map");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.Object");
        argTypes[1] = Class.forName("java.lang.Object");
        Object[] args = new Object[2];
        args[0] = term341807;
        args[1] = null;
        Object retValue = callMethod(klass, "put", argTypes, term341263, args);
        assertTrue(recursiveEquals(term341263, term342111));
        assertTrue(recursiveEquals(term341807, term342118));
        assertTrue(recursiveEquals(retValue, null));
    }

};


