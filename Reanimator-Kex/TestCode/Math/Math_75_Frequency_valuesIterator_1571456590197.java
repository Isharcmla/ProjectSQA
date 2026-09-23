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

public class Frequency_valuesIterator_1571456590197 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term39568;
     Object term39616;
     Object term39609;

    public Frequency_valuesIterator_1571456590197() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term39568 = newInstance(Class.forName("org.apache.commons.math.stat.Frequency"));
        Object term39608 = newInstance(Class.forName("java.util.TreeMap"));
        setField(term39568, term39568.getClass(), "freqTable", term39608);
        term39616 = newInstance(Class.forName("org.apache.commons.math.stat.Frequency"));
        Object term39617 = newInstance(Class.forName("java.util.TreeMap"));
        Object term39618 = newInstance(Class.forName("java.util.TreeMap$KeySet"));
        setField(term39617, term39617.getClass(), "comparator", null);
        setField(term39617, term39617.getClass(), "root", null);
        setIntField(term39617, term39617.getClass(), "size", 0);
        setIntField(term39617, term39617.getClass(), "modCount", 0);
        setField(term39617, term39617.getClass(), "entrySet", null);
        setField(term39618, term39618.getClass(), "m", term39617);
        setField(term39617, term39617.getClass(), "navigableKeySet", term39618);
        setField(term39617, term39617.getClass(), "descendingMap", null);
        setField(term39617, term39617.getClass(), "keySet", null);
        setField(term39617, term39617.getClass(), "values", null);
        setField(term39616, term39616.getClass(), "freqTable", term39617);
        term39609 = newInstance(Class.forName("java.util.TreeMap$KeyIterator"));
        Object term39610 = newInstance(Class.forName("java.util.TreeMap"));
        Object term39613 = newInstance(Class.forName("java.util.TreeMap$KeySet"));
        setField(term39610, term39610.getClass(), "comparator", null);
        setField(term39610, term39610.getClass(), "root", null);
        setIntField(term39610, term39610.getClass(), "size", 0);
        setIntField(term39610, term39610.getClass(), "modCount", 0);
        setField(term39610, term39610.getClass(), "entrySet", null);
        setField(term39613, term39613.getClass(), "m", term39610);
        setField(term39610, term39610.getClass(), "navigableKeySet", term39613);
        setField(term39610, term39610.getClass(), "descendingMap", null);
        setField(term39610, term39610.getClass(), "keySet", null);
        setField(term39610, term39610.getClass(), "values", null);
        setField(term39609, term39609.getClass(), "this$0", term39610);
        setField(term39609, term39609.getClass(), "next", null);
        setField(term39609, term39609.getClass(), "lastReturned", null);
        setIntField(term39609, term39609.getClass(), "expectedModCount", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.stat.Frequency");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "valuesIterator", argTypes, term39568, args);
        assertTrue(recursiveEquals(term39568, term39616));
        assertTrue(recursiveEquals(retValue, term39609));
    }

};


