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

public class Flat3Map_remove_8406902791141 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term236154;
     Object term237256;
     Object term237258;

    public Flat3Map_remove_8406902791141() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term236154 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term236209 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap"));
        setField(term236154, term236154.getClass(), "delegateMap", null);
        setIntField(term236154, term236154.getClass(), "size", 3);
        setIntField(term236154, term236154.getClass(), "hash3", 0);
        setIntField(term236209, term236209.getClass(), "size", 0);
        setField(term236154, term236154.getClass(), "value3", term236209);
        setIntField(term236154, term236154.getClass(), "hash2", -1);
        setField(term236154, term236154.getClass(), "value2", null);
        setIntField(term236154, term236154.getClass(), "hash1", 0);
        setField(term236154, term236154.getClass(), "value1", null);
        setField(term236154, term236154.getClass(), "key3", null);
        term237256 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term237257 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap"));
        setIntField(term237256, term237256.getClass(), "size", 3);
        setIntField(term237256, term237256.getClass(), "hash1", 0);
        setIntField(term237256, term237256.getClass(), "hash2", -1);
        setIntField(term237256, term237256.getClass(), "hash3", 0);
        setField(term237256, term237256.getClass(), "key1", null);
        setField(term237256, term237256.getClass(), "key2", null);
        setField(term237256, term237256.getClass(), "key3", null);
        setField(term237256, term237256.getClass(), "value1", null);
        setField(term237256, term237256.getClass(), "value2", null);
        setFloatField(term237257, term237257.getClass(), "loadFactor", 0.0F);
        setIntField(term237257, term237257.getClass(), "size", 0);
        setField(term237257, term237257.getClass(), "data", null);
        setIntField(term237257, term237257.getClass(), "threshold", 0);
        setIntField(term237257, term237257.getClass(), "modCount", 0);
        setField(term237257, term237257.getClass(), "entrySet", null);
        setField(term237257, term237257.getClass(), "keySet", null);
        setField(term237257, term237257.getClass(), "values", null);
        setField(term237257, term237257.getClass(), "keySet", null);
        setField(term237257, term237257.getClass(), "values", null);
        setField(term237256, term237256.getClass(), "value3", term237257);
        setField(term237256, term237256.getClass(), "delegateMap", null);
        term237258 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term237259 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap"));
        setIntField(term237258, term237258.getClass(), "size", 3);
        setIntField(term237258, term237258.getClass(), "hash1", 0);
        setIntField(term237258, term237258.getClass(), "hash2", -1);
        setIntField(term237258, term237258.getClass(), "hash3", 0);
        setField(term237258, term237258.getClass(), "key1", null);
        setField(term237258, term237258.getClass(), "key2", null);
        setField(term237258, term237258.getClass(), "key3", null);
        setField(term237258, term237258.getClass(), "value1", null);
        setField(term237258, term237258.getClass(), "value2", null);
        setFloatField(term237259, term237259.getClass(), "loadFactor", 0.0F);
        setIntField(term237259, term237259.getClass(), "size", 0);
        setField(term237259, term237259.getClass(), "data", null);
        setIntField(term237259, term237259.getClass(), "threshold", 0);
        setIntField(term237259, term237259.getClass(), "modCount", 0);
        setField(term237259, term237259.getClass(), "entrySet", null);
        setField(term237259, term237259.getClass(), "keySet", null);
        setField(term237259, term237259.getClass(), "values", null);
        setField(term237259, term237259.getClass(), "keySet", null);
        setField(term237259, term237259.getClass(), "values", null);
        setField(term237258, term237258.getClass(), "value3", term237259);
        setField(term237258, term237258.getClass(), "delegateMap", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.map.Flat3Map");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term236154;
        Object retValue = callMethod(klass, "remove", argTypes, term236154, args);
        assertTrue(recursiveEquals(term236154, term237256));
        assertTrue(recursiveEquals(term236154, term237258));
        assertTrue(recursiveEquals(retValue, null));
    }

};
