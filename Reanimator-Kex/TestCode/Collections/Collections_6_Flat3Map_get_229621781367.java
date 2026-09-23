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

public class Flat3Map_get_229621781367 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term62531;
     Object term62745;
     Object term62789;
     Object term62793;

    public Flat3Map_get_229621781367() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term62531 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term62569 = newInstance(Class.forName("java.lang.Object"));
        Object term62607 = newInstance(Class.forName("java.lang.Object"));
        term62745 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setField(term62531, term62531.getClass(), "delegateMap", null);
        setIntField(term62531, term62531.getClass(), "size", 3);
        setIntField(term62531, term62531.getClass(), "hash3", 0);
        setField(term62531, term62531.getClass(), "key3", term62569);
        setIntField(term62531, term62531.getClass(), "hash2", 0);
        setField(term62531, term62531.getClass(), "key2", term62607);
        setIntField(term62531, term62531.getClass(), "hash1", 0);
        setField(term62745, term62745.getClass(), "delegateMap", null);
        setIntField(term62745, term62745.getClass(), "size", 3);
        setIntField(term62745, term62745.getClass(), "hash3", 0);
        setField(term62745, term62745.getClass(), "value3", null);
        setIntField(term62745, term62745.getClass(), "hash2", 0);
        setField(term62745, term62745.getClass(), "value2", null);
        setIntField(term62745, term62745.getClass(), "hash1", 0);
        setField(term62745, term62745.getClass(), "value1", null);
        setField(term62531, term62531.getClass(), "key1", term62745);
        term62789 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term62790 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term62791 = newInstance(Class.forName("java.lang.Object"));
        Object term62792 = newInstance(Class.forName("java.lang.Object"));
        setIntField(term62789, term62789.getClass(), "size", 3);
        setIntField(term62789, term62789.getClass(), "hash1", 0);
        setIntField(term62789, term62789.getClass(), "hash2", 0);
        setIntField(term62789, term62789.getClass(), "hash3", 0);
        setIntField(term62790, term62790.getClass(), "size", 3);
        setIntField(term62790, term62790.getClass(), "hash1", 0);
        setIntField(term62790, term62790.getClass(), "hash2", 0);
        setIntField(term62790, term62790.getClass(), "hash3", 0);
        setField(term62790, term62790.getClass(), "key1", null);
        setField(term62790, term62790.getClass(), "key2", null);
        setField(term62790, term62790.getClass(), "key3", null);
        setField(term62790, term62790.getClass(), "value1", null);
        setField(term62790, term62790.getClass(), "value2", null);
        setField(term62790, term62790.getClass(), "value3", null);
        setField(term62790, term62790.getClass(), "delegateMap", null);
        setField(term62789, term62789.getClass(), "key1", term62790);
        setField(term62789, term62789.getClass(), "key2", term62791);
        setField(term62789, term62789.getClass(), "key3", term62792);
        setField(term62789, term62789.getClass(), "value1", null);
        setField(term62789, term62789.getClass(), "value2", null);
        setField(term62789, term62789.getClass(), "value3", null);
        setField(term62789, term62789.getClass(), "delegateMap", null);
        term62793 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setIntField(term62793, term62793.getClass(), "size", 3);
        setIntField(term62793, term62793.getClass(), "hash1", 0);
        setIntField(term62793, term62793.getClass(), "hash2", 0);
        setIntField(term62793, term62793.getClass(), "hash3", 0);
        setField(term62793, term62793.getClass(), "key1", null);
        setField(term62793, term62793.getClass(), "key2", null);
        setField(term62793, term62793.getClass(), "key3", null);
        setField(term62793, term62793.getClass(), "value1", null);
        setField(term62793, term62793.getClass(), "value2", null);
        setField(term62793, term62793.getClass(), "value3", null);
        setField(term62793, term62793.getClass(), "delegateMap", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.map.Flat3Map");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term62745;
        Object retValue = callMethod(klass, "get", argTypes, term62531, args);
        assertTrue(recursiveEquals(term62531, term62789));
        assertTrue(recursiveEquals(term62745, term62793));
        assertTrue(recursiveEquals(retValue, null));
    }

};


