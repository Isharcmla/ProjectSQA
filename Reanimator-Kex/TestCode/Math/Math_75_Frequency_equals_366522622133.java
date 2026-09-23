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

public class Frequency_equals_366522622133 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term16246;
     Object term16328;
     Object term16643;
     Object term16644;

    public Frequency_equals_366522622133() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term16246 = newInstance(Class.forName("org.apache.commons.math.stat.Frequency"));
        setField(term16246, term16246.getClass(), "freqTable", null);
        term16328 = newInstance(Class.forName("org.apache.commons.math.stat.Frequency"));
        Object term16368 = newInstance(Class.forName("java.util.TreeMap"));
        setField(term16328, term16328.getClass(), "freqTable", term16368);
        term16643 = newInstance(Class.forName("org.apache.commons.math.stat.Frequency"));
        setField(term16643, term16643.getClass(), "freqTable", null);
        term16644 = newInstance(Class.forName("org.apache.commons.math.stat.Frequency"));
        Object term16645 = newInstance(Class.forName("java.util.TreeMap"));
        setField(term16645, term16645.getClass(), "comparator", null);
        setField(term16645, term16645.getClass(), "root", null);
        setIntField(term16645, term16645.getClass(), "size", 0);
        setIntField(term16645, term16645.getClass(), "modCount", 0);
        setField(term16645, term16645.getClass(), "entrySet", null);
        setField(term16645, term16645.getClass(), "navigableKeySet", null);
        setField(term16645, term16645.getClass(), "descendingMap", null);
        setField(term16645, term16645.getClass(), "keySet", null);
        setField(term16645, term16645.getClass(), "values", null);
        setField(term16644, term16644.getClass(), "freqTable", term16645);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.stat.Frequency");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term16328;
        Object retValue = callMethod(klass, "equals", argTypes, term16246, args);
        assertTrue(recursiveEquals(term16246, term16643));
        assertTrue(recursiveEquals(term16328, term16644));
        assertTrue(recursiveEquals(retValue, false));
    }

};


