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
     Object term13345;
     Object term14186;

    public Frequency_toString_1325968987113() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term13345 = newInstance(Class.forName("org.apache.commons.math.stat.Frequency"));
        Object term13385 = newInstance(Class.forName("java.util.TreeMap"));
        setField(term13345, term13345.getClass(), "freqTable", term13385);
        term14186 = newInstance(Class.forName("org.apache.commons.math.stat.Frequency"));
        Object term14187 = newInstance(Class.forName("java.util.TreeMap"));
        Object term14188 = newInstance(Class.forName("java.util.TreeMap$KeySet"));
        setField(term14187, term14187.getClass(), "comparator", null);
        setField(term14187, term14187.getClass(), "root", null);
        setIntField(term14187, term14187.getClass(), "size", 0);
        setIntField(term14187, term14187.getClass(), "modCount", 0);
        setField(term14187, term14187.getClass(), "entrySet", null);
        setField(term14188, term14188.getClass(), "m", term14187);
        setField(term14187, term14187.getClass(), "navigableKeySet", term14188);
        setField(term14187, term14187.getClass(), "descendingMap", null);
        setField(term14187, term14187.getClass(), "keySet", null);
        setField(term14187, term14187.getClass(), "values", null);
        setField(term14186, term14186.getClass(), "freqTable", term14187);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.stat.Frequency");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "toString", argTypes, term13345, args);
        assertTrue(recursiveEquals(term13345, term14186));
        assertTrue(recursiveEquals(retValue, "Value \t Freq. \t Pct. \t Cum Pct. \n"));
    }

};


