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

public class Flat3Map_equals_1826922527442 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term79867;
     Object term79997;
     Object term80427;
     Object term80429;

    public Flat3Map_equals_1826922527442() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term79867 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term79905 = newInstance(Class.forName("java.lang.Object"));
        setField(term79867, term79867.getClass(), "delegateMap", null);
        setIntField(term79867, term79867.getClass(), "size", 3);
        setField(term79867, term79867.getClass(), "key3", null);
        setField(term79867, term79867.getClass(), "value3", null);
        setField(term79867, term79867.getClass(), "key2", null);
        setField(term79867, term79867.getClass(), "value2", null);
        setField(term79867, term79867.getClass(), "key1", term79905);
        term79997 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term80035 = newInstance(Class.forName("java.lang.Object"));
        setField(term79997, term79997.getClass(), "delegateMap", null);
        setIntField(term79997, term79997.getClass(), "size", 3);
        setField(term79997, term79997.getClass(), "key3", term80035);
        setField(term79997, term79997.getClass(), "key2", null);
        setField(term79997, term79997.getClass(), "value2", null);
        term80427 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term80428 = newInstance(Class.forName("java.lang.Object"));
        setIntField(term80427, term80427.getClass(), "size", 3);
        setIntField(term80427, term80427.getClass(), "hash1", 0);
        setIntField(term80427, term80427.getClass(), "hash2", 0);
        setIntField(term80427, term80427.getClass(), "hash3", 0);
        setField(term80427, term80427.getClass(), "key1", term80428);
        setField(term80427, term80427.getClass(), "key2", null);
        setField(term80427, term80427.getClass(), "key3", null);
        setField(term80427, term80427.getClass(), "value1", null);
        setField(term80427, term80427.getClass(), "value2", null);
        setField(term80427, term80427.getClass(), "value3", null);
        setField(term80427, term80427.getClass(), "delegateMap", null);
        term80429 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term80430 = newInstance(Class.forName("java.lang.Object"));
        setIntField(term80429, term80429.getClass(), "size", 3);
        setIntField(term80429, term80429.getClass(), "hash1", 0);
        setIntField(term80429, term80429.getClass(), "hash2", 0);
        setIntField(term80429, term80429.getClass(), "hash3", 0);
        setField(term80429, term80429.getClass(), "key1", null);
        setField(term80429, term80429.getClass(), "key2", null);
        setField(term80429, term80429.getClass(), "key3", term80430);
        setField(term80429, term80429.getClass(), "value1", null);
        setField(term80429, term80429.getClass(), "value2", null);
        setField(term80429, term80429.getClass(), "value3", null);
        setField(term80429, term80429.getClass(), "delegateMap", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.map.Flat3Map");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term79997;
        Object retValue = callMethod(klass, "equals", argTypes, term79867, args);
        assertTrue(recursiveEquals(term79867, term80427));
        assertTrue(recursiveEquals(term79997, term80429));
        assertTrue(recursiveEquals(retValue, false));
    }

};


