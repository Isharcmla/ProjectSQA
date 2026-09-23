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
     Object term14104;
     Object term14263;

    public Frequency_toString_1325968987114() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term14104 = newInstance(Class.forName("org.apache.commons.math.stat.Frequency"));
        Object term14144 = newInstance(Class.forName("java.util.TreeMap"));
        setField(term14104, term14104.getClass(), "freqTable", term14144);
        term14263 = newInstance(Class.forName("org.apache.commons.math.stat.Frequency"));
        Object term14264 = newInstance(Class.forName("java.util.TreeMap"));
        Object term14265 = newInstance(Class.forName("java.util.TreeMap$KeySet"));
        setField(term14264, term14264.getClass(), "comparator", null);
        setField(term14264, term14264.getClass(), "root", null);
        setIntField(term14264, term14264.getClass(), "size", 0);
        setIntField(term14264, term14264.getClass(), "modCount", 0);
        setField(term14264, term14264.getClass(), "entrySet", null);
        setField(term14265, term14265.getClass(), "m", term14264);
        setField(term14264, term14264.getClass(), "navigableKeySet", term14265);
        setField(term14264, term14264.getClass(), "descendingMap", null);
        setField(term14264, term14264.getClass(), "keySet", null);
        setField(term14264, term14264.getClass(), "values", null);
        setField(term14263, term14263.getClass(), "freqTable", term14264);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.stat.Frequency");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "toString", argTypes, term14104, args);
        assertTrue(recursiveEquals(term14104, term14263));
        assertTrue(recursiveEquals(retValue, "Value \t Freq. \t Pct. \t Cum Pct. \n"));
    }

};


