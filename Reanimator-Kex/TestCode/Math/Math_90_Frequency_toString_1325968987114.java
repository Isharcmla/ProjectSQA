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

public class Frequency_toString_1325968987114 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term15038;
     Object term15197;

    public Frequency_toString_1325968987114() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term15038 = newInstance(Class.forName("org.apache.commons.math.stat.Frequency"));
        Object term15078 = newInstance(Class.forName("java.util.TreeMap"));
        setField(term15038, term15038.getClass(), "freqTable", term15078);
        term15197 = newInstance(Class.forName("org.apache.commons.math.stat.Frequency"));
        Object term15198 = newInstance(Class.forName("java.util.TreeMap"));
        Object term15199 = newInstance(Class.forName("java.util.TreeMap$KeySet"));
        setField(term15198, term15198.getClass(), "comparator", null);
        setField(term15198, term15198.getClass(), "root", null);
        setIntField(term15198, term15198.getClass(), "size", 0);
        setIntField(term15198, term15198.getClass(), "modCount", 0);
        setField(term15198, term15198.getClass(), "entrySet", null);
        setField(term15199, term15199.getClass(), "m", term15198);
        setField(term15198, term15198.getClass(), "navigableKeySet", term15199);
        setField(term15198, term15198.getClass(), "descendingMap", null);
        setField(term15198, term15198.getClass(), "keySet", null);
        setField(term15198, term15198.getClass(), "values", null);
        setField(term15197, term15197.getClass(), "freqTable", term15198);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.stat.Frequency");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "toString", argTypes, term15038, args);
        assertTrue(recursiveEquals(term15038, term15197));
        assertTrue(recursiveEquals(retValue, "Value \t Freq. \t Pct. \t Cum Pct. \n"));
    }

};


