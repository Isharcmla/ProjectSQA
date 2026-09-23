package org.apache.commons.math.stat.inference;

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
import static org.apache.commons.math.stat.inference.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static org.apache.commons.math.stat.inference.EqualityUtils.*;
import java.lang.Object;

public class ChiSquareTestImpl_isNonNegative_194471653134 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term350;
     Object term355;
     Object term3735;
     Object term3738;

    public ChiSquareTestImpl_isNonNegative_194471653134() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term350 = newInstance(Class.forName("org.apache.commons.math.stat.inference.ChiSquareTestImpl"));
        Object term351 = newInstance(Class.forName("org.apache.commons.math.distribution.ChiSquaredDistributionImpl"));
        Object term352 = newInstance(Class.forName("org.apache.commons.math.distribution.GammaDistributionImpl"));
        setDoubleField(term352, term352.getClass(), "alpha", 0.5);
        setDoubleField(term352, term352.getClass(), "beta", 2.0);
        setField(term351, term351.getClass(), "gamma", term352);
        setField(term350, term350.getClass(), "distribution", term351);
        term355 = (Object[]) newArray("[J", 5);
        long[] term356 = (long[]) newLongArray(3);
        long[] term360 = (long[]) newLongArray(5);
        long[] term366 = (long[]) newLongArray(5);
        long[] term372 = (long[]) newLongArray(1);
        long[] term374 = (long[]) newLongArray(0);
        setLongElement(term356, 0, -5786861555969446503L);
        setLongElement(term356, 1, 2354625302846375590L);
        setLongElement(term356, 2, 7276637106827860087L);
        setElement(term355, 0, term356);
        setLongElement(term360, 0, -3936701866695933852L);
        setLongElement(term360, 1, 1215116475929634177L);
        setLongElement(term360, 2, 1597484336218508869L);
        setLongElement(term360, 3, -685023850445639859L);
        setLongElement(term360, 4, -6950146046121430355L);
        setElement(term355, 1, term360);
        setLongElement(term366, 0, 1667122142089513324L);
        setLongElement(term366, 1, -6342139649364011743L);
        setLongElement(term366, 2, -4924950707540628022L);
        setLongElement(term366, 3, -4393710401270724527L);
        setLongElement(term366, 4, -4822736661741380518L);
        setElement(term355, 2, term366);
        setLongElement(term372, 0, -5386201758403679145L);
        setElement(term355, 3, term372);
        setElement(term355, 4, term374);
        term3735 = newInstance(Class.forName("org.apache.commons.math.stat.inference.ChiSquareTestImpl"));
        Object term3736 = newInstance(Class.forName("org.apache.commons.math.distribution.ChiSquaredDistributionImpl"));
        Object term3737 = newInstance(Class.forName("org.apache.commons.math.distribution.GammaDistributionImpl"));
        setDoubleField(term3737, term3737.getClass(), "alpha", 0.5);
        setDoubleField(term3737, term3737.getClass(), "beta", 2.0);
        setField(term3736, term3736.getClass(), "gamma", term3737);
        setField(term3735, term3735.getClass(), "distribution", term3736);
        term3738 = (Object[]) newArray("[J", 5);
        long[] term3739 = (long[]) newLongArray(3);
        long[] term3740 = (long[]) newLongArray(5);
        long[] term3741 = (long[]) newLongArray(5);
        long[] term3742 = (long[]) newLongArray(1);
        long[] term3743 = (long[]) newLongArray(0);
        setLongElement(term3739, 0, -5786861555969446503L);
        setLongElement(term3739, 1, 2354625302846375590L);
        setLongElement(term3739, 2, 7276637106827860087L);
        setElement(term3738, 0, term3739);
        setLongElement(term3740, 0, -3936701866695933852L);
        setLongElement(term3740, 1, 1215116475929634177L);
        setLongElement(term3740, 2, 1597484336218508869L);
        setLongElement(term3740, 3, -685023850445639859L);
        setLongElement(term3740, 4, -6950146046121430355L);
        setElement(term3738, 1, term3740);
        setLongElement(term3741, 0, 1667122142089513324L);
        setLongElement(term3741, 1, -6342139649364011743L);
        setLongElement(term3741, 2, -4924950707540628022L);
        setLongElement(term3741, 3, -4393710401270724527L);
        setLongElement(term3741, 4, -4822736661741380518L);
        setElement(term3738, 2, term3741);
        setLongElement(term3742, 0, -5386201758403679145L);
        setElement(term3738, 3, term3742);
        setElement(term3738, 4, term3743);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.stat.inference.ChiSquareTestImpl");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(Array.newInstance(long.class, 0).getClass(), 0).getClass();
        Object[] args = new Object[1];
        args[0] = term355;
        Object retValue = callMethod(klass, "isNonNegative", argTypes, term350, args);
        assertTrue(recursiveEquals(term350, term3735));
        assertTrue(recursiveEquals(term355, term3738));
        assertTrue(recursiveEquals(retValue, false));
    }

};


