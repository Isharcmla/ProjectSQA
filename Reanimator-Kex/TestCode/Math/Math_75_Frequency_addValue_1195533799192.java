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

public class Frequency_addValue_1195533799192 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term38400;
     Object term38492;
     Object term38815;
     Object term38820;

    public Frequency_addValue_1195533799192() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term38400 = newInstance(Class.forName("org.apache.commons.math.stat.Frequency"));
        Object term38440 = newInstance(Class.forName("java.util.TreeMap"));
        setField(term38400, term38400.getClass(), "freqTable", term38440);
        term38492 = newInstance(Class.forName("java.nio.HeapCharBuffer"));
        Long term38819 = new Long(1L);
        term38815 = newInstance(Class.forName("org.apache.commons.math.stat.Frequency"));
        Object term38816 = newInstance(Class.forName("java.util.TreeMap"));
        Object term38817 = newInstance(Class.forName("java.util.TreeMap$Entry"));
        Object term38818 = newInstance(Class.forName("java.nio.HeapCharBuffer"));
        setField(term38816, term38816.getClass(), "comparator", null);
        setField(term38818, term38818.getClass(), "hb", null);
        setIntField(term38818, term38818.getClass(), "offset", 0);
        setBooleanField(term38818, term38818.getClass(), "isReadOnly", false);
        setIntField(term38818, term38818.getClass(), "mark", 0);
        setIntField(term38818, term38818.getClass(), "position", 0);
        setIntField(term38818, term38818.getClass(), "limit", 0);
        setIntField(term38818, term38818.getClass(), "capacity", 0);
        setLongField(term38818, term38818.getClass(), "address", 0L);
        setField(term38817, term38817.getClass(), "key", term38818);
        setField(term38817, term38817.getClass(), "value", term38819);
        setField(term38817, term38817.getClass(), "left", null);
        setField(term38817, term38817.getClass(), "right", null);
        setField(term38817, term38817.getClass(), "parent", null);
        setBooleanField(term38817, term38817.getClass(), "color", true);
        setField(term38816, term38816.getClass(), "root", term38817);
        setIntField(term38816, term38816.getClass(), "size", 1);
        setIntField(term38816, term38816.getClass(), "modCount", 1);
        setField(term38816, term38816.getClass(), "entrySet", null);
        setField(term38816, term38816.getClass(), "navigableKeySet", null);
        setField(term38816, term38816.getClass(), "descendingMap", null);
        setField(term38816, term38816.getClass(), "keySet", null);
        setField(term38816, term38816.getClass(), "values", null);
        setField(term38815, term38815.getClass(), "freqTable", term38816);
        term38820 = newInstance(Class.forName("java.nio.HeapCharBuffer"));
        setField(term38820, term38820.getClass(), "hb", null);
        setIntField(term38820, term38820.getClass(), "offset", 0);
        setBooleanField(term38820, term38820.getClass(), "isReadOnly", false);
        setIntField(term38820, term38820.getClass(), "mark", 0);
        setIntField(term38820, term38820.getClass(), "position", 0);
        setIntField(term38820, term38820.getClass(), "limit", 0);
        setIntField(term38820, term38820.getClass(), "capacity", 0);
        setLongField(term38820, term38820.getClass(), "address", 0L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.stat.Frequency");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term38492;
        callMethod(klass, "addValue", argTypes, term38400, args);
        assertTrue(recursiveEquals(term38400, term38815));
        assertTrue(recursiveEquals(term38492, term38820));
    }

};


