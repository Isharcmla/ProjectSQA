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

public class MannWhitneyUTest_mannWhitneyU_102061560248 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term40461;
     Object term39728;
     Object term39730;

    public MannWhitneyUTest_mannWhitneyU_102061560248() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term40715 = Class.forName((String) "org.apache.commons.math3.stat.ranking.NaNStrategy");
        Field term40714 = ((Class) term40715).getDeclaredField((String) "MAXIMAL");
        ((Field) term40714).setAccessible(true);
        Object enum41 = ((Field) term40714).get((Object) null);
        term40461 = newInstance(Class.forName("org.apache.commons.math3.stat.inference.MannWhitneyUTest"));
        Object term40571 = newInstance(Class.forName("org.apache.commons.math3.stat.ranking.NaturalRanking"));
        setField(term40571, term40571.getClass(), "nanStrategy", enum41);
        setField(term40461, term40461.getClass(), "naturalRanking", term40571);
        term39728 = (double[]) newDoubleArray(1);
        term39730 = (double[]) newDoubleArray(6);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math3.stat.inference.MannWhitneyUTest");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Array.newInstance(double.class, 0).getClass();
        argTypes[1] = Array.newInstance(double.class, 0).getClass();
        Object[] args = new Object[2];
        args[0] = term39728;
        args[1] = term39730;
        callMethod(klass, "mannWhitneyU", argTypes, term40461, args);
    }

};


