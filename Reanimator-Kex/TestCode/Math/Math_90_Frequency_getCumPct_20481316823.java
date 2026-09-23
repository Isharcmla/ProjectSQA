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

public class Frequency_getCumPct_20481316823 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term115;
     Object term119;

    public Frequency_getCumPct_20481316823() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term115 = newInstance(Class.forName("org.apache.commons.math.stat.Frequency"));
        Object term116 = newInstance(Class.forName("java.util.TreeMap"));
        setField(term116, term116.getClass(), "comparator", null);
        setField(term116, term116.getClass(), "root", null);
        setIntField(term116, term116.getClass(), "size", 0);
        setIntField(term116, term116.getClass(), "modCount", 0);
        setField(term116, term116.getClass(), "entrySet", null);
        setField(term116, term116.getClass(), "navigableKeySet", null);
        setField(term116, term116.getClass(), "descendingMap", null);
        setField(term116, term116.getClass(), "keySet", null);
        setField(term116, term116.getClass(), "values", null);
        setField(term115, term115.getClass(), "freqTable", term116);
        term119 = newInstance(Class.forName("java.lang.Object"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.stat.Frequency");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term119;
        callMethod(klass, "getCumPct", argTypes, term115, args);
    }

};


