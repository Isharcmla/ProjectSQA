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

public class MannWhitneyUTest_mannWhitneyU_102061560228 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term19295;
     Object term18622;
     Object term18624;

    public MannWhitneyUTest_mannWhitneyU_102061560228() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term19549 = Class.forName((String) "org.apache.commons.math3.stat.ranking.NaNStrategy");
        Field term19548 = ((Class) term19549).getDeclaredField((String) "MINIMAL");
        ((Field) term19548).setAccessible(true);
        Object enum33 = ((Field) term19548).get((Object) null);
        term19295 = newInstance(Class.forName("org.apache.commons.math3.stat.inference.MannWhitneyUTest"));
        Object term19405 = newInstance(Class.forName("org.apache.commons.math3.stat.ranking.NaturalRanking"));
        setField(term19405, term19405.getClass(), "nanStrategy", enum33);
        setField(term19295, term19295.getClass(), "naturalRanking", term19405);
        term18622 = (double[]) newDoubleArray(1);
        term18624 = (double[]) newDoubleArray(6);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math3.stat.inference.MannWhitneyUTest");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Array.newInstance(double.class, 0).getClass();
        argTypes[1] = Array.newInstance(double.class, 0).getClass();
        Object[] args = new Object[2];
        args[0] = term18622;
        args[1] = term18624;
        callMethod(klass, "mannWhitneyU", argTypes, term19295, args);
    }

};


