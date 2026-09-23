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
import java.lang.Integer;
import java.lang.Long;

public class Frequency_addValue_112567849033 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term14;
     Object term18;
     Object term904;

    public Frequency_addValue_112567849033() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term14 = newInstance(Class.forName("org.apache.commons.math.stat.Frequency"));
        Object term15 = newInstance(Class.forName("java.util.TreeMap"));
        setField(term15, term15.getClass(), "comparator", null);
        setField(term15, term15.getClass(), "root", null);
        setIntField(term15, term15.getClass(), "size", 0);
        setIntField(term15, term15.getClass(), "modCount", 0);
        setField(term15, term15.getClass(), "entrySet", null);
        setField(term15, term15.getClass(), "navigableKeySet", null);
        setField(term15, term15.getClass(), "descendingMap", null);
        setField(term15, term15.getClass(), "keySet", null);
        setField(term15, term15.getClass(), "values", null);
        setField(term14, term14.getClass(), "freqTable", term15);
        term18 = new Integer(568599855);
        Long term907 = new Long(568599855L);
        Long term908 = new Long(1L);
        term904 = newInstance(Class.forName("org.apache.commons.math.stat.Frequency"));
        Object term905 = newInstance(Class.forName("java.util.TreeMap"));
        Object term906 = newInstance(Class.forName("java.util.TreeMap$Entry"));
        setField(term905, term905.getClass(), "comparator", null);
        setField(term906, term906.getClass(), "key", term907);
        setField(term906, term906.getClass(), "value", term908);
        setField(term906, term906.getClass(), "left", null);
        setField(term906, term906.getClass(), "right", null);
        setField(term906, term906.getClass(), "parent", null);
        setBooleanField(term906, term906.getClass(), "color", true);
        setField(term905, term905.getClass(), "root", term906);
        setIntField(term905, term905.getClass(), "size", 1);
        setIntField(term905, term905.getClass(), "modCount", 1);
        setField(term905, term905.getClass(), "entrySet", null);
        setField(term905, term905.getClass(), "navigableKeySet", null);
        setField(term905, term905.getClass(), "descendingMap", null);
        setField(term905, term905.getClass(), "keySet", null);
        setField(term905, term905.getClass(), "values", null);
        setField(term904, term904.getClass(), "freqTable", term905);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.stat.Frequency");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term18;
        callMethod(klass, "addValue", argTypes, term14, args);
        assertTrue(recursiveEquals(term14, term904));
        assertTrue(recursiveEquals(term18, 568599855));
    }

};


