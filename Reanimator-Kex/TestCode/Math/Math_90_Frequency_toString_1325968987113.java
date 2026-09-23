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

public class Frequency_toString_1325968987113 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term14356;
     Object term15120;

    public Frequency_toString_1325968987113() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term14356 = newInstance(Class.forName("org.apache.commons.math.stat.Frequency"));
        Object term14396 = newInstance(Class.forName("java.util.TreeMap"));
        setField(term14356, term14356.getClass(), "freqTable", term14396);
        term15120 = newInstance(Class.forName("org.apache.commons.math.stat.Frequency"));
        Object term15121 = newInstance(Class.forName("java.util.TreeMap"));
        Object term15122 = newInstance(Class.forName("java.util.TreeMap$KeySet"));
        setField(term15121, term15121.getClass(), "comparator", null);
        setField(term15121, term15121.getClass(), "root", null);
        setIntField(term15121, term15121.getClass(), "size", 0);
        setIntField(term15121, term15121.getClass(), "modCount", 0);
        setField(term15121, term15121.getClass(), "entrySet", null);
        setField(term15122, term15122.getClass(), "m", term15121);
        setField(term15121, term15121.getClass(), "navigableKeySet", term15122);
        setField(term15121, term15121.getClass(), "descendingMap", null);
        setField(term15121, term15121.getClass(), "keySet", null);
        setField(term15121, term15121.getClass(), "values", null);
        setField(term15120, term15120.getClass(), "freqTable", term15121);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.stat.Frequency");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "toString", argTypes, term14356, args);
        assertTrue(recursiveEquals(term14356, term15120));
        assertTrue(recursiveEquals(retValue, "Value \t Freq. \t Pct. \t Cum Pct. \n"));
    }

};


