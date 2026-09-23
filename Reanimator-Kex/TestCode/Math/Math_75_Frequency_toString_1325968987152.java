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

public class Frequency_toString_1325968987152 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term22970;
     Object term24076;

    public Frequency_toString_1325968987152() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term22970 = newInstance(Class.forName("org.apache.commons.math.stat.Frequency"));
        Object term23010 = newInstance(Class.forName("java.util.TreeMap"));
        setField(term22970, term22970.getClass(), "freqTable", term23010);
        term24076 = newInstance(Class.forName("org.apache.commons.math.stat.Frequency"));
        Object term24077 = newInstance(Class.forName("java.util.TreeMap"));
        Object term24078 = newInstance(Class.forName("java.util.TreeMap$KeySet"));
        setField(term24077, term24077.getClass(), "comparator", null);
        setField(term24077, term24077.getClass(), "root", null);
        setIntField(term24077, term24077.getClass(), "size", 0);
        setIntField(term24077, term24077.getClass(), "modCount", 0);
        setField(term24077, term24077.getClass(), "entrySet", null);
        setField(term24078, term24078.getClass(), "m", term24077);
        setField(term24077, term24077.getClass(), "navigableKeySet", term24078);
        setField(term24077, term24077.getClass(), "descendingMap", null);
        setField(term24077, term24077.getClass(), "keySet", null);
        setField(term24077, term24077.getClass(), "values", null);
        setField(term24076, term24076.getClass(), "freqTable", term24077);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.stat.Frequency");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "toString", argTypes, term22970, args);
        assertTrue(recursiveEquals(term22970, term24076));
        assertTrue(recursiveEquals(retValue, "Value \t Freq. \t Pct. \t Cum Pct. \n"));
    }

};


