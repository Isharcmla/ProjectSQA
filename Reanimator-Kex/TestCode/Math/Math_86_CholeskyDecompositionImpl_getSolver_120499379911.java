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
import static org.apache.commons.math.linear.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static org.apache.commons.math.linear.EqualityUtils.*;
import java.lang.Object;

public class CholeskyDecompositionImpl_getSolver_120499379911 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term93;
     Object term3658;
     Object term3605;

    public CholeskyDecompositionImpl_getSolver_120499379911() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term93 = newInstance(Class.forName("org.apache.commons.math.linear.CholeskyDecompositionImpl"));
        Object[] term94 = (Object[]) newArray("[D", 5);
        double[] term95 = (double[]) newDoubleArray(5);
        double[] term101 = (double[]) newDoubleArray(2);
        double[] term104 = (double[]) newDoubleArray(3);
        double[] term108 = (double[]) newDoubleArray(1);
        double[] term110 = (double[]) newDoubleArray(0);
        setDoubleElement(term95, 0, 0.3202192021706908);
        setDoubleElement(term95, 1, 0.22651340641904605);
        setDoubleElement(term95, 2, 0.8878841294187743);
        setDoubleElement(term95, 3, 0.6588948704887806);
        setDoubleElement(term95, 4, 0.6397214730945112);
        setElement(term94, 0, term95);
        setDoubleElement(term101, 0, 0.25937345430928016);
        setDoubleElement(term101, 1, 0.5873228247510078);
        setElement(term94, 1, term101);
        setDoubleElement(term104, 0, 0.8823181080774973);
        setDoubleElement(term104, 1, 0.2192450926212024);
        setDoubleElement(term104, 2, 0.7591353014991907);
        setElement(term94, 2, term104);
        setDoubleElement(term108, 0, 0.791695029600875);
        setElement(term94, 3, term108);
        setElement(term94, 4, term110);
        setField(term93, term93.getClass(), "lTData", term94);
        setField(term93, term93.getClass(), "cachedL", null);
        setField(term93, term93.getClass(), "cachedLT", null);
        term3658 = newInstance(Class.forName("org.apache.commons.math.linear.CholeskyDecompositionImpl"));
        Object[] term3659 = (Object[]) newArray("[D", 5);
        double[] term3660 = (double[]) newDoubleArray(5);
        double[] term3661 = (double[]) newDoubleArray(2);
        double[] term3662 = (double[]) newDoubleArray(3);
        double[] term3663 = (double[]) newDoubleArray(1);
        double[] term3664 = (double[]) newDoubleArray(0);
        setDoubleElement(term3660, 0, 0.3202192021706908);
        setDoubleElement(term3660, 1, 0.22651340641904605);
        setDoubleElement(term3660, 2, 0.8878841294187743);
        setDoubleElement(term3660, 3, 0.6588948704887806);
        setDoubleElement(term3660, 4, 0.6397214730945112);
        setElement(term3659, 0, term3660);
        setDoubleElement(term3661, 0, 0.25937345430928016);
        setDoubleElement(term3661, 1, 0.5873228247510078);
        setElement(term3659, 1, term3661);
        setDoubleElement(term3662, 0, 0.8823181080774973);
        setDoubleElement(term3662, 1, 0.2192450926212024);
        setDoubleElement(term3662, 2, 0.7591353014991907);
        setElement(term3659, 2, term3662);
        setDoubleElement(term3663, 0, 0.791695029600875);
        setElement(term3659, 3, term3663);
        setElement(term3659, 4, term3664);
        setField(term3658, term3658.getClass(), "lTData", term3659);
        setField(term3658, term3658.getClass(), "cachedL", null);
        setField(term3658, term3658.getClass(), "cachedLT", null);
        term3605 = newInstance(Class.forName("org.apache.commons.math.linear.CholeskyDecompositionImpl$Solver"));
        Object[] term3606 = (Object[]) newArray("[D", 5);
        double[] term3607 = (double[]) newDoubleArray(5);
        double[] term3613 = (double[]) newDoubleArray(2);
        double[] term3616 = (double[]) newDoubleArray(3);
        double[] term3620 = (double[]) newDoubleArray(1);
        double[] term3622 = (double[]) newDoubleArray(0);
        setDoubleElement(term3607, 0, 0.3202192021706908);
        setDoubleElement(term3607, 1, 0.22651340641904605);
        setDoubleElement(term3607, 2, 0.8878841294187743);
        setDoubleElement(term3607, 3, 0.6588948704887806);
        setDoubleElement(term3607, 4, 0.6397214730945112);
        setElement(term3606, 0, term3607);
        setDoubleElement(term3613, 0, 0.25937345430928016);
        setDoubleElement(term3613, 1, 0.5873228247510078);
        setElement(term3606, 1, term3613);
        setDoubleElement(term3616, 0, 0.8823181080774973);
        setDoubleElement(term3616, 1, 0.2192450926212024);
        setDoubleElement(term3616, 2, 0.7591353014991907);
        setElement(term3606, 2, term3616);
        setDoubleElement(term3620, 0, 0.791695029600875);
        setElement(term3606, 3, term3620);
        setElement(term3606, 4, term3622);
        setField(term3605, term3605.getClass(), "lTData", term3606);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.linear.CholeskyDecompositionImpl");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "getSolver", argTypes, term93, args);
        assertTrue(recursiveEquals(term93, term3658));
        assertTrue(recursiveEquals(retValue, term3605));
    }

};


