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

public class Frequency_toString_1325968987119 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term15277;
     Object term16041;

    public Frequency_toString_1325968987119() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term15277 = newInstance(Class.forName("org.apache.commons.math.stat.Frequency"));
        Object term15317 = newInstance(Class.forName("java.util.TreeMap"));
        setField(term15277, term15277.getClass(), "freqTable", term15317);
        term16041 = newInstance(Class.forName("org.apache.commons.math.stat.Frequency"));
        Object term16042 = newInstance(Class.forName("java.util.TreeMap"));
        Object term16043 = newInstance(Class.forName("java.util.TreeMap$KeySet"));
        setField(term16042, term16042.getClass(), "comparator", null);
        setField(term16042, term16042.getClass(), "root", null);
        setIntField(term16042, term16042.getClass(), "size", 0);
        setIntField(term16042, term16042.getClass(), "modCount", 0);
        setField(term16042, term16042.getClass(), "entrySet", null);
        setField(term16043, term16043.getClass(), "m", term16042);
        setField(term16042, term16042.getClass(), "navigableKeySet", term16043);
        setField(term16042, term16042.getClass(), "descendingMap", null);
        setField(term16042, term16042.getClass(), "keySet", null);
        setField(term16042, term16042.getClass(), "values", null);
        setField(term16041, term16041.getClass(), "freqTable", term16042);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.stat.Frequency");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "toString", argTypes, term15277, args);
        assertTrue(recursiveEquals(term15277, term16041));
        assertTrue(recursiveEquals(retValue, "Value \t Freq. \t Pct. \t Cum Pct. \n"));
    }

};


