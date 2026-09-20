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

public class Flat3Map_containsValue_2053071372264 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term46595;
     Object term46773;
     Object term47207;
     Object term47210;

    public Flat3Map_containsValue_2053071372264() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term46681 = new HashMap();
        term46595 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term46633 = newInstance(Class.forName("java.lang.Object"));
        setField(term46595, term46595.getClass(), "delegateMap", null);
        setIntField(term46595, term46595.getClass(), "size", 3);
        setField(term46595, term46595.getClass(), "value3", term46633);
        setField(term46595, term46595.getClass(), "value2", term46681);
        term46773 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setField(term46773, term46773.getClass(), "delegateMap", null);
        HashMap term47208 = new HashMap();
        term47207 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term47209 = newInstance(Class.forName("java.lang.Object"));
        setIntField(term47207, term47207.getClass(), "size", 3);
        setIntField(term47207, term47207.getClass(), "hash1", 0);
        setIntField(term47207, term47207.getClass(), "hash2", 0);
        setIntField(term47207, term47207.getClass(), "hash3", 0);
        setField(term47207, term47207.getClass(), "key1", null);
        setField(term47207, term47207.getClass(), "key2", null);
        setField(term47207, term47207.getClass(), "key3", null);
        setField(term47207, term47207.getClass(), "value1", null);
        setField(term47207, term47207.getClass(), "value2", term47208);
        setField(term47207, term47207.getClass(), "value3", term47209);
        setField(term47207, term47207.getClass(), "delegateMap", null);
        term47210 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setIntField(term47210, term47210.getClass(), "size", 0);
        setIntField(term47210, term47210.getClass(), "hash1", 0);
        setIntField(term47210, term47210.getClass(), "hash2", 0);
        setIntField(term47210, term47210.getClass(), "hash3", 0);
        setField(term47210, term47210.getClass(), "key1", null);
        setField(term47210, term47210.getClass(), "key2", null);
        setField(term47210, term47210.getClass(), "key3", null);
        setField(term47210, term47210.getClass(), "value1", null);
        setField(term47210, term47210.getClass(), "value2", null);
        setField(term47210, term47210.getClass(), "value3", null);
        setField(term47210, term47210.getClass(), "delegateMap", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.map.Flat3Map");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term46773;
        callMethod(klass, "containsValue", argTypes, term46595, args);
        assertTrue(recursiveEquals(term46595, term47207));
        assertTrue(recursiveEquals(term46773, term47210));
    }

};
