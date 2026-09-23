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

public class Frequency_getPct_31156588916 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term73;
     Object term77;

    public Frequency_getPct_31156588916() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term73 = newInstance(Class.forName("org.apache.commons.math.stat.Frequency"));
        Object term74 = newInstance(Class.forName("java.util.TreeMap"));
        setField(term74, term74.getClass(), "comparator", null);
        setField(term74, term74.getClass(), "root", null);
        setIntField(term74, term74.getClass(), "size", 0);
        setIntField(term74, term74.getClass(), "modCount", 0);
        setField(term74, term74.getClass(), "entrySet", null);
        setField(term74, term74.getClass(), "navigableKeySet", null);
        setField(term74, term74.getClass(), "descendingMap", null);
        setField(term74, term74.getClass(), "keySet", null);
        setField(term74, term74.getClass(), "values", null);
        setField(term73, term73.getClass(), "freqTable", term74);
        term77 = newInstance(Class.forName("java.lang.Object"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.stat.Frequency");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term77;
        callMethod(klass, "getPct", argTypes, term73, args);
    }

};


