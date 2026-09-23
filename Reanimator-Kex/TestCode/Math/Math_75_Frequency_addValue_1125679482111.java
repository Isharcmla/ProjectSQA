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
import java.lang.Long;

public class Frequency_addValue_1125679482111 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term12045;
     Object term12111;

    public Frequency_addValue_1125679482111() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term12045 = newInstance(Class.forName("org.apache.commons.math.stat.Frequency"));
        Object term12085 = newInstance(Class.forName("java.util.TreeMap"));
        setField(term12045, term12045.getClass(), "freqTable", term12085);
        Long term12114 = new Long(0L);
        Long term12115 = new Long(1L);
        term12111 = newInstance(Class.forName("org.apache.commons.math.stat.Frequency"));
        Object term12112 = newInstance(Class.forName("java.util.TreeMap"));
        Object term12113 = newInstance(Class.forName("java.util.TreeMap$Entry"));
        setField(term12112, term12112.getClass(), "comparator", null);
        setField(term12113, term12113.getClass(), "key", term12114);
        setField(term12113, term12113.getClass(), "value", term12115);
        setField(term12113, term12113.getClass(), "left", null);
        setField(term12113, term12113.getClass(), "right", null);
        setField(term12113, term12113.getClass(), "parent", null);
        setBooleanField(term12113, term12113.getClass(), "color", true);
        setField(term12112, term12112.getClass(), "root", term12113);
        setIntField(term12112, term12112.getClass(), "size", 1);
        setIntField(term12112, term12112.getClass(), "modCount", 1);
        setField(term12112, term12112.getClass(), "entrySet", null);
        setField(term12112, term12112.getClass(), "navigableKeySet", null);
        setField(term12112, term12112.getClass(), "descendingMap", null);
        setField(term12112, term12112.getClass(), "keySet", null);
        setField(term12112, term12112.getClass(), "values", null);
        setField(term12111, term12111.getClass(), "freqTable", term12112);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.stat.Frequency");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = long.class;
        Object[] args = new Object[1];
        args[0] = 0L;
        callMethod(klass, "addValue", argTypes, term12045, args);
        assertTrue(recursiveEquals(term12045, term12111));
    }

};


