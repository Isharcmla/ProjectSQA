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

public class Flat3Map_mapIterator_83361908892 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term17560;
     Object term17769;
     Object term17763;

    public Flat3Map_mapIterator_83361908892() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term17560 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setField(term17560, term17560.getClass(), "delegateMap", null);
        term17769 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setIntField(term17769, term17769.getClass(), "size", 0);
        setIntField(term17769, term17769.getClass(), "hash1", 0);
        setIntField(term17769, term17769.getClass(), "hash2", 0);
        setIntField(term17769, term17769.getClass(), "hash3", 0);
        setField(term17769, term17769.getClass(), "key1", null);
        setField(term17769, term17769.getClass(), "key2", null);
        setField(term17769, term17769.getClass(), "key3", null);
        setField(term17769, term17769.getClass(), "value1", null);
        setField(term17769, term17769.getClass(), "value2", null);
        setField(term17769, term17769.getClass(), "value3", null);
        setField(term17769, term17769.getClass(), "delegateMap", null);
        term17763 = newInstance(Class.forName("org.apache.commons.collections.iterators.EmptyMapIterator"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.map.Flat3Map");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "mapIterator", argTypes, term17560, args);
        assertTrue(recursiveEquals(term17560, term17769));
        assertTrue(recursiveEquals(retValue, term17763));
    }

};
