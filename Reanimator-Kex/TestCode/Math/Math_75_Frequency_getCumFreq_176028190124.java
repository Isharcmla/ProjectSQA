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
import java.lang.Integer;

public class Frequency_getCumFreq_176028190124 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term113;
     Object term117;

    public Frequency_getCumFreq_176028190124() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term113 = newInstance(Class.forName("org.apache.commons.math.stat.Frequency"));
        Object term114 = newInstance(Class.forName("java.util.TreeMap"));
        setField(term114, term114.getClass(), "comparator", null);
        setField(term114, term114.getClass(), "root", null);
        setIntField(term114, term114.getClass(), "size", 0);
        setIntField(term114, term114.getClass(), "modCount", 0);
        setField(term114, term114.getClass(), "entrySet", null);
        setField(term114, term114.getClass(), "navigableKeySet", null);
        setField(term114, term114.getClass(), "descendingMap", null);
        setField(term114, term114.getClass(), "keySet", null);
        setField(term114, term114.getClass(), "values", null);
        setField(term113, term113.getClass(), "freqTable", term114);
        term117 = new Integer(391863371);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.stat.Frequency");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term117;
        callMethod(klass, "getCumFreq", argTypes, term113, args);
    }

};


