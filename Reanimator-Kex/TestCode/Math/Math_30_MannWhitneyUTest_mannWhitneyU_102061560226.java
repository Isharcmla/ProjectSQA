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

public class MannWhitneyUTest_mannWhitneyU_102061560226 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term17593;
     Object term16580;
     Object term16582;

    public MannWhitneyUTest_mannWhitneyU_102061560226() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term17847 = Class.forName((String) "org.apache.commons.math3.stat.ranking.NaNStrategy");
        Field term17846 = ((Class) term17847).getDeclaredField((String) "MAXIMAL");
        ((Field) term17846).setAccessible(true);
        Object enum32 = ((Field) term17846).get((Object) null);
        term17593 = newInstance(Class.forName("org.apache.commons.math3.stat.inference.MannWhitneyUTest"));
        Object term17703 = newInstance(Class.forName("org.apache.commons.math3.stat.ranking.NaturalRanking"));
        setField(term17703, term17703.getClass(), "nanStrategy", enum32);
        setField(term17593, term17593.getClass(), "naturalRanking", term17703);
        term16580 = (double[]) newDoubleArray(1);
        term16582 = (double[]) newDoubleArray(6);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math3.stat.inference.MannWhitneyUTest");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Array.newInstance(double.class, 0).getClass();
        argTypes[1] = Array.newInstance(double.class, 0).getClass();
        Object[] args = new Object[2];
        args[0] = term16580;
        args[1] = term16582;
        callMethod(klass, "mannWhitneyU", argTypes, term17593, args);
    }

};


