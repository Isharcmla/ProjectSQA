package org.apache.commons.math3.stat.inference;

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
import static org.apache.commons.math3.stat.inference.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static org.apache.commons.math3.stat.inference.EqualityUtils.*;
import java.lang.String;
import java.lang.Object;

public class MannWhitneyUTest_init_7992906388 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object enum14;
     Object enum15;
     Object term4239;
     Object enum18;
     Object enum19;

    public MannWhitneyUTest_init_7992906388() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term4255 = Class.forName((String) "org.apache.commons.math3.stat.ranking.NaNStrategy");
        Field term4254 = ((Class) term4255).getDeclaredField((String) "MINIMAL");
        ((Field) term4254).setAccessible(true);
        enum14 = ((Field) term4254).get((Object) null);
        Class<? extends Object> term4528 = Class.forName((String) "org.apache.commons.math3.stat.ranking.TiesStrategy");
        Field term4527 = ((Class) term4528).getDeclaredField((String) "MAXIMUM");
        ((Field) term4527).setAccessible(true);
        enum15 = ((Field) term4527).get((Object) null);
        Class<? extends Object> term4806 = Class.forName((String) "org.apache.commons.math3.stat.ranking.NaNStrategy");
        Field term4805 = ((Class) term4806).getDeclaredField((String) "MINIMAL");
        ((Field) term4805).setAccessible(true);
        Object enum16 = ((Field) term4805).get((Object) null);
        Class<? extends Object> term5079 = Class.forName((String) "org.apache.commons.math3.stat.ranking.TiesStrategy");
        Field term5078 = ((Class) term5079).getDeclaredField((String) "MAXIMUM");
        ((Field) term5078).setAccessible(true);
        Object enum17 = ((Field) term5078).get((Object) null);
        term4239 = newInstance(Class.forName("org.apache.commons.math3.stat.inference.MannWhitneyUTest"));
        Object term4240 = newInstance(Class.forName("org.apache.commons.math3.stat.ranking.NaturalRanking"));
        Object term4247 = newInstance(Class.forName("org.apache.commons.math3.random.RandomDataImpl"));
        setField(term4240, term4240.getClass(), "nanStrategy", enum16);
        setField(term4240, term4240.getClass(), "tiesStrategy", enum17);
        setField(term4247, term4247.getClass(), "rand", null);
        setField(term4247, term4247.getClass(), "secRand", null);
        setField(term4240, term4240.getClass(), "randomData", term4247);
        setField(term4239, term4239.getClass(), "naturalRanking", term4240);
        Class<? extends Object> term5357 = Class.forName((String) "org.apache.commons.math3.stat.ranking.NaNStrategy");
        Field term5356 = ((Class) term5357).getDeclaredField((String) "MINIMAL");
        ((Field) term5356).setAccessible(true);
        enum18 = ((Field) term5356).get((Object) null);
        Class<? extends Object> term5630 = Class.forName((String) "org.apache.commons.math3.stat.ranking.TiesStrategy");
        Field term5629 = ((Class) term5630).getDeclaredField((String) "MAXIMUM");
        ((Field) term5629).setAccessible(true);
        enum19 = ((Field) term5629).get((Object) null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math3.stat.inference.MannWhitneyUTest");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("org.apache.commons.math3.stat.ranking.NaNStrategy");
        argTypes[1] = Class.forName("org.apache.commons.math3.stat.ranking.TiesStrategy");
        Object[] args = new Object[2];
        args[0] = enum14;
        args[1] = enum15;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term4239));
        assertTrue(recursiveEquals(enum14, enum18));
        assertTrue(recursiveEquals(enum15, enum19));
    }

};


