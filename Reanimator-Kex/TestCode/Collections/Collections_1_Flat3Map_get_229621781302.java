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

public class Flat3Map_get_229621781302 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term53707;
     Object term53819;
     Object term54440;
     Object term54441;

    public Flat3Map_get_229621781302() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term53707 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setField(term53707, term53707.getClass(), "delegateMap", null);
        setIntField(term53707, term53707.getClass(), "size", 1);
        term53819 = newInstance(Class.forName("org.apache.commons.collections.functors.TruePredicate"));
        term54440 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setIntField(term54440, term54440.getClass(), "size", 1);
        setIntField(term54440, term54440.getClass(), "hash1", 0);
        setIntField(term54440, term54440.getClass(), "hash2", 0);
        setIntField(term54440, term54440.getClass(), "hash3", 0);
        setField(term54440, term54440.getClass(), "key1", null);
        setField(term54440, term54440.getClass(), "key2", null);
        setField(term54440, term54440.getClass(), "key3", null);
        setField(term54440, term54440.getClass(), "value1", null);
        setField(term54440, term54440.getClass(), "value2", null);
        setField(term54440, term54440.getClass(), "value3", null);
        setField(term54440, term54440.getClass(), "delegateMap", null);
        term54441 = newInstance(Class.forName("org.apache.commons.collections.functors.TruePredicate"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.map.Flat3Map");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term53819;
        Object retValue = callMethod(klass, "get", argTypes, term53707, args);
        assertTrue(recursiveEquals(term53707, term54440));
        assertTrue(recursiveEquals(term53819, term54441));
        assertTrue(recursiveEquals(retValue, null));
    }

};
