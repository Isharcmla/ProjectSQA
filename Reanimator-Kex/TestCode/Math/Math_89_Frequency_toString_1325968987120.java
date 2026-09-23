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

public class Frequency_toString_1325968987120 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term15959;
     Object term16118;

    public Frequency_toString_1325968987120() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term15959 = newInstance(Class.forName("org.apache.commons.math.stat.Frequency"));
        Object term15999 = newInstance(Class.forName("java.util.TreeMap"));
        setField(term15959, term15959.getClass(), "freqTable", term15999);
        term16118 = newInstance(Class.forName("org.apache.commons.math.stat.Frequency"));
        Object term16119 = newInstance(Class.forName("java.util.TreeMap"));
        Object term16120 = newInstance(Class.forName("java.util.TreeMap$KeySet"));
        setField(term16119, term16119.getClass(), "comparator", null);
        setField(term16119, term16119.getClass(), "root", null);
        setIntField(term16119, term16119.getClass(), "size", 0);
        setIntField(term16119, term16119.getClass(), "modCount", 0);
        setField(term16119, term16119.getClass(), "entrySet", null);
        setField(term16120, term16120.getClass(), "m", term16119);
        setField(term16119, term16119.getClass(), "navigableKeySet", term16120);
        setField(term16119, term16119.getClass(), "descendingMap", null);
        setField(term16119, term16119.getClass(), "keySet", null);
        setField(term16119, term16119.getClass(), "values", null);
        setField(term16118, term16118.getClass(), "freqTable", term16119);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.stat.Frequency");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "toString", argTypes, term15959, args);
        assertTrue(recursiveEquals(term15959, term16118));
        assertTrue(recursiveEquals(retValue, "Value \t Freq. \t Pct. \t Cum Pct. \n"));
    }

};


