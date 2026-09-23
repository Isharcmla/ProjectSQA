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

public class Frequency_toString_1325968987145 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term20187;
     Object term20951;

    public Frequency_toString_1325968987145() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term20187 = newInstance(Class.forName("org.apache.commons.math.stat.Frequency"));
        Object term20227 = newInstance(Class.forName("java.util.TreeMap"));
        setField(term20187, term20187.getClass(), "freqTable", term20227);
        term20951 = newInstance(Class.forName("org.apache.commons.math.stat.Frequency"));
        Object term20952 = newInstance(Class.forName("java.util.TreeMap"));
        Object term20953 = newInstance(Class.forName("java.util.TreeMap$KeySet"));
        setField(term20952, term20952.getClass(), "comparator", null);
        setField(term20952, term20952.getClass(), "root", null);
        setIntField(term20952, term20952.getClass(), "size", 0);
        setIntField(term20952, term20952.getClass(), "modCount", 0);
        setField(term20952, term20952.getClass(), "entrySet", null);
        setField(term20953, term20953.getClass(), "m", term20952);
        setField(term20952, term20952.getClass(), "navigableKeySet", term20953);
        setField(term20952, term20952.getClass(), "descendingMap", null);
        setField(term20952, term20952.getClass(), "keySet", null);
        setField(term20952, term20952.getClass(), "values", null);
        setField(term20951, term20951.getClass(), "freqTable", term20952);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.stat.Frequency");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "toString", argTypes, term20187, args);
        assertTrue(recursiveEquals(term20187, term20951));
        assertTrue(recursiveEquals(retValue, "Value \t Freq. \t Pct. \t Cum Pct. \n"));
    }

};


