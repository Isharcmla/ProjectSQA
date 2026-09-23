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

public class Flat3Map_containsValue_2053071372118 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term21781;
     Object term21986;

    public Flat3Map_containsValue_2053071372118() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term21781 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setField(term21781, term21781.getClass(), "delegateMap", null);
        setIntField(term21781, term21781.getClass(), "size", 1);
        term21986 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setIntField(term21986, term21986.getClass(), "size", 1);
        setIntField(term21986, term21986.getClass(), "hash1", 0);
        setIntField(term21986, term21986.getClass(), "hash2", 0);
        setIntField(term21986, term21986.getClass(), "hash3", 0);
        setField(term21986, term21986.getClass(), "key1", null);
        setField(term21986, term21986.getClass(), "key2", null);
        setField(term21986, term21986.getClass(), "key3", null);
        setField(term21986, term21986.getClass(), "value1", null);
        setField(term21986, term21986.getClass(), "value2", null);
        setField(term21986, term21986.getClass(), "value3", null);
        setField(term21986, term21986.getClass(), "delegateMap", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.map.Flat3Map");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "containsValue", argTypes, term21781, args);
        assertTrue(recursiveEquals(term21781, term21986));
    }

};


