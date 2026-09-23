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

public class Frequency_addValue_112567749896 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term9816;
     Object term10228;

    public Frequency_addValue_112567749896() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term9816 = newInstance(Class.forName("org.apache.commons.math.stat.Frequency"));
        Object term9856 = newInstance(Class.forName("java.util.TreeMap"));
        setField(term9816, term9816.getClass(), "freqTable", term9856);
        Character term10231 = new Character((char) 0);
        Long term10232 = new Long(1L);
        term10228 = newInstance(Class.forName("org.apache.commons.math.stat.Frequency"));
        Object term10229 = newInstance(Class.forName("java.util.TreeMap"));
        Object term10230 = newInstance(Class.forName("java.util.TreeMap$Entry"));
        setField(term10229, term10229.getClass(), "comparator", null);
        setField(term10230, term10230.getClass(), "key", term10231);
        setField(term10230, term10230.getClass(), "value", term10232);
        setField(term10230, term10230.getClass(), "left", null);
        setField(term10230, term10230.getClass(), "right", null);
        setField(term10230, term10230.getClass(), "parent", null);
        setBooleanField(term10230, term10230.getClass(), "color", true);
        setField(term10229, term10229.getClass(), "root", term10230);
        setIntField(term10229, term10229.getClass(), "size", 1);
        setIntField(term10229, term10229.getClass(), "modCount", 1);
        setField(term10229, term10229.getClass(), "entrySet", null);
        setField(term10229, term10229.getClass(), "navigableKeySet", null);
        setField(term10229, term10229.getClass(), "descendingMap", null);
        setField(term10229, term10229.getClass(), "keySet", null);
        setField(term10229, term10229.getClass(), "values", null);
        setField(term10228, term10228.getClass(), "freqTable", term10229);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.stat.Frequency");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = char.class;
        Object[] args = new Object[1];
        args[0] = (char) 0;
        callMethod(klass, "addValue", argTypes, term9816, args);
        assertTrue(recursiveEquals(term9816, term10228));
    }

};


