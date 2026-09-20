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

public class Flat3Map_remove_8406902791093 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term216580;
     Object term216718;
     Object term216720;

    public Flat3Map_remove_8406902791093() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term216580 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term216635 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap"));
        setField(term216580, term216580.getClass(), "delegateMap", null);
        setIntField(term216580, term216580.getClass(), "size", 3);
        setIntField(term216580, term216580.getClass(), "hash3", 0);
        setIntField(term216635, term216635.getClass(), "size", 0);
        setField(term216580, term216580.getClass(), "value3", term216635);
        setIntField(term216580, term216580.getClass(), "hash2", 0);
        setField(term216580, term216580.getClass(), "value2", null);
        setIntField(term216580, term216580.getClass(), "hash1", 0);
        setField(term216580, term216580.getClass(), "value1", null);
        term216718 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term216719 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap"));
        setIntField(term216718, term216718.getClass(), "size", 3);
        setIntField(term216718, term216718.getClass(), "hash1", 0);
        setIntField(term216718, term216718.getClass(), "hash2", 0);
        setIntField(term216718, term216718.getClass(), "hash3", 0);
        setField(term216718, term216718.getClass(), "key1", null);
        setField(term216718, term216718.getClass(), "key2", null);
        setField(term216718, term216718.getClass(), "key3", null);
        setField(term216718, term216718.getClass(), "value1", null);
        setField(term216718, term216718.getClass(), "value2", null);
        setFloatField(term216719, term216719.getClass(), "loadFactor", 0.0F);
        setIntField(term216719, term216719.getClass(), "size", 0);
        setField(term216719, term216719.getClass(), "data", null);
        setIntField(term216719, term216719.getClass(), "threshold", 0);
        setIntField(term216719, term216719.getClass(), "modCount", 0);
        setField(term216719, term216719.getClass(), "entrySet", null);
        setField(term216719, term216719.getClass(), "keySet", null);
        setField(term216719, term216719.getClass(), "values", null);
        setField(term216719, term216719.getClass(), "keySet", null);
        setField(term216719, term216719.getClass(), "values", null);
        setField(term216718, term216718.getClass(), "value3", term216719);
        setField(term216718, term216718.getClass(), "delegateMap", null);
        term216720 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term216721 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap"));
        setIntField(term216720, term216720.getClass(), "size", 3);
        setIntField(term216720, term216720.getClass(), "hash1", 0);
        setIntField(term216720, term216720.getClass(), "hash2", 0);
        setIntField(term216720, term216720.getClass(), "hash3", 0);
        setField(term216720, term216720.getClass(), "key1", null);
        setField(term216720, term216720.getClass(), "key2", null);
        setField(term216720, term216720.getClass(), "key3", null);
        setField(term216720, term216720.getClass(), "value1", null);
        setField(term216720, term216720.getClass(), "value2", null);
        setFloatField(term216721, term216721.getClass(), "loadFactor", 0.0F);
        setIntField(term216721, term216721.getClass(), "size", 0);
        setField(term216721, term216721.getClass(), "data", null);
        setIntField(term216721, term216721.getClass(), "threshold", 0);
        setIntField(term216721, term216721.getClass(), "modCount", 0);
        setField(term216721, term216721.getClass(), "entrySet", null);
        setField(term216721, term216721.getClass(), "keySet", null);
        setField(term216721, term216721.getClass(), "values", null);
        setField(term216721, term216721.getClass(), "keySet", null);
        setField(term216721, term216721.getClass(), "values", null);
        setField(term216720, term216720.getClass(), "value3", term216721);
        setField(term216720, term216720.getClass(), "delegateMap", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.map.Flat3Map");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term216580;
        Object retValue = callMethod(klass, "remove", argTypes, term216580, args);
        assertTrue(recursiveEquals(term216580, term216718));
        assertTrue(recursiveEquals(term216580, term216720));
        assertTrue(recursiveEquals(retValue, null));
    }

};
