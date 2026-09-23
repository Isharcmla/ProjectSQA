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

public class SingularValueDecompositionImpl_getCovariance_191630612540 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term8189;

    public SingularValueDecompositionImpl_getCovariance_191630612540() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term8189 = newInstance(Class.forName("org.apache.commons.math.linear.SingularValueDecompositionImpl"));
        double[] term7928 = (double[]) newDoubleArray(6);
        setDoubleElement(term7928, 0, 9.007199254740992E15);
        setDoubleElement(term7928, 1, 5.62949953421312E15);
        setDoubleElement(term7928, 2, 1.9140298416324608E16);
        setDoubleElement(term7928, 3, 5.7758665221026611E17);
        setDoubleElement(term7928, 4, 5.7758665221026611E17);
        setDoubleElement(term7928, 5, 4.6128119183342305E18);
        setField(term8189, term8189.getClass(), "singularValues", term7928);
        setField(term8189, term8189.getClass(), "cachedVt", null);
        setField(term8189, term8189.getClass(), "cachedV", null);
        setIntField(term8189, term8189.getClass(), "m", -2147483648);
        setIntField(term8189, term8189.getClass(), "n", -2147483648);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.linear.SingularValueDecompositionImpl");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = double.class;
        Object[] args = new Object[1];
        args[0] = 2.7813423231340017E-308;
        try {
            callMethod(klass, "getCovariance", argTypes, term8189, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


