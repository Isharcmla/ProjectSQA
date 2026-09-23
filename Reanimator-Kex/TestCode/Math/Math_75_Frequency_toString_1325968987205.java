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

public class Frequency_toString_1325968987205 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term41158;
     Object term41240;

    public Frequency_toString_1325968987205() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term41158 = newInstance(Class.forName("org.apache.commons.math.stat.Frequency"));
        Object term41198 = newInstance(Class.forName("java.util.TreeMap"));
        setField(term41158, term41158.getClass(), "freqTable", term41198);
        term41240 = newInstance(Class.forName("org.apache.commons.math.stat.Frequency"));
        Object term41241 = newInstance(Class.forName("java.util.TreeMap"));
        Object term41242 = newInstance(Class.forName("java.util.TreeMap$KeySet"));
        setField(term41241, term41241.getClass(), "comparator", null);
        setField(term41241, term41241.getClass(), "root", null);
        setIntField(term41241, term41241.getClass(), "size", 0);
        setIntField(term41241, term41241.getClass(), "modCount", 0);
        setField(term41241, term41241.getClass(), "entrySet", null);
        setField(term41242, term41242.getClass(), "m", term41241);
        setField(term41241, term41241.getClass(), "navigableKeySet", term41242);
        setField(term41241, term41241.getClass(), "descendingMap", null);
        setField(term41241, term41241.getClass(), "keySet", null);
        setField(term41241, term41241.getClass(), "values", null);
        setField(term41240, term41240.getClass(), "freqTable", term41241);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.stat.Frequency");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "toString", argTypes, term41158, args);
        assertTrue(recursiveEquals(term41158, term41240));
        assertTrue(recursiveEquals(retValue, "Value \t Freq. \t Pct. \t Cum Pct. \n"));
    }

};


