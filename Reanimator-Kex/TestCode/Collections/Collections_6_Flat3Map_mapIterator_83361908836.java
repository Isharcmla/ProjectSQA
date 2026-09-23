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
     Object term212;
     Object term7832;
     Object term7815;

    public Flat3Map_mapIterator_83361908836() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term212 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term217 = newInstance(Class.forName("java.lang.Object"));
        Object term218 = newInstance(Class.forName("java.lang.Object"));
        Object term219 = newInstance(Class.forName("java.lang.Object"));
        Object term220 = newInstance(Class.forName("java.lang.Object"));
        Object term221 = newInstance(Class.forName("java.lang.Object"));
        Object term222 = newInstance(Class.forName("java.lang.Object"));
        Object term223 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap"));
        setIntField(term212, term212.getClass(), "size", 339372704);
        setIntField(term212, term212.getClass(), "hash1", -851097944);
        setIntField(term212, term212.getClass(), "hash2", 803925431);
        setIntField(term212, term212.getClass(), "hash3", 76929641);
        setField(term212, term212.getClass(), "key1", term217);
        setField(term212, term212.getClass(), "key2", term218);
        setField(term212, term212.getClass(), "key3", term219);
        setField(term212, term212.getClass(), "value1", term220);
        setField(term212, term212.getClass(), "value2", term221);
        setField(term212, term212.getClass(), "value3", term222);
        setFloatField(term223, term223.getClass(), "loadFactor", 0.0F);
        setIntField(term223, term223.getClass(), "size", 0);
        setField(term223, term223.getClass(), "data", null);
        setIntField(term223, term223.getClass(), "threshold", 0);
        setIntField(term223, term223.getClass(), "modCount", 0);
        setField(term223, term223.getClass(), "entrySet", null);
        setField(term223, term223.getClass(), "keySet", null);
        setField(term223, term223.getClass(), "values", null);
        setField(term223, term223.getClass(), "keySet", null);
        setField(term223, term223.getClass(), "values", null);
        setField(term212, term212.getClass(), "delegateMap", term223);
        term7832 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term7833 = newInstance(Class.forName("java.lang.Object"));
        Object term7834 = newInstance(Class.forName("java.lang.Object"));
        Object term7835 = newInstance(Class.forName("java.lang.Object"));
        Object term7836 = newInstance(Class.forName("java.lang.Object"));
        Object term7837 = newInstance(Class.forName("java.lang.Object"));
        Object term7838 = newInstance(Class.forName("java.lang.Object"));
        Object term7839 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap"));
        setIntField(term7832, term7832.getClass(), "size", 339372704);
        setIntField(term7832, term7832.getClass(), "hash1", -851097944);
        setIntField(term7832, term7832.getClass(), "hash2", 803925431);
        setIntField(term7832, term7832.getClass(), "hash3", 76929641);
        setField(term7832, term7832.getClass(), "key1", term7833);
        setField(term7832, term7832.getClass(), "key2", term7834);
        setField(term7832, term7832.getClass(), "key3", term7835);
        setField(term7832, term7832.getClass(), "value1", term7836);
        setField(term7832, term7832.getClass(), "value2", term7837);
        setField(term7832, term7832.getClass(), "value3", term7838);
        setFloatField(term7839, term7839.getClass(), "loadFactor", 0.0F);
        setIntField(term7839, term7839.getClass(), "size", 0);
        setField(term7839, term7839.getClass(), "data", null);
        setIntField(term7839, term7839.getClass(), "threshold", 0);
        setIntField(term7839, term7839.getClass(), "modCount", 0);
        setField(term7839, term7839.getClass(), "entrySet", null);
        setField(term7839, term7839.getClass(), "keySet", null);
        setField(term7839, term7839.getClass(), "values", null);
        setField(term7839, term7839.getClass(), "keySet", null);
        setField(term7839, term7839.getClass(), "values", null);
        setField(term7832, term7832.getClass(), "delegateMap", term7839);
        term7815 = newInstance(Class.forName("org.apache.commons.collections.iterators.EmptyMapIterator"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.map.Flat3Map");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "mapIterator", argTypes, term212, args);
        assertTrue(recursiveEquals(term212, term7832));
        assertTrue(recursiveEquals(retValue, term7815));
    }

};


