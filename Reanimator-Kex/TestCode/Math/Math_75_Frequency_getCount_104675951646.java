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

public class Frequency_getCount_104675951646 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term50;
     Object term54;

    public Frequency_getCount_104675951646() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term50 = newInstance(Class.forName("org.apache.commons.math.stat.Frequency"));
        Object term51 = newInstance(Class.forName("java.util.TreeMap"));
        setField(term51, term51.getClass(), "comparator", null);
        setField(term51, term51.getClass(), "root", null);
        setIntField(term51, term51.getClass(), "size", 0);
        setIntField(term51, term51.getClass(), "modCount", 0);
        setField(term51, term51.getClass(), "entrySet", null);
        setField(term51, term51.getClass(), "navigableKeySet", null);
        setField(term51, term51.getClass(), "descendingMap", null);
        setField(term51, term51.getClass(), "keySet", null);
        setField(term51, term51.getClass(), "values", null);
        setField(term50, term50.getClass(), "freqTable", term51);
        term54 = newInstance(Class.forName("java.lang.Object"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.stat.Frequency");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term54;
        try {
            callMethod(klass, "getCount", argTypes, term50, args);
            assertTrue(false);
        }
        catch (ClassCastException e) {
        }

    }

};


