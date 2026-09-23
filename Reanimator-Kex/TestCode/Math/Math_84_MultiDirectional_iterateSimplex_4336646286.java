package org.apache.commons.math.optimization.direct;

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
import static org.apache.commons.math.optimization.direct.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class MultiDirectional_iterateSimplex_4336646286 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5;

    public MultiDirectional_iterateSimplex_4336646286() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term5 = newInstance(Class.forName("org.apache.commons.math.optimization.direct.MultiDirectional"));
        Object[] term8 = (Object[]) newArray("org.apache.commons.math.optimization.RealPointValuePair", 5);
        Object term9 = newInstance(Class.forName("org.apache.commons.math.optimization.RealPointValuePair"));
        double[] term10 = (double[]) newDoubleArray(4);
        Object term16 = newInstance(Class.forName("org.apache.commons.math.optimization.RealPointValuePair"));
        double[] term17 = (double[]) newDoubleArray(3);
        Object term22 = newInstance(Class.forName("org.apache.commons.math.optimization.RealPointValuePair"));
        double[] term23 = (double[]) newDoubleArray(4);
        Object term29 = newInstance(Class.forName("org.apache.commons.math.optimization.RealPointValuePair"));
        double[] term30 = (double[]) newDoubleArray(1);
        Object term33 = newInstance(Class.forName("org.apache.commons.math.optimization.RealPointValuePair"));
        double[] term34 = (double[]) newDoubleArray(6);
        Object term42 = newInstance(Class.forName("org.apache.commons.math.optimization.SimpleScalarValueChecker"));
        Object[] term49 = (Object[]) newArray("[D", 2);
        double[] term50 = (double[]) newDoubleArray(6);
        double[] term57 = (double[]) newDoubleArray(7);
        setDoubleField(term5, term5.getClass(), "khi", 2.0);
        setDoubleField(term5, term5.getClass(), "gamma", 0.5);
        setDoubleElement(term10, 0, 0.5523635872663106);
        setDoubleElement(term10, 1, 0.544608645520025);
        setDoubleElement(term10, 2, 0.28570734989730284);
        setDoubleElement(term10, 3, 0.40176586625454525);
        setField(term9, term9.getClass(), "point", term10);
        setDoubleField(term9, term9.getClass(), "value", 0.2641345529914265);
        setElement(term8, 0, term9);
        setDoubleElement(term17, 0, 0.36923381893433327);
        setDoubleElement(term17, 1, 0.6076495596892013);
        setDoubleElement(term17, 2, 0.37773193782763337);
        setField(term16, term16.getClass(), "point", term17);
        setDoubleField(term16, term16.getClass(), "value", 0.8474802076607362);
        setElement(term8, 1, term16);
        setDoubleElement(term23, 0, 0.5183269973490326);
        setDoubleElement(term23, 1, 0.7655020693602768);
        setDoubleElement(term23, 2, 0.1374549299694151);
        setDoubleElement(term23, 3, 0.7031006357544823);
        setField(term22, term22.getClass(), "point", term23);
        setDoubleField(term22, term22.getClass(), "value", 0.9527281779865117);
        setElement(term8, 2, term22);
        setDoubleElement(term30, 0, 0.9828442029246764);
        setField(term29, term29.getClass(), "point", term30);
        setDoubleField(term29, term29.getClass(), "value", 0.2779719046761513);
        setElement(term8, 3, term29);
        setDoubleElement(term34, 0, 0.6436713023569729);
        setDoubleElement(term34, 1, 0.7332741045694002);
        setDoubleElement(term34, 2, 0.4569171842750229);
        setDoubleElement(term34, 3, 0.8598297828918529);
        setDoubleElement(term34, 4, 0.43692187681405226);
        setDoubleElement(term34, 5, 0.7633268466829064);
        setField(term33, term33.getClass(), "point", term34);
        setDoubleField(term33, term33.getClass(), "value", 0.13481025392611334);
        setElement(term8, 4, term33);
        setField(term5, term5.getClass(), "simplex", term8);
        setField(term5, term5.getClass(), "f", null);
        setDoubleField(term42, term42.getClass(), "relativeThreshold", 1.1102230246251565E-14);
        setDoubleField(term42, term42.getClass(), "absoluteThreshold", 2.2250738585072014E-306);
        setField(term5, term5.getClass(), "checker", term42);
        setIntField(term5, term5.getClass(), "maxIterations", 2147483647);
        setIntField(term5, term5.getClass(), "iterations", 568599855);
        setIntField(term5, term5.getClass(), "maxEvaluations", 2147483647);
        setIntField(term5, term5.getClass(), "evaluations", 1162663216);
        setDoubleElement(term50, 0, 0.3800088629986428);
        setDoubleElement(term50, 1, 0.5840714198152577);
        setDoubleElement(term50, 2, 0.7559240768573477);
        setDoubleElement(term50, 3, 0.10667076642995188);
        setDoubleElement(term50, 4, 0.11493000848982304);
        setDoubleElement(term50, 5, 0.37161417339133307);
        setElement(term49, 0, term50);
        setDoubleElement(term57, 0, 0.6805867182029153);
        setDoubleElement(term57, 1, 0.2852810965221698);
        setDoubleElement(term57, 2, 0.6300849762307866);
        setDoubleElement(term57, 3, 0.9737083944266686);
        setDoubleElement(term57, 4, 0.0668892744806211);
        setDoubleElement(term57, 5, 0.3587267442738795);
        setDoubleElement(term57, 6, 0.07802449704920456);
        setElement(term49, 1, term57);
        setField(term5, term5.getClass(), "startConfiguration", term49);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.optimization.direct.MultiDirectional");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.Comparator");
        Object[] args = new Object[1];
        args[0] = null;
        try {
            callMethod(klass, "iterateSimplex", argTypes, term5, args);
            assertTrue(false);
        }
        catch (ArrayIndexOutOfBoundsException e) {
        }

    }

};


