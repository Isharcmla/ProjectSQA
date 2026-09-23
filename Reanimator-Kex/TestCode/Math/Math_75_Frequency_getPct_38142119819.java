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
import java.lang.Integer;

public class Frequency_getPct_38142119819 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term86;
     Object term90;

    public Frequency_getPct_38142119819() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term86 = newInstance(Class.forName("org.apache.commons.math.stat.Frequency"));
        Object term87 = newInstance(Class.forName("java.util.TreeMap"));
        setField(term87, term87.getClass(), "comparator", null);
        setField(term87, term87.getClass(), "root", null);
        setIntField(term87, term87.getClass(), "size", 0);
        setIntField(term87, term87.getClass(), "modCount", 0);
        setField(term87, term87.getClass(), "entrySet", null);
        setField(term87, term87.getClass(), "navigableKeySet", null);
        setField(term87, term87.getClass(), "descendingMap", null);
        setField(term87, term87.getClass(), "keySet", null);
        setField(term87, term87.getClass(), "values", null);
        setField(term86, term86.getClass(), "freqTable", term87);
        term90 = new Integer(1484323161);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.stat.Frequency");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term90;
        callMethod(klass, "getPct", argTypes, term86, args);
    }

};


