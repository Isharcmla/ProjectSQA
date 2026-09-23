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
import org.apache.commons.math.linear.InvalidMatrixException;
import static org.apache.commons.math.linear.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class RealMatrixImpl_getDeterminant_54521000075 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2792;

    public RealMatrixImpl_getDeterminant_54521000075() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2792 = newInstance(Class.forName("org.apache.commons.math.linear.RealMatrixImpl"));
        Object[] term2793 = (Object[]) newArray("[D", 4);
        double[] term2794 = (double[]) newDoubleArray(5);
        double[] term2800 = (double[]) newDoubleArray(0);
        double[] term2801 = (double[]) newDoubleArray(6);
        double[] term2808 = (double[]) newDoubleArray(0);
        Object[] term2809 = (Object[]) newArray("[D", 2);
        double[] term2810 = (double[]) newDoubleArray(6);
        double[] term2817 = (double[]) newDoubleArray(2);
        int[] term2820 = (int[]) newIntArray(8);
        setDoubleElement(term2794, 0, 0.9607897323439137);
        setDoubleElement(term2794, 1, 0.391302766190016);
        setDoubleElement(term2794, 2, 0.4877622925755275);
        setDoubleElement(term2794, 3, 0.9636047288221744);
        setDoubleElement(term2794, 4, 0.9812989520568652);
        setElement(term2793, 0, term2794);
        setElement(term2793, 1, term2800);
        setDoubleElement(term2801, 0, 0.5260401729085636);
        setDoubleElement(term2801, 1, 0.1966416537238288);
        setDoubleElement(term2801, 2, 0.5507226770539227);
        setDoubleElement(term2801, 3, 0.22718531728979197);
        setDoubleElement(term2801, 4, 0.945082869732553);
        setDoubleElement(term2801, 5, 0.03123965072102497);
        setElement(term2793, 2, term2801);
        setElement(term2793, 3, term2808);
        setField(term2792, term2792.getClass(), "data", term2793);
        setDoubleElement(term2810, 0, 0.026533684659376444);
        setDoubleElement(term2810, 1, 0.11613622644165744);
        setDoubleElement(term2810, 2, 0.7906598722688312);
        setDoubleElement(term2810, 3, 0.18313324415093823);
        setDoubleElement(term2810, 4, 0.1744575635121215);
        setDoubleElement(term2810, 5, 0.7997126520436173);
        setElement(term2809, 0, term2810);
        setDoubleElement(term2817, 0, 0.2885995559163721);
        setDoubleElement(term2817, 1, 0.24376380251538943);
        setElement(term2809, 1, term2817);
        setField(term2792, term2792.getClass(), "lu", term2809);
        setIntElement(term2820, 0, 1474524152);
        setIntElement(term2820, 1, 568954359);
        setIntElement(term2820, 2, 53410913);
        setIntElement(term2820, 3, -375014958);
        setIntElement(term2820, 4, 1107176718);
        setIntElement(term2820, 5, 480137250);
        setIntElement(term2820, 6, -341152642);
        setIntElement(term2820, 7, -2015854073);
        setField(term2792, term2792.getClass(), "permutation", term2820);
        setIntField(term2792, term2792.getClass(), "parity", 1);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.linear.RealMatrixImpl");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "getDeterminant", argTypes, term2792, args);
            assertTrue(false);
        }
        catch (InvalidMatrixException e) {
        }

    }

};


