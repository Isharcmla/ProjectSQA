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

public class Flat3Map_containsValue_2053071372364 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term66081;
     Object term66303;
     Object term66562;
     Object term66565;

    public Flat3Map_containsValue_2053071372364() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term66081 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term66119 = newInstance(Class.forName("java.lang.Object"));
        Object term66211 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setField(term66081, term66081.getClass(), "delegateMap", null);
        setIntField(term66081, term66081.getClass(), "size", 0);
        setField(term66081, term66081.getClass(), "value3", term66081);
        setField(term66081, term66081.getClass(), "value2", term66119);
        setField(term66081, term66081.getClass(), "value1", term66211);
        term66303 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setField(term66303, term66303.getClass(), "delegateMap", null);
        setIntField(term66303, term66303.getClass(), "size", -1);
        term66562 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term66563 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term66564 = newInstance(Class.forName("java.lang.Object"));
        setIntField(term66562, term66562.getClass(), "size", 0);
        setIntField(term66562, term66562.getClass(), "hash1", 0);
        setIntField(term66562, term66562.getClass(), "hash2", 0);
        setIntField(term66562, term66562.getClass(), "hash3", 0);
        setField(term66562, term66562.getClass(), "key1", null);
        setField(term66562, term66562.getClass(), "key2", null);
        setField(term66562, term66562.getClass(), "key3", null);
        setIntField(term66563, term66563.getClass(), "size", 0);
        setIntField(term66563, term66563.getClass(), "hash1", 0);
        setIntField(term66563, term66563.getClass(), "hash2", 0);
        setIntField(term66563, term66563.getClass(), "hash3", 0);
        setField(term66563, term66563.getClass(), "key1", null);
        setField(term66563, term66563.getClass(), "key2", null);
        setField(term66563, term66563.getClass(), "key3", null);
        setField(term66563, term66563.getClass(), "value1", null);
        setField(term66563, term66563.getClass(), "value2", null);
        setField(term66563, term66563.getClass(), "value3", null);
        setField(term66563, term66563.getClass(), "delegateMap", null);
        setField(term66562, term66562.getClass(), "value1", term66563);
        setField(term66562, term66562.getClass(), "value2", term66564);
        setField(term66562, term66562.getClass(), "value3", term66562);
        setField(term66562, term66562.getClass(), "delegateMap", null);
        term66565 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setIntField(term66565, term66565.getClass(), "size", -1);
        setIntField(term66565, term66565.getClass(), "hash1", 0);
        setIntField(term66565, term66565.getClass(), "hash2", 0);
        setIntField(term66565, term66565.getClass(), "hash3", 0);
        setField(term66565, term66565.getClass(), "key1", null);
        setField(term66565, term66565.getClass(), "key2", null);
        setField(term66565, term66565.getClass(), "key3", null);
        setField(term66565, term66565.getClass(), "value1", null);
        setField(term66565, term66565.getClass(), "value2", null);
        setField(term66565, term66565.getClass(), "value3", null);
        setField(term66565, term66565.getClass(), "delegateMap", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.map.Flat3Map");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term66303;
        callMethod(klass, "containsValue", argTypes, term66081, args);
        assertTrue(recursiveEquals(term66081, term66562));
        assertTrue(recursiveEquals(term66303, term66565));
    }

};
