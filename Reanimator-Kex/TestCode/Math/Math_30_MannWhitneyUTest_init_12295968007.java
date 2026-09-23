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
import static org.apache.commons.math3.stat.inference.EqualityUtils.*;
import java.lang.Object;
import java.lang.String;

public class MannWhitneyUTest_init_12295968007 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3635;

    public MannWhitneyUTest_init_12295968007() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term3645 = Class.forName((String) "org.apache.commons.math3.stat.ranking.NaNStrategy");
        Field term3644 = ((Class) term3645).getDeclaredField((String) "FIXED");
        ((Field) term3644).setAccessible(true);
        Object enum12 = ((Field) term3644).get((Object) null);
        Class<? extends Object> term3912 = Class.forName((String) "org.apache.commons.math3.stat.ranking.TiesStrategy");
        Field term3911 = ((Class) term3912).getDeclaredField((String) "AVERAGE");
        ((Field) term3911).setAccessible(true);
        Object enum13 = ((Field) term3911).get((Object) null);
        term3635 = newInstance(Class.forName("org.apache.commons.math3.stat.inference.MannWhitneyUTest"));
        Object term3636 = newInstance(Class.forName("org.apache.commons.math3.stat.ranking.NaturalRanking"));
        Object term3643 = newInstance(Class.forName("org.apache.commons.math3.random.RandomDataImpl"));
        setField(term3636, term3636.getClass(), "nanStrategy", enum12);
        setField(term3636, term3636.getClass(), "tiesStrategy", enum13);
        setField(term3643, term3643.getClass(), "rand", null);
        setField(term3643, term3643.getClass(), "secRand", null);
        setField(term3636, term3636.getClass(), "randomData", term3643);
        setField(term3635, term3635.getClass(), "naturalRanking", term3636);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math3.stat.inference.MannWhitneyUTest");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term3635));
    }

};


