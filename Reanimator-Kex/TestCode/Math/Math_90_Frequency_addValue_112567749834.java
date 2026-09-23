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

public class Frequency_addValue_112567749834 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term28;
     Object term32;
     Object term940;

    public Frequency_addValue_112567749834() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term28 = newInstance(Class.forName("org.apache.commons.math.stat.Frequency"));
        Object term29 = newInstance(Class.forName("java.util.TreeMap"));
        setField(term29, term29.getClass(), "comparator", null);
        setField(term29, term29.getClass(), "root", null);
        setIntField(term29, term29.getClass(), "size", 0);
        setIntField(term29, term29.getClass(), "modCount", 0);
        setField(term29, term29.getClass(), "entrySet", null);
        setField(term29, term29.getClass(), "navigableKeySet", null);
        setField(term29, term29.getClass(), "descendingMap", null);
        setField(term29, term29.getClass(), "keySet", null);
        setField(term29, term29.getClass(), "values", null);
        setField(term28, term28.getClass(), "freqTable", term29);
        term32 = new Character('P');
        Character term943 = new Character('P');
        Long term944 = new Long(1L);
        term940 = newInstance(Class.forName("org.apache.commons.math.stat.Frequency"));
        Object term941 = newInstance(Class.forName("java.util.TreeMap"));
        Object term942 = newInstance(Class.forName("java.util.TreeMap$Entry"));
        setField(term941, term941.getClass(), "comparator", null);
        setField(term942, term942.getClass(), "key", term943);
        setField(term942, term942.getClass(), "value", term944);
        setField(term942, term942.getClass(), "left", null);
        setField(term942, term942.getClass(), "right", null);
        setField(term942, term942.getClass(), "parent", null);
        setBooleanField(term942, term942.getClass(), "color", true);
        setField(term941, term941.getClass(), "root", term942);
        setIntField(term941, term941.getClass(), "size", 1);
        setIntField(term941, term941.getClass(), "modCount", 1);
        setField(term941, term941.getClass(), "entrySet", null);
        setField(term941, term941.getClass(), "navigableKeySet", null);
        setField(term941, term941.getClass(), "descendingMap", null);
        setField(term941, term941.getClass(), "keySet", null);
        setField(term941, term941.getClass(), "values", null);
        setField(term940, term940.getClass(), "freqTable", term941);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.stat.Frequency");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = char.class;
        Object[] args = new Object[1];
        args[0] = term32;
        callMethod(klass, "addValue", argTypes, term28, args);
        assertTrue(recursiveEquals(term28, term940));
        assertTrue(recursiveEquals(term32, 'P'));
    }

};


