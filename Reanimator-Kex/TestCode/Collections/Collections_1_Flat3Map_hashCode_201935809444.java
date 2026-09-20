package org.apache.commons.collections.map;

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
import static org.apache.commons.collections.map.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static org.apache.commons.collections.map.EqualityUtils.*;
import java.lang.Object;

public class Flat3Map_hashCode_201935809444 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term6055;
     Object term13648;

    public Flat3Map_hashCode_201935809444() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term6055 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term6060 = newInstance(Class.forName("java.lang.Object"));
        Object term6061 = newInstance(Class.forName("java.lang.Object"));
        Object term6062 = newInstance(Class.forName("java.lang.Object"));
        Object term6063 = newInstance(Class.forName("java.lang.Object"));
        Object term6064 = newInstance(Class.forName("java.lang.Object"));
        Object term6065 = newInstance(Class.forName("java.lang.Object"));
        Object term6066 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap"));
        setIntField(term6055, term6055.getClass(), "size", -1551355284);
        setIntField(term6055, term6055.getClass(), "hash1", -1381970335);
        setIntField(term6055, term6055.getClass(), "hash2", 1213549815);
        setIntField(term6055, term6055.getClass(), "hash3", -1518419301);
        setField(term6055, term6055.getClass(), "key1", term6060);
        setField(term6055, term6055.getClass(), "key2", term6061);
        setField(term6055, term6055.getClass(), "key3", term6062);
        setField(term6055, term6055.getClass(), "value1", term6063);
        setField(term6055, term6055.getClass(), "value2", term6064);
        setField(term6055, term6055.getClass(), "value3", term6065);
        setFloatField(term6066, term6066.getClass(), "loadFactor", 0.0F);
        setIntField(term6066, term6066.getClass(), "size", 0);
        setField(term6066, term6066.getClass(), "data", null);
        setIntField(term6066, term6066.getClass(), "threshold", 0);
        setIntField(term6066, term6066.getClass(), "modCount", 0);
        setField(term6066, term6066.getClass(), "entrySet", null);
        setField(term6066, term6066.getClass(), "keySet", null);
        setField(term6066, term6066.getClass(), "values", null);
        setField(term6066, term6066.getClass(), "keySet", null);
        setField(term6066, term6066.getClass(), "values", null);
        setField(term6055, term6055.getClass(), "delegateMap", term6066);
        term13648 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term13649 = newInstance(Class.forName("java.lang.Object"));
        Object term13650 = newInstance(Class.forName("java.lang.Object"));
        Object term13651 = newInstance(Class.forName("java.lang.Object"));
        Object term13652 = newInstance(Class.forName("java.lang.Object"));
        Object term13653 = newInstance(Class.forName("java.lang.Object"));
        Object term13654 = newInstance(Class.forName("java.lang.Object"));
        Object term13655 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap"));
        setIntField(term13648, term13648.getClass(), "size", -1551355284);
        setIntField(term13648, term13648.getClass(), "hash1", -1381970335);
        setIntField(term13648, term13648.getClass(), "hash2", 1213549815);
        setIntField(term13648, term13648.getClass(), "hash3", -1518419301);
        setField(term13648, term13648.getClass(), "key1", term13649);
        setField(term13648, term13648.getClass(), "key2", term13650);
        setField(term13648, term13648.getClass(), "key3", term13651);
        setField(term13648, term13648.getClass(), "value1", term13652);
        setField(term13648, term13648.getClass(), "value2", term13653);
        setField(term13648, term13648.getClass(), "value3", term13654);
        setFloatField(term13655, term13655.getClass(), "loadFactor", 0.0F);
        setIntField(term13655, term13655.getClass(), "size", 0);
        setField(term13655, term13655.getClass(), "data", null);
        setIntField(term13655, term13655.getClass(), "threshold", 0);
        setIntField(term13655, term13655.getClass(), "modCount", 0);
        setField(term13655, term13655.getClass(), "entrySet", null);
        setField(term13655, term13655.getClass(), "keySet", null);
        setField(term13655, term13655.getClass(), "values", null);
        setField(term13655, term13655.getClass(), "keySet", null);
        setField(term13655, term13655.getClass(), "values", null);
        setField(term13648, term13648.getClass(), "delegateMap", term13655);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.map.Flat3Map");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "hashCode", argTypes, term6055, args);
        assertTrue(recursiveEquals(term6055, term13648));
        assertTrue(recursiveEquals(retValue, 0));
    }

};
