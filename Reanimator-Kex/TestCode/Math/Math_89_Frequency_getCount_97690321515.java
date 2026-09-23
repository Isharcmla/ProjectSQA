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
import java.lang.Object;
import java.lang.Character;

public class Frequency_getCount_97690321515 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term67;
     Object term71;

    public Frequency_getCount_97690321515() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term67 = newInstance(Class.forName("org.apache.commons.math.stat.Frequency"));
        Object term68 = newInstance(Class.forName("java.util.TreeMap"));
        setField(term68, term68.getClass(), "comparator", null);
        setField(term68, term68.getClass(), "root", null);
        setIntField(term68, term68.getClass(), "size", 0);
        setIntField(term68, term68.getClass(), "modCount", 0);
        setField(term68, term68.getClass(), "entrySet", null);
        setField(term68, term68.getClass(), "navigableKeySet", null);
        setField(term68, term68.getClass(), "descendingMap", null);
        setField(term68, term68.getClass(), "keySet", null);
        setField(term68, term68.getClass(), "values", null);
        setField(term67, term67.getClass(), "freqTable", term68);
        term71 = new Character('A');
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.stat.Frequency");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = char.class;
        Object[] args = new Object[1];
        args[0] = term71;
        callMethod(klass, "getCount", argTypes, term67, args);
    }

};


