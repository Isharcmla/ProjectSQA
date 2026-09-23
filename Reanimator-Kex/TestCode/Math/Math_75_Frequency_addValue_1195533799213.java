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

public class Frequency_addValue_1195533799213 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term42796;
     Object term42884;
     Object term42902;
     Object term42907;

    public Frequency_addValue_1195533799213() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term42796 = newInstance(Class.forName("org.apache.commons.math.stat.Frequency"));
        Object term42836 = newInstance(Class.forName("java.util.TreeMap"));
        setField(term42796, term42796.getClass(), "freqTable", term42836);
        term42884 = new Integer(0);
        Long term42905 = new Long(0L);
        Long term42906 = new Long(1L);
        term42902 = newInstance(Class.forName("org.apache.commons.math.stat.Frequency"));
        Object term42903 = newInstance(Class.forName("java.util.TreeMap"));
        Object term42904 = newInstance(Class.forName("java.util.TreeMap$Entry"));
        setField(term42903, term42903.getClass(), "comparator", null);
        setField(term42904, term42904.getClass(), "key", term42905);
        setField(term42904, term42904.getClass(), "value", term42906);
        setField(term42904, term42904.getClass(), "left", null);
        setField(term42904, term42904.getClass(), "right", null);
        setField(term42904, term42904.getClass(), "parent", null);
        setBooleanField(term42904, term42904.getClass(), "color", true);
        setField(term42903, term42903.getClass(), "root", term42904);
        setIntField(term42903, term42903.getClass(), "size", 1);
        setIntField(term42903, term42903.getClass(), "modCount", 1);
        setField(term42903, term42903.getClass(), "entrySet", null);
        setField(term42903, term42903.getClass(), "navigableKeySet", null);
        setField(term42903, term42903.getClass(), "descendingMap", null);
        setField(term42903, term42903.getClass(), "keySet", null);
        setField(term42903, term42903.getClass(), "values", null);
        setField(term42902, term42902.getClass(), "freqTable", term42903);
        term42907 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.stat.Frequency");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term42884;
        callMethod(klass, "addValue", argTypes, term42796, args);
        assertTrue(recursiveEquals(term42796, term42902));
        assertTrue(recursiveEquals(term42884, term42907));
    }

};


