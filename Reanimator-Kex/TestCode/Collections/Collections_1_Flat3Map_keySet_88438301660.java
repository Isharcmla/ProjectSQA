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

public class Flat3Map_keySet_88438301660 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term14614;
     Object term14752;
     Object term14751;

    public Flat3Map_keySet_88438301660() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term14614 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setField(term14614, term14614.getClass(), "delegateMap", null);
        term14752 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setIntField(term14752, term14752.getClass(), "size", 0);
        setIntField(term14752, term14752.getClass(), "hash1", 0);
        setIntField(term14752, term14752.getClass(), "hash2", 0);
        setIntField(term14752, term14752.getClass(), "hash3", 0);
        setField(term14752, term14752.getClass(), "key1", null);
        setField(term14752, term14752.getClass(), "key2", null);
        setField(term14752, term14752.getClass(), "key3", null);
        setField(term14752, term14752.getClass(), "value1", null);
        setField(term14752, term14752.getClass(), "value2", null);
        setField(term14752, term14752.getClass(), "value3", null);
        setField(term14752, term14752.getClass(), "delegateMap", null);
        term14751 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map$KeySet"));
        Object term14746 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setIntField(term14746, term14746.getClass(), "size", 0);
        setIntField(term14746, term14746.getClass(), "hash1", 0);
        setIntField(term14746, term14746.getClass(), "hash2", 0);
        setIntField(term14746, term14746.getClass(), "hash3", 0);
        setField(term14746, term14746.getClass(), "key1", null);
        setField(term14746, term14746.getClass(), "key2", null);
        setField(term14746, term14746.getClass(), "key3", null);
        setField(term14746, term14746.getClass(), "value1", null);
        setField(term14746, term14746.getClass(), "value2", null);
        setField(term14746, term14746.getClass(), "value3", null);
        setField(term14746, term14746.getClass(), "delegateMap", null);
        setField(term14751, term14751.getClass(), "parent", term14746);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.map.Flat3Map");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "keySet", argTypes, term14614, args);
        assertTrue(recursiveEquals(term14614, term14752));
        assertTrue(recursiveEquals(retValue, term14751));
    }

};
