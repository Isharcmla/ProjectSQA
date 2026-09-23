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

public class Frequency_addValue_112567849080 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term6941;
     Object term7704;

    public Frequency_addValue_112567849080() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term6941 = newInstance(Class.forName("org.apache.commons.math.stat.Frequency"));
        Object term6981 = newInstance(Class.forName("java.util.TreeMap"));
        setField(term6941, term6941.getClass(), "freqTable", term6981);
        Long term7707 = new Long(0L);
        Long term7708 = new Long(1L);
        term7704 = newInstance(Class.forName("org.apache.commons.math.stat.Frequency"));
        Object term7705 = newInstance(Class.forName("java.util.TreeMap"));
        Object term7706 = newInstance(Class.forName("java.util.TreeMap$Entry"));
        setField(term7705, term7705.getClass(), "comparator", null);
        setField(term7706, term7706.getClass(), "key", term7707);
        setField(term7706, term7706.getClass(), "value", term7708);
        setField(term7706, term7706.getClass(), "left", null);
        setField(term7706, term7706.getClass(), "right", null);
        setField(term7706, term7706.getClass(), "parent", null);
        setBooleanField(term7706, term7706.getClass(), "color", true);
        setField(term7705, term7705.getClass(), "root", term7706);
        setIntField(term7705, term7705.getClass(), "size", 1);
        setIntField(term7705, term7705.getClass(), "modCount", 1);
        setField(term7705, term7705.getClass(), "entrySet", null);
        setField(term7705, term7705.getClass(), "navigableKeySet", null);
        setField(term7705, term7705.getClass(), "descendingMap", null);
        setField(term7705, term7705.getClass(), "keySet", null);
        setField(term7705, term7705.getClass(), "values", null);
        setField(term7704, term7704.getClass(), "freqTable", term7705);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.stat.Frequency");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = 0;
        callMethod(klass, "addValue", argTypes, term6941, args);
        assertTrue(recursiveEquals(term6941, term7704));
    }

};


