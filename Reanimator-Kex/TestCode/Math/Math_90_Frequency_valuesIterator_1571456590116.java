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

public class Frequency_valuesIterator_1571456590116 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term15326;
     Object term15374;
     Object term15367;

    public Frequency_valuesIterator_1571456590116() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term15326 = newInstance(Class.forName("org.apache.commons.math.stat.Frequency"));
        Object term15366 = newInstance(Class.forName("java.util.TreeMap"));
        setField(term15326, term15326.getClass(), "freqTable", term15366);
        term15374 = newInstance(Class.forName("org.apache.commons.math.stat.Frequency"));
        Object term15375 = newInstance(Class.forName("java.util.TreeMap"));
        Object term15376 = newInstance(Class.forName("java.util.TreeMap$KeySet"));
        setField(term15375, term15375.getClass(), "comparator", null);
        setField(term15375, term15375.getClass(), "root", null);
        setIntField(term15375, term15375.getClass(), "size", 0);
        setIntField(term15375, term15375.getClass(), "modCount", 0);
        setField(term15375, term15375.getClass(), "entrySet", null);
        setField(term15376, term15376.getClass(), "m", term15375);
        setField(term15375, term15375.getClass(), "navigableKeySet", term15376);
        setField(term15375, term15375.getClass(), "descendingMap", null);
        setField(term15375, term15375.getClass(), "keySet", null);
        setField(term15375, term15375.getClass(), "values", null);
        setField(term15374, term15374.getClass(), "freqTable", term15375);
        term15367 = newInstance(Class.forName("java.util.TreeMap$KeyIterator"));
        Object term15368 = newInstance(Class.forName("java.util.TreeMap"));
        Object term15371 = newInstance(Class.forName("java.util.TreeMap$KeySet"));
        setField(term15368, term15368.getClass(), "comparator", null);
        setField(term15368, term15368.getClass(), "root", null);
        setIntField(term15368, term15368.getClass(), "size", 0);
        setIntField(term15368, term15368.getClass(), "modCount", 0);
        setField(term15368, term15368.getClass(), "entrySet", null);
        setField(term15371, term15371.getClass(), "m", term15368);
        setField(term15368, term15368.getClass(), "navigableKeySet", term15371);
        setField(term15368, term15368.getClass(), "descendingMap", null);
        setField(term15368, term15368.getClass(), "keySet", null);
        setField(term15368, term15368.getClass(), "values", null);
        setField(term15367, term15367.getClass(), "this$0", term15368);
        setField(term15367, term15367.getClass(), "next", null);
        setField(term15367, term15367.getClass(), "lastReturned", null);
        setIntField(term15367, term15367.getClass(), "expectedModCount", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.stat.Frequency");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "valuesIterator", argTypes, term15326, args);
        assertTrue(recursiveEquals(term15326, term15374));
        assertTrue(recursiveEquals(retValue, term15367));
    }

};


