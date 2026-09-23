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
import java.lang.Long;

public class Frequency_addValue_112567948286 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term8034;
     Object term8364;

    public Frequency_addValue_112567948286() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term8034 = newInstance(Class.forName("org.apache.commons.math.stat.Frequency"));
        Object term8074 = newInstance(Class.forName("java.util.TreeMap"));
        setField(term8034, term8034.getClass(), "freqTable", term8074);
        Long term8367 = new Long(0L);
        Long term8368 = new Long(1L);
        term8364 = newInstance(Class.forName("org.apache.commons.math.stat.Frequency"));
        Object term8365 = newInstance(Class.forName("java.util.TreeMap"));
        Object term8366 = newInstance(Class.forName("java.util.TreeMap$Entry"));
        setField(term8365, term8365.getClass(), "comparator", null);
        setField(term8366, term8366.getClass(), "key", term8367);
        setField(term8366, term8366.getClass(), "value", term8368);
        setField(term8366, term8366.getClass(), "left", null);
        setField(term8366, term8366.getClass(), "right", null);
        setField(term8366, term8366.getClass(), "parent", null);
        setBooleanField(term8366, term8366.getClass(), "color", true);
        setField(term8365, term8365.getClass(), "root", term8366);
        setIntField(term8365, term8365.getClass(), "size", 1);
        setIntField(term8365, term8365.getClass(), "modCount", 1);
        setField(term8365, term8365.getClass(), "entrySet", null);
        setField(term8365, term8365.getClass(), "navigableKeySet", null);
        setField(term8365, term8365.getClass(), "descendingMap", null);
        setField(term8365, term8365.getClass(), "keySet", null);
        setField(term8365, term8365.getClass(), "values", null);
        setField(term8364, term8364.getClass(), "freqTable", term8365);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.stat.Frequency");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = long.class;
        Object[] args = new Object[1];
        args[0] = 0L;
        callMethod(klass, "addValue", argTypes, term8034, args);
        assertTrue(recursiveEquals(term8034, term8364));
    }

};


