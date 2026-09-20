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
import java.util.HashMap;

public class Flat3Map_get_229621781745 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term150295;
     Object term150619;
     Object term150725;
     Object term150729;

    public Flat3Map_get_229621781745() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term150527 = new HashMap();
        term150295 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term150387 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term150479 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setField(term150295, term150295.getClass(), "delegateMap", null);
        setIntField(term150295, term150295.getClass(), "size", 2);
        setIntField(term150295, term150295.getClass(), "hash2", 0);
        setField(term150387, term150387.getClass(), "delegateMap", null);
        setIntField(term150387, term150387.getClass(), "size", -3);
        setField(term150295, term150295.getClass(), "key2", term150387);
        setIntField(term150295, term150295.getClass(), "hash1", 0);
        setField(term150479, term150479.getClass(), "delegateMap", null);
        setIntField(term150479, term150479.getClass(), "size", 2);
        setField(term150479, term150479.getClass(), "key2", term150527);
        setField(term150479, term150479.getClass(), "key1", null);
        setField(term150295, term150295.getClass(), "key1", term150479);
        term150619 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setField(term150619, term150619.getClass(), "delegateMap", null);
        setIntField(term150619, term150619.getClass(), "size", 2);
        setIntField(term150619, term150619.getClass(), "hash2", 0);
        setField(term150619, term150619.getClass(), "value2", null);
        setIntField(term150619, term150619.getClass(), "hash1", 0);
        setField(term150619, term150619.getClass(), "value1", null);
        setField(term150619, term150619.getClass(), "key2", null);
        HashMap term150727 = new HashMap();
        term150725 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term150726 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term150728 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setIntField(term150725, term150725.getClass(), "size", 2);
        setIntField(term150725, term150725.getClass(), "hash1", 0);
        setIntField(term150725, term150725.getClass(), "hash2", 0);
        setIntField(term150725, term150725.getClass(), "hash3", 0);
        setIntField(term150726, term150726.getClass(), "size", 2);
        setIntField(term150726, term150726.getClass(), "hash1", 0);
        setIntField(term150726, term150726.getClass(), "hash2", 0);
        setIntField(term150726, term150726.getClass(), "hash3", 0);
        setField(term150726, term150726.getClass(), "key1", null);
        setField(term150726, term150726.getClass(), "key2", term150727);
        setField(term150726, term150726.getClass(), "key3", null);
        setField(term150726, term150726.getClass(), "value1", null);
        setField(term150726, term150726.getClass(), "value2", null);
        setField(term150726, term150726.getClass(), "value3", null);
        setField(term150726, term150726.getClass(), "delegateMap", null);
        setField(term150725, term150725.getClass(), "key1", term150726);
        setIntField(term150728, term150728.getClass(), "size", -3);
        setIntField(term150728, term150728.getClass(), "hash1", 0);
        setIntField(term150728, term150728.getClass(), "hash2", 0);
        setIntField(term150728, term150728.getClass(), "hash3", 0);
        setField(term150728, term150728.getClass(), "key1", null);
        setField(term150728, term150728.getClass(), "key2", null);
        setField(term150728, term150728.getClass(), "key3", null);
        setField(term150728, term150728.getClass(), "value1", null);
        setField(term150728, term150728.getClass(), "value2", null);
        setField(term150728, term150728.getClass(), "value3", null);
        setField(term150728, term150728.getClass(), "delegateMap", null);
        setField(term150725, term150725.getClass(), "key2", term150728);
        setField(term150725, term150725.getClass(), "key3", null);
        setField(term150725, term150725.getClass(), "value1", null);
        setField(term150725, term150725.getClass(), "value2", null);
        setField(term150725, term150725.getClass(), "value3", null);
        setField(term150725, term150725.getClass(), "delegateMap", null);
        term150729 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setIntField(term150729, term150729.getClass(), "size", 2);
        setIntField(term150729, term150729.getClass(), "hash1", 0);
        setIntField(term150729, term150729.getClass(), "hash2", 0);
        setIntField(term150729, term150729.getClass(), "hash3", 0);
        setField(term150729, term150729.getClass(), "key1", null);
        setField(term150729, term150729.getClass(), "key2", null);
        setField(term150729, term150729.getClass(), "key3", null);
        setField(term150729, term150729.getClass(), "value1", null);
        setField(term150729, term150729.getClass(), "value2", null);
        setField(term150729, term150729.getClass(), "value3", null);
        setField(term150729, term150729.getClass(), "delegateMap", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.map.Flat3Map");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term150619;
        Object retValue = callMethod(klass, "get", argTypes, term150295, args);
        assertTrue(recursiveEquals(term150295, term150725));
        assertTrue(recursiveEquals(term150619, term150729));
        assertTrue(recursiveEquals(retValue, null));
    }

};
