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
import java.util.HashMap;

public class Flat3Map_equals_1826922527436 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term80106;
     Object term80246;
     Object term80495;
     Object term80498;

    public Flat3Map_equals_1826922527436() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term80154 = new HashMap();
        term80106 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setField(term80106, term80106.getClass(), "delegateMap", null);
        setIntField(term80106, term80106.getClass(), "size", 2);
        setField(term80106, term80106.getClass(), "key2", term80154);
        term80246 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setField(term80246, term80246.getClass(), "delegateMap", null);
        setIntField(term80246, term80246.getClass(), "size", 2);
        HashMap term80496 = new HashMap();
        term80495 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setIntField(term80495, term80495.getClass(), "size", 2);
        setIntField(term80495, term80495.getClass(), "hash1", 0);
        setIntField(term80495, term80495.getClass(), "hash2", 0);
        setIntField(term80495, term80495.getClass(), "hash3", 0);
        setField(term80495, term80495.getClass(), "key1", null);
        setField(term80495, term80495.getClass(), "key2", term80496);
        setField(term80495, term80495.getClass(), "key3", null);
        setField(term80495, term80495.getClass(), "value1", null);
        setField(term80495, term80495.getClass(), "value2", null);
        setField(term80495, term80495.getClass(), "value3", null);
        setField(term80495, term80495.getClass(), "delegateMap", null);
        term80498 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setIntField(term80498, term80498.getClass(), "size", 2);
        setIntField(term80498, term80498.getClass(), "hash1", 0);
        setIntField(term80498, term80498.getClass(), "hash2", 0);
        setIntField(term80498, term80498.getClass(), "hash3", 0);
        setField(term80498, term80498.getClass(), "key1", null);
        setField(term80498, term80498.getClass(), "key2", null);
        setField(term80498, term80498.getClass(), "key3", null);
        setField(term80498, term80498.getClass(), "value1", null);
        setField(term80498, term80498.getClass(), "value2", null);
        setField(term80498, term80498.getClass(), "value3", null);
        setField(term80498, term80498.getClass(), "delegateMap", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.map.Flat3Map");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term80246;
        Object retValue = callMethod(klass, "equals", argTypes, term80106, args);
        assertTrue(recursiveEquals(term80106, term80495));
        assertTrue(recursiveEquals(term80246, term80498));
        assertTrue(recursiveEquals(retValue, false));
    }

};
