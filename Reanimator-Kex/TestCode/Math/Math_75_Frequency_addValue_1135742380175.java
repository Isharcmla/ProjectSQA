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
import java.lang.Integer;
import java.lang.Long;

public class Frequency_addValue_1135742380175 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term32612;
     Object term32700;
     Object term33073;
     Object term33078;

    public Frequency_addValue_1135742380175() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term32612 = newInstance(Class.forName("org.apache.commons.math.stat.Frequency"));
        Object term32652 = newInstance(Class.forName("java.util.TreeMap"));
        setField(term32612, term32612.getClass(), "freqTable", term32652);
        term32700 = new Integer(0);
        Long term33076 = new Long(0L);
        Long term33077 = new Long(1L);
        term33073 = newInstance(Class.forName("org.apache.commons.math.stat.Frequency"));
        Object term33074 = newInstance(Class.forName("java.util.TreeMap"));
        Object term33075 = newInstance(Class.forName("java.util.TreeMap$Entry"));
        setField(term33074, term33074.getClass(), "comparator", null);
        setField(term33075, term33075.getClass(), "key", term33076);
        setField(term33075, term33075.getClass(), "value", term33077);
        setField(term33075, term33075.getClass(), "left", null);
        setField(term33075, term33075.getClass(), "right", null);
        setField(term33075, term33075.getClass(), "parent", null);
        setBooleanField(term33075, term33075.getClass(), "color", true);
        setField(term33074, term33074.getClass(), "root", term33075);
        setIntField(term33074, term33074.getClass(), "size", 1);
        setIntField(term33074, term33074.getClass(), "modCount", 1);
        setField(term33074, term33074.getClass(), "entrySet", null);
        setField(term33074, term33074.getClass(), "navigableKeySet", null);
        setField(term33074, term33074.getClass(), "descendingMap", null);
        setField(term33074, term33074.getClass(), "keySet", null);
        setField(term33074, term33074.getClass(), "values", null);
        setField(term33073, term33073.getClass(), "freqTable", term33074);
        term33078 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.stat.Frequency");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Comparable");
        Object[] args = new Object[1];
        args[0] = term32700;
        callMethod(klass, "addValue", argTypes, term32612, args);
        assertTrue(recursiveEquals(term32612, term33073));
        assertTrue(recursiveEquals(term32700, term33078));
    }

};


