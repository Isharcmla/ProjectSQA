package org.apache.commons.math.util;

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
import static org.apache.commons.math.util.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static org.apache.commons.math.util.EqualityUtils.*;

public class MathUtils_equalsIncludingNaN_145784760286 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term89;
     Object term93;
     Object term4221;
     Object term4222;

    public MathUtils_equalsIncludingNaN_145784760286() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term89 = (double[]) newDoubleArray(3);
        setDoubleElement(term89, 0, 0.7559240768573477);
        setDoubleElement(term89, 1, 0.10667076642995188);
        setDoubleElement(term89, 2, 0.11493000848982304);
        term93 = (double[]) newDoubleArray(4);
        setDoubleElement(term93, 0, 0.37161417339133307);
        setDoubleElement(term93, 1, 0.6805867182029153);
        setDoubleElement(term93, 2, 0.2852810965221698);
        setDoubleElement(term93, 3, 0.6300849762307866);
        term4221 = (double[]) newDoubleArray(3);
        setDoubleElement(term4221, 0, 0.7559240768573477);
        setDoubleElement(term4221, 1, 0.10667076642995188);
        setDoubleElement(term4221, 2, 0.11493000848982304);
        term4222 = (double[]) newDoubleArray(4);
        setDoubleElement(term4222, 0, 0.37161417339133307);
        setDoubleElement(term4222, 1, 0.6805867182029153);
        setDoubleElement(term4222, 2, 0.2852810965221698);
        setDoubleElement(term4222, 3, 0.6300849762307866);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.util.MathUtils");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Array.newInstance(double.class, 0).getClass();
        argTypes[1] = Array.newInstance(double.class, 0).getClass();
        Object[] args = new Object[2];
        args[0] = term89;
        args[1] = term93;
        Object retValue = callMethod(klass, "equalsIncludingNaN", argTypes, null, args);
        assertTrue(recursiveEquals(term89, term4221));
        assertTrue(recursiveEquals(term93, term4222));
        assertTrue(recursiveEquals(retValue, false));
    }

};


