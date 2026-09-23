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

public class Frequency_getCumPct_13495885125 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term126;
     Object term130;

    public Frequency_getCumPct_13495885125() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term126 = newInstance(Class.forName("org.apache.commons.math.stat.Frequency"));
        Object term127 = newInstance(Class.forName("java.util.TreeMap"));
        setField(term127, term127.getClass(), "comparator", null);
        setField(term127, term127.getClass(), "root", null);
        setIntField(term127, term127.getClass(), "size", 0);
        setIntField(term127, term127.getClass(), "modCount", 0);
        setField(term127, term127.getClass(), "entrySet", null);
        setField(term127, term127.getClass(), "navigableKeySet", null);
        setField(term127, term127.getClass(), "descendingMap", null);
        setField(term127, term127.getClass(), "keySet", null);
        setField(term127, term127.getClass(), "values", null);
        setField(term126, term126.getClass(), "freqTable", term127);
        term130 = new Long(5270370404989704783L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.stat.Frequency");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = long.class;
        Object[] args = new Object[1];
        args[0] = term130;
        callMethod(klass, "getCumPct", argTypes, term126, args);
    }

};


