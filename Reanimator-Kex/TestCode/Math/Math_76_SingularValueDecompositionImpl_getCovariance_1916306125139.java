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

public class SingularValueDecompositionImpl_getCovariance_1916306125139 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term67687;

    public SingularValueDecompositionImpl_getCovariance_1916306125139() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term67687 = newInstance(Class.forName("org.apache.commons.math.linear.SingularValueDecompositionImpl"));
        double[] term67460 = (double[]) newDoubleArray(12);
        setDoubleElement(term67460, 0, 1.23511661364301005E18);
        setDoubleElement(term67460, 1, 2.3088097075134484E16);
        setField(term67687, term67687.getClass(), "singularValues", term67460);
        setField(term67687, term67687.getClass(), "cachedVt", null);
        setField(term67687, term67687.getClass(), "cachedV", null);
        setIntField(term67687, term67687.getClass(), "m", -2147483648);
        setIntField(term67687, term67687.getClass(), "n", -2147483647);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.linear.SingularValueDecompositionImpl");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = double.class;
        Object[] args = new Object[1];
        args[0] = 1.1860896679573247E-302;
        try {
            callMethod(klass, "getCovariance", argTypes, term67687, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


