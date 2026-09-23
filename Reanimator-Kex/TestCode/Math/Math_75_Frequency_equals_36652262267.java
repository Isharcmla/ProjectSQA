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

public class Frequency_equals_36652262267 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term162;
     Object term166;
     Object term3362;
     Object term3364;

    public Frequency_equals_36652262267() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term162 = newInstance(Class.forName("org.apache.commons.math.stat.Frequency"));
        Object term163 = newInstance(Class.forName("java.util.TreeMap"));
        setField(term163, term163.getClass(), "comparator", null);
        setField(term163, term163.getClass(), "root", null);
        setIntField(term163, term163.getClass(), "size", 0);
        setIntField(term163, term163.getClass(), "modCount", 0);
        setField(term163, term163.getClass(), "entrySet", null);
        setField(term163, term163.getClass(), "navigableKeySet", null);
        setField(term163, term163.getClass(), "descendingMap", null);
        setField(term163, term163.getClass(), "keySet", null);
        setField(term163, term163.getClass(), "values", null);
        setField(term162, term162.getClass(), "freqTable", term163);
        term166 = newInstance(Class.forName("java.lang.Object"));
        term3362 = newInstance(Class.forName("org.apache.commons.math.stat.Frequency"));
        Object term3363 = newInstance(Class.forName("java.util.TreeMap"));
        setField(term3363, term3363.getClass(), "comparator", null);
        setField(term3363, term3363.getClass(), "root", null);
        setIntField(term3363, term3363.getClass(), "size", 0);
        setIntField(term3363, term3363.getClass(), "modCount", 0);
        setField(term3363, term3363.getClass(), "entrySet", null);
        setField(term3363, term3363.getClass(), "navigableKeySet", null);
        setField(term3363, term3363.getClass(), "descendingMap", null);
        setField(term3363, term3363.getClass(), "keySet", null);
        setField(term3363, term3363.getClass(), "values", null);
        setField(term3362, term3362.getClass(), "freqTable", term3363);
        term3364 = newInstance(Class.forName("java.lang.Object"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.stat.Frequency");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term166;
        Object retValue = callMethod(klass, "equals", argTypes, term162, args);
        assertTrue(recursiveEquals(term162, term3362));
        assertTrue(recursiveEquals(term166, term3364));
        assertTrue(recursiveEquals(retValue, false));
    }

};


