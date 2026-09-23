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

public class Frequency_getCumFreq_175021801123 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term109;

    public Frequency_getCumFreq_175021801123() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term109 = newInstance(Class.forName("org.apache.commons.math.stat.Frequency"));
        Object term110 = newInstance(Class.forName("java.util.TreeMap"));
        setField(term110, term110.getClass(), "comparator", null);
        setField(term110, term110.getClass(), "root", null);
        setIntField(term110, term110.getClass(), "size", 0);
        setIntField(term110, term110.getClass(), "modCount", 0);
        setField(term110, term110.getClass(), "entrySet", null);
        setField(term110, term110.getClass(), "navigableKeySet", null);
        setField(term110, term110.getClass(), "descendingMap", null);
        setField(term110, term110.getClass(), "keySet", null);
        setField(term110, term110.getClass(), "values", null);
        setField(term109, term109.getClass(), "freqTable", term110);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.stat.Frequency");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Comparable");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "getCumFreq", argTypes, term109, args);
    }

};


