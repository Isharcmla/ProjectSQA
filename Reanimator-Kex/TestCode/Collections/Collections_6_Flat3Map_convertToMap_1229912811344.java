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

public class Flat3Map_convertToMap_1229912811344 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term56984;
     Object term57622;

    public Flat3Map_convertToMap_1229912811344() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term56984 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term57110 = newInstance(Class.forName("org.apache.commons.collections.functors.NullIsFalsePredicate"));
        Object term57240 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap$HashEntry"));
        setField(term56984, term56984.getClass(), "delegateMap", null);
        setIntField(term56984, term56984.getClass(), "size", 2);
        setField(term56984, term56984.getClass(), "key2", null);
        setField(term56984, term56984.getClass(), "value2", term57110);
        setField(term56984, term56984.getClass(), "key1", null);
        setField(term56984, term56984.getClass(), "value1", term57240);
        term57622 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term57623 = newInstance(Class.forName("org.apache.commons.collections.map.HashedMap"));
        Object[] term57624 = (Object[]) newArray("org.apache.commons.collections.map.AbstractHashedMap$HashEntry", 16);
        Object term57625 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap$HashEntry"));
        Object term57626 = newInstance(Class.forName("java.lang.Object"));
        Object term57627 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap$HashEntry"));
        setIntField(term57622, term57622.getClass(), "size", 0);
        setIntField(term57622, term57622.getClass(), "hash1", 0);
        setIntField(term57622, term57622.getClass(), "hash2", 0);
        setIntField(term57622, term57622.getClass(), "hash3", 0);
        setField(term57622, term57622.getClass(), "key1", null);
        setField(term57622, term57622.getClass(), "key2", null);
        setField(term57622, term57622.getClass(), "key3", null);
        setField(term57622, term57622.getClass(), "value1", null);
        setField(term57622, term57622.getClass(), "value2", null);
        setField(term57622, term57622.getClass(), "value3", null);
        setFloatField(term57623, term57623.getClass(), "loadFactor", 0.75F);
        setIntField(term57623, term57623.getClass(), "size", 1);
        setField(term57625, term57625.getClass(), "next", null);
        setField(term57625, term57625.getClass(), "key", term57626);
        setField(term57627, term57627.getClass(), "next", null);
        setField(term57627, term57627.getClass(), "key", null);
        setField(term57627, term57627.getClass(), "value", null);
        setField(term57625, term57625.getClass(), "value", term57627);
        setElement(term57624, 5, term57625);
        setField(term57623, term57623.getClass(), "data", term57624);
        setIntField(term57623, term57623.getClass(), "threshold", 12);
        setIntField(term57623, term57623.getClass(), "modCount", 1);
        setField(term57623, term57623.getClass(), "entrySet", null);
        setField(term57623, term57623.getClass(), "keySet", null);
        setField(term57623, term57623.getClass(), "values", null);
        setField(term57623, term57623.getClass(), "keySet", null);
        setField(term57623, term57623.getClass(), "values", null);
        setField(term57622, term57622.getClass(), "delegateMap", term57623);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.map.Flat3Map");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "convertToMap", argTypes, term56984, args);
        assertTrue(recursiveEquals(term56984, term57622));
    }

};


