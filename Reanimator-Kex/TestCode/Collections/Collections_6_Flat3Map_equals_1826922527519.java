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
import java.util.HashMap;

public class Flat3Map_equals_1826922527519 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term98865;
     Object term99005;
     Object term99128;
     Object term99131;

    public Flat3Map_equals_1826922527519() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term98913 = new HashMap();
        term98865 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setField(term98865, term98865.getClass(), "delegateMap", null);
        setIntField(term98865, term98865.getClass(), "size", 3);
        setField(term98865, term98865.getClass(), "key3", term98913);
        term99005 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setField(term99005, term99005.getClass(), "delegateMap", null);
        setIntField(term99005, term99005.getClass(), "size", 3);
        HashMap term99129 = new HashMap();
        term99128 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setIntField(term99128, term99128.getClass(), "size", 3);
        setIntField(term99128, term99128.getClass(), "hash1", 0);
        setIntField(term99128, term99128.getClass(), "hash2", 0);
        setIntField(term99128, term99128.getClass(), "hash3", 0);
        setField(term99128, term99128.getClass(), "key1", null);
        setField(term99128, term99128.getClass(), "key2", null);
        setField(term99128, term99128.getClass(), "key3", term99129);
        setField(term99128, term99128.getClass(), "value1", null);
        setField(term99128, term99128.getClass(), "value2", null);
        setField(term99128, term99128.getClass(), "value3", null);
        setField(term99128, term99128.getClass(), "delegateMap", null);
        term99131 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setIntField(term99131, term99131.getClass(), "size", 3);
        setIntField(term99131, term99131.getClass(), "hash1", 0);
        setIntField(term99131, term99131.getClass(), "hash2", 0);
        setIntField(term99131, term99131.getClass(), "hash3", 0);
        setField(term99131, term99131.getClass(), "key1", null);
        setField(term99131, term99131.getClass(), "key2", null);
        setField(term99131, term99131.getClass(), "key3", null);
        setField(term99131, term99131.getClass(), "value1", null);
        setField(term99131, term99131.getClass(), "value2", null);
        setField(term99131, term99131.getClass(), "value3", null);
        setField(term99131, term99131.getClass(), "delegateMap", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.map.Flat3Map");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term99005;
        Object retValue = callMethod(klass, "equals", argTypes, term98865, args);
        assertTrue(recursiveEquals(term98865, term99128));
        assertTrue(recursiveEquals(term99005, term99131));
        assertTrue(recursiveEquals(retValue, false));
    }

};


