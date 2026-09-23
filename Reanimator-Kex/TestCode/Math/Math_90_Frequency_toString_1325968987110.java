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

public class Frequency_toString_1325968987110 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term13577;
     Object term13679;

    public Frequency_toString_1325968987110() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term13577 = newInstance(Class.forName("org.apache.commons.math.stat.Frequency"));
        Object term13617 = newInstance(Class.forName("java.util.TreeMap"));
        setField(term13577, term13577.getClass(), "freqTable", term13617);
        term13679 = newInstance(Class.forName("org.apache.commons.math.stat.Frequency"));
        Object term13680 = newInstance(Class.forName("java.util.TreeMap"));
        Object term13681 = newInstance(Class.forName("java.util.TreeMap$KeySet"));
        setField(term13680, term13680.getClass(), "comparator", null);
        setField(term13680, term13680.getClass(), "root", null);
        setIntField(term13680, term13680.getClass(), "size", 0);
        setIntField(term13680, term13680.getClass(), "modCount", 0);
        setField(term13680, term13680.getClass(), "entrySet", null);
        setField(term13681, term13681.getClass(), "m", term13680);
        setField(term13680, term13680.getClass(), "navigableKeySet", term13681);
        setField(term13680, term13680.getClass(), "descendingMap", null);
        setField(term13680, term13680.getClass(), "keySet", null);
        setField(term13680, term13680.getClass(), "values", null);
        setField(term13679, term13679.getClass(), "freqTable", term13680);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.stat.Frequency");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "toString", argTypes, term13577, args);
        assertTrue(recursiveEquals(term13577, term13679));
        assertTrue(recursiveEquals(retValue, "Value \t Freq. \t Pct. \t Cum Pct. \n"));
    }

};


