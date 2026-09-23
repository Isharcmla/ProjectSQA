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
import java.lang.ClassCastException;
import static org.apache.commons.math.stat.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class Frequency_getCumPct_20481316861 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term131;
     Object term135;

    public Frequency_getCumPct_20481316861() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term131 = newInstance(Class.forName("org.apache.commons.math.stat.Frequency"));
        Object term132 = newInstance(Class.forName("java.util.TreeMap"));
        setField(term132, term132.getClass(), "comparator", null);
        setField(term132, term132.getClass(), "root", null);
        setIntField(term132, term132.getClass(), "size", 0);
        setIntField(term132, term132.getClass(), "modCount", 0);
        setField(term132, term132.getClass(), "entrySet", null);
        setField(term132, term132.getClass(), "navigableKeySet", null);
        setField(term132, term132.getClass(), "descendingMap", null);
        setField(term132, term132.getClass(), "keySet", null);
        setField(term132, term132.getClass(), "values", null);
        setField(term131, term131.getClass(), "freqTable", term132);
        term135 = newInstance(Class.forName("java.lang.Object"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.stat.Frequency");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term135;
        try {
            callMethod(klass, "getCumPct", argTypes, term131, args);
            assertTrue(false);
        }
        catch (ClassCastException e) {
        }

    }

};


