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

public class Frequency_getCumPct_13495785925 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term124;
     Object term128;

    public Frequency_getCumPct_13495785925() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term124 = newInstance(Class.forName("org.apache.commons.math.stat.Frequency"));
        Object term125 = newInstance(Class.forName("java.util.TreeMap"));
        setField(term125, term125.getClass(), "comparator", null);
        setField(term125, term125.getClass(), "root", null);
        setIntField(term125, term125.getClass(), "size", 0);
        setIntField(term125, term125.getClass(), "modCount", 0);
        setField(term125, term125.getClass(), "entrySet", null);
        setField(term125, term125.getClass(), "navigableKeySet", null);
        setField(term125, term125.getClass(), "descendingMap", null);
        setField(term125, term125.getClass(), "keySet", null);
        setField(term125, term125.getClass(), "values", null);
        setField(term124, term124.getClass(), "freqTable", term125);
        term128 = new Integer(-1922583790);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.stat.Frequency");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term128;
        callMethod(klass, "getCumPct", argTypes, term124, args);
    }

};


