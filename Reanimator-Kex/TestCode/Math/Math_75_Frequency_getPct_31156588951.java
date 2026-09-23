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
import java.lang.ClassCastException;
import static org.apache.commons.math.stat.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class Frequency_getPct_31156588951 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term77;
     Object term81;

    public Frequency_getPct_31156588951() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term77 = newInstance(Class.forName("org.apache.commons.math.stat.Frequency"));
        Object term78 = newInstance(Class.forName("java.util.TreeMap"));
        setField(term78, term78.getClass(), "comparator", null);
        setField(term78, term78.getClass(), "root", null);
        setIntField(term78, term78.getClass(), "size", 0);
        setIntField(term78, term78.getClass(), "modCount", 0);
        setField(term78, term78.getClass(), "entrySet", null);
        setField(term78, term78.getClass(), "navigableKeySet", null);
        setField(term78, term78.getClass(), "descendingMap", null);
        setField(term78, term78.getClass(), "keySet", null);
        setField(term78, term78.getClass(), "values", null);
        setField(term77, term77.getClass(), "freqTable", term78);
        term81 = newInstance(Class.forName("java.lang.Object"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.stat.Frequency");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term81;
        try {
            callMethod(klass, "getPct", argTypes, term77, args);
            assertTrue(false);
        }
        catch (ClassCastException e) {
        }

    }

};


