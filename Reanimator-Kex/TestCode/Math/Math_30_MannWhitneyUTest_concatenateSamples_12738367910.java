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
import java.lang.Object;
import java.lang.String;

public class MannWhitneyUTest_concatenateSamples_12738367910 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1261;
     Object term1284;
     Object term1288;
     Object term7104;
     Object term7113;
     Object term7114;
     Object term7064;

    public MannWhitneyUTest_concatenateSamples_12738367910() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term7116 = Class.forName((String) "org.apache.commons.math3.stat.ranking.NaNStrategy");
        Field term7115 = ((Class) term7116).getDeclaredField((String) "FIXED");
        ((Field) term7115).setAccessible(true);
        Object enum24 = ((Field) term7115).get((Object) null);
        Class<? extends Object> term7383 = Class.forName((String) "org.apache.commons.math3.stat.ranking.TiesStrategy");
        Field term7382 = ((Class) term7383).getDeclaredField((String) "AVERAGE");
        ((Field) term7382).setAccessible(true);
        Object enum25 = ((Field) term7382).get((Object) null);
        term1261 = newInstance(Class.forName("org.apache.commons.math3.stat.inference.MannWhitneyUTest"));
        Object term1262 = newInstance(Class.forName("org.apache.commons.math3.stat.ranking.NaturalRanking"));
        Object term1283 = newInstance(Class.forName("org.apache.commons.math3.random.RandomDataImpl"));
        setField(term1262, term1262.getClass(), "nanStrategy", enum24);
        setField(term1262, term1262.getClass(), "tiesStrategy", enum25);
        setField(term1283, term1283.getClass(), "rand", null);
        setField(term1283, term1283.getClass(), "secRand", null);
        setField(term1262, term1262.getClass(), "randomData", term1283);
        setField(term1261, term1261.getClass(), "naturalRanking", term1262);
        term1284 = (double[]) newDoubleArray(3);
        setDoubleElement(term1284, 0, 0.37773193782763337);
        setDoubleElement(term1284, 1, 0.8474802076607362);
        setDoubleElement(term1284, 2, 0.5183269973490326);
        term1288 = (double[]) newDoubleArray(4);
        setDoubleElement(term1288, 0, 0.7655020693602768);
        setDoubleElement(term1288, 1, 0.1374549299694151);
        setDoubleElement(term1288, 2, 0.7031006357544823);
        setDoubleElement(term1288, 3, 0.9527281779865117);
        Class<? extends Object> term7668 = Class.forName((String) "org.apache.commons.math3.stat.ranking.NaNStrategy");
        Field term7667 = ((Class) term7668).getDeclaredField((String) "FIXED");
        ((Field) term7667).setAccessible(true);
        Object enum26 = ((Field) term7667).get((Object) null);
        Class<? extends Object> term7935 = Class.forName((String) "org.apache.commons.math3.stat.ranking.TiesStrategy");
        Field term7934 = ((Class) term7935).getDeclaredField((String) "AVERAGE");
        ((Field) term7934).setAccessible(true);
        Object enum27 = ((Field) term7934).get((Object) null);
        term7104 = newInstance(Class.forName("org.apache.commons.math3.stat.inference.MannWhitneyUTest"));
        Object term7105 = newInstance(Class.forName("org.apache.commons.math3.stat.ranking.NaturalRanking"));
        Object term7112 = newInstance(Class.forName("org.apache.commons.math3.random.RandomDataImpl"));
        setField(term7105, term7105.getClass(), "nanStrategy", enum26);
        setField(term7105, term7105.getClass(), "tiesStrategy", enum27);
        setField(term7112, term7112.getClass(), "rand", null);
        setField(term7112, term7112.getClass(), "secRand", null);
        setField(term7105, term7105.getClass(), "randomData", term7112);
        setField(term7104, term7104.getClass(), "naturalRanking", term7105);
        term7113 = (double[]) newDoubleArray(3);
        setDoubleElement(term7113, 0, 0.37773193782763337);
        setDoubleElement(term7113, 1, 0.8474802076607362);
        setDoubleElement(term7113, 2, 0.5183269973490326);
        term7114 = (double[]) newDoubleArray(4);
        setDoubleElement(term7114, 0, 0.7655020693602768);
        setDoubleElement(term7114, 1, 0.1374549299694151);
        setDoubleElement(term7114, 2, 0.7031006357544823);
        setDoubleElement(term7114, 3, 0.9527281779865117);
        term7064 = (double[]) newDoubleArray(7);
        setDoubleElement(term7064, 0, 0.37773193782763337);
        setDoubleElement(term7064, 1, 0.8474802076607362);
        setDoubleElement(term7064, 2, 0.5183269973490326);
        setDoubleElement(term7064, 3, 0.7655020693602768);
        setDoubleElement(term7064, 4, 0.1374549299694151);
        setDoubleElement(term7064, 5, 0.7031006357544823);
        setDoubleElement(term7064, 6, 0.9527281779865117);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math3.stat.inference.MannWhitneyUTest");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Array.newInstance(double.class, 0).getClass();
        argTypes[1] = Array.newInstance(double.class, 0).getClass();
        Object[] args = new Object[2];
        args[0] = term1284;
        args[1] = term1288;
        Object retValue = callMethod(klass, "concatenateSamples", argTypes, term1261, args);
        assertTrue(recursiveEquals(term1261, term7104));
        assertTrue(recursiveEquals(term1284, term7113));
        assertTrue(recursiveEquals(term1288, term7114));
        assertTrue(recursiveEquals(retValue, term7064));
    }

};


