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

public class Frequency_toString_132596898787 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term8117;
     Object term8199;

    public Frequency_toString_132596898787() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term8117 = newInstance(Class.forName("org.apache.commons.math.stat.Frequency"));
        Object term8157 = newInstance(Class.forName("java.util.TreeMap"));
        setField(term8117, term8117.getClass(), "freqTable", term8157);
        term8199 = newInstance(Class.forName("org.apache.commons.math.stat.Frequency"));
        Object term8200 = newInstance(Class.forName("java.util.TreeMap"));
        Object term8201 = newInstance(Class.forName("java.util.TreeMap$KeySet"));
        setField(term8200, term8200.getClass(), "comparator", null);
        setField(term8200, term8200.getClass(), "root", null);
        setIntField(term8200, term8200.getClass(), "size", 0);
        setIntField(term8200, term8200.getClass(), "modCount", 0);
        setField(term8200, term8200.getClass(), "entrySet", null);
        setField(term8201, term8201.getClass(), "m", term8200);
        setField(term8200, term8200.getClass(), "navigableKeySet", term8201);
        setField(term8200, term8200.getClass(), "descendingMap", null);
        setField(term8200, term8200.getClass(), "keySet", null);
        setField(term8200, term8200.getClass(), "values", null);
        setField(term8199, term8199.getClass(), "freqTable", term8200);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.stat.Frequency");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "toString", argTypes, term8117, args);
        assertTrue(recursiveEquals(term8117, term8199));
        assertTrue(recursiveEquals(retValue, "Value \t Freq. \t Pct. \t Cum Pct. \n"));
    }

};


