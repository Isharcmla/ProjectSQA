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
import java.lang.Long;

public class Frequency_addValue_112567849091 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term9353;
     Object term9409;

    public Frequency_addValue_112567849091() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term9353 = newInstance(Class.forName("org.apache.commons.math.stat.Frequency"));
        Object term9393 = newInstance(Class.forName("java.util.TreeMap"));
        setField(term9353, term9353.getClass(), "freqTable", term9393);
        Long term9412 = new Long(0L);
        Long term9413 = new Long(1L);
        term9409 = newInstance(Class.forName("org.apache.commons.math.stat.Frequency"));
        Object term9410 = newInstance(Class.forName("java.util.TreeMap"));
        Object term9411 = newInstance(Class.forName("java.util.TreeMap$Entry"));
        setField(term9410, term9410.getClass(), "comparator", null);
        setField(term9411, term9411.getClass(), "key", term9412);
        setField(term9411, term9411.getClass(), "value", term9413);
        setField(term9411, term9411.getClass(), "left", null);
        setField(term9411, term9411.getClass(), "right", null);
        setField(term9411, term9411.getClass(), "parent", null);
        setBooleanField(term9411, term9411.getClass(), "color", true);
        setField(term9410, term9410.getClass(), "root", term9411);
        setIntField(term9410, term9410.getClass(), "size", 1);
        setIntField(term9410, term9410.getClass(), "modCount", 1);
        setField(term9410, term9410.getClass(), "entrySet", null);
        setField(term9410, term9410.getClass(), "navigableKeySet", null);
        setField(term9410, term9410.getClass(), "descendingMap", null);
        setField(term9410, term9410.getClass(), "keySet", null);
        setField(term9410, term9410.getClass(), "values", null);
        setField(term9409, term9409.getClass(), "freqTable", term9410);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.stat.Frequency");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = 0;
        callMethod(klass, "addValue", argTypes, term9353, args);
        assertTrue(recursiveEquals(term9353, term9409));
    }

};


