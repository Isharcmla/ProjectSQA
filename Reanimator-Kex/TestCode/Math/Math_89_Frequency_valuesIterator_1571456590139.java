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

public class Frequency_valuesIterator_1571456590139 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term20931;
     Object term21068;
     Object term21061;

    public Frequency_valuesIterator_1571456590139() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term20931 = newInstance(Class.forName("org.apache.commons.math.stat.Frequency"));
        Object term20971 = newInstance(Class.forName("java.util.TreeMap"));
        setField(term20931, term20931.getClass(), "freqTable", term20971);
        term21068 = newInstance(Class.forName("org.apache.commons.math.stat.Frequency"));
        Object term21069 = newInstance(Class.forName("java.util.TreeMap"));
        Object term21070 = newInstance(Class.forName("java.util.TreeMap$KeySet"));
        setField(term21069, term21069.getClass(), "comparator", null);
        setField(term21069, term21069.getClass(), "root", null);
        setIntField(term21069, term21069.getClass(), "size", 0);
        setIntField(term21069, term21069.getClass(), "modCount", 0);
        setField(term21069, term21069.getClass(), "entrySet", null);
        setField(term21070, term21070.getClass(), "m", term21069);
        setField(term21069, term21069.getClass(), "navigableKeySet", term21070);
        setField(term21069, term21069.getClass(), "descendingMap", null);
        setField(term21069, term21069.getClass(), "keySet", null);
        setField(term21069, term21069.getClass(), "values", null);
        setField(term21068, term21068.getClass(), "freqTable", term21069);
        term21061 = newInstance(Class.forName("java.util.TreeMap$KeyIterator"));
        Object term21062 = newInstance(Class.forName("java.util.TreeMap"));
        Object term21065 = newInstance(Class.forName("java.util.TreeMap$KeySet"));
        setField(term21062, term21062.getClass(), "comparator", null);
        setField(term21062, term21062.getClass(), "root", null);
        setIntField(term21062, term21062.getClass(), "size", 0);
        setIntField(term21062, term21062.getClass(), "modCount", 0);
        setField(term21062, term21062.getClass(), "entrySet", null);
        setField(term21065, term21065.getClass(), "m", term21062);
        setField(term21062, term21062.getClass(), "navigableKeySet", term21065);
        setField(term21062, term21062.getClass(), "descendingMap", null);
        setField(term21062, term21062.getClass(), "keySet", null);
        setField(term21062, term21062.getClass(), "values", null);
        setField(term21061, term21061.getClass(), "this$0", term21062);
        setField(term21061, term21061.getClass(), "next", null);
        setField(term21061, term21061.getClass(), "lastReturned", null);
        setIntField(term21061, term21061.getClass(), "expectedModCount", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.stat.Frequency");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "valuesIterator", argTypes, term20931, args);
        assertTrue(recursiveEquals(term20931, term21068));
        assertTrue(recursiveEquals(retValue, term21061));
    }

};


