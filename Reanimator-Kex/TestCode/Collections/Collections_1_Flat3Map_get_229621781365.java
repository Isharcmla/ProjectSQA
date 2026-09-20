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

public class Flat3Map_get_229621781365 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term66450;
     Object term66542;
     Object term66595;
     Object term66596;

    public Flat3Map_get_229621781365() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term66450 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setField(term66450, term66450.getClass(), "delegateMap", null);
        setIntField(term66450, term66450.getClass(), "size", 2);
        setIntField(term66450, term66450.getClass(), "hash2", 0);
        setField(term66450, term66450.getClass(), "key2", null);
        term66542 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setField(term66542, term66542.getClass(), "delegateMap", null);
        setIntField(term66542, term66542.getClass(), "size", 2);
        setIntField(term66542, term66542.getClass(), "hash2", 0);
        setField(term66542, term66542.getClass(), "value2", null);
        setIntField(term66542, term66542.getClass(), "hash1", 0);
        setField(term66542, term66542.getClass(), "value1", null);
        setField(term66542, term66542.getClass(), "key2", null);
        term66595 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setIntField(term66595, term66595.getClass(), "size", 2);
        setIntField(term66595, term66595.getClass(), "hash1", 0);
        setIntField(term66595, term66595.getClass(), "hash2", 0);
        setIntField(term66595, term66595.getClass(), "hash3", 0);
        setField(term66595, term66595.getClass(), "key1", null);
        setField(term66595, term66595.getClass(), "key2", null);
        setField(term66595, term66595.getClass(), "key3", null);
        setField(term66595, term66595.getClass(), "value1", null);
        setField(term66595, term66595.getClass(), "value2", null);
        setField(term66595, term66595.getClass(), "value3", null);
        setField(term66595, term66595.getClass(), "delegateMap", null);
        term66596 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setIntField(term66596, term66596.getClass(), "size", 2);
        setIntField(term66596, term66596.getClass(), "hash1", 0);
        setIntField(term66596, term66596.getClass(), "hash2", 0);
        setIntField(term66596, term66596.getClass(), "hash3", 0);
        setField(term66596, term66596.getClass(), "key1", null);
        setField(term66596, term66596.getClass(), "key2", null);
        setField(term66596, term66596.getClass(), "key3", null);
        setField(term66596, term66596.getClass(), "value1", null);
        setField(term66596, term66596.getClass(), "value2", null);
        setField(term66596, term66596.getClass(), "value3", null);
        setField(term66596, term66596.getClass(), "delegateMap", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.map.Flat3Map");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term66542;
        Object retValue = callMethod(klass, "get", argTypes, term66450, args);
        assertTrue(recursiveEquals(term66450, term66595));
        assertTrue(recursiveEquals(term66542, term66596));
        assertTrue(recursiveEquals(retValue, null));
    }

};
