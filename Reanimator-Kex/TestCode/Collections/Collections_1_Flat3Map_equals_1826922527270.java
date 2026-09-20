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

public class Flat3Map_equals_1826922527270 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term47994;
     Object term48086;
     Object term48585;
     Object term48586;

    public Flat3Map_equals_1826922527270() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term47994 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setField(term47994, term47994.getClass(), "delegateMap", null);
        setIntField(term47994, term47994.getClass(), "size", 0);
        term48086 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term48184 = newInstance(Class.forName("org.apache.commons.collections.map.IdentityMap"));
        setField(term48086, term48086.getClass(), "delegateMap", term48184);
        term48585 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setIntField(term48585, term48585.getClass(), "size", 0);
        setIntField(term48585, term48585.getClass(), "hash1", 0);
        setIntField(term48585, term48585.getClass(), "hash2", 0);
        setIntField(term48585, term48585.getClass(), "hash3", 0);
        setField(term48585, term48585.getClass(), "key1", null);
        setField(term48585, term48585.getClass(), "key2", null);
        setField(term48585, term48585.getClass(), "key3", null);
        setField(term48585, term48585.getClass(), "value1", null);
        setField(term48585, term48585.getClass(), "value2", null);
        setField(term48585, term48585.getClass(), "value3", null);
        setField(term48585, term48585.getClass(), "delegateMap", null);
        term48586 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term48587 = newInstance(Class.forName("org.apache.commons.collections.map.IdentityMap"));
        setIntField(term48586, term48586.getClass(), "size", 0);
        setIntField(term48586, term48586.getClass(), "hash1", 0);
        setIntField(term48586, term48586.getClass(), "hash2", 0);
        setIntField(term48586, term48586.getClass(), "hash3", 0);
        setField(term48586, term48586.getClass(), "key1", null);
        setField(term48586, term48586.getClass(), "key2", null);
        setField(term48586, term48586.getClass(), "key3", null);
        setField(term48586, term48586.getClass(), "value1", null);
        setField(term48586, term48586.getClass(), "value2", null);
        setField(term48586, term48586.getClass(), "value3", null);
        setFloatField(term48587, term48587.getClass(), "loadFactor", 0.0F);
        setIntField(term48587, term48587.getClass(), "size", 0);
        setField(term48587, term48587.getClass(), "data", null);
        setIntField(term48587, term48587.getClass(), "threshold", 0);
        setIntField(term48587, term48587.getClass(), "modCount", 0);
        setField(term48587, term48587.getClass(), "entrySet", null);
        setField(term48587, term48587.getClass(), "keySet", null);
        setField(term48587, term48587.getClass(), "values", null);
        setField(term48587, term48587.getClass(), "keySet", null);
        setField(term48587, term48587.getClass(), "values", null);
        setField(term48586, term48586.getClass(), "delegateMap", term48587);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.map.Flat3Map");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term48086;
        Object retValue = callMethod(klass, "equals", argTypes, term47994, args);
        assertTrue(recursiveEquals(term47994, term48585));
        assertTrue(recursiveEquals(term48086, term48586));
        assertTrue(recursiveEquals(retValue, true));
    }

};
