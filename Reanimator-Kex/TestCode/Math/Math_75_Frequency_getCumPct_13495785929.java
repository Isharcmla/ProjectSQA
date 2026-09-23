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

public class Frequency_getCumPct_13495785929 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term140;
     Object term144;

    public Frequency_getCumPct_13495785929() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term140 = newInstance(Class.forName("org.apache.commons.math.stat.Frequency"));
        Object term141 = newInstance(Class.forName("java.util.TreeMap"));
        setField(term141, term141.getClass(), "comparator", null);
        setField(term141, term141.getClass(), "root", null);
        setIntField(term141, term141.getClass(), "size", 0);
        setIntField(term141, term141.getClass(), "modCount", 0);
        setField(term141, term141.getClass(), "entrySet", null);
        setField(term141, term141.getClass(), "navigableKeySet", null);
        setField(term141, term141.getClass(), "descendingMap", null);
        setField(term141, term141.getClass(), "keySet", null);
        setField(term141, term141.getClass(), "values", null);
        setField(term140, term140.getClass(), "freqTable", term141);
        term144 = new Integer(-1922583790);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.stat.Frequency");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term144;
        callMethod(klass, "getCumPct", argTypes, term140, args);
    }

};


