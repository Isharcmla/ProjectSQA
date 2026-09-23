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

public class Frequency_addValue_1135742380201 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term39826;
     Object term39914;
     Object term40178;
     Object term40183;

    public Frequency_addValue_1135742380201() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term39826 = newInstance(Class.forName("org.apache.commons.math.stat.Frequency"));
        Object term39866 = newInstance(Class.forName("java.util.TreeMap"));
        setField(term39826, term39826.getClass(), "freqTable", term39866);
        term39914 = new Integer(0);
        Long term40181 = new Long(0L);
        Long term40182 = new Long(1L);
        term40178 = newInstance(Class.forName("org.apache.commons.math.stat.Frequency"));
        Object term40179 = newInstance(Class.forName("java.util.TreeMap"));
        Object term40180 = newInstance(Class.forName("java.util.TreeMap$Entry"));
        setField(term40179, term40179.getClass(), "comparator", null);
        setField(term40180, term40180.getClass(), "key", term40181);
        setField(term40180, term40180.getClass(), "value", term40182);
        setField(term40180, term40180.getClass(), "left", null);
        setField(term40180, term40180.getClass(), "right", null);
        setField(term40180, term40180.getClass(), "parent", null);
        setBooleanField(term40180, term40180.getClass(), "color", true);
        setField(term40179, term40179.getClass(), "root", term40180);
        setIntField(term40179, term40179.getClass(), "size", 1);
        setIntField(term40179, term40179.getClass(), "modCount", 1);
        setField(term40179, term40179.getClass(), "entrySet", null);
        setField(term40179, term40179.getClass(), "navigableKeySet", null);
        setField(term40179, term40179.getClass(), "descendingMap", null);
        setField(term40179, term40179.getClass(), "keySet", null);
        setField(term40179, term40179.getClass(), "values", null);
        setField(term40178, term40178.getClass(), "freqTable", term40179);
        term40183 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.stat.Frequency");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Comparable");
        Object[] args = new Object[1];
        args[0] = term39914;
        callMethod(klass, "addValue", argTypes, term39826, args);
        assertTrue(recursiveEquals(term39826, term40178));
        assertTrue(recursiveEquals(term39914, term40183));
    }

};


