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

public class Frequency_toString_132596898730 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1;
     Object term195;

    public Frequency_toString_132596898730() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1 = newInstance(Class.forName("org.apache.commons.math.stat.Frequency"));
        Object term2 = newInstance(Class.forName("java.util.TreeMap"));
        setField(term2, term2.getClass(), "comparator", null);
        setField(term2, term2.getClass(), "root", null);
        setIntField(term2, term2.getClass(), "size", 0);
        setIntField(term2, term2.getClass(), "modCount", 0);
        setField(term2, term2.getClass(), "entrySet", null);
        setField(term2, term2.getClass(), "navigableKeySet", null);
        setField(term2, term2.getClass(), "descendingMap", null);
        setField(term2, term2.getClass(), "keySet", null);
        setField(term2, term2.getClass(), "values", null);
        setField(term1, term1.getClass(), "freqTable", term2);
        term195 = newInstance(Class.forName("org.apache.commons.math.stat.Frequency"));
        Object term196 = newInstance(Class.forName("java.util.TreeMap"));
        Object term197 = newInstance(Class.forName("java.util.TreeMap$KeySet"));
        setField(term196, term196.getClass(), "comparator", null);
        setField(term196, term196.getClass(), "root", null);
        setIntField(term196, term196.getClass(), "size", 0);
        setIntField(term196, term196.getClass(), "modCount", 0);
        setField(term196, term196.getClass(), "entrySet", null);
        setField(term197, term197.getClass(), "m", term196);
        setField(term196, term196.getClass(), "navigableKeySet", term197);
        setField(term196, term196.getClass(), "descendingMap", null);
        setField(term196, term196.getClass(), "keySet", null);
        setField(term196, term196.getClass(), "values", null);
        setField(term195, term195.getClass(), "freqTable", term196);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.stat.Frequency");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "toString", argTypes, term1, args);
        assertTrue(recursiveEquals(term1, term195));
        assertTrue(recursiveEquals(retValue, "Value \t Freq. \t Pct. \t Cum Pct. \n"));
    }

};


