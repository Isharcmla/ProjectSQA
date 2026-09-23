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

public class Frequency_getPct_38142020618 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term84;
     Object term88;

    public Frequency_getPct_38142020618() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term84 = newInstance(Class.forName("org.apache.commons.math.stat.Frequency"));
        Object term85 = newInstance(Class.forName("java.util.TreeMap"));
        setField(term85, term85.getClass(), "comparator", null);
        setField(term85, term85.getClass(), "root", null);
        setIntField(term85, term85.getClass(), "size", 0);
        setIntField(term85, term85.getClass(), "modCount", 0);
        setField(term85, term85.getClass(), "entrySet", null);
        setField(term85, term85.getClass(), "navigableKeySet", null);
        setField(term85, term85.getClass(), "descendingMap", null);
        setField(term85, term85.getClass(), "keySet", null);
        setField(term85, term85.getClass(), "values", null);
        setField(term84, term84.getClass(), "freqTable", term85);
        term88 = new Long(-8257434502486459194L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.stat.Frequency");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = long.class;
        Object[] args = new Object[1];
        args[0] = term88;
        callMethod(klass, "getPct", argTypes, term84, args);
    }

};


