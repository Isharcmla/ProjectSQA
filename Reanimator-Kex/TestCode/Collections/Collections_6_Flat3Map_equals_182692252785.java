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

public class Flat3Map_equals_182692252785 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term17194;
     Object term17662;

    public Flat3Map_equals_182692252785() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term17194 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setField(term17194, term17194.getClass(), "delegateMap", null);
        term17662 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setIntField(term17662, term17662.getClass(), "size", 0);
        setIntField(term17662, term17662.getClass(), "hash1", 0);
        setIntField(term17662, term17662.getClass(), "hash2", 0);
        setIntField(term17662, term17662.getClass(), "hash3", 0);
        setField(term17662, term17662.getClass(), "key1", null);
        setField(term17662, term17662.getClass(), "key2", null);
        setField(term17662, term17662.getClass(), "key3", null);
        setField(term17662, term17662.getClass(), "value1", null);
        setField(term17662, term17662.getClass(), "value2", null);
        setField(term17662, term17662.getClass(), "value3", null);
        setField(term17662, term17662.getClass(), "delegateMap", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.map.Flat3Map");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = null;
        Object retValue = callMethod(klass, "equals", argTypes, term17194, args);
        assertTrue(recursiveEquals(term17194, term17662));
        assertTrue(recursiveEquals(retValue, false));
    }

};


