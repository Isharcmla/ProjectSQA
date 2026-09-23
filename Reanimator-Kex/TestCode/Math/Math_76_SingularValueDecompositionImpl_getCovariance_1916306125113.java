package org.apache.commons.math.linear;

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
import static org.apache.commons.math.linear.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class SingularValueDecompositionImpl_getCovariance_1916306125113 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term51220;

    public SingularValueDecompositionImpl_getCovariance_1916306125113() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term51220 = newInstance(Class.forName("org.apache.commons.math.linear.SingularValueDecompositionImpl"));
        double[] term50993 = (double[]) newDoubleArray(4);
        Object term51332 = newInstance(Class.forName("org.apache.commons.math.linear.EigenDecompositionImpl"));
        double[] term51021 = (double[]) newDoubleArray(9);
        setDoubleElement(term50993, 0, 4.618248768051713E18);
        setDoubleElement(term50993, 1, 4.6182086670169129E18);
        setDoubleElement(term50993, 2, 6.316043214474272E15);
        setField(term51220, term51220.getClass(), "singularValues", term50993);
        setField(term51220, term51220.getClass(), "cachedVt", null);
        setField(term51220, term51220.getClass(), "cachedV", null);
        setIntField(term51220, term51220.getClass(), "m", -2147483648);
        setIntField(term51220, term51220.getClass(), "n", -2147483648);
        setField(term51332, term51332.getClass(), "cachedV", null);
        setField(term51332, term51332.getClass(), "eigenvectors", null);
        setField(term51332, term51332.getClass(), "main", term51021);
        setField(term51220, term51220.getClass(), "eigenDecomposition", term51332);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.linear.SingularValueDecompositionImpl");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = double.class;
        Object[] args = new Object[1];
        args[0] = 2.4239968075212492;
        try {
            callMethod(klass, "getCovariance", argTypes, term51220, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


