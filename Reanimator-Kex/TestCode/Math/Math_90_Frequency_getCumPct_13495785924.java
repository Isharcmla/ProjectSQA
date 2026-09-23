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

public class Frequency_getCumPct_13495785924 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term120;
     Object term124;

    public Frequency_getCumPct_13495785924() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term120 = newInstance(Class.forName("org.apache.commons.math.stat.Frequency"));
        Object term121 = newInstance(Class.forName("java.util.TreeMap"));
        setField(term121, term121.getClass(), "comparator", null);
        setField(term121, term121.getClass(), "root", null);
        setIntField(term121, term121.getClass(), "size", 0);
        setIntField(term121, term121.getClass(), "modCount", 0);
        setField(term121, term121.getClass(), "entrySet", null);
        setField(term121, term121.getClass(), "navigableKeySet", null);
        setField(term121, term121.getClass(), "descendingMap", null);
        setField(term121, term121.getClass(), "keySet", null);
        setField(term121, term121.getClass(), "values", null);
        setField(term120, term120.getClass(), "freqTable", term121);
        term124 = new Integer(-1922583790);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.stat.Frequency");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term124;
        callMethod(klass, "getCumPct", argTypes, term120, args);
    }

};


