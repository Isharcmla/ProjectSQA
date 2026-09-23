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
import java.lang.Object;
import java.lang.String;

public class MannWhitneyUTest_mannWhitneyUTest_56420326434 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term29087;
     Object term28552;
     Object term28559;

    public MannWhitneyUTest_mannWhitneyUTest_56420326434() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term29341 = Class.forName((String) "org.apache.commons.math3.stat.ranking.NaNStrategy");
        Field term29340 = ((Class) term29341).getDeclaredField((String) "MINIMAL");
        ((Field) term29340).setAccessible(true);
        Object enum34 = ((Field) term29340).get((Object) null);
        term29087 = newInstance(Class.forName("org.apache.commons.math3.stat.inference.MannWhitneyUTest"));
        Object term29197 = newInstance(Class.forName("org.apache.commons.math3.stat.ranking.NaturalRanking"));
        setField(term29197, term29197.getClass(), "nanStrategy", enum34);
        setField(term29087, term29087.getClass(), "naturalRanking", term29197);
        term28552 = (double[]) newDoubleArray(6);
        term28559 = (double[]) newDoubleArray(2);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math3.stat.inference.MannWhitneyUTest");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Array.newInstance(double.class, 0).getClass();
        argTypes[1] = Array.newInstance(double.class, 0).getClass();
        Object[] args = new Object[2];
        args[0] = term28552;
        args[1] = term28559;
        callMethod(klass, "mannWhitneyUTest", argTypes, term29087, args);
    }

};


