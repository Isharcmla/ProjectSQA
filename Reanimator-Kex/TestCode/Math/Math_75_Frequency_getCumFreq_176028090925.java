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

public class Frequency_getCumFreq_176028090925 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term119;
     Object term123;

    public Frequency_getCumFreq_176028090925() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term119 = newInstance(Class.forName("org.apache.commons.math.stat.Frequency"));
        Object term120 = newInstance(Class.forName("java.util.TreeMap"));
        setField(term120, term120.getClass(), "comparator", null);
        setField(term120, term120.getClass(), "root", null);
        setIntField(term120, term120.getClass(), "size", 0);
        setIntField(term120, term120.getClass(), "modCount", 0);
        setField(term120, term120.getClass(), "entrySet", null);
        setField(term120, term120.getClass(), "navigableKeySet", null);
        setField(term120, term120.getClass(), "descendingMap", null);
        setField(term120, term120.getClass(), "keySet", null);
        setField(term120, term120.getClass(), "values", null);
        setField(term119, term119.getClass(), "freqTable", term120);
        term123 = new Long(-8400487765614892086L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.stat.Frequency");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = long.class;
        Object[] args = new Object[1];
        args[0] = term123;
        callMethod(klass, "getCumFreq", argTypes, term119, args);
    }

};


