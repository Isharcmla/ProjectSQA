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

public class Frequency_addValue_1195533799137 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term19138;
     Object term19226;
     Object term19874;
     Object term19879;

    public Frequency_addValue_1195533799137() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term19138 = newInstance(Class.forName("org.apache.commons.math.stat.Frequency"));
        Object term19178 = newInstance(Class.forName("java.util.TreeMap"));
        setField(term19138, term19138.getClass(), "freqTable", term19178);
        term19226 = new Integer(0);
        Long term19877 = new Long(0L);
        Long term19878 = new Long(1L);
        term19874 = newInstance(Class.forName("org.apache.commons.math.stat.Frequency"));
        Object term19875 = newInstance(Class.forName("java.util.TreeMap"));
        Object term19876 = newInstance(Class.forName("java.util.TreeMap$Entry"));
        setField(term19875, term19875.getClass(), "comparator", null);
        setField(term19876, term19876.getClass(), "key", term19877);
        setField(term19876, term19876.getClass(), "value", term19878);
        setField(term19876, term19876.getClass(), "left", null);
        setField(term19876, term19876.getClass(), "right", null);
        setField(term19876, term19876.getClass(), "parent", null);
        setBooleanField(term19876, term19876.getClass(), "color", true);
        setField(term19875, term19875.getClass(), "root", term19876);
        setIntField(term19875, term19875.getClass(), "size", 1);
        setIntField(term19875, term19875.getClass(), "modCount", 1);
        setField(term19875, term19875.getClass(), "entrySet", null);
        setField(term19875, term19875.getClass(), "navigableKeySet", null);
        setField(term19875, term19875.getClass(), "descendingMap", null);
        setField(term19875, term19875.getClass(), "keySet", null);
        setField(term19875, term19875.getClass(), "values", null);
        setField(term19874, term19874.getClass(), "freqTable", term19875);
        term19879 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.stat.Frequency");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term19226;
        callMethod(klass, "addValue", argTypes, term19138, args);
        assertTrue(recursiveEquals(term19138, term19874));
        assertTrue(recursiveEquals(term19226, term19879));
    }

};


