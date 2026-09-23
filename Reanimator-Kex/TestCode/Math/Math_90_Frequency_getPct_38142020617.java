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
import java.lang.Long;

public class Frequency_getPct_38142020617 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term80;
     Object term84;

    public Frequency_getPct_38142020617() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term80 = newInstance(Class.forName("org.apache.commons.math.stat.Frequency"));
        Object term81 = newInstance(Class.forName("java.util.TreeMap"));
        setField(term81, term81.getClass(), "comparator", null);
        setField(term81, term81.getClass(), "root", null);
        setIntField(term81, term81.getClass(), "size", 0);
        setIntField(term81, term81.getClass(), "modCount", 0);
        setField(term81, term81.getClass(), "entrySet", null);
        setField(term81, term81.getClass(), "navigableKeySet", null);
        setField(term81, term81.getClass(), "descendingMap", null);
        setField(term81, term81.getClass(), "keySet", null);
        setField(term81, term81.getClass(), "values", null);
        setField(term80, term80.getClass(), "freqTable", term81);
        term84 = new Long(-8257434502486459194L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.stat.Frequency");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = long.class;
        Object[] args = new Object[1];
        args[0] = term84;
        callMethod(klass, "getPct", argTypes, term80, args);
    }

};


