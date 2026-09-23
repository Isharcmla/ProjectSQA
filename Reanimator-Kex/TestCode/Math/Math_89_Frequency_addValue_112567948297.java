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

public class Frequency_addValue_112567948297 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term10069;
     Object term10374;

    public Frequency_addValue_112567948297() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term10069 = newInstance(Class.forName("org.apache.commons.math.stat.Frequency"));
        Object term10109 = newInstance(Class.forName("java.util.TreeMap"));
        setField(term10069, term10069.getClass(), "freqTable", term10109);
        Long term10377 = new Long(0L);
        Long term10378 = new Long(1L);
        term10374 = newInstance(Class.forName("org.apache.commons.math.stat.Frequency"));
        Object term10375 = newInstance(Class.forName("java.util.TreeMap"));
        Object term10376 = newInstance(Class.forName("java.util.TreeMap$Entry"));
        setField(term10375, term10375.getClass(), "comparator", null);
        setField(term10376, term10376.getClass(), "key", term10377);
        setField(term10376, term10376.getClass(), "value", term10378);
        setField(term10376, term10376.getClass(), "left", null);
        setField(term10376, term10376.getClass(), "right", null);
        setField(term10376, term10376.getClass(), "parent", null);
        setBooleanField(term10376, term10376.getClass(), "color", true);
        setField(term10375, term10375.getClass(), "root", term10376);
        setIntField(term10375, term10375.getClass(), "size", 1);
        setIntField(term10375, term10375.getClass(), "modCount", 1);
        setField(term10375, term10375.getClass(), "entrySet", null);
        setField(term10375, term10375.getClass(), "navigableKeySet", null);
        setField(term10375, term10375.getClass(), "descendingMap", null);
        setField(term10375, term10375.getClass(), "keySet", null);
        setField(term10375, term10375.getClass(), "values", null);
        setField(term10374, term10374.getClass(), "freqTable", term10375);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.stat.Frequency");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = long.class;
        Object[] args = new Object[1];
        args[0] = 0L;
        callMethod(klass, "addValue", argTypes, term10069, args);
        assertTrue(recursiveEquals(term10069, term10374));
    }

};


