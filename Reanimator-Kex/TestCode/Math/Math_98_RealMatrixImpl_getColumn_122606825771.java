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
import java.lang.Integer;

public class RealMatrixImpl_getColumn_122606825771 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2508;
     Object term2526;

    public RealMatrixImpl_getColumn_122606825771() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2508 = newInstance(Class.forName("org.apache.commons.math.linear.RealMatrixImpl"));
        Object[] term2509 = (Object[]) newArray("[D", 0);
        Object[] term2510 = (Object[]) newArray("[D", 2);
        double[] term2511 = (double[]) newDoubleArray(5);
        double[] term2517 = (double[]) newDoubleArray(0);
        int[] term2518 = (int[]) newIntArray(6);
        setField(term2508, term2508.getClass(), "data", term2509);
        setDoubleElement(term2511, 0, 0.5726119417156881);
        setDoubleElement(term2511, 1, 0.190417489318088);
        setDoubleElement(term2511, 2, 0.6263202945251085);
        setDoubleElement(term2511, 3, 0.47971707140048314);
        setDoubleElement(term2511, 4, 0.11814755873301563);
        setElement(term2510, 0, term2511);
        setElement(term2510, 1, term2517);
        setField(term2508, term2508.getClass(), "lu", term2510);
        setIntElement(term2518, 0, -663691365);
        setIntElement(term2518, 1, 339854490);
        setIntElement(term2518, 2, -615654495);
        setIntElement(term2518, 3, -1476117762);
        setIntElement(term2518, 4, -341962980);
        setIntElement(term2518, 5, 1532716628);
        setField(term2508, term2508.getClass(), "permutation", term2518);
        setIntField(term2508, term2508.getClass(), "parity", 1);
        term2526 = new Integer(-1801760683);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.linear.RealMatrixImpl");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term2526;
        try {
            callMethod(klass, "getColumn", argTypes, term2508, args);
            assertTrue(false);
        }
        catch (ArrayIndexOutOfBoundsException e) {
        }

    }

};


