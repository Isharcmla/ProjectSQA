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

public class Flat3Map_containsValue_2053071372409 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term71080;
     Object term71258;
     Object term71391;
     Object term71394;

    public Flat3Map_containsValue_2053071372409() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term71166 = new HashMap();
        term71080 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term71118 = newInstance(Class.forName("java.lang.Object"));
        setField(term71080, term71080.getClass(), "delegateMap", null);
        setIntField(term71080, term71080.getClass(), "size", 3);
        setField(term71080, term71080.getClass(), "value3", term71118);
        setField(term71080, term71080.getClass(), "value2", term71166);
        term71258 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setField(term71258, term71258.getClass(), "delegateMap", null);
        HashMap term71392 = new HashMap();
        term71391 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term71393 = newInstance(Class.forName("java.lang.Object"));
        setIntField(term71391, term71391.getClass(), "size", 3);
        setIntField(term71391, term71391.getClass(), "hash1", 0);
        setIntField(term71391, term71391.getClass(), "hash2", 0);
        setIntField(term71391, term71391.getClass(), "hash3", 0);
        setField(term71391, term71391.getClass(), "key1", null);
        setField(term71391, term71391.getClass(), "key2", null);
        setField(term71391, term71391.getClass(), "key3", null);
        setField(term71391, term71391.getClass(), "value1", null);
        setField(term71391, term71391.getClass(), "value2", term71392);
        setField(term71391, term71391.getClass(), "value3", term71393);
        setField(term71391, term71391.getClass(), "delegateMap", null);
        term71394 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setIntField(term71394, term71394.getClass(), "size", 0);
        setIntField(term71394, term71394.getClass(), "hash1", 0);
        setIntField(term71394, term71394.getClass(), "hash2", 0);
        setIntField(term71394, term71394.getClass(), "hash3", 0);
        setField(term71394, term71394.getClass(), "key1", null);
        setField(term71394, term71394.getClass(), "key2", null);
        setField(term71394, term71394.getClass(), "key3", null);
        setField(term71394, term71394.getClass(), "value1", null);
        setField(term71394, term71394.getClass(), "value2", null);
        setField(term71394, term71394.getClass(), "value3", null);
        setField(term71394, term71394.getClass(), "delegateMap", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.map.Flat3Map");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term71258;
        callMethod(klass, "containsValue", argTypes, term71080, args);
        assertTrue(recursiveEquals(term71080, term71391));
        assertTrue(recursiveEquals(term71258, term71394));
    }

};


