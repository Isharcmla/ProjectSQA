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

public class Frequency_addValue_1195533799189 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term38025;
     Object term38113;
     Object term38131;
     Object term38136;

    public Frequency_addValue_1195533799189() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term38025 = newInstance(Class.forName("org.apache.commons.math.stat.Frequency"));
        Object term38065 = newInstance(Class.forName("java.util.TreeMap"));
        setField(term38025, term38025.getClass(), "freqTable", term38065);
        term38113 = new Integer(0);
        Long term38134 = new Long(0L);
        Long term38135 = new Long(1L);
        term38131 = newInstance(Class.forName("org.apache.commons.math.stat.Frequency"));
        Object term38132 = newInstance(Class.forName("java.util.TreeMap"));
        Object term38133 = newInstance(Class.forName("java.util.TreeMap$Entry"));
        setField(term38132, term38132.getClass(), "comparator", null);
        setField(term38133, term38133.getClass(), "key", term38134);
        setField(term38133, term38133.getClass(), "value", term38135);
        setField(term38133, term38133.getClass(), "left", null);
        setField(term38133, term38133.getClass(), "right", null);
        setField(term38133, term38133.getClass(), "parent", null);
        setBooleanField(term38133, term38133.getClass(), "color", true);
        setField(term38132, term38132.getClass(), "root", term38133);
        setIntField(term38132, term38132.getClass(), "size", 1);
        setIntField(term38132, term38132.getClass(), "modCount", 1);
        setField(term38132, term38132.getClass(), "entrySet", null);
        setField(term38132, term38132.getClass(), "navigableKeySet", null);
        setField(term38132, term38132.getClass(), "descendingMap", null);
        setField(term38132, term38132.getClass(), "keySet", null);
        setField(term38132, term38132.getClass(), "values", null);
        setField(term38131, term38131.getClass(), "freqTable", term38132);
        term38136 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.stat.Frequency");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term38113;
        callMethod(klass, "addValue", argTypes, term38025, args);
        assertTrue(recursiveEquals(term38025, term38131));
        assertTrue(recursiveEquals(term38113, term38136));
    }

};


