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
import java.lang.Object;
import java.lang.Long;

public class Frequency_getCount_97690519914 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term61;
     Object term65;

    public Frequency_getCount_97690519914() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term61 = newInstance(Class.forName("org.apache.commons.math.stat.Frequency"));
        Object term62 = newInstance(Class.forName("java.util.TreeMap"));
        setField(term62, term62.getClass(), "comparator", null);
        setField(term62, term62.getClass(), "root", null);
        setIntField(term62, term62.getClass(), "size", 0);
        setIntField(term62, term62.getClass(), "modCount", 0);
        setField(term62, term62.getClass(), "entrySet", null);
        setField(term62, term62.getClass(), "navigableKeySet", null);
        setField(term62, term62.getClass(), "descendingMap", null);
        setField(term62, term62.getClass(), "keySet", null);
        setField(term62, term62.getClass(), "values", null);
        setField(term61, term61.getClass(), "freqTable", term62);
        term65 = new Long(6375119433582206027L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.stat.Frequency");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = long.class;
        Object[] args = new Object[1];
        args[0] = term65;
        callMethod(klass, "getCount", argTypes, term61, args);
    }

};


