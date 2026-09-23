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

public class Frequency_toString_1325968987111 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term12663;
     Object term13427;

    public Frequency_toString_1325968987111() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term12663 = newInstance(Class.forName("org.apache.commons.math.stat.Frequency"));
        Object term12703 = newInstance(Class.forName("java.util.TreeMap"));
        setField(term12663, term12663.getClass(), "freqTable", term12703);
        term13427 = newInstance(Class.forName("org.apache.commons.math.stat.Frequency"));
        Object term13428 = newInstance(Class.forName("java.util.TreeMap"));
        Object term13429 = newInstance(Class.forName("java.util.TreeMap$KeySet"));
        setField(term13428, term13428.getClass(), "comparator", null);
        setField(term13428, term13428.getClass(), "root", null);
        setIntField(term13428, term13428.getClass(), "size", 0);
        setIntField(term13428, term13428.getClass(), "modCount", 0);
        setField(term13428, term13428.getClass(), "entrySet", null);
        setField(term13429, term13429.getClass(), "m", term13428);
        setField(term13428, term13428.getClass(), "navigableKeySet", term13429);
        setField(term13428, term13428.getClass(), "descendingMap", null);
        setField(term13428, term13428.getClass(), "keySet", null);
        setField(term13428, term13428.getClass(), "values", null);
        setField(term13427, term13427.getClass(), "freqTable", term13428);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.stat.Frequency");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "toString", argTypes, term12663, args);
        assertTrue(recursiveEquals(term12663, term13427));
        assertTrue(recursiveEquals(retValue, "Value \t Freq. \t Pct. \t Cum Pct. \n"));
    }

};


