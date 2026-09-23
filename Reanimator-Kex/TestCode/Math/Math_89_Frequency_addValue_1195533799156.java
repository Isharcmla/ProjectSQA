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

public class Frequency_addValue_1195533799156 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term24572;
     Object term24660;
     Object term24677;
     Object term24682;

    public Frequency_addValue_1195533799156() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term24572 = newInstance(Class.forName("org.apache.commons.math.stat.Frequency"));
        Object term24612 = newInstance(Class.forName("java.util.TreeMap"));
        setField(term24572, term24572.getClass(), "freqTable", term24612);
        term24660 = new Integer(0);
        Long term24680 = new Long(0L);
        Long term24681 = new Long(1L);
        term24677 = newInstance(Class.forName("org.apache.commons.math.stat.Frequency"));
        Object term24678 = newInstance(Class.forName("java.util.TreeMap"));
        Object term24679 = newInstance(Class.forName("java.util.TreeMap$Entry"));
        setField(term24678, term24678.getClass(), "comparator", null);
        setField(term24679, term24679.getClass(), "key", term24680);
        setField(term24679, term24679.getClass(), "value", term24681);
        setField(term24679, term24679.getClass(), "left", null);
        setField(term24679, term24679.getClass(), "right", null);
        setField(term24679, term24679.getClass(), "parent", null);
        setBooleanField(term24679, term24679.getClass(), "color", true);
        setField(term24678, term24678.getClass(), "root", term24679);
        setIntField(term24678, term24678.getClass(), "size", 1);
        setIntField(term24678, term24678.getClass(), "modCount", 1);
        setField(term24678, term24678.getClass(), "entrySet", null);
        setField(term24678, term24678.getClass(), "navigableKeySet", null);
        setField(term24678, term24678.getClass(), "descendingMap", null);
        setField(term24678, term24678.getClass(), "keySet", null);
        setField(term24678, term24678.getClass(), "values", null);
        setField(term24677, term24677.getClass(), "freqTable", term24678);
        term24682 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.stat.Frequency");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term24660;
        callMethod(klass, "addValue", argTypes, term24572, args);
        assertTrue(recursiveEquals(term24572, term24677));
        assertTrue(recursiveEquals(term24660, term24682));
    }

};


