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

public class Flat3Map_equals_1826922527437 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term80372;
     Object term80450;
     Object term80511;
     Object term80513;

    public Flat3Map_equals_1826922527437() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term80372 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term80412 = newInstance(Class.forName("java.lang.Package"));
        setField(term80372, term80372.getClass(), "delegateMap", null);
        setIntField(term80372, term80372.getClass(), "size", 1);
        setField(term80372, term80372.getClass(), "key1", term80412);
        term80450 = newInstance(Class.forName("java.lang.Object"));
        term80511 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term80512 = newInstance(Class.forName("java.lang.Package"));
        setIntField(term80511, term80511.getClass(), "size", 1);
        setIntField(term80511, term80511.getClass(), "hash1", 0);
        setIntField(term80511, term80511.getClass(), "hash2", 0);
        setIntField(term80511, term80511.getClass(), "hash3", 0);
        setField(term80512, term80512.getClass(), "versionInfo", null);
        setField(term80512, term80512.getClass(), "packageInfo", null);
        setField(term80512, term80512.getClass(), "name", null);
        setField(term80512, term80512.getClass(), "module", null);
        setField(term80511, term80511.getClass(), "key1", term80512);
        setField(term80511, term80511.getClass(), "key2", null);
        setField(term80511, term80511.getClass(), "key3", null);
        setField(term80511, term80511.getClass(), "value1", null);
        setField(term80511, term80511.getClass(), "value2", null);
        setField(term80511, term80511.getClass(), "value3", null);
        setField(term80511, term80511.getClass(), "delegateMap", null);
        term80513 = newInstance(Class.forName("java.lang.Object"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.map.Flat3Map");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term80450;
        Object retValue = callMethod(klass, "equals", argTypes, term80372, args);
        assertTrue(recursiveEquals(term80372, term80511));
        assertTrue(recursiveEquals(term80450, term80513));
        assertTrue(recursiveEquals(retValue, false));
    }

};
