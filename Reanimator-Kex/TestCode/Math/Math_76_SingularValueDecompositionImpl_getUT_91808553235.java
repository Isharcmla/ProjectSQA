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

public class SingularValueDecompositionImpl_getUT_91808553235 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5313;

    public SingularValueDecompositionImpl_getUT_91808553235() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term5313 = newInstance(Class.forName("org.apache.commons.math.linear.SingularValueDecompositionImpl"));
        double[] term5162 = (double[]) newDoubleArray(0);
        Object term5425 = newInstance(Class.forName("org.apache.commons.math.linear.EigenDecompositionImpl"));
        setField(term5313, term5313.getClass(), "cachedUt", null);
        setField(term5313, term5313.getClass(), "cachedU", null);
        setField(term5313, term5313.getClass(), "singularValues", term5162);
        setIntField(term5313, term5313.getClass(), "m", -2147483648);
        setIntField(term5313, term5313.getClass(), "n", -2147483648);
        setField(term5313, term5313.getClass(), "eigenDecomposition", term5425);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.linear.SingularValueDecompositionImpl");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "getUT", argTypes, term5313, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


