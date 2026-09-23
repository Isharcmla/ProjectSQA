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

public class Frequency_toString_1325968987147 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term20869;
     Object term21327;

    public Frequency_toString_1325968987147() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term20869 = newInstance(Class.forName("org.apache.commons.math.stat.Frequency"));
        Object term20909 = newInstance(Class.forName("java.util.TreeMap"));
        setField(term20869, term20869.getClass(), "freqTable", term20909);
        term21327 = newInstance(Class.forName("org.apache.commons.math.stat.Frequency"));
        Object term21328 = newInstance(Class.forName("java.util.TreeMap"));
        Object term21329 = newInstance(Class.forName("java.util.TreeMap$KeySet"));
        setField(term21328, term21328.getClass(), "comparator", null);
        setField(term21328, term21328.getClass(), "root", null);
        setIntField(term21328, term21328.getClass(), "size", 0);
        setIntField(term21328, term21328.getClass(), "modCount", 0);
        setField(term21328, term21328.getClass(), "entrySet", null);
        setField(term21329, term21329.getClass(), "m", term21328);
        setField(term21328, term21328.getClass(), "navigableKeySet", term21329);
        setField(term21328, term21328.getClass(), "descendingMap", null);
        setField(term21328, term21328.getClass(), "keySet", null);
        setField(term21328, term21328.getClass(), "values", null);
        setField(term21327, term21327.getClass(), "freqTable", term21328);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.stat.Frequency");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "toString", argTypes, term20869, args);
        assertTrue(recursiveEquals(term20869, term21327));
        assertTrue(recursiveEquals(retValue, "Value \t Freq. \t Pct. \t Cum Pct. \n"));
    }

};


