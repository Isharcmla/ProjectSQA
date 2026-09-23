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
import java.lang.Integer;

public class Frequency_getCount_97690420714 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term59;
     Object term63;

    public Frequency_getCount_97690420714() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term59 = newInstance(Class.forName("org.apache.commons.math.stat.Frequency"));
        Object term60 = newInstance(Class.forName("java.util.TreeMap"));
        setField(term60, term60.getClass(), "comparator", null);
        setField(term60, term60.getClass(), "root", null);
        setIntField(term60, term60.getClass(), "size", 0);
        setIntField(term60, term60.getClass(), "modCount", 0);
        setField(term60, term60.getClass(), "entrySet", null);
        setField(term60, term60.getClass(), "navigableKeySet", null);
        setField(term60, term60.getClass(), "descendingMap", null);
        setField(term60, term60.getClass(), "keySet", null);
        setField(term60, term60.getClass(), "values", null);
        setField(term59, term59.getClass(), "freqTable", term60);
        term63 = new Integer(1162663216);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.stat.Frequency");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term63;
        callMethod(klass, "getCount", argTypes, term59, args);
    }

};


