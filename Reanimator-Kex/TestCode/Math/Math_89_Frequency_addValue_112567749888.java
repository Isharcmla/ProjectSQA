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

public class Frequency_addValue_112567749888 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term8439;
     Object term8511;

    public Frequency_addValue_112567749888() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term8439 = newInstance(Class.forName("org.apache.commons.math.stat.Frequency"));
        Object term8479 = newInstance(Class.forName("java.util.TreeMap"));
        setField(term8439, term8439.getClass(), "freqTable", term8479);
        Character term8514 = new Character((char) 0);
        Long term8515 = new Long(1L);
        term8511 = newInstance(Class.forName("org.apache.commons.math.stat.Frequency"));
        Object term8512 = newInstance(Class.forName("java.util.TreeMap"));
        Object term8513 = newInstance(Class.forName("java.util.TreeMap$Entry"));
        setField(term8512, term8512.getClass(), "comparator", null);
        setField(term8513, term8513.getClass(), "key", term8514);
        setField(term8513, term8513.getClass(), "value", term8515);
        setField(term8513, term8513.getClass(), "left", null);
        setField(term8513, term8513.getClass(), "right", null);
        setField(term8513, term8513.getClass(), "parent", null);
        setBooleanField(term8513, term8513.getClass(), "color", true);
        setField(term8512, term8512.getClass(), "root", term8513);
        setIntField(term8512, term8512.getClass(), "size", 1);
        setIntField(term8512, term8512.getClass(), "modCount", 1);
        setField(term8512, term8512.getClass(), "entrySet", null);
        setField(term8512, term8512.getClass(), "navigableKeySet", null);
        setField(term8512, term8512.getClass(), "descendingMap", null);
        setField(term8512, term8512.getClass(), "keySet", null);
        setField(term8512, term8512.getClass(), "values", null);
        setField(term8511, term8511.getClass(), "freqTable", term8512);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.stat.Frequency");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = char.class;
        Object[] args = new Object[1];
        args[0] = (char) 0;
        callMethod(klass, "addValue", argTypes, term8439, args);
        assertTrue(recursiveEquals(term8439, term8511));
    }

};


