package org.apache.commons.math.stat.clustering;

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
import static org.apache.commons.math.stat.clustering.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static org.apache.commons.math.stat.clustering.EqualityUtils.*;
import java.lang.Object;
import java.lang.String;

public class KMeansPlusPlusClusterer_init_195179155610 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term6;
     Object enum2;
     Object term1146;
     Object term1152;
     Object enum4;

    public KMeansPlusPlusClusterer_init_195179155610() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term6 = newInstance(Class.forName("java.util.Random"));
        Object term7 = newInstance(Class.forName("java.util.concurrent.atomic.AtomicLong"));
        setLongField(term7, term7.getClass(), "value", 219360334695599L);
        setField(term6, term6.getClass(), "seed", term7);
        setDoubleField(term6, term6.getClass(), "nextNextGaussian", 0.3455959125047594);
        setBooleanField(term6, term6.getClass(), "haveNextNextGaussian", false);
        Class<? extends Object> term1158 = Class.forName((String) "org.apache.commons.math.stat.clustering.KMeansPlusPlusClusterer$EmptyClusterStrategy");
        Field term1157 = ((Class) term1158).getDeclaredField((String) "LARGEST_VARIANCE");
        ((Field) term1157).setAccessible(true);
        enum2 = ((Field) term1157).get((Object) null);
        Class<? extends Object> term1633 = Class.forName((String) "org.apache.commons.math.stat.clustering.KMeansPlusPlusClusterer$EmptyClusterStrategy");
        Field term1632 = ((Class) term1633).getDeclaredField((String) "LARGEST_VARIANCE");
        ((Field) term1632).setAccessible(true);
        Object enum3 = ((Field) term1632).get((Object) null);
        term1146 = newInstance(Class.forName("org.apache.commons.math.stat.clustering.KMeansPlusPlusClusterer"));
        Object term1147 = newInstance(Class.forName("java.util.Random"));
        Object term1148 = newInstance(Class.forName("java.util.concurrent.atomic.AtomicLong"));
        setLongField(term1148, term1148.getClass(), "value", 219360334695599L);
        setField(term1147, term1147.getClass(), "seed", term1148);
        setDoubleField(term1147, term1147.getClass(), "nextNextGaussian", 0.3455959125047594);
        setBooleanField(term1147, term1147.getClass(), "haveNextNextGaussian", false);
        setField(term1146, term1146.getClass(), "random", term1147);
        setField(term1146, term1146.getClass(), "emptyStrategy", enum3);
        term1152 = newInstance(Class.forName("java.util.Random"));
        Object term1153 = newInstance(Class.forName("java.util.concurrent.atomic.AtomicLong"));
        setLongField(term1153, term1153.getClass(), "value", 219360334695599L);
        setField(term1152, term1152.getClass(), "seed", term1153);
        setDoubleField(term1152, term1152.getClass(), "nextNextGaussian", 0.3455959125047594);
        setBooleanField(term1152, term1152.getClass(), "haveNextNextGaussian", false);
        Class<? extends Object> term2108 = Class.forName((String) "org.apache.commons.math.stat.clustering.KMeansPlusPlusClusterer$EmptyClusterStrategy");
        Field term2107 = ((Class) term2108).getDeclaredField((String) "LARGEST_VARIANCE");
        ((Field) term2107).setAccessible(true);
        enum4 = ((Field) term2107).get((Object) null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.stat.clustering.KMeansPlusPlusClusterer");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.util.Random");
        argTypes[1] = Class.forName("org.apache.commons.math.stat.clustering.KMeansPlusPlusClusterer$EmptyClusterStrategy");
        Object[] args = new Object[2];
        args[0] = term6;
        args[1] = enum2;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term1146));
        assertTrue(recursiveEquals(term6, term1152));
        assertTrue(recursiveEquals(enum2, enum4));
    }

};


