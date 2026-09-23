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

public class Frequency_valuesIterator_157145659036 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term38;
     Object term958;
     Object term951;

    public Frequency_valuesIterator_157145659036() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term38 = newInstance(Class.forName("org.apache.commons.math.stat.Frequency"));
        Object term39 = newInstance(Class.forName("java.util.TreeMap"));
        setField(term39, term39.getClass(), "comparator", null);
        setField(term39, term39.getClass(), "root", null);
        setIntField(term39, term39.getClass(), "size", 0);
        setIntField(term39, term39.getClass(), "modCount", 0);
        setField(term39, term39.getClass(), "entrySet", null);
        setField(term39, term39.getClass(), "navigableKeySet", null);
        setField(term39, term39.getClass(), "descendingMap", null);
        setField(term39, term39.getClass(), "keySet", null);
        setField(term39, term39.getClass(), "values", null);
        setField(term38, term38.getClass(), "freqTable", term39);
        term958 = newInstance(Class.forName("org.apache.commons.math.stat.Frequency"));
        Object term959 = newInstance(Class.forName("java.util.TreeMap"));
        Object term960 = newInstance(Class.forName("java.util.TreeMap$KeySet"));
        setField(term959, term959.getClass(), "comparator", null);
        setField(term959, term959.getClass(), "root", null);
        setIntField(term959, term959.getClass(), "size", 0);
        setIntField(term959, term959.getClass(), "modCount", 0);
        setField(term959, term959.getClass(), "entrySet", null);
        setField(term960, term960.getClass(), "m", term959);
        setField(term959, term959.getClass(), "navigableKeySet", term960);
        setField(term959, term959.getClass(), "descendingMap", null);
        setField(term959, term959.getClass(), "keySet", null);
        setField(term959, term959.getClass(), "values", null);
        setField(term958, term958.getClass(), "freqTable", term959);
        term951 = newInstance(Class.forName("java.util.TreeMap$KeyIterator"));
        Object term952 = newInstance(Class.forName("java.util.TreeMap"));
        Object term955 = newInstance(Class.forName("java.util.TreeMap$KeySet"));
        setField(term952, term952.getClass(), "comparator", null);
        setField(term952, term952.getClass(), "root", null);
        setIntField(term952, term952.getClass(), "size", 0);
        setIntField(term952, term952.getClass(), "modCount", 0);
        setField(term952, term952.getClass(), "entrySet", null);
        setField(term955, term955.getClass(), "m", term952);
        setField(term952, term952.getClass(), "navigableKeySet", term955);
        setField(term952, term952.getClass(), "descendingMap", null);
        setField(term952, term952.getClass(), "keySet", null);
        setField(term952, term952.getClass(), "values", null);
        setField(term951, term951.getClass(), "this$0", term952);
        setField(term951, term951.getClass(), "next", null);
        setField(term951, term951.getClass(), "lastReturned", null);
        setIntField(term951, term951.getClass(), "expectedModCount", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.stat.Frequency");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "valuesIterator", argTypes, term38, args);
        assertTrue(recursiveEquals(term38, term958));
        assertTrue(recursiveEquals(retValue, term951));
    }

};


