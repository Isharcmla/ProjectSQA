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

public class Frequency_init_177379888629 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term152;

    public Frequency_init_177379888629() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term152 = newInstance(Class.forName("org.apache.commons.math.stat.Frequency"));
        Object term153 = newInstance(Class.forName("java.util.TreeMap"));
        setField(term153, term153.getClass(), "comparator", null);
        setField(term153, term153.getClass(), "root", null);
        setIntField(term153, term153.getClass(), "size", 0);
        setIntField(term153, term153.getClass(), "modCount", 0);
        setField(term153, term153.getClass(), "entrySet", null);
        setField(term153, term153.getClass(), "navigableKeySet", null);
        setField(term153, term153.getClass(), "descendingMap", null);
        setField(term153, term153.getClass(), "keySet", null);
        setField(term153, term153.getClass(), "values", null);
        setField(term152, term152.getClass(), "freqTable", term153);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.stat.Frequency");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.Comparator");
        Object[] args = new Object[1];
        args[0] = null;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term152));
    }

};


