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

public class Flat3Map_remove_8406902791071 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term212976;
     Object term213068;
     Object term213070;

    public Flat3Map_remove_8406902791071() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term212976 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term213004 = newInstance(Class.forName("java.util.stream.SliceOps"));
        setField(term212976, term212976.getClass(), "delegateMap", null);
        setIntField(term212976, term212976.getClass(), "size", 1);
        setIntField(term212976, term212976.getClass(), "hash1", 0);
        setField(term212976, term212976.getClass(), "value1", term213004);
        term213068 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term213069 = newInstance(Class.forName("java.util.stream.SliceOps"));
        setIntField(term213068, term213068.getClass(), "size", 1);
        setIntField(term213068, term213068.getClass(), "hash1", 0);
        setIntField(term213068, term213068.getClass(), "hash2", 0);
        setIntField(term213068, term213068.getClass(), "hash3", 0);
        setField(term213068, term213068.getClass(), "key1", null);
        setField(term213068, term213068.getClass(), "key2", null);
        setField(term213068, term213068.getClass(), "key3", null);
        setField(term213068, term213068.getClass(), "value1", term213069);
        setField(term213068, term213068.getClass(), "value2", null);
        setField(term213068, term213068.getClass(), "value3", null);
        setField(term213068, term213068.getClass(), "delegateMap", null);
        term213070 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term213071 = newInstance(Class.forName("java.util.stream.SliceOps"));
        setIntField(term213070, term213070.getClass(), "size", 1);
        setIntField(term213070, term213070.getClass(), "hash1", 0);
        setIntField(term213070, term213070.getClass(), "hash2", 0);
        setIntField(term213070, term213070.getClass(), "hash3", 0);
        setField(term213070, term213070.getClass(), "key1", null);
        setField(term213070, term213070.getClass(), "key2", null);
        setField(term213070, term213070.getClass(), "key3", null);
        setField(term213070, term213070.getClass(), "value1", term213071);
        setField(term213070, term213070.getClass(), "value2", null);
        setField(term213070, term213070.getClass(), "value3", null);
        setField(term213070, term213070.getClass(), "delegateMap", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.map.Flat3Map");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term212976;
        Object retValue = callMethod(klass, "remove", argTypes, term212976, args);
        assertTrue(recursiveEquals(term212976, term213068));
        assertTrue(recursiveEquals(term212976, term213070));
        assertTrue(recursiveEquals(retValue, null));
    }

};
