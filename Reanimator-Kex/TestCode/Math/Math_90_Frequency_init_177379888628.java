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

public class Frequency_init_177379888628 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term148;

    public Frequency_init_177379888628() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term148 = newInstance(Class.forName("org.apache.commons.math.stat.Frequency"));
        Object term149 = newInstance(Class.forName("java.util.TreeMap"));
        setField(term149, term149.getClass(), "comparator", null);
        setField(term149, term149.getClass(), "root", null);
        setIntField(term149, term149.getClass(), "size", 0);
        setIntField(term149, term149.getClass(), "modCount", 0);
        setField(term149, term149.getClass(), "entrySet", null);
        setField(term149, term149.getClass(), "navigableKeySet", null);
        setField(term149, term149.getClass(), "descendingMap", null);
        setField(term149, term149.getClass(), "keySet", null);
        setField(term149, term149.getClass(), "values", null);
        setField(term148, term148.getClass(), "freqTable", term149);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.stat.Frequency");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.Comparator");
        Object[] args = new Object[1];
        args[0] = null;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term148));
    }

};


