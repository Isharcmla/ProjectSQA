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

public class Frequency_addValue_52416251294 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term9526;
     Object term9614;
     Object term9807;
     Object term9812;

    public Frequency_addValue_52416251294() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term9526 = newInstance(Class.forName("org.apache.commons.math.stat.Frequency"));
        Object term9566 = newInstance(Class.forName("java.util.TreeMap"));
        setField(term9526, term9526.getClass(), "freqTable", term9566);
        term9614 = new Integer(0);
        Long term9810 = new Long(0L);
        Long term9811 = new Long(1L);
        term9807 = newInstance(Class.forName("org.apache.commons.math.stat.Frequency"));
        Object term9808 = newInstance(Class.forName("java.util.TreeMap"));
        Object term9809 = newInstance(Class.forName("java.util.TreeMap$Entry"));
        setField(term9808, term9808.getClass(), "comparator", null);
        setField(term9809, term9809.getClass(), "key", term9810);
        setField(term9809, term9809.getClass(), "value", term9811);
        setField(term9809, term9809.getClass(), "left", null);
        setField(term9809, term9809.getClass(), "right", null);
        setField(term9809, term9809.getClass(), "parent", null);
        setBooleanField(term9809, term9809.getClass(), "color", true);
        setField(term9808, term9808.getClass(), "root", term9809);
        setIntField(term9808, term9808.getClass(), "size", 1);
        setIntField(term9808, term9808.getClass(), "modCount", 1);
        setField(term9808, term9808.getClass(), "entrySet", null);
        setField(term9808, term9808.getClass(), "navigableKeySet", null);
        setField(term9808, term9808.getClass(), "descendingMap", null);
        setField(term9808, term9808.getClass(), "keySet", null);
        setField(term9808, term9808.getClass(), "values", null);
        setField(term9807, term9807.getClass(), "freqTable", term9808);
        term9812 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.stat.Frequency");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Integer");
        Object[] args = new Object[1];
        args[0] = term9614;
        callMethod(klass, "addValue", argTypes, term9526, args);
        assertTrue(recursiveEquals(term9526, term9807));
        assertTrue(recursiveEquals(term9614, term9812));
    }

};


