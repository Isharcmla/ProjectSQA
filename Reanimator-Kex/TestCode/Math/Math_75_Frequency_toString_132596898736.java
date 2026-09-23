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

public class Frequency_toString_132596898736 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1;
     Object term220;

    public Frequency_toString_132596898736() {
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
        term220 = newInstance(Class.forName("org.apache.commons.math.stat.Frequency"));
        Object term221 = newInstance(Class.forName("java.util.TreeMap"));
        Object term222 = newInstance(Class.forName("java.util.TreeMap$KeySet"));
        setField(term221, term221.getClass(), "comparator", null);
        setField(term221, term221.getClass(), "root", null);
        setIntField(term221, term221.getClass(), "size", 0);
        setIntField(term221, term221.getClass(), "modCount", 0);
        setField(term221, term221.getClass(), "entrySet", null);
        setField(term222, term222.getClass(), "m", term221);
        setField(term221, term221.getClass(), "navigableKeySet", term222);
        setField(term221, term221.getClass(), "descendingMap", null);
        setField(term221, term221.getClass(), "keySet", null);
        setField(term221, term221.getClass(), "values", null);
        setField(term220, term220.getClass(), "freqTable", term221);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.stat.Frequency");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "toString", argTypes, term1, args);
        assertTrue(recursiveEquals(term1, term220));
        assertTrue(recursiveEquals(retValue, "Value \t Freq. \t Pct. \t Cum Pct. \n"));
    }

};


