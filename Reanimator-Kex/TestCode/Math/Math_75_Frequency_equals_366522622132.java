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
import static org.apache.commons.math.stat.EqualityUtils.*;
import java.lang.Object;

public class Frequency_equals_366522622132 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term16023;
     Object term16145;
     Object term16628;
     Object term16630;

    public Frequency_equals_366522622132() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term16023 = newInstance(Class.forName("org.apache.commons.math.stat.Frequency"));
        Object term16063 = newInstance(Class.forName("java.util.TreeMap"));
        setField(term16023, term16023.getClass(), "freqTable", term16063);
        term16145 = newInstance(Class.forName("org.apache.commons.math.stat.Frequency"));
        term16628 = newInstance(Class.forName("org.apache.commons.math.stat.Frequency"));
        Object term16629 = newInstance(Class.forName("java.util.TreeMap"));
        setField(term16629, term16629.getClass(), "comparator", null);
        setField(term16629, term16629.getClass(), "root", null);
        setIntField(term16629, term16629.getClass(), "size", 0);
        setIntField(term16629, term16629.getClass(), "modCount", 0);
        setField(term16629, term16629.getClass(), "entrySet", null);
        setField(term16629, term16629.getClass(), "navigableKeySet", null);
        setField(term16629, term16629.getClass(), "descendingMap", null);
        setField(term16629, term16629.getClass(), "keySet", null);
        setField(term16629, term16629.getClass(), "values", null);
        setField(term16628, term16628.getClass(), "freqTable", term16629);
        term16630 = newInstance(Class.forName("org.apache.commons.math.stat.Frequency"));
        setField(term16630, term16630.getClass(), "freqTable", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.stat.Frequency");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term16145;
        Object retValue = callMethod(klass, "equals", argTypes, term16023, args);
        assertTrue(recursiveEquals(term16023, term16628));
        assertTrue(recursiveEquals(term16145, term16630));
        assertTrue(recursiveEquals(retValue, false));
    }

};


