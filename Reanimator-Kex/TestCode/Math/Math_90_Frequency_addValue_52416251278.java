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

public class Frequency_addValue_52416251278 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term6744;
     Object term6832;
     Object term6998;
     Object term7003;

    public Frequency_addValue_52416251278() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term6744 = newInstance(Class.forName("org.apache.commons.math.stat.Frequency"));
        Object term6784 = newInstance(Class.forName("java.util.TreeMap"));
        setField(term6744, term6744.getClass(), "freqTable", term6784);
        term6832 = new Integer(0);
        Long term7001 = new Long(0L);
        Long term7002 = new Long(1L);
        term6998 = newInstance(Class.forName("org.apache.commons.math.stat.Frequency"));
        Object term6999 = newInstance(Class.forName("java.util.TreeMap"));
        Object term7000 = newInstance(Class.forName("java.util.TreeMap$Entry"));
        setField(term6999, term6999.getClass(), "comparator", null);
        setField(term7000, term7000.getClass(), "key", term7001);
        setField(term7000, term7000.getClass(), "value", term7002);
        setField(term7000, term7000.getClass(), "left", null);
        setField(term7000, term7000.getClass(), "right", null);
        setField(term7000, term7000.getClass(), "parent", null);
        setBooleanField(term7000, term7000.getClass(), "color", true);
        setField(term6999, term6999.getClass(), "root", term7000);
        setIntField(term6999, term6999.getClass(), "size", 1);
        setIntField(term6999, term6999.getClass(), "modCount", 1);
        setField(term6999, term6999.getClass(), "entrySet", null);
        setField(term6999, term6999.getClass(), "navigableKeySet", null);
        setField(term6999, term6999.getClass(), "descendingMap", null);
        setField(term6999, term6999.getClass(), "keySet", null);
        setField(term6999, term6999.getClass(), "values", null);
        setField(term6998, term6998.getClass(), "freqTable", term6999);
        term7003 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.stat.Frequency");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Integer");
        Object[] args = new Object[1];
        args[0] = term6832;
        callMethod(klass, "addValue", argTypes, term6744, args);
        assertTrue(recursiveEquals(term6744, term6998));
        assertTrue(recursiveEquals(term6832, term7003));
    }

};


