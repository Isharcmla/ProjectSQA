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

public class MannWhitneyUTest_mannWhitneyU_102061560236 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term30721;
     Object term30106;
     Object term30110;

    public MannWhitneyUTest_mannWhitneyU_102061560236() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term30975 = Class.forName((String) "org.apache.commons.math3.stat.ranking.NaNStrategy");
        Field term30974 = ((Class) term30975).getDeclaredField((String) "MINIMAL");
        ((Field) term30974).setAccessible(true);
        Object enum35 = ((Field) term30974).get((Object) null);
        term30721 = newInstance(Class.forName("org.apache.commons.math3.stat.inference.MannWhitneyUTest"));
        Object term30831 = newInstance(Class.forName("org.apache.commons.math3.stat.ranking.NaturalRanking"));
        setField(term30831, term30831.getClass(), "nanStrategy", enum35);
        setField(term30721, term30721.getClass(), "naturalRanking", term30831);
        term30106 = (double[]) newDoubleArray(3);
        term30110 = (double[]) newDoubleArray(4);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math3.stat.inference.MannWhitneyUTest");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Array.newInstance(double.class, 0).getClass();
        argTypes[1] = Array.newInstance(double.class, 0).getClass();
        Object[] args = new Object[2];
        args[0] = term30106;
        args[1] = term30110;
        callMethod(klass, "mannWhitneyU", argTypes, term30721, args);
    }

};


