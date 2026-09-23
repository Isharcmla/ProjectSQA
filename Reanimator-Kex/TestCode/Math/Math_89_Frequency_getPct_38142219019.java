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

public class Frequency_getPct_38142219019 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term90;
     Object term94;

    public Frequency_getPct_38142219019() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term90 = newInstance(Class.forName("org.apache.commons.math.stat.Frequency"));
        Object term91 = newInstance(Class.forName("java.util.TreeMap"));
        setField(term91, term91.getClass(), "comparator", null);
        setField(term91, term91.getClass(), "root", null);
        setIntField(term91, term91.getClass(), "size", 0);
        setIntField(term91, term91.getClass(), "modCount", 0);
        setField(term91, term91.getClass(), "entrySet", null);
        setField(term91, term91.getClass(), "navigableKeySet", null);
        setField(term91, term91.getClass(), "descendingMap", null);
        setField(term91, term91.getClass(), "keySet", null);
        setField(term91, term91.getClass(), "values", null);
        setField(term90, term90.getClass(), "freqTable", term91);
        term94 = new Character('E');
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.stat.Frequency");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = char.class;
        Object[] args = new Object[1];
        args[0] = term94;
        callMethod(klass, "getPct", argTypes, term90, args);
    }

};


