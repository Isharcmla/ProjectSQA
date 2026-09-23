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

public class Frequency_addValue_1125677498103 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term10781;
     Object term11228;

    public Frequency_addValue_1125677498103() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term10781 = newInstance(Class.forName("org.apache.commons.math.stat.Frequency"));
        Object term10821 = newInstance(Class.forName("java.util.TreeMap"));
        setField(term10781, term10781.getClass(), "freqTable", term10821);
        Character term11231 = new Character((char) 0);
        Long term11232 = new Long(1L);
        term11228 = newInstance(Class.forName("org.apache.commons.math.stat.Frequency"));
        Object term11229 = newInstance(Class.forName("java.util.TreeMap"));
        Object term11230 = newInstance(Class.forName("java.util.TreeMap$Entry"));
        setField(term11229, term11229.getClass(), "comparator", null);
        setField(term11230, term11230.getClass(), "key", term11231);
        setField(term11230, term11230.getClass(), "value", term11232);
        setField(term11230, term11230.getClass(), "left", null);
        setField(term11230, term11230.getClass(), "right", null);
        setField(term11230, term11230.getClass(), "parent", null);
        setBooleanField(term11230, term11230.getClass(), "color", true);
        setField(term11229, term11229.getClass(), "root", term11230);
        setIntField(term11229, term11229.getClass(), "size", 1);
        setIntField(term11229, term11229.getClass(), "modCount", 1);
        setField(term11229, term11229.getClass(), "entrySet", null);
        setField(term11229, term11229.getClass(), "navigableKeySet", null);
        setField(term11229, term11229.getClass(), "descendingMap", null);
        setField(term11229, term11229.getClass(), "keySet", null);
        setField(term11229, term11229.getClass(), "values", null);
        setField(term11228, term11228.getClass(), "freqTable", term11229);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.stat.Frequency");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = char.class;
        Object[] args = new Object[1];
        args[0] = (char) 0;
        callMethod(klass, "addValue", argTypes, term10781, args);
        assertTrue(recursiveEquals(term10781, term11228));
    }

};


