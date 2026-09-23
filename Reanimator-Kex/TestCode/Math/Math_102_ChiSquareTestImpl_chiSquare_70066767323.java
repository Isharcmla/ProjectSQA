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
import java.lang.IllegalArgumentException;
import static org.apache.commons.math.stat.inference.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class ChiSquareTestImpl_chiSquare_70066767323 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term70;
     Object term75;

    public ChiSquareTestImpl_chiSquare_70066767323() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term70 = newInstance(Class.forName("org.apache.commons.math.stat.inference.ChiSquareTestImpl"));
        Object term71 = newInstance(Class.forName("org.apache.commons.math.distribution.ChiSquaredDistributionImpl"));
        Object term72 = newInstance(Class.forName("org.apache.commons.math.distribution.GammaDistributionImpl"));
        setDoubleField(term72, term72.getClass(), "alpha", 0.5);
        setDoubleField(term72, term72.getClass(), "beta", 2.0);
        setField(term71, term71.getClass(), "gamma", term72);
        setField(term70, term70.getClass(), "distribution", term71);
        term75 = (Object[]) newArray("[J", 2);
        long[] term76 = (long[]) newLongArray(6);
        long[] term83 = (long[]) newLongArray(7);
        setLongElement(term76, 0, -5476826692763582090L);
        setLongElement(term76, 1, -872011222785455006L);
        setLongElement(term76, 2, -316468845751588286L);
        setLongElement(term76, 3, 5127676408959197577L);
        setLongElement(term76, 4, -6573104506744284592L);
        setLongElement(term76, 5, -4920224193275732920L);
        setElement(term75, 0, term76);
        setLongElement(term83, 0, 8428634514691209827L);
        setLongElement(term83, 1, -2585684163342970173L);
        setLongElement(term83, 2, 8059786003080744426L);
        setLongElement(term83, 3, -4365849114644724155L);
        setLongElement(term83, 4, 2486810210675247493L);
        setLongElement(term83, 5, 7009926388951271268L);
        setLongElement(term83, 6, -7672528020740371001L);
        setElement(term75, 1, term83);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.stat.inference.ChiSquareTestImpl");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(Array.newInstance(long.class, 0).getClass(), 0).getClass();
        Object[] args = new Object[1];
        args[0] = term75;
        try {
            callMethod(klass, "chiSquare", argTypes, term70, args);
            assertTrue(false);
        }
        catch (IllegalArgumentException e) {
        }

    }

};


