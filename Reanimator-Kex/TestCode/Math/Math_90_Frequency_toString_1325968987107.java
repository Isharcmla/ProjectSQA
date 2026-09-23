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

public class Frequency_toString_1325968987107 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term12620;
     Object term12900;

    public Frequency_toString_1325968987107() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term12620 = newInstance(Class.forName("org.apache.commons.math.stat.Frequency"));
        Object term12660 = newInstance(Class.forName("java.util.TreeMap"));
        setField(term12620, term12620.getClass(), "freqTable", term12660);
        term12900 = newInstance(Class.forName("org.apache.commons.math.stat.Frequency"));
        Object term12901 = newInstance(Class.forName("java.util.TreeMap"));
        Object term12902 = newInstance(Class.forName("java.util.TreeMap$KeySet"));
        setField(term12901, term12901.getClass(), "comparator", null);
        setField(term12901, term12901.getClass(), "root", null);
        setIntField(term12901, term12901.getClass(), "size", 0);
        setIntField(term12901, term12901.getClass(), "modCount", 0);
        setField(term12901, term12901.getClass(), "entrySet", null);
        setField(term12902, term12902.getClass(), "m", term12901);
        setField(term12901, term12901.getClass(), "navigableKeySet", term12902);
        setField(term12901, term12901.getClass(), "descendingMap", null);
        setField(term12901, term12901.getClass(), "keySet", null);
        setField(term12901, term12901.getClass(), "values", null);
        setField(term12900, term12900.getClass(), "freqTable", term12901);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.stat.Frequency");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "toString", argTypes, term12620, args);
        assertTrue(recursiveEquals(term12620, term12900));
        assertTrue(recursiveEquals(retValue, "Value \t Freq. \t Pct. \t Cum Pct. \n"));
    }

};


