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

public class Frequency_addValue_1195533799154 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term24194;
     Object term24282;
     Object term24299;
     Object term24304;

    public Frequency_addValue_1195533799154() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term24194 = newInstance(Class.forName("org.apache.commons.math.stat.Frequency"));
        Object term24234 = newInstance(Class.forName("java.util.TreeMap"));
        setField(term24194, term24194.getClass(), "freqTable", term24234);
        term24282 = new Integer(0);
        Long term24302 = new Long(0L);
        Long term24303 = new Long(1L);
        term24299 = newInstance(Class.forName("org.apache.commons.math.stat.Frequency"));
        Object term24300 = newInstance(Class.forName("java.util.TreeMap"));
        Object term24301 = newInstance(Class.forName("java.util.TreeMap$Entry"));
        setField(term24300, term24300.getClass(), "comparator", null);
        setField(term24301, term24301.getClass(), "key", term24302);
        setField(term24301, term24301.getClass(), "value", term24303);
        setField(term24301, term24301.getClass(), "left", null);
        setField(term24301, term24301.getClass(), "right", null);
        setField(term24301, term24301.getClass(), "parent", null);
        setBooleanField(term24301, term24301.getClass(), "color", true);
        setField(term24300, term24300.getClass(), "root", term24301);
        setIntField(term24300, term24300.getClass(), "size", 1);
        setIntField(term24300, term24300.getClass(), "modCount", 1);
        setField(term24300, term24300.getClass(), "entrySet", null);
        setField(term24300, term24300.getClass(), "navigableKeySet", null);
        setField(term24300, term24300.getClass(), "descendingMap", null);
        setField(term24300, term24300.getClass(), "keySet", null);
        setField(term24300, term24300.getClass(), "values", null);
        setField(term24299, term24299.getClass(), "freqTable", term24300);
        term24304 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.stat.Frequency");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term24282;
        callMethod(klass, "addValue", argTypes, term24194, args);
        assertTrue(recursiveEquals(term24194, term24299));
        assertTrue(recursiveEquals(term24282, term24304));
    }

};


