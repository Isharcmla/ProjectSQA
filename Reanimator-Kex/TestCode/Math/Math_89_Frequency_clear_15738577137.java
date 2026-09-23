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

public class Frequency_clear_15738577137 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term38;
     Object term975;

    public Frequency_clear_15738577137() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term38 = newInstance(Class.forName("org.apache.commons.math.stat.Frequency"));
        Object term39 = newInstance(Class.forName("java.util.TreeMap"));
        setField(term39, term39.getClass(), "comparator", null);
        setField(term39, term39.getClass(), "root", null);
        setIntField(term39, term39.getClass(), "size", 0);
        setIntField(term39, term39.getClass(), "modCount", 0);
        setField(term39, term39.getClass(), "entrySet", null);
        setField(term39, term39.getClass(), "navigableKeySet", null);
        setField(term39, term39.getClass(), "descendingMap", null);
        setField(term39, term39.getClass(), "keySet", null);
        setField(term39, term39.getClass(), "values", null);
        setField(term38, term38.getClass(), "freqTable", term39);
        term975 = newInstance(Class.forName("org.apache.commons.math.stat.Frequency"));
        Object term976 = newInstance(Class.forName("java.util.TreeMap"));
        setField(term976, term976.getClass(), "comparator", null);
        setField(term976, term976.getClass(), "root", null);
        setIntField(term976, term976.getClass(), "size", 0);
        setIntField(term976, term976.getClass(), "modCount", 1);
        setField(term976, term976.getClass(), "entrySet", null);
        setField(term976, term976.getClass(), "navigableKeySet", null);
        setField(term976, term976.getClass(), "descendingMap", null);
        setField(term976, term976.getClass(), "keySet", null);
        setField(term976, term976.getClass(), "values", null);
        setField(term975, term975.getClass(), "freqTable", term976);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.stat.Frequency");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "clear", argTypes, term38, args);
        assertTrue(recursiveEquals(term38, term975));
    }

};


