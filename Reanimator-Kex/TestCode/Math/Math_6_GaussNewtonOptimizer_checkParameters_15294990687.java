package org.apache.commons.math3.optim.nonlinear.vector.jacobian;

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
import org.apache.commons.math3.exception.MathUnsupportedOperationException;
import static org.apache.commons.math3.optim.nonlinear.vector.jacobian.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class GaussNewtonOptimizer_checkParameters_15294990687 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term50;

    public GaussNewtonOptimizer_checkParameters_15294990687() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term50 = newInstance(Class.forName("org.apache.commons.math3.optim.nonlinear.vector.jacobian.GaussNewtonOptimizer"));
        double[] term53 = (double[]) newDoubleArray(1);
        double[] term55 = (double[]) newDoubleArray(6);
        double[] term62 = (double[]) newDoubleArray(2);
        double[] term65 = (double[]) newDoubleArray(6);
        Object term72 = newInstance(Class.forName("org.apache.commons.math3.util.Incrementor"));
        Object term75 = newInstance(Class.forName("org.apache.commons.math3.util.Incrementor$1"));
        Object term76 = newInstance(Class.forName("org.apache.commons.math3.util.Incrementor"));
        Object term79 = newInstance(Class.forName("org.apache.commons.math3.util.Incrementor$1"));
        setBooleanField(term50, term50.getClass(), "useLU", false);
        setField(term50, term50.getClass(), "weightMatrixSqrt", null);
        setDoubleField(term50, term50.getClass(), "cost", 0.2779719046761513);
        setField(term50, term50.getClass(), "jacobian", null);
        setDoubleElement(term53, 0, 0.6436713023569729);
        setField(term50, term50.getClass(), "target", term53);
        setField(term50, term50.getClass(), "weightMatrix", null);
        setField(term50, term50.getClass(), "model", null);
        setDoubleElement(term55, 0, 0.7332741045694002);
        setDoubleElement(term55, 1, 0.4569171842750229);
        setDoubleElement(term55, 2, 0.8598297828918529);
        setDoubleElement(term55, 3, 0.43692187681405226);
        setDoubleElement(term55, 4, 0.7633268466829064);
        setDoubleElement(term55, 5, 0.13481025392611334);
        setField(term50, term50.getClass(), "start", term55);
        setDoubleElement(term62, 0, 0.3800088629986428);
        setDoubleElement(term62, 1, 0.5840714198152577);
        setField(term50, term50.getClass(), "lowerBound", term62);
        setDoubleElement(term65, 0, 0.7559240768573477);
        setDoubleElement(term65, 1, 0.10667076642995188);
        setDoubleElement(term65, 2, 0.11493000848982304);
        setDoubleElement(term65, 3, 0.37161417339133307);
        setDoubleElement(term65, 4, 0.6805867182029153);
        setDoubleElement(term65, 5, 0.2852810965221698);
        setField(term50, term50.getClass(), "upperBound", term65);
        setIntField(term72, term72.getClass(), "maximalCount", -1922583790);
        setIntField(term72, term72.getClass(), "count", -616727354);
        setField(term72, term72.getClass(), "maxCountCallback", term75);
        setField(term50, term50.getClass(), "evaluations", term72);
        setIntField(term76, term76.getClass(), "maximalCount", -1955890973);
        setIntField(term76, term76.getClass(), "count", -2038273078);
        setField(term76, term76.getClass(), "maxCountCallback", term79);
        setField(term50, term50.getClass(), "iterations", term76);
        setField(term50, term50.getClass(), "checker", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math3.optim.nonlinear.vector.jacobian.GaussNewtonOptimizer");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "checkParameters", argTypes, term50, args);
            assertTrue(false);
        }
        catch (MathUnsupportedOperationException e) {
        }

    }

};


