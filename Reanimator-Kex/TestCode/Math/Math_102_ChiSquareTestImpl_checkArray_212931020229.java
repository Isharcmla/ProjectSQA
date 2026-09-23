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

public class ChiSquareTestImpl_checkArray_212931020229 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term237;
     Object term242;

    public ChiSquareTestImpl_checkArray_212931020229() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term237 = newInstance(Class.forName("org.apache.commons.math.stat.inference.ChiSquareTestImpl"));
        Object term238 = newInstance(Class.forName("org.apache.commons.math.distribution.ChiSquaredDistributionImpl"));
        Object term239 = newInstance(Class.forName("org.apache.commons.math.distribution.GammaDistributionImpl"));
        setDoubleField(term239, term239.getClass(), "alpha", 0.5);
        setDoubleField(term239, term239.getClass(), "beta", 2.0);
        setField(term238, term238.getClass(), "gamma", term239);
        setField(term237, term237.getClass(), "distribution", term238);
        term242 = (Object[]) newArray("[J", 3);
        long[] term243 = (long[]) newLongArray(5);
        long[] term249 = (long[]) newLongArray(6);
        long[] term256 = (long[]) newLongArray(5);
        setLongElement(term243, 0, 41775768178052008L);
        setLongElement(term243, 1, 6682528376118987775L);
        setLongElement(term243, 2, 682356318767179819L);
        setLongElement(term243, 3, -7291743527973326814L);
        setLongElement(term243, 4, -5963439350418910964L);
        setElement(term242, 0, term243);
        setLongElement(term249, 0, 9013624480170062917L);
        setLongElement(term249, 1, 7862575738391801707L);
        setLongElement(term249, 2, 50358265865610362L);
        setLongElement(term249, 3, 5510783420697225605L);
        setLongElement(term249, 4, 6005241913654469005L);
        setLongElement(term249, 5, -1983291584002806658L);
        setElement(term242, 1, term249);
        setLongElement(term256, 0, 5946780097489996391L);
        setLongElement(term256, 1, -8652538484981166496L);
        setLongElement(term256, 2, 2701184207686293431L);
        setLongElement(term256, 3, 4474998035090263139L);
        setLongElement(term256, 4, 2848819812340321742L);
        setElement(term242, 2, term256);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.stat.inference.ChiSquareTestImpl");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(Array.newInstance(long.class, 0).getClass(), 0).getClass();
        Object[] args = new Object[1];
        args[0] = term242;
        try {
            callMethod(klass, "checkArray", argTypes, term237, args);
            assertTrue(false);
        }
        catch (IllegalArgumentException e) {
        }

    }

};


