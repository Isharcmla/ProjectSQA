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

public class Flat3Map_put_19447407251055 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term304438;
     Object term304836;
     Object term304997;
     Object term305003;

    public Flat3Map_put_19447407251055() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term304438 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term304530 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term304568 = newInstance(Class.forName("java.lang.Object"));
        Object term304606 = newInstance(Class.forName("java.lang.Object"));
        term304836 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term304882 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setField(term304438, term304438.getClass(), "delegateMap", null);
        setIntField(term304438, term304438.getClass(), "size", 3);
        setIntField(term304438, term304438.getClass(), "hash3", 0);
        setField(term304530, term304530.getClass(), "delegateMap", null);
        setIntField(term304530, term304530.getClass(), "size", 3);
        setField(term304530, term304530.getClass(), "key3", term304568);
        setField(term304530, term304530.getClass(), "key2", null);
        setField(term304530, term304530.getClass(), "value2", null);
        setIntField(term304530, term304530.getClass(), "hash3", 0);
        setIntField(term304530, term304530.getClass(), "hash2", 0);
        setIntField(term304530, term304530.getClass(), "hash1", 0);
        setField(term304530, term304530.getClass(), "key1", term304606);
        setField(term304438, term304438.getClass(), "key3", term304530);
        setIntField(term304438, term304438.getClass(), "hash2", 0);
        setField(term304836, term304836.getClass(), "delegateMap", null);
        setIntField(term304836, term304836.getClass(), "size", 3);
        setIntField(term304836, term304836.getClass(), "hash3", 0);
        setField(term304836, term304836.getClass(), "value3", null);
        setIntField(term304836, term304836.getClass(), "hash2", 0);
        setField(term304836, term304836.getClass(), "value2", null);
        setIntField(term304836, term304836.getClass(), "hash1", 0);
        setField(term304836, term304836.getClass(), "value1", null);
        setField(term304836, term304836.getClass(), "key3", null);
        setField(term304882, term304882.getClass(), "delegateMap", null);
        setIntField(term304882, term304882.getClass(), "size", 2);
        setIntField(term304882, term304882.getClass(), "hash2", 0);
        setField(term304882, term304882.getClass(), "value2", null);
        setIntField(term304882, term304882.getClass(), "hash1", 0);
        setField(term304882, term304882.getClass(), "value1", null);
        setField(term304836, term304836.getClass(), "key2", term304882);
        setField(term304438, term304438.getClass(), "key2", term304836);
        term304997 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term304998 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term304999 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term305000 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term305001 = newInstance(Class.forName("java.lang.Object"));
        Object term305002 = newInstance(Class.forName("java.lang.Object"));
        setIntField(term304997, term304997.getClass(), "size", 3);
        setIntField(term304997, term304997.getClass(), "hash1", 0);
        setIntField(term304997, term304997.getClass(), "hash2", 0);
        setIntField(term304997, term304997.getClass(), "hash3", 0);
        setField(term304997, term304997.getClass(), "key1", null);
        setIntField(term304998, term304998.getClass(), "size", 3);
        setIntField(term304998, term304998.getClass(), "hash1", 0);
        setIntField(term304998, term304998.getClass(), "hash2", 0);
        setIntField(term304998, term304998.getClass(), "hash3", 0);
        setField(term304998, term304998.getClass(), "key1", null);
        setIntField(term304999, term304999.getClass(), "size", 2);
        setIntField(term304999, term304999.getClass(), "hash1", 0);
        setIntField(term304999, term304999.getClass(), "hash2", 0);
        setIntField(term304999, term304999.getClass(), "hash3", 0);
        setField(term304999, term304999.getClass(), "key1", null);
        setField(term304999, term304999.getClass(), "key2", null);
        setField(term304999, term304999.getClass(), "key3", null);
        setField(term304999, term304999.getClass(), "value1", null);
        setField(term304999, term304999.getClass(), "value2", null);
        setField(term304999, term304999.getClass(), "value3", null);
        setField(term304999, term304999.getClass(), "delegateMap", null);
        setField(term304998, term304998.getClass(), "key2", term304999);
        setField(term304998, term304998.getClass(), "key3", null);
        setField(term304998, term304998.getClass(), "value1", null);
        setField(term304998, term304998.getClass(), "value2", null);
        setField(term304998, term304998.getClass(), "value3", null);
        setField(term304998, term304998.getClass(), "delegateMap", null);
        setField(term304997, term304997.getClass(), "key2", term304998);
        setIntField(term305000, term305000.getClass(), "size", 3);
        setIntField(term305000, term305000.getClass(), "hash1", 0);
        setIntField(term305000, term305000.getClass(), "hash2", 0);
        setIntField(term305000, term305000.getClass(), "hash3", 0);
        setField(term305000, term305000.getClass(), "key1", term305001);
        setField(term305000, term305000.getClass(), "key2", null);
        setField(term305000, term305000.getClass(), "key3", term305002);
        setField(term305000, term305000.getClass(), "value1", null);
        setField(term305000, term305000.getClass(), "value2", null);
        setField(term305000, term305000.getClass(), "value3", null);
        setField(term305000, term305000.getClass(), "delegateMap", null);
        setField(term304997, term304997.getClass(), "key3", term305000);
        setField(term304997, term304997.getClass(), "value1", null);
        setField(term304997, term304997.getClass(), "value2", null);
        setField(term304997, term304997.getClass(), "value3", null);
        setField(term304997, term304997.getClass(), "delegateMap", null);
        term305003 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term305004 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setIntField(term305003, term305003.getClass(), "size", 3);
        setIntField(term305003, term305003.getClass(), "hash1", 0);
        setIntField(term305003, term305003.getClass(), "hash2", 0);
        setIntField(term305003, term305003.getClass(), "hash3", 0);
        setField(term305003, term305003.getClass(), "key1", null);
        setIntField(term305004, term305004.getClass(), "size", 2);
        setIntField(term305004, term305004.getClass(), "hash1", 0);
        setIntField(term305004, term305004.getClass(), "hash2", 0);
        setIntField(term305004, term305004.getClass(), "hash3", 0);
        setField(term305004, term305004.getClass(), "key1", null);
        setField(term305004, term305004.getClass(), "key2", null);
        setField(term305004, term305004.getClass(), "key3", null);
        setField(term305004, term305004.getClass(), "value1", null);
        setField(term305004, term305004.getClass(), "value2", null);
        setField(term305004, term305004.getClass(), "value3", null);
        setField(term305004, term305004.getClass(), "delegateMap", null);
        setField(term305003, term305003.getClass(), "key2", term305004);
        setField(term305003, term305003.getClass(), "key3", null);
        setField(term305003, term305003.getClass(), "value1", null);
        setField(term305003, term305003.getClass(), "value2", null);
        setField(term305003, term305003.getClass(), "value3", null);
        setField(term305003, term305003.getClass(), "delegateMap", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.map.Flat3Map");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.Object");
        argTypes[1] = Class.forName("java.lang.Object");
        Object[] args = new Object[2];
        args[0] = term304836;
        args[1] = null;
        Object retValue = callMethod(klass, "put", argTypes, term304438, args);
        assertTrue(recursiveEquals(term304438, term304997));
        assertTrue(recursiveEquals(term304836, term305003));
        assertTrue(recursiveEquals(retValue, null));
    }

};


