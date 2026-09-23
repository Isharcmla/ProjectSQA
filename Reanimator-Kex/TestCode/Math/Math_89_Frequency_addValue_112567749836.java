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

public class Frequency_addValue_112567749836 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term32;
     Object term36;
     Object term966;

    public Frequency_addValue_112567749836() {
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
        Character term969 = new Character('P');
        Long term970 = new Long(1L);
        term966 = newInstance(Class.forName("org.apache.commons.math.stat.Frequency"));
        Object term967 = newInstance(Class.forName("java.util.TreeMap"));
        Object term968 = newInstance(Class.forName("java.util.TreeMap$Entry"));
        setField(term967, term967.getClass(), "comparator", null);
        setField(term968, term968.getClass(), "key", term969);
        setField(term968, term968.getClass(), "value", term970);
        setField(term968, term968.getClass(), "left", null);
        setField(term968, term968.getClass(), "right", null);
        setField(term968, term968.getClass(), "parent", null);
        setBooleanField(term968, term968.getClass(), "color", true);
        setField(term967, term967.getClass(), "root", term968);
        setIntField(term967, term967.getClass(), "size", 1);
        setIntField(term967, term967.getClass(), "modCount", 1);
        setField(term967, term967.getClass(), "entrySet", null);
        setField(term967, term967.getClass(), "navigableKeySet", null);
        setField(term967, term967.getClass(), "descendingMap", null);
        setField(term967, term967.getClass(), "keySet", null);
        setField(term967, term967.getClass(), "values", null);
        setField(term966, term966.getClass(), "freqTable", term967);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.stat.Frequency");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = char.class;
        Object[] args = new Object[1];
        args[0] = term36;
        callMethod(klass, "addValue", argTypes, term32, args);
        assertTrue(recursiveEquals(term32, term966));
        assertTrue(recursiveEquals(term36, 'P'));
    }

};


