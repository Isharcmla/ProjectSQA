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

public class Flat3Map_equals_1826922527985 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term274238;
     Object term274382;
     Object term274423;
     Object term274426;

    public Flat3Map_equals_1826922527985() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term274406 = new HashMap();
        term274238 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term274344 = newInstance(Class.forName("java.lang.reflect.Modifier"));
        setField(term274238, term274238.getClass(), "delegateMap", null);
        setIntField(term274238, term274238.getClass(), "size", 3);
        setField(term274238, term274238.getClass(), "key3", term274406);
        setField(term274238, term274238.getClass(), "value3", null);
        setField(term274238, term274238.getClass(), "key2", term274344);
        term274382 = newInstance(Class.forName("java.lang.Object"));
        HashMap term274425 = new HashMap();
        term274423 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term274424 = newInstance(Class.forName("java.lang.reflect.Modifier"));
        setIntField(term274423, term274423.getClass(), "size", 3);
        setIntField(term274423, term274423.getClass(), "hash1", 0);
        setIntField(term274423, term274423.getClass(), "hash2", 0);
        setIntField(term274423, term274423.getClass(), "hash3", 0);
        setField(term274423, term274423.getClass(), "key1", null);
        setField(term274423, term274423.getClass(), "key2", term274424);
        setField(term274423, term274423.getClass(), "key3", term274425);
        setField(term274423, term274423.getClass(), "value1", null);
        setField(term274423, term274423.getClass(), "value2", null);
        setField(term274423, term274423.getClass(), "value3", null);
        setField(term274423, term274423.getClass(), "delegateMap", null);
        term274426 = newInstance(Class.forName("java.lang.Object"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.map.Flat3Map");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term274382;
        Object retValue = callMethod(klass, "equals", argTypes, term274238, args);
        assertTrue(recursiveEquals(term274238, term274423));
        assertTrue(recursiveEquals(term274382, term274426));
        assertTrue(recursiveEquals(retValue, false));
    }

};


