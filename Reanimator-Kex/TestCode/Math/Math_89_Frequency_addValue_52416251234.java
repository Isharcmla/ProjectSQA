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
import java.lang.Integer;
import java.lang.Long;

public class Frequency_addValue_52416251234 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term20;
     Object term24;
     Object term925;
     Object term930;

    public Frequency_addValue_52416251234() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term20 = newInstance(Class.forName("org.apache.commons.math.stat.Frequency"));
        Object term21 = newInstance(Class.forName("java.util.TreeMap"));
        setField(term21, term21.getClass(), "comparator", null);
        setField(term21, term21.getClass(), "root", null);
        setIntField(term21, term21.getClass(), "size", 0);
        setIntField(term21, term21.getClass(), "modCount", 0);
        setField(term21, term21.getClass(), "entrySet", null);
        setField(term21, term21.getClass(), "navigableKeySet", null);
        setField(term21, term21.getClass(), "descendingMap", null);
        setField(term21, term21.getClass(), "keySet", null);
        setField(term21, term21.getClass(), "values", null);
        setField(term20, term20.getClass(), "freqTable", term21);
        term24 = new Integer(568599855);
        Long term928 = new Long(568599855L);
        Long term929 = new Long(1L);
        term925 = newInstance(Class.forName("org.apache.commons.math.stat.Frequency"));
        Object term926 = newInstance(Class.forName("java.util.TreeMap"));
        Object term927 = newInstance(Class.forName("java.util.TreeMap$Entry"));
        setField(term926, term926.getClass(), "comparator", null);
        setField(term927, term927.getClass(), "key", term928);
        setField(term927, term927.getClass(), "value", term929);
        setField(term927, term927.getClass(), "left", null);
        setField(term927, term927.getClass(), "right", null);
        setField(term927, term927.getClass(), "parent", null);
        setBooleanField(term927, term927.getClass(), "color", true);
        setField(term926, term926.getClass(), "root", term927);
        setIntField(term926, term926.getClass(), "size", 1);
        setIntField(term926, term926.getClass(), "modCount", 1);
        setField(term926, term926.getClass(), "entrySet", null);
        setField(term926, term926.getClass(), "navigableKeySet", null);
        setField(term926, term926.getClass(), "descendingMap", null);
        setField(term926, term926.getClass(), "keySet", null);
        setField(term926, term926.getClass(), "values", null);
        setField(term925, term925.getClass(), "freqTable", term926);
        term930 = new Integer(568599855);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.stat.Frequency");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Integer");
        Object[] args = new Object[1];
        args[0] = term24;
        callMethod(klass, "addValue", argTypes, term20, args);
        assertTrue(recursiveEquals(term20, term925));
        assertTrue(recursiveEquals(term24, term930));
    }

};


