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

public class Flat3Map_put_1944740725920 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term245024;
     Object term245572;
     Object term246800;

    public Flat3Map_put_1944740725920() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term245480 = new HashMap();
        term245024 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term245116 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term245226 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap"));
        Object term245264 = newInstance(Class.forName("java.lang.Object"));
        Object term245394 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap$HashEntry"));
        Object term245432 = newInstance(Class.forName("java.lang.Object"));
        setField(term245024, term245024.getClass(), "delegateMap", null);
        setIntField(term245024, term245024.getClass(), "size", 3);
        setIntField(term245024, term245024.getClass(), "hash3", -968353209);
        setField(term245116, term245116.getClass(), "delegateMap", null);
        setIntField(term245116, term245116.getClass(), "size", 3);
        setIntField(term245226, term245226.getClass(), "size", 0);
        setField(term245116, term245116.getClass(), "key3", term245226);
        setField(term245116, term245116.getClass(), "key2", null);
        setField(term245116, term245116.getClass(), "value2", null);
        setIntField(term245116, term245116.getClass(), "hash3", 313491976);
        setIntField(term245116, term245116.getClass(), "hash2", 806682628);
        setIntField(term245116, term245116.getClass(), "hash1", 33262621);
        setField(term245116, term245116.getClass(), "key1", term245264);
        setField(term245116, term245116.getClass(), "value3", null);
        setField(term245116, term245116.getClass(), "value1", null);
        setField(term245024, term245024.getClass(), "key3", term245116);
        setIntField(term245024, term245024.getClass(), "hash2", -968353209);
        setField(term245024, term245024.getClass(), "key2", null);
        setIntField(term245024, term245024.getClass(), "hash1", -968353209);
        setField(term245024, term245024.getClass(), "key1", null);
        setField(term245024, term245024.getClass(), "value3", term245394);
        setField(term245024, term245024.getClass(), "value2", term245432);
        setField(term245024, term245024.getClass(), "value1", term245480);
        term245572 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term245664 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setField(term245572, term245572.getClass(), "delegateMap", null);
        setIntField(term245572, term245572.getClass(), "size", 3);
        setIntField(term245572, term245572.getClass(), "hash3", 1075088576);
        setField(term245572, term245572.getClass(), "value3", null);
        setIntField(term245572, term245572.getClass(), "hash2", 1074790471);
        setField(term245572, term245572.getClass(), "value2", null);
        setIntField(term245572, term245572.getClass(), "hash1", 1176735040);
        setField(term245572, term245572.getClass(), "value1", null);
        setField(term245572, term245572.getClass(), "key3", null);
        setField(term245664, term245664.getClass(), "delegateMap", null);
        setIntField(term245664, term245664.getClass(), "size", 2);
        setIntField(term245664, term245664.getClass(), "hash2", 313491976);
        setField(term245664, term245664.getClass(), "value2", null);
        setIntField(term245664, term245664.getClass(), "hash1", 134217728);
        setField(term245664, term245664.getClass(), "value1", null);
        setField(term245572, term245572.getClass(), "key2", term245664);
        term246800 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setIntField(term246800, term246800.getClass(), "size", 3);
        setIntField(term246800, term246800.getClass(), "hash1", 1176735040);
        setIntField(term246800, term246800.getClass(), "hash2", 1074790471);
        setIntField(term246800, term246800.getClass(), "hash3", 1075088576);
        setField(term246800, term246800.getClass(), "key1", null);
        setField(term246800, term246800.getClass(), "key2", null);
        setField(term246800, term246800.getClass(), "key3", null);
        setField(term246800, term246800.getClass(), "value1", null);
        setField(term246800, term246800.getClass(), "value2", null);
        setField(term246800, term246800.getClass(), "value3", null);
        setField(term246800, term246800.getClass(), "delegateMap", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.map.Flat3Map");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.Object");
        argTypes[1] = Class.forName("java.lang.Object");
        Object[] args = new Object[2];
        args[0] = term245572;
        args[1] = null;
        Object retValue = callMethod(klass, "put", argTypes, term245024, args);
        assertTrue(recursiveEquals(term245572, term246800));
        assertTrue(recursiveEquals(retValue, null));
    }

};


