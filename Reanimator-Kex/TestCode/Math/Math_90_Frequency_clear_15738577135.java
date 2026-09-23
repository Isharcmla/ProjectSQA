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
import static org.apache.commons.math.stat.EqualityUtils.*;
import java.lang.Object;

public class Frequency_clear_15738577135 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term34;
     Object term949;

    public Frequency_clear_15738577135() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term34 = newInstance(Class.forName("org.apache.commons.math.stat.Frequency"));
        Object term35 = newInstance(Class.forName("java.util.TreeMap"));
        setField(term35, term35.getClass(), "comparator", null);
        setField(term35, term35.getClass(), "root", null);
        setIntField(term35, term35.getClass(), "size", 0);
        setIntField(term35, term35.getClass(), "modCount", 0);
        setField(term35, term35.getClass(), "entrySet", null);
        setField(term35, term35.getClass(), "navigableKeySet", null);
        setField(term35, term35.getClass(), "descendingMap", null);
        setField(term35, term35.getClass(), "keySet", null);
        setField(term35, term35.getClass(), "values", null);
        setField(term34, term34.getClass(), "freqTable", term35);
        term949 = newInstance(Class.forName("org.apache.commons.math.stat.Frequency"));
        Object term950 = newInstance(Class.forName("java.util.TreeMap"));
        setField(term950, term950.getClass(), "comparator", null);
        setField(term950, term950.getClass(), "root", null);
        setIntField(term950, term950.getClass(), "size", 0);
        setIntField(term950, term950.getClass(), "modCount", 1);
        setField(term950, term950.getClass(), "entrySet", null);
        setField(term950, term950.getClass(), "navigableKeySet", null);
        setField(term950, term950.getClass(), "descendingMap", null);
        setField(term950, term950.getClass(), "keySet", null);
        setField(term950, term950.getClass(), "values", null);
        setField(term949, term949.getClass(), "freqTable", term950);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.stat.Frequency");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "clear", argTypes, term34, args);
        assertTrue(recursiveEquals(term34, term949));
    }

};


