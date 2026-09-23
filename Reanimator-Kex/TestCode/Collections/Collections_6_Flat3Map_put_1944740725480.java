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

public class Flat3Map_put_1944740725480 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term89051;
     Object term89327;
     Object term89884;
     Object term89887;

    public Flat3Map_put_1944740725480() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term89051 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term89143 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term89235 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setField(term89051, term89051.getClass(), "delegateMap", null);
        setIntField(term89051, term89051.getClass(), "size", 3);
        setIntField(term89051, term89051.getClass(), "hash3", 0);
        setField(term89143, term89143.getClass(), "delegateMap", null);
        setIntField(term89143, term89143.getClass(), "size", 3);
        setField(term89143, term89143.getClass(), "key3", term89235);
        setField(term89143, term89143.getClass(), "key2", null);
        setField(term89143, term89143.getClass(), "value2", null);
        setField(term89051, term89051.getClass(), "key3", term89143);
        term89327 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term89419 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setField(term89327, term89327.getClass(), "delegateMap", null);
        setIntField(term89327, term89327.getClass(), "size", 3);
        setIntField(term89327, term89327.getClass(), "hash3", 0);
        setField(term89327, term89327.getClass(), "value3", null);
        setIntField(term89327, term89327.getClass(), "hash2", 0);
        setField(term89327, term89327.getClass(), "value2", null);
        setIntField(term89327, term89327.getClass(), "hash1", 0);
        setField(term89327, term89327.getClass(), "value1", null);
        setField(term89327, term89327.getClass(), "key3", null);
        setField(term89327, term89327.getClass(), "key2", null);
        setField(term89327, term89327.getClass(), "key1", term89419);
        term89884 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term89885 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term89886 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setIntField(term89884, term89884.getClass(), "size", 3);
        setIntField(term89884, term89884.getClass(), "hash1", 0);
        setIntField(term89884, term89884.getClass(), "hash2", 0);
        setIntField(term89884, term89884.getClass(), "hash3", 0);
        setField(term89884, term89884.getClass(), "key1", null);
        setField(term89884, term89884.getClass(), "key2", null);
        setIntField(term89885, term89885.getClass(), "size", 3);
        setIntField(term89885, term89885.getClass(), "hash1", 0);
        setIntField(term89885, term89885.getClass(), "hash2", 0);
        setIntField(term89885, term89885.getClass(), "hash3", 0);
        setField(term89885, term89885.getClass(), "key1", null);
        setField(term89885, term89885.getClass(), "key2", null);
        setIntField(term89886, term89886.getClass(), "size", 0);
        setIntField(term89886, term89886.getClass(), "hash1", 0);
        setIntField(term89886, term89886.getClass(), "hash2", 0);
        setIntField(term89886, term89886.getClass(), "hash3", 0);
        setField(term89886, term89886.getClass(), "key1", null);
        setField(term89886, term89886.getClass(), "key2", null);
        setField(term89886, term89886.getClass(), "key3", null);
        setField(term89886, term89886.getClass(), "value1", null);
        setField(term89886, term89886.getClass(), "value2", null);
        setField(term89886, term89886.getClass(), "value3", null);
        setField(term89886, term89886.getClass(), "delegateMap", null);
        setField(term89885, term89885.getClass(), "key3", term89886);
        setField(term89885, term89885.getClass(), "value1", null);
        setField(term89885, term89885.getClass(), "value2", null);
        setField(term89885, term89885.getClass(), "value3", null);
        setField(term89885, term89885.getClass(), "delegateMap", null);
        setField(term89884, term89884.getClass(), "key3", term89885);
        setField(term89884, term89884.getClass(), "value1", null);
        setField(term89884, term89884.getClass(), "value2", null);
        setField(term89884, term89884.getClass(), "value3", null);
        setField(term89884, term89884.getClass(), "delegateMap", null);
        term89887 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term89888 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setIntField(term89887, term89887.getClass(), "size", 3);
        setIntField(term89887, term89887.getClass(), "hash1", 0);
        setIntField(term89887, term89887.getClass(), "hash2", 0);
        setIntField(term89887, term89887.getClass(), "hash3", 0);
        setIntField(term89888, term89888.getClass(), "size", 0);
        setIntField(term89888, term89888.getClass(), "hash1", 0);
        setIntField(term89888, term89888.getClass(), "hash2", 0);
        setIntField(term89888, term89888.getClass(), "hash3", 0);
        setField(term89888, term89888.getClass(), "key1", null);
        setField(term89888, term89888.getClass(), "key2", null);
        setField(term89888, term89888.getClass(), "key3", null);
        setField(term89888, term89888.getClass(), "value1", null);
        setField(term89888, term89888.getClass(), "value2", null);
        setField(term89888, term89888.getClass(), "value3", null);
        setField(term89888, term89888.getClass(), "delegateMap", null);
        setField(term89887, term89887.getClass(), "key1", term89888);
        setField(term89887, term89887.getClass(), "key2", null);
        setField(term89887, term89887.getClass(), "key3", null);
        setField(term89887, term89887.getClass(), "value1", null);
        setField(term89887, term89887.getClass(), "value2", null);
        setField(term89887, term89887.getClass(), "value3", null);
        setField(term89887, term89887.getClass(), "delegateMap", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.map.Flat3Map");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.Object");
        argTypes[1] = Class.forName("java.lang.Object");
        Object[] args = new Object[2];
        args[0] = term89327;
        args[1] = null;
        Object retValue = callMethod(klass, "put", argTypes, term89051, args);
        assertTrue(recursiveEquals(term89051, term89884));
        assertTrue(recursiveEquals(term89327, term89887));
        assertTrue(recursiveEquals(retValue, null));
    }

};


