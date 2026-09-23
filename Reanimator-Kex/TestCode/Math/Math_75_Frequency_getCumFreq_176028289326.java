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

public class Frequency_getCumFreq_176028289326 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term125;
     Object term129;

    public Frequency_getCumFreq_176028289326() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term125 = newInstance(Class.forName("org.apache.commons.math.stat.Frequency"));
        Object term126 = newInstance(Class.forName("java.util.TreeMap"));
        setField(term126, term126.getClass(), "comparator", null);
        setField(term126, term126.getClass(), "root", null);
        setIntField(term126, term126.getClass(), "size", 0);
        setIntField(term126, term126.getClass(), "modCount", 0);
        setField(term126, term126.getClass(), "entrySet", null);
        setField(term126, term126.getClass(), "navigableKeySet", null);
        setField(term126, term126.getClass(), "descendingMap", null);
        setField(term126, term126.getClass(), "keySet", null);
        setField(term126, term126.getClass(), "values", null);
        setField(term125, term125.getClass(), "freqTable", term126);
        term129 = new Character('B');
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.stat.Frequency");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = char.class;
        Object[] args = new Object[1];
        args[0] = term129;
        callMethod(klass, "getCumFreq", argTypes, term125, args);
    }

};


