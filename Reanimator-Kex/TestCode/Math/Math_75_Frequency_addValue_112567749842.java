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
import java.lang.Character;
import java.lang.Long;

public class Frequency_addValue_112567749842 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term32;
     Object term36;
     Object term1207;

    public Frequency_addValue_112567749842() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term32 = newInstance(Class.forName("org.apache.commons.math.stat.Frequency"));
        Object term33 = newInstance(Class.forName("java.util.TreeMap"));
        setField(term33, term33.getClass(), "comparator", null);
        setField(term33, term33.getClass(), "root", null);
        setIntField(term33, term33.getClass(), "size", 0);
        setIntField(term33, term33.getClass(), "modCount", 0);
        setField(term33, term33.getClass(), "entrySet", null);
        setField(term33, term33.getClass(), "navigableKeySet", null);
        setField(term33, term33.getClass(), "descendingMap", null);
        setField(term33, term33.getClass(), "keySet", null);
        setField(term33, term33.getClass(), "values", null);
        setField(term32, term32.getClass(), "freqTable", term33);
        term36 = new Character('P');
        Character term1210 = new Character('P');
        Long term1211 = new Long(1L);
        term1207 = newInstance(Class.forName("org.apache.commons.math.stat.Frequency"));
        Object term1208 = newInstance(Class.forName("java.util.TreeMap"));
        Object term1209 = newInstance(Class.forName("java.util.TreeMap$Entry"));
        setField(term1208, term1208.getClass(), "comparator", null);
        setField(term1209, term1209.getClass(), "key", term1210);
        setField(term1209, term1209.getClass(), "value", term1211);
        setField(term1209, term1209.getClass(), "left", null);
        setField(term1209, term1209.getClass(), "right", null);
        setField(term1209, term1209.getClass(), "parent", null);
        setBooleanField(term1209, term1209.getClass(), "color", true);
        setField(term1208, term1208.getClass(), "root", term1209);
        setIntField(term1208, term1208.getClass(), "size", 1);
        setIntField(term1208, term1208.getClass(), "modCount", 1);
        setField(term1208, term1208.getClass(), "entrySet", null);
        setField(term1208, term1208.getClass(), "navigableKeySet", null);
        setField(term1208, term1208.getClass(), "descendingMap", null);
        setField(term1208, term1208.getClass(), "keySet", null);
        setField(term1208, term1208.getClass(), "values", null);
        setField(term1207, term1207.getClass(), "freqTable", term1208);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.stat.Frequency");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = char.class;
        Object[] args = new Object[1];
        args[0] = term36;
        callMethod(klass, "addValue", argTypes, term32, args);
        assertTrue(recursiveEquals(term32, term1207));
        assertTrue(recursiveEquals(term36, 'P'));
    }

};


