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

public class Frequency_addValue_112567849031 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term10;
     Object term14;
     Object term878;

    public Frequency_addValue_112567849031() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term10 = newInstance(Class.forName("org.apache.commons.math.stat.Frequency"));
        Object term11 = newInstance(Class.forName("java.util.TreeMap"));
        setField(term11, term11.getClass(), "comparator", null);
        setField(term11, term11.getClass(), "root", null);
        setIntField(term11, term11.getClass(), "size", 0);
        setIntField(term11, term11.getClass(), "modCount", 0);
        setField(term11, term11.getClass(), "entrySet", null);
        setField(term11, term11.getClass(), "navigableKeySet", null);
        setField(term11, term11.getClass(), "descendingMap", null);
        setField(term11, term11.getClass(), "keySet", null);
        setField(term11, term11.getClass(), "values", null);
        setField(term10, term10.getClass(), "freqTable", term11);
        term14 = new Integer(568599855);
        Long term881 = new Long(568599855L);
        Long term882 = new Long(1L);
        term878 = newInstance(Class.forName("org.apache.commons.math.stat.Frequency"));
        Object term879 = newInstance(Class.forName("java.util.TreeMap"));
        Object term880 = newInstance(Class.forName("java.util.TreeMap$Entry"));
        setField(term879, term879.getClass(), "comparator", null);
        setField(term880, term880.getClass(), "key", term881);
        setField(term880, term880.getClass(), "value", term882);
        setField(term880, term880.getClass(), "left", null);
        setField(term880, term880.getClass(), "right", null);
        setField(term880, term880.getClass(), "parent", null);
        setBooleanField(term880, term880.getClass(), "color", true);
        setField(term879, term879.getClass(), "root", term880);
        setIntField(term879, term879.getClass(), "size", 1);
        setIntField(term879, term879.getClass(), "modCount", 1);
        setField(term879, term879.getClass(), "entrySet", null);
        setField(term879, term879.getClass(), "navigableKeySet", null);
        setField(term879, term879.getClass(), "descendingMap", null);
        setField(term879, term879.getClass(), "keySet", null);
        setField(term879, term879.getClass(), "values", null);
        setField(term878, term878.getClass(), "freqTable", term879);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.stat.Frequency");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term14;
        callMethod(klass, "addValue", argTypes, term10, args);
        assertTrue(recursiveEquals(term10, term878));
        assertTrue(recursiveEquals(term14, 568599855));
    }

};


