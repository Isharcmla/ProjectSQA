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

public class Frequency_toString_132596898781 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term7648;
     Object term7750;

    public Frequency_toString_132596898781() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term7648 = newInstance(Class.forName("org.apache.commons.math.stat.Frequency"));
        Object term7688 = newInstance(Class.forName("java.util.TreeMap"));
        setField(term7648, term7648.getClass(), "freqTable", term7688);
        term7750 = newInstance(Class.forName("org.apache.commons.math.stat.Frequency"));
        Object term7751 = newInstance(Class.forName("java.util.TreeMap"));
        Object term7752 = newInstance(Class.forName("java.util.TreeMap$KeySet"));
        setField(term7751, term7751.getClass(), "comparator", null);
        setField(term7751, term7751.getClass(), "root", null);
        setIntField(term7751, term7751.getClass(), "size", 0);
        setIntField(term7751, term7751.getClass(), "modCount", 0);
        setField(term7751, term7751.getClass(), "entrySet", null);
        setField(term7752, term7752.getClass(), "m", term7751);
        setField(term7751, term7751.getClass(), "navigableKeySet", term7752);
        setField(term7751, term7751.getClass(), "descendingMap", null);
        setField(term7751, term7751.getClass(), "keySet", null);
        setField(term7751, term7751.getClass(), "values", null);
        setField(term7750, term7750.getClass(), "freqTable", term7751);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.stat.Frequency");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "toString", argTypes, term7648, args);
        assertTrue(recursiveEquals(term7648, term7750));
        assertTrue(recursiveEquals(retValue, "Value \t Freq. \t Pct. \t Cum Pct. \n"));
    }

};


