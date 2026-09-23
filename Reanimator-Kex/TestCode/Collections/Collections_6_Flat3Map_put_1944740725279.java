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

public class Flat3Map_put_1944740725279 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term45654;
     Object term46169;
     Object term46171;

    public Flat3Map_put_1944740725279() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term45654 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term45700 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setField(term45654, term45654.getClass(), "delegateMap", null);
        setIntField(term45654, term45654.getClass(), "size", 2);
        setIntField(term45654, term45654.getClass(), "hash2", 0);
        setField(term45654, term45654.getClass(), "value2", null);
        setIntField(term45654, term45654.getClass(), "hash1", 0);
        setField(term45654, term45654.getClass(), "value1", null);
        setField(term45654, term45654.getClass(), "key2", term45700);
        term46169 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term46170 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setIntField(term46169, term46169.getClass(), "size", 3);
        setIntField(term46169, term46169.getClass(), "hash1", 0);
        setIntField(term46169, term46169.getClass(), "hash2", 0);
        setIntField(term46169, term46169.getClass(), "hash3", 0);
        setField(term46169, term46169.getClass(), "key1", null);
        setIntField(term46170, term46170.getClass(), "size", 0);
        setIntField(term46170, term46170.getClass(), "hash1", 0);
        setIntField(term46170, term46170.getClass(), "hash2", 0);
        setIntField(term46170, term46170.getClass(), "hash3", 0);
        setField(term46170, term46170.getClass(), "key1", null);
        setField(term46170, term46170.getClass(), "key2", null);
        setField(term46170, term46170.getClass(), "key3", null);
        setField(term46170, term46170.getClass(), "value1", null);
        setField(term46170, term46170.getClass(), "value2", null);
        setField(term46170, term46170.getClass(), "value3", null);
        setField(term46170, term46170.getClass(), "delegateMap", null);
        setField(term46169, term46169.getClass(), "key2", term46170);
        setField(term46169, term46169.getClass(), "key3", term46169);
        setField(term46169, term46169.getClass(), "value1", null);
        setField(term46169, term46169.getClass(), "value2", null);
        setField(term46169, term46169.getClass(), "value3", null);
        setField(term46169, term46169.getClass(), "delegateMap", null);
        term46171 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term46172 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setIntField(term46171, term46171.getClass(), "size", 3);
        setIntField(term46171, term46171.getClass(), "hash1", 0);
        setIntField(term46171, term46171.getClass(), "hash2", 0);
        setIntField(term46171, term46171.getClass(), "hash3", 0);
        setField(term46171, term46171.getClass(), "key1", null);
        setIntField(term46172, term46172.getClass(), "size", 0);
        setIntField(term46172, term46172.getClass(), "hash1", 0);
        setIntField(term46172, term46172.getClass(), "hash2", 0);
        setIntField(term46172, term46172.getClass(), "hash3", 0);
        setField(term46172, term46172.getClass(), "key1", null);
        setField(term46172, term46172.getClass(), "key2", null);
        setField(term46172, term46172.getClass(), "key3", null);
        setField(term46172, term46172.getClass(), "value1", null);
        setField(term46172, term46172.getClass(), "value2", null);
        setField(term46172, term46172.getClass(), "value3", null);
        setField(term46172, term46172.getClass(), "delegateMap", null);
        setField(term46171, term46171.getClass(), "key2", term46172);
        setField(term46171, term46171.getClass(), "key3", term46171);
        setField(term46171, term46171.getClass(), "value1", null);
        setField(term46171, term46171.getClass(), "value2", null);
        setField(term46171, term46171.getClass(), "value3", null);
        setField(term46171, term46171.getClass(), "delegateMap", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.map.Flat3Map");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.Object");
        argTypes[1] = Class.forName("java.lang.Object");
        Object[] args = new Object[2];
        args[0] = term45654;
        args[1] = null;
        Object retValue = callMethod(klass, "put", argTypes, term45654, args);
        assertTrue(recursiveEquals(term45654, term46169));
        assertTrue(recursiveEquals(term45654, term46171));
        assertTrue(recursiveEquals(retValue, null));
    }

};


