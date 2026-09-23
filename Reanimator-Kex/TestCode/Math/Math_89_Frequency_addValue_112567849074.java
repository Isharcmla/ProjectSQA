package org.apache.commons.math.stat;

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
import static org.apache.commons.math.stat.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static org.apache.commons.math.stat.EqualityUtils.*;
import java.lang.Object;
import java.lang.Long;

public class Frequency_addValue_112567849074 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5909;
     Object term5965;

    public Frequency_addValue_112567849074() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term5909 = newInstance(Class.forName("org.apache.commons.math.stat.Frequency"));
        Object term5949 = newInstance(Class.forName("java.util.TreeMap"));
        setField(term5909, term5909.getClass(), "freqTable", term5949);
        Long term5968 = new Long(0L);
        Long term5969 = new Long(1L);
        term5965 = newInstance(Class.forName("org.apache.commons.math.stat.Frequency"));
        Object term5966 = newInstance(Class.forName("java.util.TreeMap"));
        Object term5967 = newInstance(Class.forName("java.util.TreeMap$Entry"));
        setField(term5966, term5966.getClass(), "comparator", null);
        setField(term5967, term5967.getClass(), "key", term5968);
        setField(term5967, term5967.getClass(), "value", term5969);
        setField(term5967, term5967.getClass(), "left", null);
        setField(term5967, term5967.getClass(), "right", null);
        setField(term5967, term5967.getClass(), "parent", null);
        setBooleanField(term5967, term5967.getClass(), "color", true);
        setField(term5966, term5966.getClass(), "root", term5967);
        setIntField(term5966, term5966.getClass(), "size", 1);
        setIntField(term5966, term5966.getClass(), "modCount", 1);
        setField(term5966, term5966.getClass(), "entrySet", null);
        setField(term5966, term5966.getClass(), "navigableKeySet", null);
        setField(term5966, term5966.getClass(), "descendingMap", null);
        setField(term5966, term5966.getClass(), "keySet", null);
        setField(term5966, term5966.getClass(), "values", null);
        setField(term5965, term5965.getClass(), "freqTable", term5966);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.stat.Frequency");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = 0;
        callMethod(klass, "addValue", argTypes, term5909, args);
        assertTrue(recursiveEquals(term5909, term5965));
    }

};


