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

public class RealMatrixImpl_getData_197151236962 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1346;

    public RealMatrixImpl_getData_197151236962() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1346 = newInstance(Class.forName("org.apache.commons.math.linear.RealMatrixImpl"));
        Object[] term1347 = (Object[]) newArray("[D", 3);
        double[] term1348 = (double[]) newDoubleArray(3);
        double[] term1352 = (double[]) newDoubleArray(4);
        double[] term1357 = (double[]) newDoubleArray(6);
        Object[] term1364 = (Object[]) newArray("[D", 1);
        double[] term1365 = (double[]) newDoubleArray(2);
        int[] term1368 = (int[]) newIntArray(0);
        setDoubleElement(term1348, 0, 0.6474385034713966);
        setDoubleElement(term1348, 1, 0.589407706873697);
        setDoubleElement(term1348, 2, 0.6317865333680911);
        setElement(term1347, 0, term1348);
        setDoubleElement(term1352, 0, 0.8927448424561988);
        setDoubleElement(term1352, 1, 0.5749385818274158);
        setDoubleElement(term1352, 2, 0.08286713692323);
        setDoubleElement(term1352, 3, 0.1713603524061028);
        setElement(term1347, 1, term1352);
        setDoubleElement(term1357, 0, 0.46840044557462845);
        setDoubleElement(term1357, 1, 0.7757378334599976);
        setDoubleElement(term1357, 2, 0.3459237114146855);
        setDoubleElement(term1357, 3, 0.41504405374405495);
        setDoubleElement(term1357, 4, 0.9526973682054863);
        setDoubleElement(term1357, 5, 0.27635065300519635);
        setElement(term1347, 2, term1357);
        setField(term1346, term1346.getClass(), "data", term1347);
        setDoubleElement(term1365, 0, 0.49834805734323884);
        setDoubleElement(term1365, 1, 0.5823024616231472);
        setElement(term1364, 0, term1365);
        setField(term1346, term1346.getClass(), "lu", term1364);
        setField(term1346, term1346.getClass(), "permutation", term1368);
        setIntField(term1346, term1346.getClass(), "parity", 1);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.linear.RealMatrixImpl");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "getData", argTypes, term1346, args);
            assertTrue(false);
        }
        catch (ArrayIndexOutOfBoundsException e) {
        }

    }

};


