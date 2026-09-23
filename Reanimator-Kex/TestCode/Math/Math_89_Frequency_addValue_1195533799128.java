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
import java.lang.String;
import java.lang.Long;

public class Frequency_addValue_1195533799128 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term17727;
     Object enum1;
     Object term18346;
     Object enum3;

    public Frequency_addValue_1195533799128() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term17727 = newInstance(Class.forName("org.apache.commons.math.stat.Frequency"));
        Object term17767 = newInstance(Class.forName("java.util.TreeMap"));
        setField(term17727, term17727.getClass(), "freqTable", term17767);
        Class<? extends Object> term18355 = Class.forName((String) "java.lang.annotation.RetentionPolicy");
        Field term18354 = ((Class) term18355).getDeclaredField((String) "SOURCE");
        ((Field) term18354).setAccessible(true);
        enum1 = ((Field) term18354).get((Object) null);
        Class<? extends Object> term18560 = Class.forName((String) "java.lang.annotation.RetentionPolicy");
        Field term18559 = ((Class) term18560).getDeclaredField((String) "SOURCE");
        ((Field) term18559).setAccessible(true);
        Object enum2 = ((Field) term18559).get((Object) null);
        Long term18351 = new Long(1L);
        term18346 = newInstance(Class.forName("org.apache.commons.math.stat.Frequency"));
        Object term18347 = newInstance(Class.forName("java.util.TreeMap"));
        Object term18348 = newInstance(Class.forName("java.util.TreeMap$Entry"));
        setField(term18347, term18347.getClass(), "comparator", null);
        setField(term18348, term18348.getClass(), "key", enum2);
        setField(term18348, term18348.getClass(), "value", term18351);
        setField(term18348, term18348.getClass(), "left", null);
        setField(term18348, term18348.getClass(), "right", null);
        setField(term18348, term18348.getClass(), "parent", null);
        setBooleanField(term18348, term18348.getClass(), "color", true);
        setField(term18347, term18347.getClass(), "root", term18348);
        setIntField(term18347, term18347.getClass(), "size", 1);
        setIntField(term18347, term18347.getClass(), "modCount", 1);
        setField(term18347, term18347.getClass(), "entrySet", null);
        setField(term18347, term18347.getClass(), "navigableKeySet", null);
        setField(term18347, term18347.getClass(), "descendingMap", null);
        setField(term18347, term18347.getClass(), "keySet", null);
        setField(term18347, term18347.getClass(), "values", null);
        setField(term18346, term18346.getClass(), "freqTable", term18347);
        Class<? extends Object> term18765 = Class.forName((String) "java.lang.annotation.RetentionPolicy");
        Field term18764 = ((Class) term18765).getDeclaredField((String) "SOURCE");
        ((Field) term18764).setAccessible(true);
        enum3 = ((Field) term18764).get((Object) null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.stat.Frequency");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = enum1;
        callMethod(klass, "addValue", argTypes, term17727, args);
        assertTrue(recursiveEquals(term17727, term18346));
        assertTrue(recursiveEquals(enum1, enum3));
    }

};


