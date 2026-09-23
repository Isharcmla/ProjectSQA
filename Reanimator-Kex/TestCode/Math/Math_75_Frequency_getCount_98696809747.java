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
import java.lang.NullPointerException;
import static org.apache.commons.math.stat.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class Frequency_getCount_98696809747 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term55;

    public Frequency_getCount_98696809747() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term55 = newInstance(Class.forName("org.apache.commons.math.stat.Frequency"));
        Object term56 = newInstance(Class.forName("java.util.TreeMap"));
        setField(term56, term56.getClass(), "comparator", null);
        setField(term56, term56.getClass(), "root", null);
        setIntField(term56, term56.getClass(), "size", 0);
        setIntField(term56, term56.getClass(), "modCount", 0);
        setField(term56, term56.getClass(), "entrySet", null);
        setField(term56, term56.getClass(), "navigableKeySet", null);
        setField(term56, term56.getClass(), "descendingMap", null);
        setField(term56, term56.getClass(), "keySet", null);
        setField(term56, term56.getClass(), "values", null);
        setField(term55, term55.getClass(), "freqTable", term56);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.stat.Frequency");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Comparable");
        Object[] args = new Object[1];
        args[0] = null;
        try {
            callMethod(klass, "getCount", argTypes, term55, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


