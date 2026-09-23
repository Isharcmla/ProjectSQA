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

public class Frequency_toString_1325968987160 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term26862;
     Object term28627;

    public Frequency_toString_1325968987160() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term26862 = newInstance(Class.forName("org.apache.commons.math.stat.Frequency"));
        Object term26902 = newInstance(Class.forName("java.util.TreeMap"));
        setField(term26862, term26862.getClass(), "freqTable", term26902);
        term28627 = newInstance(Class.forName("org.apache.commons.math.stat.Frequency"));
        Object term28628 = newInstance(Class.forName("java.util.TreeMap"));
        Object term28629 = newInstance(Class.forName("java.util.TreeMap$KeySet"));
        setField(term28628, term28628.getClass(), "comparator", null);
        setField(term28628, term28628.getClass(), "root", null);
        setIntField(term28628, term28628.getClass(), "size", 0);
        setIntField(term28628, term28628.getClass(), "modCount", 0);
        setField(term28628, term28628.getClass(), "entrySet", null);
        setField(term28629, term28629.getClass(), "m", term28628);
        setField(term28628, term28628.getClass(), "navigableKeySet", term28629);
        setField(term28628, term28628.getClass(), "descendingMap", null);
        setField(term28628, term28628.getClass(), "keySet", null);
        setField(term28628, term28628.getClass(), "values", null);
        setField(term28627, term28627.getClass(), "freqTable", term28628);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.stat.Frequency");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "toString", argTypes, term26862, args);
        assertTrue(recursiveEquals(term26862, term28627));
        assertTrue(recursiveEquals(retValue, "Value \t Freq. \t Pct. \t Cum Pct. \n"));
    }

};


