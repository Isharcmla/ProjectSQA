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

public class Frequency_toString_1325968987136 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term20720;
     Object term20802;

    public Frequency_toString_1325968987136() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term20720 = newInstance(Class.forName("org.apache.commons.math.stat.Frequency"));
        Object term20760 = newInstance(Class.forName("java.util.TreeMap"));
        setField(term20720, term20720.getClass(), "freqTable", term20760);
        term20802 = newInstance(Class.forName("org.apache.commons.math.stat.Frequency"));
        Object term20803 = newInstance(Class.forName("java.util.TreeMap"));
        Object term20804 = newInstance(Class.forName("java.util.TreeMap$KeySet"));
        setField(term20803, term20803.getClass(), "comparator", null);
        setField(term20803, term20803.getClass(), "root", null);
        setIntField(term20803, term20803.getClass(), "size", 0);
        setIntField(term20803, term20803.getClass(), "modCount", 0);
        setField(term20803, term20803.getClass(), "entrySet", null);
        setField(term20804, term20804.getClass(), "m", term20803);
        setField(term20803, term20803.getClass(), "navigableKeySet", term20804);
        setField(term20803, term20803.getClass(), "descendingMap", null);
        setField(term20803, term20803.getClass(), "keySet", null);
        setField(term20803, term20803.getClass(), "values", null);
        setField(term20802, term20802.getClass(), "freqTable", term20803);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.stat.Frequency");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "toString", argTypes, term20720, args);
        assertTrue(recursiveEquals(term20720, term20802));
        assertTrue(recursiveEquals(retValue, "Value \t Freq. \t Pct. \t Cum Pct. \n"));
    }

};


