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

public class Flat3Map_remove_84069027980 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term16234;
     Object term16357;

    public Flat3Map_remove_84069027980() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term16234 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setField(term16234, term16234.getClass(), "delegateMap", null);
        term16357 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setIntField(term16357, term16357.getClass(), "size", 0);
        setIntField(term16357, term16357.getClass(), "hash1", 0);
        setIntField(term16357, term16357.getClass(), "hash2", 0);
        setIntField(term16357, term16357.getClass(), "hash3", 0);
        setField(term16357, term16357.getClass(), "key1", null);
        setField(term16357, term16357.getClass(), "key2", null);
        setField(term16357, term16357.getClass(), "key3", null);
        setField(term16357, term16357.getClass(), "value1", null);
        setField(term16357, term16357.getClass(), "value2", null);
        setField(term16357, term16357.getClass(), "value3", null);
        setField(term16357, term16357.getClass(), "delegateMap", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.map.Flat3Map");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = null;
        Object retValue = callMethod(klass, "remove", argTypes, term16234, args);
        assertTrue(recursiveEquals(term16234, term16357));
        assertTrue(recursiveEquals(retValue, null));
    }

};
