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
import java.lang.Object;

public class Flat3Map_equals_1826922527680 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term133415;
     Object term133639;
     Object term134365;
     Object term134368;

    public Flat3Map_equals_1826922527680() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term133663 = new HashMap();
        term133415 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term133501 = newInstance(Class.forName("java.lang.Object"));
        setField(term133415, term133415.getClass(), "delegateMap", null);
        setIntField(term133415, term133415.getClass(), "size", 2);
        setField(term133415, term133415.getClass(), "key2", term133663);
        setField(term133415, term133415.getClass(), "value2", term133501);
        term133639 = newInstance(Class.forName("java.lang.Object"));
        HashMap term134366 = new HashMap();
        term134365 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term134367 = newInstance(Class.forName("java.lang.Object"));
        setIntField(term134365, term134365.getClass(), "size", 2);
        setIntField(term134365, term134365.getClass(), "hash1", 0);
        setIntField(term134365, term134365.getClass(), "hash2", 0);
        setIntField(term134365, term134365.getClass(), "hash3", 0);
        setField(term134365, term134365.getClass(), "key1", null);
        setField(term134365, term134365.getClass(), "key2", term134366);
        setField(term134365, term134365.getClass(), "key3", null);
        setField(term134365, term134365.getClass(), "value1", null);
        setField(term134365, term134365.getClass(), "value2", term134367);
        setField(term134365, term134365.getClass(), "value3", null);
        setField(term134365, term134365.getClass(), "delegateMap", null);
        term134368 = newInstance(Class.forName("java.lang.Object"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.map.Flat3Map");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term133639;
        Object retValue = callMethod(klass, "equals", argTypes, term133415, args);
        assertTrue(recursiveEquals(term133415, term134365));
        assertTrue(recursiveEquals(term133639, term134368));
        assertTrue(recursiveEquals(retValue, false));
    }

};
