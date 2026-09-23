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

public class Frequency_addValue_112567948241 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term26;
     Object term30;
     Object term1187;

    public Frequency_addValue_112567948241() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term26 = newInstance(Class.forName("org.apache.commons.math.stat.Frequency"));
        Object term27 = newInstance(Class.forName("java.util.TreeMap"));
        setField(term27, term27.getClass(), "comparator", null);
        setField(term27, term27.getClass(), "root", null);
        setIntField(term27, term27.getClass(), "size", 0);
        setIntField(term27, term27.getClass(), "modCount", 0);
        setField(term27, term27.getClass(), "entrySet", null);
        setField(term27, term27.getClass(), "navigableKeySet", null);
        setField(term27, term27.getClass(), "descendingMap", null);
        setField(term27, term27.getClass(), "keySet", null);
        setField(term27, term27.getClass(), "values", null);
        setField(term26, term26.getClass(), "freqTable", term27);
        term30 = new Long(2442117782898005296L);
        Long term1190 = new Long(2442117782898005296L);
        Long term1191 = new Long(1L);
        term1187 = newInstance(Class.forName("org.apache.commons.math.stat.Frequency"));
        Object term1188 = newInstance(Class.forName("java.util.TreeMap"));
        Object term1189 = newInstance(Class.forName("java.util.TreeMap$Entry"));
        setField(term1188, term1188.getClass(), "comparator", null);
        setField(term1189, term1189.getClass(), "key", term1190);
        setField(term1189, term1189.getClass(), "value", term1191);
        setField(term1189, term1189.getClass(), "left", null);
        setField(term1189, term1189.getClass(), "right", null);
        setField(term1189, term1189.getClass(), "parent", null);
        setBooleanField(term1189, term1189.getClass(), "color", true);
        setField(term1188, term1188.getClass(), "root", term1189);
        setIntField(term1188, term1188.getClass(), "size", 1);
        setIntField(term1188, term1188.getClass(), "modCount", 1);
        setField(term1188, term1188.getClass(), "entrySet", null);
        setField(term1188, term1188.getClass(), "navigableKeySet", null);
        setField(term1188, term1188.getClass(), "descendingMap", null);
        setField(term1188, term1188.getClass(), "keySet", null);
        setField(term1188, term1188.getClass(), "values", null);
        setField(term1187, term1187.getClass(), "freqTable", term1188);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.stat.Frequency");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = long.class;
        Object[] args = new Object[1];
        args[0] = term30;
        callMethod(klass, "addValue", argTypes, term26, args);
        assertTrue(recursiveEquals(term26, term1187));
        assertTrue(recursiveEquals(term30, 2442117782898005296L));
    }

};


