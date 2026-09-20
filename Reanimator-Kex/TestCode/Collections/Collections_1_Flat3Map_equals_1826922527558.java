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

public class Flat3Map_equals_1826922527558 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term106927;
     Object term107167;
     Object term107969;
     Object term107972;

    public Flat3Map_equals_1826922527558() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term106927 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term107037 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap"));
        Object term107075 = newInstance(Class.forName("java.lang.Object"));
        setField(term106927, term106927.getClass(), "delegateMap", null);
        setIntField(term106927, term106927.getClass(), "size", 2);
        setField(term106927, term106927.getClass(), "key2", null);
        setIntField(term107037, term107037.getClass(), "size", 0);
        setField(term106927, term106927.getClass(), "value2", term107037);
        setField(term106927, term106927.getClass(), "key1", term107075);
        term107167 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term107277 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap"));
        setField(term107167, term107167.getClass(), "delegateMap", null);
        setIntField(term107167, term107167.getClass(), "size", 2);
        setField(term107167, term107167.getClass(), "key2", null);
        setIntField(term107277, term107277.getClass(), "size", 0);
        setField(term107167, term107167.getClass(), "value2", term107277);
        term107969 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term107970 = newInstance(Class.forName("java.lang.Object"));
        Object term107971 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap"));
        setIntField(term107969, term107969.getClass(), "size", 2);
        setIntField(term107969, term107969.getClass(), "hash1", 0);
        setIntField(term107969, term107969.getClass(), "hash2", 0);
        setIntField(term107969, term107969.getClass(), "hash3", 0);
        setField(term107969, term107969.getClass(), "key1", term107970);
        setField(term107969, term107969.getClass(), "key2", null);
        setField(term107969, term107969.getClass(), "key3", null);
        setField(term107969, term107969.getClass(), "value1", null);
        setFloatField(term107971, term107971.getClass(), "loadFactor", 0.0F);
        setIntField(term107971, term107971.getClass(), "size", 0);
        setField(term107971, term107971.getClass(), "data", null);
        setIntField(term107971, term107971.getClass(), "threshold", 0);
        setIntField(term107971, term107971.getClass(), "modCount", 0);
        setField(term107971, term107971.getClass(), "entrySet", null);
        setField(term107971, term107971.getClass(), "keySet", null);
        setField(term107971, term107971.getClass(), "values", null);
        setField(term107971, term107971.getClass(), "keySet", null);
        setField(term107971, term107971.getClass(), "values", null);
        setField(term107969, term107969.getClass(), "value2", term107971);
        setField(term107969, term107969.getClass(), "value3", null);
        setField(term107969, term107969.getClass(), "delegateMap", null);
        term107972 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term107973 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap"));
        setIntField(term107972, term107972.getClass(), "size", 2);
        setIntField(term107972, term107972.getClass(), "hash1", 0);
        setIntField(term107972, term107972.getClass(), "hash2", 0);
        setIntField(term107972, term107972.getClass(), "hash3", 0);
        setField(term107972, term107972.getClass(), "key1", null);
        setField(term107972, term107972.getClass(), "key2", null);
        setField(term107972, term107972.getClass(), "key3", null);
        setField(term107972, term107972.getClass(), "value1", null);
        setFloatField(term107973, term107973.getClass(), "loadFactor", 0.0F);
        setIntField(term107973, term107973.getClass(), "size", 0);
        setField(term107973, term107973.getClass(), "data", null);
        setIntField(term107973, term107973.getClass(), "threshold", 0);
        setIntField(term107973, term107973.getClass(), "modCount", 0);
        setField(term107973, term107973.getClass(), "entrySet", null);
        setField(term107973, term107973.getClass(), "keySet", null);
        setField(term107973, term107973.getClass(), "values", null);
        setField(term107973, term107973.getClass(), "keySet", null);
        setField(term107973, term107973.getClass(), "values", null);
        setField(term107972, term107972.getClass(), "value2", term107973);
        setField(term107972, term107972.getClass(), "value3", null);
        setField(term107972, term107972.getClass(), "delegateMap", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.map.Flat3Map");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term107167;
        Object retValue = callMethod(klass, "equals", argTypes, term106927, args);
        assertTrue(recursiveEquals(term106927, term107969));
        assertTrue(recursiveEquals(term107167, term107972));
        assertTrue(recursiveEquals(retValue, false));
    }

};
