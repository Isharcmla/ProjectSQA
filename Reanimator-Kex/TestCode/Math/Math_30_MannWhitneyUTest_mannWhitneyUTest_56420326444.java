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

public class MannWhitneyUTest_mannWhitneyUTest_56420326444 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term35966;
     Object term35617;
     Object term35625;

    public MannWhitneyUTest_mannWhitneyUTest_56420326444() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term36220 = Class.forName((String) "org.apache.commons.math3.stat.ranking.NaNStrategy");
        Field term36219 = ((Class) term36220).getDeclaredField((String) "MINIMAL");
        ((Field) term36219).setAccessible(true);
        Object enum39 = ((Field) term36219).get((Object) null);
        term35966 = newInstance(Class.forName("org.apache.commons.math3.stat.inference.MannWhitneyUTest"));
        Object term36076 = newInstance(Class.forName("org.apache.commons.math3.stat.ranking.NaturalRanking"));
        setField(term36076, term36076.getClass(), "nanStrategy", enum39);
        setField(term35966, term35966.getClass(), "naturalRanking", term36076);
        term35617 = (double[]) newDoubleArray(7);
        term35625 = (double[]) newDoubleArray(1);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math3.stat.inference.MannWhitneyUTest");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Array.newInstance(double.class, 0).getClass();
        argTypes[1] = Array.newInstance(double.class, 0).getClass();
        Object[] args = new Object[2];
        args[0] = term35617;
        args[1] = term35625;
        callMethod(klass, "mannWhitneyUTest", argTypes, term35966, args);
    }

};


