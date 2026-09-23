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

public class Frequency_getCumPct_13495686726 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term132;
     Object term136;

    public Frequency_getCumPct_13495686726() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term132 = newInstance(Class.forName("org.apache.commons.math.stat.Frequency"));
        Object term133 = newInstance(Class.forName("java.util.TreeMap"));
        setField(term133, term133.getClass(), "comparator", null);
        setField(term133, term133.getClass(), "root", null);
        setIntField(term133, term133.getClass(), "size", 0);
        setIntField(term133, term133.getClass(), "modCount", 0);
        setField(term133, term133.getClass(), "entrySet", null);
        setField(term133, term133.getClass(), "navigableKeySet", null);
        setField(term133, term133.getClass(), "descendingMap", null);
        setField(term133, term133.getClass(), "keySet", null);
        setField(term133, term133.getClass(), "values", null);
        setField(term132, term132.getClass(), "freqTable", term133);
        term136 = new Character('t');
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.stat.Frequency");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = char.class;
        Object[] args = new Object[1];
        args[0] = term136;
        callMethod(klass, "getCumPct", argTypes, term132, args);
    }

};


