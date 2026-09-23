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

public class Frequency_addValue_52416251240 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term20;
     Object term24;
     Object term1166;
     Object term1171;

    public Frequency_addValue_52416251240() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term20 = newInstance(Class.forName("org.apache.commons.math.stat.Frequency"));
        Object term21 = newInstance(Class.forName("java.util.TreeMap"));
        setField(term21, term21.getClass(), "comparator", null);
        setField(term21, term21.getClass(), "root", null);
        setIntField(term21, term21.getClass(), "size", 0);
        setIntField(term21, term21.getClass(), "modCount", 0);
        setField(term21, term21.getClass(), "entrySet", null);
        setField(term21, term21.getClass(), "navigableKeySet", null);
        setField(term21, term21.getClass(), "descendingMap", null);
        setField(term21, term21.getClass(), "keySet", null);
        setField(term21, term21.getClass(), "values", null);
        setField(term20, term20.getClass(), "freqTable", term21);
        term24 = new Integer(568599855);
        Long term1169 = new Long(568599855L);
        Long term1170 = new Long(1L);
        term1166 = newInstance(Class.forName("org.apache.commons.math.stat.Frequency"));
        Object term1167 = newInstance(Class.forName("java.util.TreeMap"));
        Object term1168 = newInstance(Class.forName("java.util.TreeMap$Entry"));
        setField(term1167, term1167.getClass(), "comparator", null);
        setField(term1168, term1168.getClass(), "key", term1169);
        setField(term1168, term1168.getClass(), "value", term1170);
        setField(term1168, term1168.getClass(), "left", null);
        setField(term1168, term1168.getClass(), "right", null);
        setField(term1168, term1168.getClass(), "parent", null);
        setBooleanField(term1168, term1168.getClass(), "color", true);
        setField(term1167, term1167.getClass(), "root", term1168);
        setIntField(term1167, term1167.getClass(), "size", 1);
        setIntField(term1167, term1167.getClass(), "modCount", 1);
        setField(term1167, term1167.getClass(), "entrySet", null);
        setField(term1167, term1167.getClass(), "navigableKeySet", null);
        setField(term1167, term1167.getClass(), "descendingMap", null);
        setField(term1167, term1167.getClass(), "keySet", null);
        setField(term1167, term1167.getClass(), "values", null);
        setField(term1166, term1166.getClass(), "freqTable", term1167);
        term1171 = new Integer(568599855);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.stat.Frequency");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Integer");
        Object[] args = new Object[1];
        args[0] = term24;
        callMethod(klass, "addValue", argTypes, term20, args);
        assertTrue(recursiveEquals(term20, term1166));
        assertTrue(recursiveEquals(term24, term1171));
    }

};


