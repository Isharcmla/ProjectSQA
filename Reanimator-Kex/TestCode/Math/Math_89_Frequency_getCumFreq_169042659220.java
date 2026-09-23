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

public class Frequency_getCumFreq_169042659220 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term96;
     Object term100;

    public Frequency_getCumFreq_169042659220() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term96 = newInstance(Class.forName("org.apache.commons.math.stat.Frequency"));
        Object term97 = newInstance(Class.forName("java.util.TreeMap"));
        setField(term97, term97.getClass(), "comparator", null);
        setField(term97, term97.getClass(), "root", null);
        setIntField(term97, term97.getClass(), "size", 0);
        setIntField(term97, term97.getClass(), "modCount", 0);
        setField(term97, term97.getClass(), "entrySet", null);
        setField(term97, term97.getClass(), "navigableKeySet", null);
        setField(term97, term97.getClass(), "descendingMap", null);
        setField(term97, term97.getClass(), "keySet", null);
        setField(term97, term97.getClass(), "values", null);
        setField(term96, term96.getClass(), "freqTable", term97);
        term100 = newInstance(Class.forName("java.lang.Object"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.stat.Frequency");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term100;
        callMethod(klass, "getCumFreq", argTypes, term96, args);
    }

};


