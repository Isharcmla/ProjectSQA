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

public class Flat3Map_equals_1826922527421 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term77359;
     Object term77537;
     Object term77586;
     Object term77588;

    public Flat3Map_equals_1826922527421() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term77359 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term77445 = newInstance(Class.forName("java.nio.file.CopyMoveHelper$CopyOptions"));
        setField(term77359, term77359.getClass(), "delegateMap", null);
        setIntField(term77359, term77359.getClass(), "size", 2);
        setField(term77359, term77359.getClass(), "key2", null);
        setField(term77359, term77359.getClass(), "value2", null);
        setField(term77359, term77359.getClass(), "key1", term77445);
        term77537 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setField(term77537, term77537.getClass(), "delegateMap", null);
        setIntField(term77537, term77537.getClass(), "size", 2);
        setField(term77537, term77537.getClass(), "key2", null);
        setField(term77537, term77537.getClass(), "value2", null);
        term77586 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term77587 = newInstance(Class.forName("java.nio.file.CopyMoveHelper$CopyOptions"));
        setIntField(term77586, term77586.getClass(), "size", 2);
        setIntField(term77586, term77586.getClass(), "hash1", 0);
        setIntField(term77586, term77586.getClass(), "hash2", 0);
        setIntField(term77586, term77586.getClass(), "hash3", 0);
        setBooleanField(term77587, term77587.getClass(), "replaceExisting", false);
        setBooleanField(term77587, term77587.getClass(), "copyAttributes", false);
        setBooleanField(term77587, term77587.getClass(), "followLinks", false);
        setField(term77586, term77586.getClass(), "key1", term77587);
        setField(term77586, term77586.getClass(), "key2", null);
        setField(term77586, term77586.getClass(), "key3", null);
        setField(term77586, term77586.getClass(), "value1", null);
        setField(term77586, term77586.getClass(), "value2", null);
        setField(term77586, term77586.getClass(), "value3", null);
        setField(term77586, term77586.getClass(), "delegateMap", null);
        term77588 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setIntField(term77588, term77588.getClass(), "size", 2);
        setIntField(term77588, term77588.getClass(), "hash1", 0);
        setIntField(term77588, term77588.getClass(), "hash2", 0);
        setIntField(term77588, term77588.getClass(), "hash3", 0);
        setField(term77588, term77588.getClass(), "key1", null);
        setField(term77588, term77588.getClass(), "key2", null);
        setField(term77588, term77588.getClass(), "key3", null);
        setField(term77588, term77588.getClass(), "value1", null);
        setField(term77588, term77588.getClass(), "value2", null);
        setField(term77588, term77588.getClass(), "value3", null);
        setField(term77588, term77588.getClass(), "delegateMap", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.map.Flat3Map");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term77537;
        Object retValue = callMethod(klass, "equals", argTypes, term77359, args);
        assertTrue(recursiveEquals(term77359, term77586));
        assertTrue(recursiveEquals(term77537, term77588));
        assertTrue(recursiveEquals(retValue, false));
    }

};
