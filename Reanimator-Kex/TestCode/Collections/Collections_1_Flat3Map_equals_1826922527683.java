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

public class Flat3Map_equals_1826922527683 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term134531;
     Object term134671;
     Object term134857;
     Object term134860;

    public Flat3Map_equals_1826922527683() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term134695 = new HashMap();
        term134531 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setField(term134531, term134531.getClass(), "delegateMap", null);
        setIntField(term134531, term134531.getClass(), "size", 3);
        setField(term134531, term134531.getClass(), "key3", null);
        setField(term134531, term134531.getClass(), "value3", null);
        setField(term134531, term134531.getClass(), "key2", null);
        setField(term134531, term134531.getClass(), "value2", null);
        setField(term134531, term134531.getClass(), "key1", term134695);
        term134671 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setField(term134671, term134671.getClass(), "delegateMap", null);
        setIntField(term134671, term134671.getClass(), "size", 3);
        setField(term134671, term134671.getClass(), "key3", null);
        setField(term134671, term134671.getClass(), "value3", null);
        setIntField(term134671, term134671.getClass(), "hash3", 0);
        setIntField(term134671, term134671.getClass(), "hash2", 0);
        setField(term134671, term134671.getClass(), "key2", term134695);
        HashMap term134858 = new HashMap();
        term134857 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setIntField(term134857, term134857.getClass(), "size", 3);
        setIntField(term134857, term134857.getClass(), "hash1", 0);
        setIntField(term134857, term134857.getClass(), "hash2", 0);
        setIntField(term134857, term134857.getClass(), "hash3", 0);
        setField(term134857, term134857.getClass(), "key1", term134858);
        setField(term134857, term134857.getClass(), "key2", null);
        setField(term134857, term134857.getClass(), "key3", null);
        setField(term134857, term134857.getClass(), "value1", null);
        setField(term134857, term134857.getClass(), "value2", null);
        setField(term134857, term134857.getClass(), "value3", null);
        setField(term134857, term134857.getClass(), "delegateMap", null);
        HashMap term134861 = new HashMap();
        term134860 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setIntField(term134860, term134860.getClass(), "size", 3);
        setIntField(term134860, term134860.getClass(), "hash1", 0);
        setIntField(term134860, term134860.getClass(), "hash2", 0);
        setIntField(term134860, term134860.getClass(), "hash3", 0);
        setField(term134860, term134860.getClass(), "key1", null);
        setField(term134860, term134860.getClass(), "key2", term134861);
        setField(term134860, term134860.getClass(), "key3", null);
        setField(term134860, term134860.getClass(), "value1", null);
        setField(term134860, term134860.getClass(), "value2", null);
        setField(term134860, term134860.getClass(), "value3", null);
        setField(term134860, term134860.getClass(), "delegateMap", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.map.Flat3Map");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term134671;
        Object retValue = callMethod(klass, "equals", argTypes, term134531, args);
        assertTrue(recursiveEquals(term134531, term134857));
        assertTrue(recursiveEquals(term134671, term134860));
        assertTrue(recursiveEquals(retValue, true));
    }

};
