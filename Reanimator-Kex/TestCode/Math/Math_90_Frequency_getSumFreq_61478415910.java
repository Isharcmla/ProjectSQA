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

public class Frequency_getSumFreq_61478415910 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term42;

    public Frequency_getSumFreq_61478415910() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term42 = newInstance(Class.forName("org.apache.commons.math.stat.Frequency"));
        Object term43 = newInstance(Class.forName("java.util.TreeMap"));
        setField(term43, term43.getClass(), "comparator", null);
        setField(term43, term43.getClass(), "root", null);
        setIntField(term43, term43.getClass(), "size", 0);
        setIntField(term43, term43.getClass(), "modCount", 0);
        setField(term43, term43.getClass(), "entrySet", null);
        setField(term43, term43.getClass(), "navigableKeySet", null);
        setField(term43, term43.getClass(), "descendingMap", null);
        setField(term43, term43.getClass(), "keySet", null);
        setField(term43, term43.getClass(), "values", null);
        setField(term42, term42.getClass(), "freqTable", term43);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.stat.Frequency");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getSumFreq", argTypes, term42, args);
    }

};


