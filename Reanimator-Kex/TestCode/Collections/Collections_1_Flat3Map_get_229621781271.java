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

public class Flat3Map_get_229621781271 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term48545;
     Object term48610;
     Object term48611;

    public Flat3Map_get_229621781271() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term48545 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setField(term48545, term48545.getClass(), "delegateMap", null);
        setIntField(term48545, term48545.getClass(), "size", 2);
        setIntField(term48545, term48545.getClass(), "hash2", 0);
        setField(term48545, term48545.getClass(), "value2", null);
        setIntField(term48545, term48545.getClass(), "hash1", 0);
        setField(term48545, term48545.getClass(), "value1", null);
        setField(term48545, term48545.getClass(), "key2", term48545);
        term48610 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setIntField(term48610, term48610.getClass(), "size", 2);
        setIntField(term48610, term48610.getClass(), "hash1", 0);
        setIntField(term48610, term48610.getClass(), "hash2", 0);
        setIntField(term48610, term48610.getClass(), "hash3", 0);
        setField(term48610, term48610.getClass(), "key1", null);
        setField(term48610, term48610.getClass(), "key2", term48610);
        setField(term48610, term48610.getClass(), "key3", null);
        setField(term48610, term48610.getClass(), "value1", null);
        setField(term48610, term48610.getClass(), "value2", null);
        setField(term48610, term48610.getClass(), "value3", null);
        setField(term48610, term48610.getClass(), "delegateMap", null);
        term48611 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setIntField(term48611, term48611.getClass(), "size", 2);
        setIntField(term48611, term48611.getClass(), "hash1", 0);
        setIntField(term48611, term48611.getClass(), "hash2", 0);
        setIntField(term48611, term48611.getClass(), "hash3", 0);
        setField(term48611, term48611.getClass(), "key1", null);
        setField(term48611, term48611.getClass(), "key2", term48611);
        setField(term48611, term48611.getClass(), "key3", null);
        setField(term48611, term48611.getClass(), "value1", null);
        setField(term48611, term48611.getClass(), "value2", null);
        setField(term48611, term48611.getClass(), "value3", null);
        setField(term48611, term48611.getClass(), "delegateMap", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.map.Flat3Map");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term48545;
        Object retValue = callMethod(klass, "get", argTypes, term48545, args);
        assertTrue(recursiveEquals(term48545, term48610));
        assertTrue(recursiveEquals(term48545, term48611));
        assertTrue(recursiveEquals(retValue, null));
    }

};
