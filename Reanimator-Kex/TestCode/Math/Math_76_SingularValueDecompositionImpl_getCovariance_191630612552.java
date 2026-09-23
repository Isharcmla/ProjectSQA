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

public class SingularValueDecompositionImpl_getCovariance_191630612552 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term21715;

    public SingularValueDecompositionImpl_getCovariance_191630612552() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term21715 = newInstance(Class.forName("org.apache.commons.math.linear.SingularValueDecompositionImpl"));
        double[] term21535 = (double[]) newDoubleArray(3);
        setDoubleElement(term21535, 0, 2.305843009213694E18);
        setDoubleElement(term21535, 1, 2.251799813685248E16);
        setDoubleElement(term21535, 2, 1.8014398509481984E16);
        setField(term21715, term21715.getClass(), "singularValues", term21535);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.linear.SingularValueDecompositionImpl");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = double.class;
        Object[] args = new Object[1];
        args[0] = 1.7800590868057611E-307;
        try {
            callMethod(klass, "getCovariance", argTypes, term21715, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


