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
import java.lang.Integer;
import java.lang.Long;

public class Frequency_addValue_1135742380101 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term10629;
     Object term10717;
     Object term10887;
     Object term10892;

    public Frequency_addValue_1135742380101() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term10629 = newInstance(Class.forName("org.apache.commons.math.stat.Frequency"));
        Object term10669 = newInstance(Class.forName("java.util.TreeMap"));
        setField(term10629, term10629.getClass(), "freqTable", term10669);
        term10717 = new Integer(0);
        Long term10890 = new Long(0L);
        Long term10891 = new Long(1L);
        term10887 = newInstance(Class.forName("org.apache.commons.math.stat.Frequency"));
        Object term10888 = newInstance(Class.forName("java.util.TreeMap"));
        Object term10889 = newInstance(Class.forName("java.util.TreeMap$Entry"));
        setField(term10888, term10888.getClass(), "comparator", null);
        setField(term10889, term10889.getClass(), "key", term10890);
        setField(term10889, term10889.getClass(), "value", term10891);
        setField(term10889, term10889.getClass(), "left", null);
        setField(term10889, term10889.getClass(), "right", null);
        setField(term10889, term10889.getClass(), "parent", null);
        setBooleanField(term10889, term10889.getClass(), "color", true);
        setField(term10888, term10888.getClass(), "root", term10889);
        setIntField(term10888, term10888.getClass(), "size", 1);
        setIntField(term10888, term10888.getClass(), "modCount", 1);
        setField(term10888, term10888.getClass(), "entrySet", null);
        setField(term10888, term10888.getClass(), "navigableKeySet", null);
        setField(term10888, term10888.getClass(), "descendingMap", null);
        setField(term10888, term10888.getClass(), "keySet", null);
        setField(term10888, term10888.getClass(), "values", null);
        setField(term10887, term10887.getClass(), "freqTable", term10888);
        term10892 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.stat.Frequency");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Comparable");
        Object[] args = new Object[1];
        args[0] = term10717;
        callMethod(klass, "addValue", argTypes, term10629, args);
        assertTrue(recursiveEquals(term10629, term10887));
        assertTrue(recursiveEquals(term10717, term10892));
    }

};


