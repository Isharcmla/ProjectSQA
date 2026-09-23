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

public class SingularValueDecompositionImpl_getSolver_1804940021165 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term238062;

    public SingularValueDecompositionImpl_getSolver_1804940021165() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term238062 = newInstance(Class.forName("org.apache.commons.math.linear.SingularValueDecompositionImpl"));
        double[] term236984 = (double[]) newDoubleArray(24);
        Object term238158 = newInstance(Class.forName("org.apache.commons.math.linear.RealMatrixImpl"));
        Object term238266 = newInstance(Class.forName("org.apache.commons.math.linear.Array2DRowRealMatrix"));
        setDoubleElement(term236984, 0, -2.3058430089452585E18);
        setDoubleElement(term236984, 1, -9.2143648374658171E18);
        setDoubleElement(term236984, 2, -9.223372036854776E18);
        setDoubleElement(term236984, 3, -9.223372036854776E18);
        setDoubleElement(term236984, 4, -4.503046104465407E15);
        setDoubleElement(term236984, 5, -9.223372036854776E18);
        setDoubleElement(term236984, 6, -9.223372036854776E18);
        setDoubleElement(term236984, 7, -9.2143648376000348E18);
        setDoubleElement(term236984, 8, 9.2188684372274053E18);
        setDoubleElement(term236984, 9, 9.2188685746663588E18);
        setDoubleElement(term236984, 10, -9.223372036854776E18);
        setDoubleElement(term236984, 11, -9.1513144428168479E18);
        setDoubleElement(term236984, 12, -9.2143647688805581E18);
        setDoubleElement(term236984, 13, 9.2199943371342479E18);
        setDoubleElement(term236984, 15, -9.223372036854776E18);
        setDoubleElement(term236984, 16, 9.2188689869832192E18);
        setDoubleElement(term236984, 17, -6.8950104672574341E18);
        setDoubleElement(term236984, 18, -9.2188675998337434E18);
        setDoubleElement(term236984, 19, -8.0704499697329603E18);
        setDoubleElement(term236984, 20, -9.2008532036059628E18);
        setDoubleElement(term236984, 21, -4.58916745898274E18);
        setDoubleElement(term236984, 22, 9.2188684372945142E18);
        setDoubleElement(term236984, 23, -9.2188681623494984E18);
        setField(term238062, term238062.getClass(), "singularValues", term236984);
        setField(term238062, term238062.getClass(), "cachedUt", term238158);
        setField(term238062, term238062.getClass(), "cachedV", term238266);
        setIntField(term238062, term238062.getClass(), "m", -2147483648);
        setIntField(term238062, term238062.getClass(), "n", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.linear.SingularValueDecompositionImpl");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "getSolver", argTypes, term238062, args);
            assertTrue(false);
        }
        catch (ArrayIndexOutOfBoundsException e) {
        }

    }

};


