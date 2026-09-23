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

public class ChiSquareTestImpl_isRectangular_168464347931 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term283;
     Object term288;
     Object term3597;
     Object term3600;

    public ChiSquareTestImpl_isRectangular_168464347931() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term283 = newInstance(Class.forName("org.apache.commons.math.stat.inference.ChiSquareTestImpl"));
        Object term284 = newInstance(Class.forName("org.apache.commons.math.distribution.ChiSquaredDistributionImpl"));
        Object term285 = newInstance(Class.forName("org.apache.commons.math.distribution.GammaDistributionImpl"));
        setDoubleField(term285, term285.getClass(), "alpha", 0.5);
        setDoubleField(term285, term285.getClass(), "beta", 2.0);
        setField(term284, term284.getClass(), "gamma", term285);
        setField(term283, term283.getClass(), "distribution", term284);
        term288 = (Object[]) newArray("[J", 3);
        long[] term289 = (long[]) newLongArray(7);
        long[] term297 = (long[]) newLongArray(2);
        long[] term300 = (long[]) newLongArray(6);
        setLongElement(term289, 0, -8876856890348836498L);
        setLongElement(term289, 1, 846579494941632714L);
        setLongElement(term289, 2, 6689117472719450333L);
        setLongElement(term289, 3, 5836128569274066678L);
        setLongElement(term289, 4, -2177368829816872572L);
        setLongElement(term289, 5, -8463029266761149071L);
        setLongElement(term289, 6, 3133860696238261492L);
        setElement(term288, 0, term289);
        setLongElement(term297, 0, 7247160664318067468L);
        setLongElement(term297, 1, 2135754395358000892L);
        setElement(term288, 1, term297);
        setLongElement(term300, 0, -8085190702504231560L);
        setLongElement(term300, 1, 1672578078364590450L);
        setLongElement(term300, 2, 4949335493504695457L);
        setLongElement(term300, 3, -5216789073301458893L);
        setLongElement(term300, 4, -1832940336320585644L);
        setLongElement(term300, 5, -8033714905181142681L);
        setElement(term288, 2, term300);
        term3597 = newInstance(Class.forName("org.apache.commons.math.stat.inference.ChiSquareTestImpl"));
        Object term3598 = newInstance(Class.forName("org.apache.commons.math.distribution.ChiSquaredDistributionImpl"));
        Object term3599 = newInstance(Class.forName("org.apache.commons.math.distribution.GammaDistributionImpl"));
        setDoubleField(term3599, term3599.getClass(), "alpha", 0.5);
        setDoubleField(term3599, term3599.getClass(), "beta", 2.0);
        setField(term3598, term3598.getClass(), "gamma", term3599);
        setField(term3597, term3597.getClass(), "distribution", term3598);
        term3600 = (Object[]) newArray("[J", 3);
        long[] term3601 = (long[]) newLongArray(7);
        long[] term3602 = (long[]) newLongArray(2);
        long[] term3603 = (long[]) newLongArray(6);
        setLongElement(term3601, 0, -8876856890348836498L);
        setLongElement(term3601, 1, 846579494941632714L);
        setLongElement(term3601, 2, 6689117472719450333L);
        setLongElement(term3601, 3, 5836128569274066678L);
        setLongElement(term3601, 4, -2177368829816872572L);
        setLongElement(term3601, 5, -8463029266761149071L);
        setLongElement(term3601, 6, 3133860696238261492L);
        setElement(term3600, 0, term3601);
        setLongElement(term3602, 0, 7247160664318067468L);
        setLongElement(term3602, 1, 2135754395358000892L);
        setElement(term3600, 1, term3602);
        setLongElement(term3603, 0, -8085190702504231560L);
        setLongElement(term3603, 1, 1672578078364590450L);
        setLongElement(term3603, 2, 4949335493504695457L);
        setLongElement(term3603, 3, -5216789073301458893L);
        setLongElement(term3603, 4, -1832940336320585644L);
        setLongElement(term3603, 5, -8033714905181142681L);
        setElement(term3600, 2, term3603);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.stat.inference.ChiSquareTestImpl");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(Array.newInstance(long.class, 0).getClass(), 0).getClass();
        Object[] args = new Object[1];
        args[0] = term288;
        Object retValue = callMethod(klass, "isRectangular", argTypes, term283, args);
        assertTrue(recursiveEquals(term283, term3597));
        assertTrue(recursiveEquals(term288, term3600));
        assertTrue(recursiveEquals(retValue, false));
    }

};


