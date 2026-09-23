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

public class RealMatrixImpl_transpose_19387028073 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2580;

    public RealMatrixImpl_transpose_19387028073() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2580 = newInstance(Class.forName("org.apache.commons.math.linear.RealMatrixImpl"));
        Object[] term2581 = (Object[]) newArray("[D", 5);
        double[] term2582 = (double[]) newDoubleArray(2);
        double[] term2585 = (double[]) newDoubleArray(0);
        double[] term2586 = (double[]) newDoubleArray(5);
        double[] term2592 = (double[]) newDoubleArray(4);
        double[] term2597 = (double[]) newDoubleArray(3);
        Object[] term2601 = (Object[]) newArray("[D", 5);
        double[] term2602 = (double[]) newDoubleArray(9);
        double[] term2612 = (double[]) newDoubleArray(3);
        double[] term2616 = (double[]) newDoubleArray(5);
        double[] term2622 = (double[]) newDoubleArray(0);
        double[] term2623 = (double[]) newDoubleArray(1);
        int[] term2625 = (int[]) newIntArray(0);
        setDoubleElement(term2582, 0, 0.6862332128231466);
        setDoubleElement(term2582, 1, 0.8799451196211497);
        setElement(term2581, 0, term2582);
        setElement(term2581, 1, term2585);
        setDoubleElement(term2586, 0, 0.9739388367741902);
        setDoubleElement(term2586, 1, 0.2503677695709047);
        setDoubleElement(term2586, 2, 0.09474948219863522);
        setDoubleElement(term2586, 3, 0.4383399830188074);
        setDoubleElement(term2586, 4, 0.31844331712731666);
        setElement(term2581, 2, term2586);
        setDoubleElement(term2592, 0, 0.036973761145152384);
        setDoubleElement(term2592, 1, 0.9425796768484118);
        setDoubleElement(term2592, 2, 0.2348226206523183);
        setDoubleElement(term2592, 3, 0.443439873192083);
        setElement(term2581, 3, term2592);
        setDoubleElement(term2597, 0, 0.03969974986368108);
        setDoubleElement(term2597, 1, 0.46503001320013615);
        setDoubleElement(term2597, 2, 0.9068025458227947);
        setElement(term2581, 4, term2597);
        setField(term2580, term2580.getClass(), "data", term2581);
        setDoubleElement(term2602, 0, 0.0033019506257661035);
        setDoubleElement(term2602, 1, 0.09198544215709614);
        setDoubleElement(term2602, 2, 0.3295962990623761);
        setDoubleElement(term2602, 3, 1.0850966786768446E-4);
        setDoubleElement(term2602, 4, 0.5094636958219735);
        setDoubleElement(term2602, 5, 0.685767595670629);
        setDoubleElement(term2602, 6, 0.23723706027805036);
        setDoubleElement(term2602, 7, 0.7989546149805499);
        setDoubleElement(term2602, 8, 0.12788897235770702);
        setElement(term2601, 0, term2602);
        setDoubleElement(term2612, 0, 0.6639975973495241);
        setDoubleElement(term2612, 1, 0.4188231874187631);
        setDoubleElement(term2612, 2, 0.8023118817360049);
        setElement(term2601, 1, term2612);
        setDoubleElement(term2616, 0, 0.14645177919899588);
        setDoubleElement(term2616, 1, 0.22699862391690062);
        setDoubleElement(term2616, 2, 0.5149544974885987);
        setDoubleElement(term2616, 3, 0.8722279671290181);
        setDoubleElement(term2616, 4, 0.18489050285246944);
        setElement(term2601, 2, term2616);
        setElement(term2601, 3, term2622);
        setDoubleElement(term2623, 0, 0.8978351455009401);
        setElement(term2601, 4, term2623);
        setField(term2580, term2580.getClass(), "lu", term2601);
        setField(term2580, term2580.getClass(), "permutation", term2625);
        setIntField(term2580, term2580.getClass(), "parity", 1);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.linear.RealMatrixImpl");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "transpose", argTypes, term2580, args);
            assertTrue(false);
        }
        catch (ArrayIndexOutOfBoundsException e) {
        }

    }

};


