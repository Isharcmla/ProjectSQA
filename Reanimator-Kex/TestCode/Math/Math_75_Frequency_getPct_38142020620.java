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
import java.lang.Long;

public class Frequency_getPct_38142020620 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term92;
     Object term96;

    public Frequency_getPct_38142020620() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term92 = newInstance(Class.forName("org.apache.commons.math.stat.Frequency"));
        Object term93 = newInstance(Class.forName("java.util.TreeMap"));
        setField(term93, term93.getClass(), "comparator", null);
        setField(term93, term93.getClass(), "root", null);
        setIntField(term93, term93.getClass(), "size", 0);
        setIntField(term93, term93.getClass(), "modCount", 0);
        setField(term93, term93.getClass(), "entrySet", null);
        setField(term93, term93.getClass(), "navigableKeySet", null);
        setField(term93, term93.getClass(), "descendingMap", null);
        setField(term93, term93.getClass(), "keySet", null);
        setField(term93, term93.getClass(), "values", null);
        setField(term92, term92.getClass(), "freqTable", term93);
        term96 = new Long(-8257434502486459194L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.stat.Frequency");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = long.class;
        Object[] args = new Object[1];
        args[0] = term96;
        callMethod(klass, "getPct", argTypes, term92, args);
    }

};


