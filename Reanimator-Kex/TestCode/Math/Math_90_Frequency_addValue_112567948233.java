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
import java.lang.Long;

public class Frequency_addValue_112567948233 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term22;
     Object term26;
     Object term920;

    public Frequency_addValue_112567948233() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term22 = newInstance(Class.forName("org.apache.commons.math.stat.Frequency"));
        Object term23 = newInstance(Class.forName("java.util.TreeMap"));
        setField(term23, term23.getClass(), "comparator", null);
        setField(term23, term23.getClass(), "root", null);
        setIntField(term23, term23.getClass(), "size", 0);
        setIntField(term23, term23.getClass(), "modCount", 0);
        setField(term23, term23.getClass(), "entrySet", null);
        setField(term23, term23.getClass(), "navigableKeySet", null);
        setField(term23, term23.getClass(), "descendingMap", null);
        setField(term23, term23.getClass(), "keySet", null);
        setField(term23, term23.getClass(), "values", null);
        setField(term22, term22.getClass(), "freqTable", term23);
        term26 = new Long(2442117782898005296L);
        Long term923 = new Long(2442117782898005296L);
        Long term924 = new Long(1L);
        term920 = newInstance(Class.forName("org.apache.commons.math.stat.Frequency"));
        Object term921 = newInstance(Class.forName("java.util.TreeMap"));
        Object term922 = newInstance(Class.forName("java.util.TreeMap$Entry"));
        setField(term921, term921.getClass(), "comparator", null);
        setField(term922, term922.getClass(), "key", term923);
        setField(term922, term922.getClass(), "value", term924);
        setField(term922, term922.getClass(), "left", null);
        setField(term922, term922.getClass(), "right", null);
        setField(term922, term922.getClass(), "parent", null);
        setBooleanField(term922, term922.getClass(), "color", true);
        setField(term921, term921.getClass(), "root", term922);
        setIntField(term921, term921.getClass(), "size", 1);
        setIntField(term921, term921.getClass(), "modCount", 1);
        setField(term921, term921.getClass(), "entrySet", null);
        setField(term921, term921.getClass(), "navigableKeySet", null);
        setField(term921, term921.getClass(), "descendingMap", null);
        setField(term921, term921.getClass(), "keySet", null);
        setField(term921, term921.getClass(), "values", null);
        setField(term920, term920.getClass(), "freqTable", term921);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.stat.Frequency");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = long.class;
        Object[] args = new Object[1];
        args[0] = term26;
        callMethod(klass, "addValue", argTypes, term22, args);
        assertTrue(recursiveEquals(term22, term920));
        assertTrue(recursiveEquals(term26, 2442117782898005296L));
    }

};


