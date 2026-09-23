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

public class Flat3Map_put_1944740725241 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term39607;
     Object term39663;
     Object term39664;

    public Flat3Map_put_1944740725241() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term39607 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setField(term39607, term39607.getClass(), "delegateMap", null);
        setIntField(term39607, term39607.getClass(), "size", 2);
        term39663 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setIntField(term39663, term39663.getClass(), "size", 3);
        setIntField(term39663, term39663.getClass(), "hash1", 0);
        setIntField(term39663, term39663.getClass(), "hash2", 0);
        setIntField(term39663, term39663.getClass(), "hash3", 0);
        setField(term39663, term39663.getClass(), "key1", null);
        setField(term39663, term39663.getClass(), "key2", null);
        setField(term39663, term39663.getClass(), "key3", term39663);
        setField(term39663, term39663.getClass(), "value1", null);
        setField(term39663, term39663.getClass(), "value2", null);
        setField(term39663, term39663.getClass(), "value3", null);
        setField(term39663, term39663.getClass(), "delegateMap", null);
        term39664 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setIntField(term39664, term39664.getClass(), "size", 3);
        setIntField(term39664, term39664.getClass(), "hash1", 0);
        setIntField(term39664, term39664.getClass(), "hash2", 0);
        setIntField(term39664, term39664.getClass(), "hash3", 0);
        setField(term39664, term39664.getClass(), "key1", null);
        setField(term39664, term39664.getClass(), "key2", null);
        setField(term39664, term39664.getClass(), "key3", term39664);
        setField(term39664, term39664.getClass(), "value1", null);
        setField(term39664, term39664.getClass(), "value2", null);
        setField(term39664, term39664.getClass(), "value3", null);
        setField(term39664, term39664.getClass(), "delegateMap", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.map.Flat3Map");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.Object");
        argTypes[1] = Class.forName("java.lang.Object");
        Object[] args = new Object[2];
        args[0] = term39607;
        args[1] = null;
        Object retValue = callMethod(klass, "put", argTypes, term39607, args);
        assertTrue(recursiveEquals(term39607, term39663));
        assertTrue(recursiveEquals(term39607, term39664));
        assertTrue(recursiveEquals(retValue, null));
    }

};


