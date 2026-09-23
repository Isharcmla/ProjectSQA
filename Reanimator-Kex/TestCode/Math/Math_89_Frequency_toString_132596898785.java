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

public class Frequency_toString_132596898785 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term8072;
     Object term8156;

    public Frequency_toString_132596898785() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term8072 = newInstance(Class.forName("org.apache.commons.math.stat.Frequency"));
        Object term8112 = newInstance(Class.forName("java.util.TreeMap"));
        setField(term8072, term8072.getClass(), "freqTable", term8112);
        term8156 = newInstance(Class.forName("org.apache.commons.math.stat.Frequency"));
        Object term8157 = newInstance(Class.forName("java.util.TreeMap"));
        Object term8158 = newInstance(Class.forName("java.util.TreeMap$KeySet"));
        setField(term8157, term8157.getClass(), "comparator", null);
        setField(term8157, term8157.getClass(), "root", null);
        setIntField(term8157, term8157.getClass(), "size", 0);
        setIntField(term8157, term8157.getClass(), "modCount", 0);
        setField(term8157, term8157.getClass(), "entrySet", null);
        setField(term8158, term8158.getClass(), "m", term8157);
        setField(term8157, term8157.getClass(), "navigableKeySet", term8158);
        setField(term8157, term8157.getClass(), "descendingMap", null);
        setField(term8157, term8157.getClass(), "keySet", null);
        setField(term8157, term8157.getClass(), "values", null);
        setField(term8156, term8156.getClass(), "freqTable", term8157);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.stat.Frequency");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "toString", argTypes, term8072, args);
        assertTrue(recursiveEquals(term8072, term8156));
        assertTrue(recursiveEquals(retValue, "Value \t Freq. \t Pct. \t Cum Pct. \n"));
    }

};


