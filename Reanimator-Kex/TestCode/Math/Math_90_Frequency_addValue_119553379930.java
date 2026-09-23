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
import java.lang.IllegalArgumentException;
import static org.apache.commons.math.stat.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class Frequency_addValue_119553379930 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5;
     Object term9;

    public Frequency_addValue_119553379930() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term5 = newInstance(Class.forName("org.apache.commons.math.stat.Frequency"));
        Object term6 = newInstance(Class.forName("java.util.TreeMap"));
        setField(term6, term6.getClass(), "comparator", null);
        setField(term6, term6.getClass(), "root", null);
        setIntField(term6, term6.getClass(), "size", 0);
        setIntField(term6, term6.getClass(), "modCount", 0);
        setField(term6, term6.getClass(), "entrySet", null);
        setField(term6, term6.getClass(), "navigableKeySet", null);
        setField(term6, term6.getClass(), "descendingMap", null);
        setField(term6, term6.getClass(), "keySet", null);
        setField(term6, term6.getClass(), "values", null);
        setField(term5, term5.getClass(), "freqTable", term6);
        term9 = newInstance(Class.forName("java.lang.Object"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.stat.Frequency");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term9;
        try {
            callMethod(klass, "addValue", argTypes, term5, args);
            assertTrue(false);
        }
        catch (IllegalArgumentException e) {
        }

    }

};


