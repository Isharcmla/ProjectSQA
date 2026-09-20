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

public class Flat3Map_remove_840690279989 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term197772;
     Object term197796;
     Object term197797;

    public Flat3Map_remove_840690279989() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term197772 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setField(term197772, term197772.getClass(), "delegateMap", null);
        setIntField(term197772, term197772.getClass(), "size", 3);
        setIntField(term197772, term197772.getClass(), "hash3", 0);
        setField(term197772, term197772.getClass(), "value3", null);
        setIntField(term197772, term197772.getClass(), "hash2", 0);
        setField(term197772, term197772.getClass(), "value2", null);
        setIntField(term197772, term197772.getClass(), "hash1", 0);
        setField(term197772, term197772.getClass(), "value1", null);
        setField(term197772, term197772.getClass(), "key3", term197772);
        term197796 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setIntField(term197796, term197796.getClass(), "size", 2);
        setIntField(term197796, term197796.getClass(), "hash1", 0);
        setIntField(term197796, term197796.getClass(), "hash2", 0);
        setIntField(term197796, term197796.getClass(), "hash3", 0);
        setField(term197796, term197796.getClass(), "key1", null);
        setField(term197796, term197796.getClass(), "key2", null);
        setField(term197796, term197796.getClass(), "key3", null);
        setField(term197796, term197796.getClass(), "value1", null);
        setField(term197796, term197796.getClass(), "value2", null);
        setField(term197796, term197796.getClass(), "value3", null);
        setField(term197796, term197796.getClass(), "delegateMap", null);
        term197797 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setIntField(term197797, term197797.getClass(), "size", 2);
        setIntField(term197797, term197797.getClass(), "hash1", 0);
        setIntField(term197797, term197797.getClass(), "hash2", 0);
        setIntField(term197797, term197797.getClass(), "hash3", 0);
        setField(term197797, term197797.getClass(), "key1", null);
        setField(term197797, term197797.getClass(), "key2", null);
        setField(term197797, term197797.getClass(), "key3", null);
        setField(term197797, term197797.getClass(), "value1", null);
        setField(term197797, term197797.getClass(), "value2", null);
        setField(term197797, term197797.getClass(), "value3", null);
        setField(term197797, term197797.getClass(), "delegateMap", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.map.Flat3Map");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term197772;
        Object retValue = callMethod(klass, "remove", argTypes, term197772, args);
        assertTrue(recursiveEquals(term197772, term197796));
        assertTrue(recursiveEquals(term197772, term197797));
        assertTrue(recursiveEquals(retValue, null));
    }

};
