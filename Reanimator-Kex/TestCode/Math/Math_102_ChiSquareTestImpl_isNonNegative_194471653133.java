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

public class ChiSquareTestImpl_isNonNegative_194471653133 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term340;
     Object term345;
     Object term3696;
     Object term3699;

    public ChiSquareTestImpl_isNonNegative_194471653133() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term340 = newInstance(Class.forName("org.apache.commons.math.stat.inference.ChiSquareTestImpl"));
        Object term341 = newInstance(Class.forName("org.apache.commons.math.distribution.ChiSquaredDistributionImpl"));
        Object term342 = newInstance(Class.forName("org.apache.commons.math.distribution.GammaDistributionImpl"));
        setDoubleField(term342, term342.getClass(), "alpha", 0.5);
        setDoubleField(term342, term342.getClass(), "beta", 2.0);
        setField(term341, term341.getClass(), "gamma", term342);
        setField(term340, term340.getClass(), "distribution", term341);
        term345 = (long[]) newLongArray(2);
        setLongElement(term345, 0, -9040825890007374809L);
        setLongElement(term345, 1, 1368340889161782793L);
        term3696 = newInstance(Class.forName("org.apache.commons.math.stat.inference.ChiSquareTestImpl"));
        Object term3697 = newInstance(Class.forName("org.apache.commons.math.distribution.ChiSquaredDistributionImpl"));
        Object term3698 = newInstance(Class.forName("org.apache.commons.math.distribution.GammaDistributionImpl"));
        setDoubleField(term3698, term3698.getClass(), "alpha", 0.5);
        setDoubleField(term3698, term3698.getClass(), "beta", 2.0);
        setField(term3697, term3697.getClass(), "gamma", term3698);
        setField(term3696, term3696.getClass(), "distribution", term3697);
        term3699 = (long[]) newLongArray(2);
        setLongElement(term3699, 0, -9040825890007374809L);
        setLongElement(term3699, 1, 1368340889161782793L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.stat.inference.ChiSquareTestImpl");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(long.class, 0).getClass();
        Object[] args = new Object[1];
        args[0] = term345;
        Object retValue = callMethod(klass, "isNonNegative", argTypes, term340, args);
        assertTrue(recursiveEquals(term340, term3696));
        assertTrue(recursiveEquals(term345, term3699));
        assertTrue(recursiveEquals(retValue, false));
    }

};


