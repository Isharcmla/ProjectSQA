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

public class Flat3Map_equals_1826922527481 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term90644;
     Object term90892;
     Object term90925;
     Object term90927;

    public Flat3Map_equals_1826922527481() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term90644 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term90800 = newInstance(Class.forName("org.apache.commons.collections.list.TransformedList$TransformedListIterator"));
        setField(term90644, term90644.getClass(), "delegateMap", null);
        setIntField(term90644, term90644.getClass(), "size", 2);
        setField(term90644, term90644.getClass(), "key2", term90800);
        term90892 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setField(term90892, term90892.getClass(), "delegateMap", null);
        setIntField(term90892, term90892.getClass(), "size", 2);
        term90925 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term90926 = newInstance(Class.forName("org.apache.commons.collections.list.TransformedList$TransformedListIterator"));
        setIntField(term90925, term90925.getClass(), "size", 2);
        setIntField(term90925, term90925.getClass(), "hash1", 0);
        setIntField(term90925, term90925.getClass(), "hash2", 0);
        setIntField(term90925, term90925.getClass(), "hash3", 0);
        setField(term90925, term90925.getClass(), "key1", null);
        setField(term90926, term90926.getClass(), "this$0", null);
        setField(term90926, term90926.getClass(), "iterator", null);
        setField(term90925, term90925.getClass(), "key2", term90926);
        setField(term90925, term90925.getClass(), "key3", null);
        setField(term90925, term90925.getClass(), "value1", null);
        setField(term90925, term90925.getClass(), "value2", null);
        setField(term90925, term90925.getClass(), "value3", null);
        setField(term90925, term90925.getClass(), "delegateMap", null);
        term90927 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setIntField(term90927, term90927.getClass(), "size", 2);
        setIntField(term90927, term90927.getClass(), "hash1", 0);
        setIntField(term90927, term90927.getClass(), "hash2", 0);
        setIntField(term90927, term90927.getClass(), "hash3", 0);
        setField(term90927, term90927.getClass(), "key1", null);
        setField(term90927, term90927.getClass(), "key2", null);
        setField(term90927, term90927.getClass(), "key3", null);
        setField(term90927, term90927.getClass(), "value1", null);
        setField(term90927, term90927.getClass(), "value2", null);
        setField(term90927, term90927.getClass(), "value3", null);
        setField(term90927, term90927.getClass(), "delegateMap", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.map.Flat3Map");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term90892;
        Object retValue = callMethod(klass, "equals", argTypes, term90644, args);
        assertTrue(recursiveEquals(term90644, term90925));
        assertTrue(recursiveEquals(term90892, term90927));
        assertTrue(recursiveEquals(retValue, false));
    }

};
