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

public class Frequency_toString_1325968987154 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term23994;
     Object term25185;

    public Frequency_toString_1325968987154() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term23994 = newInstance(Class.forName("org.apache.commons.math.stat.Frequency"));
        Object term24034 = newInstance(Class.forName("java.util.TreeMap"));
        setField(term23994, term23994.getClass(), "freqTable", term24034);
        term25185 = newInstance(Class.forName("org.apache.commons.math.stat.Frequency"));
        Object term25186 = newInstance(Class.forName("java.util.TreeMap"));
        Object term25187 = newInstance(Class.forName("java.util.TreeMap$KeySet"));
        setField(term25186, term25186.getClass(), "comparator", null);
        setField(term25186, term25186.getClass(), "root", null);
        setIntField(term25186, term25186.getClass(), "size", 0);
        setIntField(term25186, term25186.getClass(), "modCount", 0);
        setField(term25186, term25186.getClass(), "entrySet", null);
        setField(term25187, term25187.getClass(), "m", term25186);
        setField(term25186, term25186.getClass(), "navigableKeySet", term25187);
        setField(term25186, term25186.getClass(), "descendingMap", null);
        setField(term25186, term25186.getClass(), "keySet", null);
        setField(term25186, term25186.getClass(), "values", null);
        setField(term25185, term25185.getClass(), "freqTable", term25186);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.stat.Frequency");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "toString", argTypes, term23994, args);
        assertTrue(recursiveEquals(term23994, term25185));
        assertTrue(recursiveEquals(retValue, "Value \t Freq. \t Pct. \t Cum Pct. \n"));
    }

};


