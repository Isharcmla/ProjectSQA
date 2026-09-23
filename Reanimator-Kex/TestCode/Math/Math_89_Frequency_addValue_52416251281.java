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
import java.lang.Integer;
import java.lang.Long;

public class Frequency_addValue_52416251281 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term6761;
     Object term6849;
     Object term7128;
     Object term7133;

    public Frequency_addValue_52416251281() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term6761 = newInstance(Class.forName("org.apache.commons.math.stat.Frequency"));
        Object term6801 = newInstance(Class.forName("java.util.TreeMap"));
        setField(term6761, term6761.getClass(), "freqTable", term6801);
        term6849 = new Integer(0);
        Long term7131 = new Long(0L);
        Long term7132 = new Long(1L);
        term7128 = newInstance(Class.forName("org.apache.commons.math.stat.Frequency"));
        Object term7129 = newInstance(Class.forName("java.util.TreeMap"));
        Object term7130 = newInstance(Class.forName("java.util.TreeMap$Entry"));
        setField(term7129, term7129.getClass(), "comparator", null);
        setField(term7130, term7130.getClass(), "key", term7131);
        setField(term7130, term7130.getClass(), "value", term7132);
        setField(term7130, term7130.getClass(), "left", null);
        setField(term7130, term7130.getClass(), "right", null);
        setField(term7130, term7130.getClass(), "parent", null);
        setBooleanField(term7130, term7130.getClass(), "color", true);
        setField(term7129, term7129.getClass(), "root", term7130);
        setIntField(term7129, term7129.getClass(), "size", 1);
        setIntField(term7129, term7129.getClass(), "modCount", 1);
        setField(term7129, term7129.getClass(), "entrySet", null);
        setField(term7129, term7129.getClass(), "navigableKeySet", null);
        setField(term7129, term7129.getClass(), "descendingMap", null);
        setField(term7129, term7129.getClass(), "keySet", null);
        setField(term7129, term7129.getClass(), "values", null);
        setField(term7128, term7128.getClass(), "freqTable", term7129);
        term7133 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.stat.Frequency");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Integer");
        Object[] args = new Object[1];
        args[0] = term6849;
        callMethod(klass, "addValue", argTypes, term6761, args);
        assertTrue(recursiveEquals(term6761, term7128));
        assertTrue(recursiveEquals(term6849, term7133));
    }

};


