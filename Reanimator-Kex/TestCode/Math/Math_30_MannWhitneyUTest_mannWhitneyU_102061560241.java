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
import java.lang.NullPointerException;
import static org.apache.commons.math3.stat.inference.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.lang.String;

public class MannWhitneyUTest_mannWhitneyU_102061560241 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term33304;
     Object term32344;
     Object term32348;

    public MannWhitneyUTest_mannWhitneyU_102061560241() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term34384 = Class.forName((String) "org.apache.commons.math3.stat.ranking.NaNStrategy");
        Field term34383 = ((Class) term34384).getDeclaredField((String) "FIXED");
        ((Field) term34383).setAccessible(true);
        Object enum37 = ((Field) term34383).get((Object) null);
        term33304 = newInstance(Class.forName("org.apache.commons.math3.stat.inference.MannWhitneyUTest"));
        Object term33414 = newInstance(Class.forName("org.apache.commons.math3.stat.ranking.NaturalRanking"));
        setField(term33414, term33414.getClass(), "nanStrategy", enum37);
        setField(term33304, term33304.getClass(), "naturalRanking", term33414);
        term32344 = (double[]) newDoubleArray(3);
        term32348 = (double[]) newDoubleArray(4);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math3.stat.inference.MannWhitneyUTest");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Array.newInstance(double.class, 0).getClass();
        argTypes[1] = Array.newInstance(double.class, 0).getClass();
        Object[] args = new Object[2];
        args[0] = term32344;
        args[1] = term32348;
        try {
            callMethod(klass, "mannWhitneyU", argTypes, term33304, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


