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

public class Flat3Map_containsKey_76092510607 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term116878;
     Object term117032;
     Object term117110;
     Object term117111;

    public Flat3Map_containsKey_76092510607() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term116878 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setField(term116878, term116878.getClass(), "delegateMap", null);
        setIntField(term116878, term116878.getClass(), "size", 2);
        term117032 = newInstance(Class.forName("org.apache.commons.collections.bidimap.AbstractDualBidiMap$BidiMapIterator"));
        term117110 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setIntField(term117110, term117110.getClass(), "size", 2);
        setIntField(term117110, term117110.getClass(), "hash1", 0);
        setIntField(term117110, term117110.getClass(), "hash2", 0);
        setIntField(term117110, term117110.getClass(), "hash3", 0);
        setField(term117110, term117110.getClass(), "key1", null);
        setField(term117110, term117110.getClass(), "key2", null);
        setField(term117110, term117110.getClass(), "key3", null);
        setField(term117110, term117110.getClass(), "value1", null);
        setField(term117110, term117110.getClass(), "value2", null);
        setField(term117110, term117110.getClass(), "value3", null);
        setField(term117110, term117110.getClass(), "delegateMap", null);
        term117111 = newInstance(Class.forName("org.apache.commons.collections.bidimap.AbstractDualBidiMap$BidiMapIterator"));
        setField(term117111, term117111.getClass(), "parent", null);
        setField(term117111, term117111.getClass(), "iterator", null);
        setField(term117111, term117111.getClass(), "last", null);
        setBooleanField(term117111, term117111.getClass(), "canRemove", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.map.Flat3Map");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term117032;
        callMethod(klass, "containsKey", argTypes, term116878, args);
        assertTrue(recursiveEquals(term116878, term117110));
        assertTrue(recursiveEquals(term117032, term117111));
    }

};
