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

public class MannWhitneyUTest_mannWhitneyUTest_5642032646 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3003;
     Object term3026;
     Object term3029;

    public MannWhitneyUTest_mannWhitneyUTest_5642032646() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term3037 = Class.forName((String) "org.apache.commons.math3.stat.ranking.NaNStrategy");
        Field term3036 = ((Class) term3037).getDeclaredField((String) "FIXED");
        ((Field) term3036).setAccessible(true);
        Object enum10 = ((Field) term3036).get((Object) null);
        Class<? extends Object> term3304 = Class.forName((String) "org.apache.commons.math3.stat.ranking.TiesStrategy");
        Field term3303 = ((Class) term3304).getDeclaredField((String) "AVERAGE");
        ((Field) term3303).setAccessible(true);
        Object enum11 = ((Field) term3303).get((Object) null);
        term3003 = newInstance(Class.forName("org.apache.commons.math3.stat.inference.MannWhitneyUTest"));
        Object term3004 = newInstance(Class.forName("org.apache.commons.math3.stat.ranking.NaturalRanking"));
        Object term3025 = newInstance(Class.forName("org.apache.commons.math3.random.RandomDataImpl"));
        setField(term3004, term3004.getClass(), "nanStrategy", enum10);
        setField(term3004, term3004.getClass(), "tiesStrategy", enum11);
        setField(term3025, term3025.getClass(), "rand", null);
        setField(term3025, term3025.getClass(), "secRand", null);
        setField(term3004, term3004.getClass(), "randomData", term3025);
        setField(term3003, term3003.getClass(), "naturalRanking", term3004);
        term3026 = (double[]) newDoubleArray(2);
        setDoubleElement(term3026, 0, 0.13481025392611334);
        setDoubleElement(term3026, 1, 0.3800088629986428);
        term3029 = (double[]) newDoubleArray(6);
        setDoubleElement(term3029, 0, 0.5840714198152577);
        setDoubleElement(term3029, 1, 0.7559240768573477);
        setDoubleElement(term3029, 2, 0.10667076642995188);
        setDoubleElement(term3029, 3, 0.11493000848982304);
        setDoubleElement(term3029, 4, 0.37161417339133307);
        setDoubleElement(term3029, 5, 0.6805867182029153);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math3.stat.inference.MannWhitneyUTest");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Array.newInstance(double.class, 0).getClass();
        argTypes[1] = Array.newInstance(double.class, 0).getClass();
        Object[] args = new Object[2];
        args[0] = term3026;
        args[1] = term3029;
        callMethod(klass, "mannWhitneyUTest", argTypes, term3003, args);
    }

};


