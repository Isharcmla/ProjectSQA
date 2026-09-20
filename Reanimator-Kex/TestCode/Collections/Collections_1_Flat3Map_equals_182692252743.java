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

public class Flat3Map_equals_182692252743 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term6038;
     Object term6054;
     Object term13607;
     Object term13615;

    public Flat3Map_equals_182692252743() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term6038 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term6043 = newInstance(Class.forName("java.lang.Object"));
        Object term6044 = newInstance(Class.forName("java.lang.Object"));
        Object term6045 = newInstance(Class.forName("java.lang.Object"));
        Object term6046 = newInstance(Class.forName("java.lang.Object"));
        Object term6047 = newInstance(Class.forName("java.lang.Object"));
        Object term6048 = newInstance(Class.forName("java.lang.Object"));
        Object term6049 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap"));
        setIntField(term6038, term6038.getClass(), "size", 1973060703);
        setIntField(term6038, term6038.getClass(), "hash1", -138239905);
        setIntField(term6038, term6038.getClass(), "hash2", 1709474063);
        setIntField(term6038, term6038.getClass(), "hash3", 1406617209);
        setField(term6038, term6038.getClass(), "key1", term6043);
        setField(term6038, term6038.getClass(), "key2", term6044);
        setField(term6038, term6038.getClass(), "key3", term6045);
        setField(term6038, term6038.getClass(), "value1", term6046);
        setField(term6038, term6038.getClass(), "value2", term6047);
        setField(term6038, term6038.getClass(), "value3", term6048);
        setFloatField(term6049, term6049.getClass(), "loadFactor", 0.0F);
        setIntField(term6049, term6049.getClass(), "size", 0);
        setField(term6049, term6049.getClass(), "data", null);
        setIntField(term6049, term6049.getClass(), "threshold", 0);
        setIntField(term6049, term6049.getClass(), "modCount", 0);
        setField(term6049, term6049.getClass(), "entrySet", null);
        setField(term6049, term6049.getClass(), "keySet", null);
        setField(term6049, term6049.getClass(), "values", null);
        setField(term6049, term6049.getClass(), "keySet", null);
        setField(term6049, term6049.getClass(), "values", null);
        setField(term6038, term6038.getClass(), "delegateMap", term6049);
        term6054 = newInstance(Class.forName("java.lang.Object"));
        term13607 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term13608 = newInstance(Class.forName("java.lang.Object"));
        Object term13609 = newInstance(Class.forName("java.lang.Object"));
        Object term13610 = newInstance(Class.forName("java.lang.Object"));
        Object term13611 = newInstance(Class.forName("java.lang.Object"));
        Object term13612 = newInstance(Class.forName("java.lang.Object"));
        Object term13613 = newInstance(Class.forName("java.lang.Object"));
        Object term13614 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap"));
        setIntField(term13607, term13607.getClass(), "size", 1973060703);
        setIntField(term13607, term13607.getClass(), "hash1", -138239905);
        setIntField(term13607, term13607.getClass(), "hash2", 1709474063);
        setIntField(term13607, term13607.getClass(), "hash3", 1406617209);
        setField(term13607, term13607.getClass(), "key1", term13608);
        setField(term13607, term13607.getClass(), "key2", term13609);
        setField(term13607, term13607.getClass(), "key3", term13610);
        setField(term13607, term13607.getClass(), "value1", term13611);
        setField(term13607, term13607.getClass(), "value2", term13612);
        setField(term13607, term13607.getClass(), "value3", term13613);
        setFloatField(term13614, term13614.getClass(), "loadFactor", 0.0F);
        setIntField(term13614, term13614.getClass(), "size", 0);
        setField(term13614, term13614.getClass(), "data", null);
        setIntField(term13614, term13614.getClass(), "threshold", 0);
        setIntField(term13614, term13614.getClass(), "modCount", 0);
        setField(term13614, term13614.getClass(), "entrySet", null);
        setField(term13614, term13614.getClass(), "keySet", null);
        setField(term13614, term13614.getClass(), "values", null);
        setField(term13614, term13614.getClass(), "keySet", null);
        setField(term13614, term13614.getClass(), "values", null);
        setField(term13607, term13607.getClass(), "delegateMap", term13614);
        term13615 = newInstance(Class.forName("java.lang.Object"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.map.Flat3Map");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term6054;
        Object retValue = callMethod(klass, "equals", argTypes, term6038, args);
        assertTrue(recursiveEquals(term6038, term13607));
        assertTrue(recursiveEquals(term6054, term13615));
        assertTrue(recursiveEquals(retValue, false));
    }

};
