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
import java.lang.NullPointerException;
import static org.apache.commons.math.stat.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class Frequency_addValue_113574238032 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term10;

    public Frequency_addValue_113574238032() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term10 = newInstance(Class.forName("org.apache.commons.math.stat.Frequency"));
        Object term11 = newInstance(Class.forName("java.util.TreeMap"));
        setField(term11, term11.getClass(), "comparator", null);
        setField(term11, term11.getClass(), "root", null);
        setIntField(term11, term11.getClass(), "size", 0);
        setIntField(term11, term11.getClass(), "modCount", 0);
        setField(term11, term11.getClass(), "entrySet", null);
        setField(term11, term11.getClass(), "navigableKeySet", null);
        setField(term11, term11.getClass(), "descendingMap", null);
        setField(term11, term11.getClass(), "keySet", null);
        setField(term11, term11.getClass(), "values", null);
        setField(term10, term10.getClass(), "freqTable", term11);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.stat.Frequency");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Comparable");
        Object[] args = new Object[1];
        args[0] = null;
        try {
            callMethod(klass, "addValue", argTypes, term10, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


