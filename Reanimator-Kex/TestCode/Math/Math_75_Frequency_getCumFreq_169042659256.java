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
import java.lang.ClassCastException;
import static org.apache.commons.math.stat.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class Frequency_getCumFreq_169042659256 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term104;
     Object term108;

    public Frequency_getCumFreq_169042659256() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term104 = newInstance(Class.forName("org.apache.commons.math.stat.Frequency"));
        Object term105 = newInstance(Class.forName("java.util.TreeMap"));
        setField(term105, term105.getClass(), "comparator", null);
        setField(term105, term105.getClass(), "root", null);
        setIntField(term105, term105.getClass(), "size", 0);
        setIntField(term105, term105.getClass(), "modCount", 0);
        setField(term105, term105.getClass(), "entrySet", null);
        setField(term105, term105.getClass(), "navigableKeySet", null);
        setField(term105, term105.getClass(), "descendingMap", null);
        setField(term105, term105.getClass(), "keySet", null);
        setField(term105, term105.getClass(), "values", null);
        setField(term104, term104.getClass(), "freqTable", term105);
        term108 = newInstance(Class.forName("java.lang.Object"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.stat.Frequency");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term108;
        try {
            callMethod(klass, "getCumFreq", argTypes, term104, args);
            assertTrue(false);
        }
        catch (ClassCastException e) {
        }

    }

};


