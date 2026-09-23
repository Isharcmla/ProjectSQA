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

public class Frequency_getCumPct_13495885130 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term146;
     Object term150;

    public Frequency_getCumPct_13495885130() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term146 = newInstance(Class.forName("org.apache.commons.math.stat.Frequency"));
        Object term147 = newInstance(Class.forName("java.util.TreeMap"));
        setField(term147, term147.getClass(), "comparator", null);
        setField(term147, term147.getClass(), "root", null);
        setIntField(term147, term147.getClass(), "size", 0);
        setIntField(term147, term147.getClass(), "modCount", 0);
        setField(term147, term147.getClass(), "entrySet", null);
        setField(term147, term147.getClass(), "navigableKeySet", null);
        setField(term147, term147.getClass(), "descendingMap", null);
        setField(term147, term147.getClass(), "keySet", null);
        setField(term147, term147.getClass(), "values", null);
        setField(term146, term146.getClass(), "freqTable", term147);
        term150 = new Long(5270370404989704783L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.stat.Frequency");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = long.class;
        Object[] args = new Object[1];
        args[0] = term150;
        callMethod(klass, "getCumPct", argTypes, term146, args);
    }

};


