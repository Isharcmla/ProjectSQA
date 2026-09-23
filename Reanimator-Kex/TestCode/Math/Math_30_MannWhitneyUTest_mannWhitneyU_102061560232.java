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

public class MannWhitneyUTest_mannWhitneyU_102061560232 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term21573;
     Object term20302;
     Object term20815;

    public MannWhitneyUTest_mannWhitneyU_102061560232() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term21573 = newInstance(Class.forName("org.apache.commons.math3.stat.inference.MannWhitneyUTest"));
        Object term21683 = newInstance(Class.forName("org.apache.commons.math3.stat.ranking.NaturalRanking"));
        setField(term21573, term21573.getClass(), "naturalRanking", term21683);
        term20302 = (double[]) newDoubleArray(512);
        term20815 = (double[]) newDoubleArray(2);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math3.stat.inference.MannWhitneyUTest");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Array.newInstance(double.class, 0).getClass();
        argTypes[1] = Array.newInstance(double.class, 0).getClass();
        Object[] args = new Object[2];
        args[0] = term20302;
        args[1] = term20815;
        try {
            callMethod(klass, "mannWhitneyU", argTypes, term21573, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


