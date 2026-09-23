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

public class Flat3Map_hashCode_2019358094219 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term36222;
     Object term36355;

    public Flat3Map_hashCode_2019358094219() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term36222 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term36314 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setField(term36222, term36222.getClass(), "delegateMap", null);
        setIntField(term36222, term36222.getClass(), "size", 3);
        setIntField(term36222, term36222.getClass(), "hash3", 0);
        setField(term36222, term36222.getClass(), "value3", term36314);
        term36355 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term36356 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setIntField(term36355, term36355.getClass(), "size", 3);
        setIntField(term36355, term36355.getClass(), "hash1", 0);
        setIntField(term36355, term36355.getClass(), "hash2", 0);
        setIntField(term36355, term36355.getClass(), "hash3", 0);
        setField(term36355, term36355.getClass(), "key1", null);
        setField(term36355, term36355.getClass(), "key2", null);
        setField(term36355, term36355.getClass(), "key3", null);
        setField(term36355, term36355.getClass(), "value1", null);
        setField(term36355, term36355.getClass(), "value2", null);
        setIntField(term36356, term36356.getClass(), "size", 0);
        setIntField(term36356, term36356.getClass(), "hash1", 0);
        setIntField(term36356, term36356.getClass(), "hash2", 0);
        setIntField(term36356, term36356.getClass(), "hash3", 0);
        setField(term36356, term36356.getClass(), "key1", null);
        setField(term36356, term36356.getClass(), "key2", null);
        setField(term36356, term36356.getClass(), "key3", null);
        setField(term36356, term36356.getClass(), "value1", null);
        setField(term36356, term36356.getClass(), "value2", null);
        setField(term36356, term36356.getClass(), "value3", null);
        setField(term36356, term36356.getClass(), "delegateMap", null);
        setField(term36355, term36355.getClass(), "value3", term36356);
        setField(term36355, term36355.getClass(), "delegateMap", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.map.Flat3Map");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "hashCode", argTypes, term36222, args);
        assertTrue(recursiveEquals(term36222, term36355));
        assertTrue(recursiveEquals(retValue, 0));
    }

};


