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

public class Frequency_getCumFreq_176028190120 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term97;
     Object term101;

    public Frequency_getCumFreq_176028190120() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term97 = newInstance(Class.forName("org.apache.commons.math.stat.Frequency"));
        Object term98 = newInstance(Class.forName("java.util.TreeMap"));
        setField(term98, term98.getClass(), "comparator", null);
        setField(term98, term98.getClass(), "root", null);
        setIntField(term98, term98.getClass(), "size", 0);
        setIntField(term98, term98.getClass(), "modCount", 0);
        setField(term98, term98.getClass(), "entrySet", null);
        setField(term98, term98.getClass(), "navigableKeySet", null);
        setField(term98, term98.getClass(), "descendingMap", null);
        setField(term98, term98.getClass(), "keySet", null);
        setField(term98, term98.getClass(), "values", null);
        setField(term97, term97.getClass(), "freqTable", term98);
        term101 = new Integer(391863371);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.stat.Frequency");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term101;
        callMethod(klass, "getCumFreq", argTypes, term97, args);
    }

};


