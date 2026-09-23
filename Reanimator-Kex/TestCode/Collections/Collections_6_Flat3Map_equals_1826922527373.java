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

public class Flat3Map_equals_1826922527373 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term64116;
     Object term64300;
     Object term64486;
     Object term64488;

    public Flat3Map_equals_1826922527373() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term64116 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term64208 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setField(term64116, term64116.getClass(), "delegateMap", null);
        setIntField(term64116, term64116.getClass(), "size", 3);
        setField(term64116, term64116.getClass(), "key3", null);
        setField(term64116, term64116.getClass(), "value3", null);
        setField(term64116, term64116.getClass(), "key2", null);
        setField(term64116, term64116.getClass(), "value2", term64208);
        term64300 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term64392 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setField(term64300, term64300.getClass(), "delegateMap", null);
        setIntField(term64300, term64300.getClass(), "size", 3);
        setField(term64300, term64300.getClass(), "key3", term64392);
        setField(term64300, term64300.getClass(), "key2", null);
        setField(term64300, term64300.getClass(), "value2", null);
        term64486 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term64487 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setIntField(term64486, term64486.getClass(), "size", 3);
        setIntField(term64486, term64486.getClass(), "hash1", 0);
        setIntField(term64486, term64486.getClass(), "hash2", 0);
        setIntField(term64486, term64486.getClass(), "hash3", 0);
        setField(term64486, term64486.getClass(), "key1", null);
        setField(term64486, term64486.getClass(), "key2", null);
        setField(term64486, term64486.getClass(), "key3", null);
        setField(term64486, term64486.getClass(), "value1", null);
        setIntField(term64487, term64487.getClass(), "size", 0);
        setIntField(term64487, term64487.getClass(), "hash1", 0);
        setIntField(term64487, term64487.getClass(), "hash2", 0);
        setIntField(term64487, term64487.getClass(), "hash3", 0);
        setField(term64487, term64487.getClass(), "key1", null);
        setField(term64487, term64487.getClass(), "key2", null);
        setField(term64487, term64487.getClass(), "key3", null);
        setField(term64487, term64487.getClass(), "value1", null);
        setField(term64487, term64487.getClass(), "value2", null);
        setField(term64487, term64487.getClass(), "value3", null);
        setField(term64487, term64487.getClass(), "delegateMap", null);
        setField(term64486, term64486.getClass(), "value2", term64487);
        setField(term64486, term64486.getClass(), "value3", null);
        setField(term64486, term64486.getClass(), "delegateMap", null);
        term64488 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term64489 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setIntField(term64488, term64488.getClass(), "size", 3);
        setIntField(term64488, term64488.getClass(), "hash1", 0);
        setIntField(term64488, term64488.getClass(), "hash2", 0);
        setIntField(term64488, term64488.getClass(), "hash3", 0);
        setField(term64488, term64488.getClass(), "key1", null);
        setField(term64488, term64488.getClass(), "key2", null);
        setIntField(term64489, term64489.getClass(), "size", 0);
        setIntField(term64489, term64489.getClass(), "hash1", 0);
        setIntField(term64489, term64489.getClass(), "hash2", 0);
        setIntField(term64489, term64489.getClass(), "hash3", 0);
        setField(term64489, term64489.getClass(), "key1", null);
        setField(term64489, term64489.getClass(), "key2", null);
        setField(term64489, term64489.getClass(), "key3", null);
        setField(term64489, term64489.getClass(), "value1", null);
        setField(term64489, term64489.getClass(), "value2", null);
        setField(term64489, term64489.getClass(), "value3", null);
        setField(term64489, term64489.getClass(), "delegateMap", null);
        setField(term64488, term64488.getClass(), "key3", term64489);
        setField(term64488, term64488.getClass(), "value1", null);
        setField(term64488, term64488.getClass(), "value2", null);
        setField(term64488, term64488.getClass(), "value3", null);
        setField(term64488, term64488.getClass(), "delegateMap", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.map.Flat3Map");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term64300;
        Object retValue = callMethod(klass, "equals", argTypes, term64116, args);
        assertTrue(recursiveEquals(term64116, term64486));
        assertTrue(recursiveEquals(term64300, term64488));
        assertTrue(recursiveEquals(retValue, false));
    }

};


