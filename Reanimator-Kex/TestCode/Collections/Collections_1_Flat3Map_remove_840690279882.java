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

public class Flat3Map_remove_840690279882 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term177765;
     Object term178323;
     Object term178325;

    public Flat3Map_remove_840690279882() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term177765 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term177820 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap"));
        setField(term177765, term177765.getClass(), "delegateMap", null);
        setIntField(term177765, term177765.getClass(), "size", 3);
        setIntField(term177765, term177765.getClass(), "hash3", 0);
        setField(term177765, term177765.getClass(), "value3", term177820);
        term178323 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term178324 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap"));
        setIntField(term178323, term178323.getClass(), "size", 3);
        setIntField(term178323, term178323.getClass(), "hash1", 0);
        setIntField(term178323, term178323.getClass(), "hash2", 0);
        setIntField(term178323, term178323.getClass(), "hash3", 0);
        setField(term178323, term178323.getClass(), "key1", null);
        setField(term178323, term178323.getClass(), "key2", null);
        setField(term178323, term178323.getClass(), "key3", null);
        setField(term178323, term178323.getClass(), "value1", null);
        setField(term178323, term178323.getClass(), "value2", null);
        setFloatField(term178324, term178324.getClass(), "loadFactor", 0.0F);
        setIntField(term178324, term178324.getClass(), "size", 0);
        setField(term178324, term178324.getClass(), "data", null);
        setIntField(term178324, term178324.getClass(), "threshold", 0);
        setIntField(term178324, term178324.getClass(), "modCount", 0);
        setField(term178324, term178324.getClass(), "entrySet", null);
        setField(term178324, term178324.getClass(), "keySet", null);
        setField(term178324, term178324.getClass(), "values", null);
        setField(term178324, term178324.getClass(), "keySet", null);
        setField(term178324, term178324.getClass(), "values", null);
        setField(term178323, term178323.getClass(), "value3", term178324);
        setField(term178323, term178323.getClass(), "delegateMap", null);
        term178325 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term178326 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap"));
        setIntField(term178325, term178325.getClass(), "size", 3);
        setIntField(term178325, term178325.getClass(), "hash1", 0);
        setIntField(term178325, term178325.getClass(), "hash2", 0);
        setIntField(term178325, term178325.getClass(), "hash3", 0);
        setField(term178325, term178325.getClass(), "key1", null);
        setField(term178325, term178325.getClass(), "key2", null);
        setField(term178325, term178325.getClass(), "key3", null);
        setField(term178325, term178325.getClass(), "value1", null);
        setField(term178325, term178325.getClass(), "value2", null);
        setFloatField(term178326, term178326.getClass(), "loadFactor", 0.0F);
        setIntField(term178326, term178326.getClass(), "size", 0);
        setField(term178326, term178326.getClass(), "data", null);
        setIntField(term178326, term178326.getClass(), "threshold", 0);
        setIntField(term178326, term178326.getClass(), "modCount", 0);
        setField(term178326, term178326.getClass(), "entrySet", null);
        setField(term178326, term178326.getClass(), "keySet", null);
        setField(term178326, term178326.getClass(), "values", null);
        setField(term178326, term178326.getClass(), "keySet", null);
        setField(term178326, term178326.getClass(), "values", null);
        setField(term178325, term178325.getClass(), "value3", term178326);
        setField(term178325, term178325.getClass(), "delegateMap", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.map.Flat3Map");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term177765;
        Object retValue = callMethod(klass, "remove", argTypes, term177765, args);
        assertTrue(recursiveEquals(term177765, term178323));
        assertTrue(recursiveEquals(term177765, term178325));
        assertTrue(recursiveEquals(retValue, null));
    }

};
