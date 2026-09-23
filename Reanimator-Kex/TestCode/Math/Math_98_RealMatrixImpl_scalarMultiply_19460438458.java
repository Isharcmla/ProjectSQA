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
import java.lang.Double;

public class RealMatrixImpl_scalarMultiply_19460438458 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term877;
     Object term900;

    public RealMatrixImpl_scalarMultiply_19460438458() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term877 = newInstance(Class.forName("org.apache.commons.math.linear.RealMatrixImpl"));
        Object[] term878 = (Object[]) newArray("[D", 4);
        double[] term879 = (double[]) newDoubleArray(8);
        double[] term888 = (double[]) newDoubleArray(0);
        double[] term889 = (double[]) newDoubleArray(4);
        double[] term894 = (double[]) newDoubleArray(1);
        Object[] term896 = (Object[]) newArray("[D", 0);
        int[] term897 = (int[]) newIntArray(1);
        setDoubleElement(term879, 0, 0.8841587807231336);
        setDoubleElement(term879, 1, 0.5041105894588648);
        setDoubleElement(term879, 2, 0.5447228125601069);
        setDoubleElement(term879, 3, 0.881005463515806);
        setDoubleElement(term879, 4, 0.24535082601257097);
        setDoubleElement(term879, 5, 0.8251257683961645);
        setDoubleElement(term879, 6, 0.9368808881355091);
        setDoubleElement(term879, 7, 0.6198040082983302);
        setElement(term878, 0, term879);
        setElement(term878, 1, term888);
        setDoubleElement(term889, 0, 0.8222160691812529);
        setDoubleElement(term889, 1, 0.6481625751444708);
        setDoubleElement(term889, 2, 0.62046987338639);
        setDoubleElement(term889, 3, 0.16681991355621673);
        setElement(term878, 2, term889);
        setDoubleElement(term894, 0, 0.24168508149332457);
        setElement(term878, 3, term894);
        setField(term877, term877.getClass(), "data", term878);
        setField(term877, term877.getClass(), "lu", term896);
        setIntElement(term897, 0, 1962444399);
        setField(term877, term877.getClass(), "permutation", term897);
        setIntField(term877, term877.getClass(), "parity", 1);
        term900 = new Double(0.9765582392968284);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.linear.RealMatrixImpl");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = double.class;
        Object[] args = new Object[1];
        args[0] = term900;
        try {
            callMethod(klass, "scalarMultiply", argTypes, term877, args);
            assertTrue(false);
        }
        catch (ArrayIndexOutOfBoundsException e) {
        }

    }

};


