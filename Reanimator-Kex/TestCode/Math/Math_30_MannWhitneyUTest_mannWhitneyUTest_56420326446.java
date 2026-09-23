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

public class MannWhitneyUTest_mannWhitneyUTest_56420326446 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term37780;
     Object term36965;
     Object term36970;

    public MannWhitneyUTest_mannWhitneyUTest_56420326446() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term38034 = Class.forName((String) "org.apache.commons.math3.stat.ranking.NaNStrategy");
        Field term38033 = ((Class) term38034).getDeclaredField((String) "MINIMAL");
        ((Field) term38033).setAccessible(true);
        Object enum40 = ((Field) term38033).get((Object) null);
        term37780 = newInstance(Class.forName("org.apache.commons.math3.stat.inference.MannWhitneyUTest"));
        Object term37890 = newInstance(Class.forName("org.apache.commons.math3.stat.ranking.NaturalRanking"));
        setField(term37890, term37890.getClass(), "nanStrategy", enum40);
        setField(term37780, term37780.getClass(), "naturalRanking", term37890);
        term36965 = (double[]) newDoubleArray(4);
        term36970 = (double[]) newDoubleArray(4);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math3.stat.inference.MannWhitneyUTest");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Array.newInstance(double.class, 0).getClass();
        argTypes[1] = Array.newInstance(double.class, 0).getClass();
        Object[] args = new Object[2];
        args[0] = term36965;
        args[1] = term36970;
        callMethod(klass, "mannWhitneyUTest", argTypes, term37780, args);
    }

};


