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

public class Frequency_getCount_97690519915 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term65;
     Object term69;

    public Frequency_getCount_97690519915() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term65 = newInstance(Class.forName("org.apache.commons.math.stat.Frequency"));
        Object term66 = newInstance(Class.forName("java.util.TreeMap"));
        setField(term66, term66.getClass(), "comparator", null);
        setField(term66, term66.getClass(), "root", null);
        setIntField(term66, term66.getClass(), "size", 0);
        setIntField(term66, term66.getClass(), "modCount", 0);
        setField(term66, term66.getClass(), "entrySet", null);
        setField(term66, term66.getClass(), "navigableKeySet", null);
        setField(term66, term66.getClass(), "descendingMap", null);
        setField(term66, term66.getClass(), "keySet", null);
        setField(term66, term66.getClass(), "values", null);
        setField(term65, term65.getClass(), "freqTable", term66);
        term69 = new Long(6375119433582206027L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.stat.Frequency");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = long.class;
        Object[] args = new Object[1];
        args[0] = term69;
        callMethod(klass, "getCount", argTypes, term65, args);
    }

};


