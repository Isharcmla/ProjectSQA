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

public class Frequency_addValue_1135742380134 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term19975;
     Object term20063;
     Object term20078;
     Object term20083;

    public Frequency_addValue_1135742380134() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term19975 = newInstance(Class.forName("org.apache.commons.math.stat.Frequency"));
        Object term20015 = newInstance(Class.forName("java.util.TreeMap"));
        setField(term19975, term19975.getClass(), "freqTable", term20015);
        term20063 = new Integer(0);
        Long term20081 = new Long(0L);
        Long term20082 = new Long(1L);
        term20078 = newInstance(Class.forName("org.apache.commons.math.stat.Frequency"));
        Object term20079 = newInstance(Class.forName("java.util.TreeMap"));
        Object term20080 = newInstance(Class.forName("java.util.TreeMap$Entry"));
        setField(term20079, term20079.getClass(), "comparator", null);
        setField(term20080, term20080.getClass(), "key", term20081);
        setField(term20080, term20080.getClass(), "value", term20082);
        setField(term20080, term20080.getClass(), "left", null);
        setField(term20080, term20080.getClass(), "right", null);
        setField(term20080, term20080.getClass(), "parent", null);
        setBooleanField(term20080, term20080.getClass(), "color", true);
        setField(term20079, term20079.getClass(), "root", term20080);
        setIntField(term20079, term20079.getClass(), "size", 1);
        setIntField(term20079, term20079.getClass(), "modCount", 1);
        setField(term20079, term20079.getClass(), "entrySet", null);
        setField(term20079, term20079.getClass(), "navigableKeySet", null);
        setField(term20079, term20079.getClass(), "descendingMap", null);
        setField(term20079, term20079.getClass(), "keySet", null);
        setField(term20079, term20079.getClass(), "values", null);
        setField(term20078, term20078.getClass(), "freqTable", term20079);
        term20083 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.stat.Frequency");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Comparable");
        Object[] args = new Object[1];
        args[0] = term20063;
        callMethod(klass, "addValue", argTypes, term19975, args);
        assertTrue(recursiveEquals(term19975, term20078));
        assertTrue(recursiveEquals(term20063, term20083));
    }

};


