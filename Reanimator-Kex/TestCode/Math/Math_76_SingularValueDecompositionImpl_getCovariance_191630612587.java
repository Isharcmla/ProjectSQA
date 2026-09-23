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

public class SingularValueDecompositionImpl_getCovariance_191630612587 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term38589;

    public SingularValueDecompositionImpl_getCovariance_191630612587() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term38589 = newInstance(Class.forName("org.apache.commons.math.linear.SingularValueDecompositionImpl"));
        double[] term38413 = (double[]) newDoubleArray(1);
        Object term38701 = newInstance(Class.forName("org.apache.commons.math.linear.EigenDecompositionImpl"));
        setDoubleElement(term38413, 0, 1.15299301208919731E18);
        setField(term38589, term38589.getClass(), "singularValues", term38413);
        setField(term38589, term38589.getClass(), "cachedVt", null);
        setField(term38589, term38589.getClass(), "cachedV", null);
        setIntField(term38589, term38589.getClass(), "m", -2147483648);
        setIntField(term38589, term38589.getClass(), "n", -2147483648);
        setField(term38589, term38589.getClass(), "eigenDecomposition", term38701);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.linear.SingularValueDecompositionImpl");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = double.class;
        Object[] args = new Object[1];
        args[0] = 2.24639952767E-311;
        try {
            callMethod(klass, "getCovariance", argTypes, term38589, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


