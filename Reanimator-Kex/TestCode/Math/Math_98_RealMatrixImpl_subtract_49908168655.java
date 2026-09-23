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

public class RealMatrixImpl_subtract_49908168655 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term465;

    public RealMatrixImpl_subtract_49908168655() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term465 = newInstance(Class.forName("org.apache.commons.math.linear.RealMatrixImpl"));
        Object[] term466 = (Object[]) newArray("[D", 0);
        Object[] term467 = (Object[]) newArray("[D", 2);
        double[] term468 = (double[]) newDoubleArray(7);
        double[] term476 = (double[]) newDoubleArray(2);
        int[] term479 = (int[]) newIntArray(9);
        setField(term465, term465.getClass(), "data", term466);
        setDoubleElement(term468, 0, 0.25997329921466494);
        setDoubleElement(term468, 1, 0.7814864708383836);
        setDoubleElement(term468, 2, 0.5657654165545906);
        setDoubleElement(term468, 3, 0.6382060245198228);
        setDoubleElement(term468, 4, 0.1849998667663698);
        setDoubleElement(term468, 5, 0.36312400202399575);
        setDoubleElement(term468, 6, 0.5485690030548175);
        setElement(term467, 0, term468);
        setDoubleElement(term476, 0, 0.9765248027281291);
        setDoubleElement(term476, 1, 0.9184034277897645);
        setElement(term467, 1, term476);
        setField(term465, term465.getClass(), "lu", term467);
        setIntElement(term479, 0, 1622346318);
        setIntElement(term479, 1, 1048535127);
        setIntElement(term479, 2, -655067527);
        setIntElement(term479, 3, -6029667);
        setIntElement(term479, 4, -2068769794);
        setIntElement(term479, 5, -117576464);
        setIntElement(term479, 6, -1007160944);
        setIntElement(term479, 7, 1135664017);
        setIntElement(term479, 8, 590364439);
        setField(term465, term465.getClass(), "permutation", term479);
        setIntField(term465, term465.getClass(), "parity", 1);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.linear.RealMatrixImpl");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.math.linear.RealMatrix");
        Object[] args = new Object[1];
        args[0] = null;
        try {
            callMethod(klass, "subtract", argTypes, term465, args);
            assertTrue(false);
        }
        catch (ArrayIndexOutOfBoundsException e) {
        }

    }

};


