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

public class Frequency_hashCode_81520929766 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term158;
     Object term3350;

    public Frequency_hashCode_81520929766() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term158 = newInstance(Class.forName("org.apache.commons.math.stat.Frequency"));
        Object term159 = newInstance(Class.forName("java.util.TreeMap"));
        setField(term159, term159.getClass(), "comparator", null);
        setField(term159, term159.getClass(), "root", null);
        setIntField(term159, term159.getClass(), "size", 0);
        setIntField(term159, term159.getClass(), "modCount", 0);
        setField(term159, term159.getClass(), "entrySet", null);
        setField(term159, term159.getClass(), "navigableKeySet", null);
        setField(term159, term159.getClass(), "descendingMap", null);
        setField(term159, term159.getClass(), "keySet", null);
        setField(term159, term159.getClass(), "values", null);
        setField(term158, term158.getClass(), "freqTable", term159);
        term3350 = newInstance(Class.forName("org.apache.commons.math.stat.Frequency"));
        Object term3351 = newInstance(Class.forName("java.util.TreeMap"));
        Object term3352 = newInstance(Class.forName("java.util.TreeMap$EntrySet"));
        setField(term3351, term3351.getClass(), "comparator", null);
        setField(term3351, term3351.getClass(), "root", null);
        setIntField(term3351, term3351.getClass(), "size", 0);
        setIntField(term3351, term3351.getClass(), "modCount", 0);
        setField(term3352, term3352.getClass(), "this$0", term3351);
        setField(term3351, term3351.getClass(), "entrySet", term3352);
        setField(term3351, term3351.getClass(), "navigableKeySet", null);
        setField(term3351, term3351.getClass(), "descendingMap", null);
        setField(term3351, term3351.getClass(), "keySet", null);
        setField(term3351, term3351.getClass(), "values", null);
        setField(term3350, term3350.getClass(), "freqTable", term3351);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.stat.Frequency");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "hashCode", argTypes, term158, args);
        assertTrue(recursiveEquals(term158, term3350));
        assertTrue(recursiveEquals(retValue, 31));
    }

};


