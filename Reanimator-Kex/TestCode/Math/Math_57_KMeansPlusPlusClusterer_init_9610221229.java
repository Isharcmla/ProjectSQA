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

public class KMeansPlusPlusClusterer_init_9610221229 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1;
     Object term637;
     Object term643;

    public KMeansPlusPlusClusterer_init_9610221229() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1 = newInstance(Class.forName("java.util.Random"));
        Object term2 = newInstance(Class.forName("java.util.concurrent.atomic.AtomicLong"));
        setLongField(term2, term2.getClass(), "value", 251047909175109L);
        setField(term1, term1.getClass(), "seed", term2);
        setDoubleField(term1, term1.getClass(), "nextNextGaussian", 0.13238746331190498);
        setBooleanField(term1, term1.getClass(), "haveNextNextGaussian", false);
        Class<? extends Object> term646 = Class.forName((String) "org.apache.commons.math.stat.clustering.KMeansPlusPlusClusterer$EmptyClusterStrategy");
        Field term645 = ((Class) term646).getDeclaredField((String) "LARGEST_VARIANCE");
        ((Field) term645).setAccessible(true);
        Object enum1 = ((Field) term645).get((Object) null);
        term637 = newInstance(Class.forName("org.apache.commons.math.stat.clustering.KMeansPlusPlusClusterer"));
        Object term638 = newInstance(Class.forName("java.util.Random"));
        Object term639 = newInstance(Class.forName("java.util.concurrent.atomic.AtomicLong"));
        setLongField(term639, term639.getClass(), "value", 251047909175109L);
        setField(term638, term638.getClass(), "seed", term639);
        setDoubleField(term638, term638.getClass(), "nextNextGaussian", 0.13238746331190498);
        setBooleanField(term638, term638.getClass(), "haveNextNextGaussian", false);
        setField(term637, term637.getClass(), "random", term638);
        setField(term637, term637.getClass(), "emptyStrategy", enum1);
        term643 = newInstance(Class.forName("java.util.Random"));
        Object term644 = newInstance(Class.forName("java.util.concurrent.atomic.AtomicLong"));
        setLongField(term644, term644.getClass(), "value", 251047909175109L);
        setField(term643, term643.getClass(), "seed", term644);
        setDoubleField(term643, term643.getClass(), "nextNextGaussian", 0.13238746331190498);
        setBooleanField(term643, term643.getClass(), "haveNextNextGaussian", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.stat.clustering.KMeansPlusPlusClusterer");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.Random");
        Object[] args = new Object[1];
        args[0] = term1;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term637));
        assertTrue(recursiveEquals(term1, term643));
    }

};


