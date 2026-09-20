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

public class Flat3Map_mapIterator_83361908836 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term214;
     Object term7834;
     Object term7817;

    public Flat3Map_mapIterator_83361908836() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term214 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term219 = newInstance(Class.forName("java.lang.Object"));
        Object term220 = newInstance(Class.forName("java.lang.Object"));
        Object term221 = newInstance(Class.forName("java.lang.Object"));
        Object term222 = newInstance(Class.forName("java.lang.Object"));
        Object term223 = newInstance(Class.forName("java.lang.Object"));
        Object term224 = newInstance(Class.forName("java.lang.Object"));
        Object term225 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap"));
        setIntField(term214, term214.getClass(), "size", 339372704);
        setIntField(term214, term214.getClass(), "hash1", -851097944);
        setIntField(term214, term214.getClass(), "hash2", 803925431);
        setIntField(term214, term214.getClass(), "hash3", 76929641);
        setField(term214, term214.getClass(), "key1", term219);
        setField(term214, term214.getClass(), "key2", term220);
        setField(term214, term214.getClass(), "key3", term221);
        setField(term214, term214.getClass(), "value1", term222);
        setField(term214, term214.getClass(), "value2", term223);
        setField(term214, term214.getClass(), "value3", term224);
        setFloatField(term225, term225.getClass(), "loadFactor", 0.0F);
        setIntField(term225, term225.getClass(), "size", 0);
        setField(term225, term225.getClass(), "data", null);
        setIntField(term225, term225.getClass(), "threshold", 0);
        setIntField(term225, term225.getClass(), "modCount", 0);
        setField(term225, term225.getClass(), "entrySet", null);
        setField(term225, term225.getClass(), "keySet", null);
        setField(term225, term225.getClass(), "values", null);
        setField(term225, term225.getClass(), "keySet", null);
        setField(term225, term225.getClass(), "values", null);
        setField(term214, term214.getClass(), "delegateMap", term225);
        term7834 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term7835 = newInstance(Class.forName("java.lang.Object"));
        Object term7836 = newInstance(Class.forName("java.lang.Object"));
        Object term7837 = newInstance(Class.forName("java.lang.Object"));
        Object term7838 = newInstance(Class.forName("java.lang.Object"));
        Object term7839 = newInstance(Class.forName("java.lang.Object"));
        Object term7840 = newInstance(Class.forName("java.lang.Object"));
        Object term7841 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap"));
        setIntField(term7834, term7834.getClass(), "size", 339372704);
        setIntField(term7834, term7834.getClass(), "hash1", -851097944);
        setIntField(term7834, term7834.getClass(), "hash2", 803925431);
        setIntField(term7834, term7834.getClass(), "hash3", 76929641);
        setField(term7834, term7834.getClass(), "key1", term7835);
        setField(term7834, term7834.getClass(), "key2", term7836);
        setField(term7834, term7834.getClass(), "key3", term7837);
        setField(term7834, term7834.getClass(), "value1", term7838);
        setField(term7834, term7834.getClass(), "value2", term7839);
        setField(term7834, term7834.getClass(), "value3", term7840);
        setFloatField(term7841, term7841.getClass(), "loadFactor", 0.0F);
        setIntField(term7841, term7841.getClass(), "size", 0);
        setField(term7841, term7841.getClass(), "data", null);
        setIntField(term7841, term7841.getClass(), "threshold", 0);
        setIntField(term7841, term7841.getClass(), "modCount", 0);
        setField(term7841, term7841.getClass(), "entrySet", null);
        setField(term7841, term7841.getClass(), "keySet", null);
        setField(term7841, term7841.getClass(), "values", null);
        setField(term7841, term7841.getClass(), "keySet", null);
        setField(term7841, term7841.getClass(), "values", null);
        setField(term7834, term7834.getClass(), "delegateMap", term7841);
        term7817 = newInstance(Class.forName("org.apache.commons.collections.iterators.EmptyMapIterator"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.map.Flat3Map");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "mapIterator", argTypes, term214, args);
        assertTrue(recursiveEquals(term214, term7834));
        assertTrue(recursiveEquals(retValue, term7817));
    }

};
