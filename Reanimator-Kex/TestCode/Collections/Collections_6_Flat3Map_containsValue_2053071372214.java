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

public class Flat3Map_containsValue_2053071372214 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term34907;
     Object term35121;
     Object term35901;
     Object term35905;

    public Flat3Map_containsValue_2053071372214() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term34907 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term34945 = newInstance(Class.forName("java.lang.Object"));
        Object term34983 = newInstance(Class.forName("java.lang.Object"));
        term35121 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setField(term34907, term34907.getClass(), "delegateMap", null);
        setIntField(term34907, term34907.getClass(), "size", 3);
        setField(term34907, term34907.getClass(), "value3", term34945);
        setField(term34907, term34907.getClass(), "value2", term34983);
        setField(term35121, term35121.getClass(), "delegateMap", null);
        setField(term34907, term34907.getClass(), "value1", term35121);
        term35901 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term35902 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term35903 = newInstance(Class.forName("java.lang.Object"));
        Object term35904 = newInstance(Class.forName("java.lang.Object"));
        setIntField(term35901, term35901.getClass(), "size", 3);
        setIntField(term35901, term35901.getClass(), "hash1", 0);
        setIntField(term35901, term35901.getClass(), "hash2", 0);
        setIntField(term35901, term35901.getClass(), "hash3", 0);
        setField(term35901, term35901.getClass(), "key1", null);
        setField(term35901, term35901.getClass(), "key2", null);
        setField(term35901, term35901.getClass(), "key3", null);
        setIntField(term35902, term35902.getClass(), "size", 0);
        setIntField(term35902, term35902.getClass(), "hash1", 0);
        setIntField(term35902, term35902.getClass(), "hash2", 0);
        setIntField(term35902, term35902.getClass(), "hash3", 0);
        setField(term35902, term35902.getClass(), "key1", null);
        setField(term35902, term35902.getClass(), "key2", null);
        setField(term35902, term35902.getClass(), "key3", null);
        setField(term35902, term35902.getClass(), "value1", null);
        setField(term35902, term35902.getClass(), "value2", null);
        setField(term35902, term35902.getClass(), "value3", null);
        setField(term35902, term35902.getClass(), "delegateMap", null);
        setField(term35901, term35901.getClass(), "value1", term35902);
        setField(term35901, term35901.getClass(), "value2", term35903);
        setField(term35901, term35901.getClass(), "value3", term35904);
        setField(term35901, term35901.getClass(), "delegateMap", null);
        term35905 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setIntField(term35905, term35905.getClass(), "size", 0);
        setIntField(term35905, term35905.getClass(), "hash1", 0);
        setIntField(term35905, term35905.getClass(), "hash2", 0);
        setIntField(term35905, term35905.getClass(), "hash3", 0);
        setField(term35905, term35905.getClass(), "key1", null);
        setField(term35905, term35905.getClass(), "key2", null);
        setField(term35905, term35905.getClass(), "key3", null);
        setField(term35905, term35905.getClass(), "value1", null);
        setField(term35905, term35905.getClass(), "value2", null);
        setField(term35905, term35905.getClass(), "value3", null);
        setField(term35905, term35905.getClass(), "delegateMap", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.map.Flat3Map");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term35121;
        callMethod(klass, "containsValue", argTypes, term34907, args);
        assertTrue(recursiveEquals(term34907, term35901));
        assertTrue(recursiveEquals(term35121, term35905));
    }

};


