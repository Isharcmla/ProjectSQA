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

public class Flat3Map_remove_840690279987 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term197553;
     Object term197590;
     Object term197591;

    public Flat3Map_remove_840690279987() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term197553 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setField(term197553, term197553.getClass(), "delegateMap", null);
        setIntField(term197553, term197553.getClass(), "size", 1);
        setIntField(term197553, term197553.getClass(), "hash1", 0);
        setField(term197553, term197553.getClass(), "value1", null);
        setField(term197553, term197553.getClass(), "key1", term197553);
        term197590 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setIntField(term197590, term197590.getClass(), "size", 0);
        setIntField(term197590, term197590.getClass(), "hash1", 0);
        setIntField(term197590, term197590.getClass(), "hash2", 0);
        setIntField(term197590, term197590.getClass(), "hash3", 0);
        setField(term197590, term197590.getClass(), "key1", null);
        setField(term197590, term197590.getClass(), "key2", null);
        setField(term197590, term197590.getClass(), "key3", null);
        setField(term197590, term197590.getClass(), "value1", null);
        setField(term197590, term197590.getClass(), "value2", null);
        setField(term197590, term197590.getClass(), "value3", null);
        setField(term197590, term197590.getClass(), "delegateMap", null);
        term197591 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setIntField(term197591, term197591.getClass(), "size", 0);
        setIntField(term197591, term197591.getClass(), "hash1", 0);
        setIntField(term197591, term197591.getClass(), "hash2", 0);
        setIntField(term197591, term197591.getClass(), "hash3", 0);
        setField(term197591, term197591.getClass(), "key1", null);
        setField(term197591, term197591.getClass(), "key2", null);
        setField(term197591, term197591.getClass(), "key3", null);
        setField(term197591, term197591.getClass(), "value1", null);
        setField(term197591, term197591.getClass(), "value2", null);
        setField(term197591, term197591.getClass(), "value3", null);
        setField(term197591, term197591.getClass(), "delegateMap", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.map.Flat3Map");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term197553;
        Object retValue = callMethod(klass, "remove", argTypes, term197553, args);
        assertTrue(recursiveEquals(term197553, term197590));
        assertTrue(recursiveEquals(term197553, term197591));
        assertTrue(recursiveEquals(retValue, null));
    }

};
