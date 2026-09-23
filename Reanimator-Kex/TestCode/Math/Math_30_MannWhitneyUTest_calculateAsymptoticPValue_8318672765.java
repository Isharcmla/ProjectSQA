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
import java.lang.Double;
import java.lang.Integer;

public class MannWhitneyUTest_calculateAsymptoticPValue_8318672765 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2429;
     Object term2452;
     Object term2454;
     Object term2456;

    public MannWhitneyUTest_calculateAsymptoticPValue_8318672765() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term2459 = Class.forName((String) "org.apache.commons.math3.stat.ranking.NaNStrategy");
        Field term2458 = ((Class) term2459).getDeclaredField((String) "FIXED");
        ((Field) term2458).setAccessible(true);
        Object enum8 = ((Field) term2458).get((Object) null);
        Class<? extends Object> term2726 = Class.forName((String) "org.apache.commons.math3.stat.ranking.TiesStrategy");
        Field term2725 = ((Class) term2726).getDeclaredField((String) "AVERAGE");
        ((Field) term2725).setAccessible(true);
        Object enum9 = ((Field) term2725).get((Object) null);
        term2429 = newInstance(Class.forName("org.apache.commons.math3.stat.inference.MannWhitneyUTest"));
        Object term2430 = newInstance(Class.forName("org.apache.commons.math3.stat.ranking.NaturalRanking"));
        Object term2451 = newInstance(Class.forName("org.apache.commons.math3.random.RandomDataImpl"));
        setField(term2430, term2430.getClass(), "nanStrategy", enum8);
        setField(term2430, term2430.getClass(), "tiesStrategy", enum9);
        setField(term2451, term2451.getClass(), "rand", null);
        setField(term2451, term2451.getClass(), "secRand", null);
        setField(term2430, term2430.getClass(), "randomData", term2451);
        setField(term2429, term2429.getClass(), "naturalRanking", term2430);
        term2452 = new Double(0.7633268466829064);
        term2454 = new Integer(568599855);
        term2456 = new Integer(1162663216);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math3.stat.inference.MannWhitneyUTest");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = double.class;
        argTypes[1] = int.class;
        argTypes[2] = int.class;
        Object[] args = new Object[3];
        args[0] = term2452;
        args[1] = term2454;
        args[2] = term2456;
        callMethod(klass, "calculateAsymptoticPValue", argTypes, term2429, args);
    }

};


