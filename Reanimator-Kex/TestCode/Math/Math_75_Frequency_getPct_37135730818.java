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
import java.lang.Object;

public class Frequency_getPct_37135730818 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term82;

    public Frequency_getPct_37135730818() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term82 = newInstance(Class.forName("org.apache.commons.math.stat.Frequency"));
        Object term83 = newInstance(Class.forName("java.util.TreeMap"));
        setField(term83, term83.getClass(), "comparator", null);
        setField(term83, term83.getClass(), "root", null);
        setIntField(term83, term83.getClass(), "size", 0);
        setIntField(term83, term83.getClass(), "modCount", 0);
        setField(term83, term83.getClass(), "entrySet", null);
        setField(term83, term83.getClass(), "navigableKeySet", null);
        setField(term83, term83.getClass(), "descendingMap", null);
        setField(term83, term83.getClass(), "keySet", null);
        setField(term83, term83.getClass(), "values", null);
        setField(term82, term82.getClass(), "freqTable", term83);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.stat.Frequency");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Comparable");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "getPct", argTypes, term82, args);
    }

};


