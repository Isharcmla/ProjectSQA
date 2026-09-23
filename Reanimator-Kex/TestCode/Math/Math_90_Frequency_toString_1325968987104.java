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

public class Frequency_toString_1325968987104 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term11859;
     Object term11941;

    public Frequency_toString_1325968987104() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term11859 = newInstance(Class.forName("org.apache.commons.math.stat.Frequency"));
        Object term11899 = newInstance(Class.forName("java.util.TreeMap"));
        setField(term11859, term11859.getClass(), "freqTable", term11899);
        term11941 = newInstance(Class.forName("org.apache.commons.math.stat.Frequency"));
        Object term11942 = newInstance(Class.forName("java.util.TreeMap"));
        Object term11943 = newInstance(Class.forName("java.util.TreeMap$KeySet"));
        setField(term11942, term11942.getClass(), "comparator", null);
        setField(term11942, term11942.getClass(), "root", null);
        setIntField(term11942, term11942.getClass(), "size", 0);
        setIntField(term11942, term11942.getClass(), "modCount", 0);
        setField(term11942, term11942.getClass(), "entrySet", null);
        setField(term11943, term11943.getClass(), "m", term11942);
        setField(term11942, term11942.getClass(), "navigableKeySet", term11943);
        setField(term11942, term11942.getClass(), "descendingMap", null);
        setField(term11942, term11942.getClass(), "keySet", null);
        setField(term11942, term11942.getClass(), "values", null);
        setField(term11941, term11941.getClass(), "freqTable", term11942);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.stat.Frequency");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "toString", argTypes, term11859, args);
        assertTrue(recursiveEquals(term11859, term11941));
        assertTrue(recursiveEquals(retValue, "Value \t Freq. \t Pct. \t Cum Pct. \n"));
    }

};


