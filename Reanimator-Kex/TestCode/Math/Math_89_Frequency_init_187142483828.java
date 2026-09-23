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

public class Frequency_init_187142483828 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term146;

    public Frequency_init_187142483828() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term146 = newInstance(Class.forName("org.apache.commons.math.stat.Frequency"));
        Object term147 = newInstance(Class.forName("java.util.TreeMap"));
        setField(term147, term147.getClass(), "comparator", null);
        setField(term147, term147.getClass(), "root", null);
        setIntField(term147, term147.getClass(), "size", 0);
        setIntField(term147, term147.getClass(), "modCount", 0);
        setField(term147, term147.getClass(), "entrySet", null);
        setField(term147, term147.getClass(), "navigableKeySet", null);
        setField(term147, term147.getClass(), "descendingMap", null);
        setField(term147, term147.getClass(), "keySet", null);
        setField(term147, term147.getClass(), "values", null);
        setField(term146, term146.getClass(), "freqTable", term147);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.stat.Frequency");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term146));
    }

};


