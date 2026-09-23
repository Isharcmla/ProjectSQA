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

public class Frequency_equals_366522622179 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term33311;
     Object term33433;
     Object term33738;
     Object term33741;

    public Frequency_equals_366522622179() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term33311 = newInstance(Class.forName("org.apache.commons.math.stat.Frequency"));
        Object term33351 = newInstance(Class.forName("java.util.TreeMap"));
        setField(term33311, term33311.getClass(), "freqTable", term33351);
        term33433 = newInstance(Class.forName("org.apache.commons.math.stat.Frequency"));
        Object term33473 = newInstance(Class.forName("java.util.TreeMap"));
        setField(term33433, term33433.getClass(), "freqTable", term33473);
        term33738 = newInstance(Class.forName("org.apache.commons.math.stat.Frequency"));
        Object term33739 = newInstance(Class.forName("java.util.TreeMap"));
        Object term33740 = newInstance(Class.forName("java.util.TreeMap$EntrySet"));
        setField(term33739, term33739.getClass(), "comparator", null);
        setField(term33739, term33739.getClass(), "root", null);
        setIntField(term33739, term33739.getClass(), "size", 0);
        setIntField(term33739, term33739.getClass(), "modCount", 0);
        setField(term33740, term33740.getClass(), "this$0", term33739);
        setField(term33739, term33739.getClass(), "entrySet", term33740);
        setField(term33739, term33739.getClass(), "navigableKeySet", null);
        setField(term33739, term33739.getClass(), "descendingMap", null);
        setField(term33739, term33739.getClass(), "keySet", null);
        setField(term33739, term33739.getClass(), "values", null);
        setField(term33738, term33738.getClass(), "freqTable", term33739);
        term33741 = newInstance(Class.forName("org.apache.commons.math.stat.Frequency"));
        Object term33742 = newInstance(Class.forName("java.util.TreeMap"));
        setField(term33742, term33742.getClass(), "comparator", null);
        setField(term33742, term33742.getClass(), "root", null);
        setIntField(term33742, term33742.getClass(), "size", 0);
        setIntField(term33742, term33742.getClass(), "modCount", 0);
        setField(term33742, term33742.getClass(), "entrySet", null);
        setField(term33742, term33742.getClass(), "navigableKeySet", null);
        setField(term33742, term33742.getClass(), "descendingMap", null);
        setField(term33742, term33742.getClass(), "keySet", null);
        setField(term33742, term33742.getClass(), "values", null);
        setField(term33741, term33741.getClass(), "freqTable", term33742);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.stat.Frequency");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term33433;
        Object retValue = callMethod(klass, "equals", argTypes, term33311, args);
        assertTrue(recursiveEquals(term33311, term33738));
        assertTrue(recursiveEquals(term33433, term33741));
        assertTrue(recursiveEquals(retValue, true));
    }

};


