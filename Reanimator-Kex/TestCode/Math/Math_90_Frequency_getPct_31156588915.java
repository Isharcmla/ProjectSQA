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

public class Frequency_getPct_31156588915 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term69;
     Object term73;

    public Frequency_getPct_31156588915() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term69 = newInstance(Class.forName("org.apache.commons.math.stat.Frequency"));
        Object term70 = newInstance(Class.forName("java.util.TreeMap"));
        setField(term70, term70.getClass(), "comparator", null);
        setField(term70, term70.getClass(), "root", null);
        setIntField(term70, term70.getClass(), "size", 0);
        setIntField(term70, term70.getClass(), "modCount", 0);
        setField(term70, term70.getClass(), "entrySet", null);
        setField(term70, term70.getClass(), "navigableKeySet", null);
        setField(term70, term70.getClass(), "descendingMap", null);
        setField(term70, term70.getClass(), "keySet", null);
        setField(term70, term70.getClass(), "values", null);
        setField(term69, term69.getClass(), "freqTable", term70);
        term73 = newInstance(Class.forName("java.lang.Object"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.stat.Frequency");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term73;
        callMethod(klass, "getPct", argTypes, term69, args);
    }

};


