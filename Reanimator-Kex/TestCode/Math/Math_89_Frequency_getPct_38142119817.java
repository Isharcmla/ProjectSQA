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

public class Frequency_getPct_38142119817 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term78;
     Object term82;

    public Frequency_getPct_38142119817() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term78 = newInstance(Class.forName("org.apache.commons.math.stat.Frequency"));
        Object term79 = newInstance(Class.forName("java.util.TreeMap"));
        setField(term79, term79.getClass(), "comparator", null);
        setField(term79, term79.getClass(), "root", null);
        setIntField(term79, term79.getClass(), "size", 0);
        setIntField(term79, term79.getClass(), "modCount", 0);
        setField(term79, term79.getClass(), "entrySet", null);
        setField(term79, term79.getClass(), "navigableKeySet", null);
        setField(term79, term79.getClass(), "descendingMap", null);
        setField(term79, term79.getClass(), "keySet", null);
        setField(term79, term79.getClass(), "values", null);
        setField(term78, term78.getClass(), "freqTable", term79);
        term82 = new Integer(1484323161);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.stat.Frequency");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term82;
        callMethod(klass, "getPct", argTypes, term78, args);
    }

};


