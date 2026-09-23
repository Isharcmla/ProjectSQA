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
import java.lang.ArrayIndexOutOfBoundsException;
import static org.apache.commons.math.linear.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class SingularValueDecompositionImpl_getSolver_1804940021155 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term125416;

    public SingularValueDecompositionImpl_getSolver_1804940021155() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term125416 = newInstance(Class.forName("org.apache.commons.math.linear.SingularValueDecompositionImpl"));
        double[] term124704 = (double[]) newDoubleArray(17);
        Object term125518 = newInstance(Class.forName("org.apache.commons.math.linear.OpenMapRealMatrix"));
        Object term125614 = newInstance(Class.forName("org.apache.commons.math.linear.RealMatrixImpl"));
        setDoubleElement(term124704, 0, -2.3058430089452585E18);
        setDoubleElement(term124704, 1, -1.15292142769582694E18);
        setDoubleElement(term124704, 2, -4.6071801816461783E18);
        setDoubleElement(term124704, 3, 3.378257536952364E15);
        setDoubleElement(term124704, 4, -9.1648241411088507E18);
        setDoubleElement(term124704, 5, -4.6071812301598228E18);
        setDoubleElement(term124704, 6, 4.503599627372592E15);
        setDoubleElement(term124704, 7, -4.6139378182410732E18);
        setDoubleElement(term124704, 8, -8.9576596588396872E18);
        setDoubleElement(term124704, 9, 1.18951325157923226E18);
        setDoubleElement(term124704, 10, -9.2188684372261417E18);
        setDoubleElement(term124704, 11, -9.2199756443616543E18);
        setDoubleElement(term124704, 12, -4.5936716199179059E18);
        setDoubleElement(term124704, 13, -9.2233720365863404E18);
        setDoubleElement(term124704, 14, -9.2233720365863404E18);
        setDoubleElement(term124704, 15, -9.2222461369479332E18);
        setDoubleElement(term124704, 16, -4.4078893391958508E18);
        setField(term125416, term125416.getClass(), "singularValues", term124704);
        setField(term125416, term125416.getClass(), "cachedUt", term125518);
        setField(term125416, term125416.getClass(), "cachedV", term125614);
        setIntField(term125416, term125416.getClass(), "m", -2147483648);
        setIntField(term125416, term125416.getClass(), "n", 32768);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.linear.SingularValueDecompositionImpl");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "getSolver", argTypes, term125416, args);
            assertTrue(false);
        }
        catch (ArrayIndexOutOfBoundsException e) {
        }

    }

};


