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

public class Flat3Map_remove_8406902791064 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term211409;
     Object term212040;

    public Flat3Map_remove_8406902791064() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term211409 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term211501 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term211593 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term211685 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setField(term211409, term211409.getClass(), "delegateMap", null);
        setIntField(term211409, term211409.getClass(), "size", 3);
        setField(term211409, term211409.getClass(), "key3", term211501);
        setField(term211409, term211409.getClass(), "key2", term211593);
        setField(term211409, term211409.getClass(), "key1", term211685);
        term212040 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term212041 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term212042 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term212043 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setIntField(term212040, term212040.getClass(), "size", 3);
        setIntField(term212040, term212040.getClass(), "hash1", 0);
        setIntField(term212040, term212040.getClass(), "hash2", 0);
        setIntField(term212040, term212040.getClass(), "hash3", 0);
        setIntField(term212041, term212041.getClass(), "size", 0);
        setIntField(term212041, term212041.getClass(), "hash1", 0);
        setIntField(term212041, term212041.getClass(), "hash2", 0);
        setIntField(term212041, term212041.getClass(), "hash3", 0);
        setField(term212041, term212041.getClass(), "key1", null);
        setField(term212041, term212041.getClass(), "key2", null);
        setField(term212041, term212041.getClass(), "key3", null);
        setField(term212041, term212041.getClass(), "value1", null);
        setField(term212041, term212041.getClass(), "value2", null);
        setField(term212041, term212041.getClass(), "value3", null);
        setField(term212041, term212041.getClass(), "delegateMap", null);
        setField(term212040, term212040.getClass(), "key1", term212041);
        setIntField(term212042, term212042.getClass(), "size", 0);
        setIntField(term212042, term212042.getClass(), "hash1", 0);
        setIntField(term212042, term212042.getClass(), "hash2", 0);
        setIntField(term212042, term212042.getClass(), "hash3", 0);
        setField(term212042, term212042.getClass(), "key1", null);
        setField(term212042, term212042.getClass(), "key2", null);
        setField(term212042, term212042.getClass(), "key3", null);
        setField(term212042, term212042.getClass(), "value1", null);
        setField(term212042, term212042.getClass(), "value2", null);
        setField(term212042, term212042.getClass(), "value3", null);
        setField(term212042, term212042.getClass(), "delegateMap", null);
        setField(term212040, term212040.getClass(), "key2", term212042);
        setIntField(term212043, term212043.getClass(), "size", 0);
        setIntField(term212043, term212043.getClass(), "hash1", 0);
        setIntField(term212043, term212043.getClass(), "hash2", 0);
        setIntField(term212043, term212043.getClass(), "hash3", 0);
        setField(term212043, term212043.getClass(), "key1", null);
        setField(term212043, term212043.getClass(), "key2", null);
        setField(term212043, term212043.getClass(), "key3", null);
        setField(term212043, term212043.getClass(), "value1", null);
        setField(term212043, term212043.getClass(), "value2", null);
        setField(term212043, term212043.getClass(), "value3", null);
        setField(term212043, term212043.getClass(), "delegateMap", null);
        setField(term212040, term212040.getClass(), "key3", term212043);
        setField(term212040, term212040.getClass(), "value1", null);
        setField(term212040, term212040.getClass(), "value2", null);
        setField(term212040, term212040.getClass(), "value3", null);
        setField(term212040, term212040.getClass(), "delegateMap", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.map.Flat3Map");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = null;
        Object retValue = callMethod(klass, "remove", argTypes, term211409, args);
        assertTrue(recursiveEquals(term211409, term212040));
        assertTrue(recursiveEquals(retValue, null));
    }

};
