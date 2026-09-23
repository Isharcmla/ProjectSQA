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

public class Frequency_addValue_112567849039 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term14;
     Object term18;
     Object term1145;

    public Frequency_addValue_112567849039() {
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
        Long term1148 = new Long(568599855L);
        Long term1149 = new Long(1L);
        term1145 = newInstance(Class.forName("org.apache.commons.math.stat.Frequency"));
        Object term1146 = newInstance(Class.forName("java.util.TreeMap"));
        Object term1147 = newInstance(Class.forName("java.util.TreeMap$Entry"));
        setField(term1146, term1146.getClass(), "comparator", null);
        setField(term1147, term1147.getClass(), "key", term1148);
        setField(term1147, term1147.getClass(), "value", term1149);
        setField(term1147, term1147.getClass(), "left", null);
        setField(term1147, term1147.getClass(), "right", null);
        setField(term1147, term1147.getClass(), "parent", null);
        setBooleanField(term1147, term1147.getClass(), "color", true);
        setField(term1146, term1146.getClass(), "root", term1147);
        setIntField(term1146, term1146.getClass(), "size", 1);
        setIntField(term1146, term1146.getClass(), "modCount", 1);
        setField(term1146, term1146.getClass(), "entrySet", null);
        setField(term1146, term1146.getClass(), "navigableKeySet", null);
        setField(term1146, term1146.getClass(), "descendingMap", null);
        setField(term1146, term1146.getClass(), "keySet", null);
        setField(term1146, term1146.getClass(), "values", null);
        setField(term1145, term1145.getClass(), "freqTable", term1146);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.stat.Frequency");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term18;
        callMethod(klass, "addValue", argTypes, term14, args);
        assertTrue(recursiveEquals(term14, term1145));
        assertTrue(recursiveEquals(term18, 568599855));
    }

};


