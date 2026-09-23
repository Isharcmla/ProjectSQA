package org.apache.commons.math3.optim.nonlinear.scalar.noderiv;

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
import static org.apache.commons.math3.optim.nonlinear.scalar.noderiv.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.lang.String;

public class PowellOptimizer_doOptimize_186967476611 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term25;

    public PowellOptimizer_doOptimize_186967476611() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term3715 = Class.forName((String) "org.apache.commons.math3.optim.nonlinear.scalar.GoalType");
        Field term3714 = ((Class) term3715).getDeclaredField((String) "MAXIMIZE");
        ((Field) term3714).setAccessible(true);
        Object enum3 = ((Field) term3714).get((Object) null);
        term25 = newInstance(Class.forName("org.apache.commons.math3.optim.nonlinear.scalar.noderiv.PowellOptimizer"));
        Object term28 = newInstance(Class.forName("org.apache.commons.math3.optim.nonlinear.scalar.noderiv.PowellOptimizer$LineSearch"));
        Object term29 = newInstance(Class.forName("org.apache.commons.math3.optim.univariate.BracketFinder"));
        Object term31 = newInstance(Class.forName("org.apache.commons.math3.util.Incrementor"));
        Object term34 = newInstance(Class.forName("org.apache.commons.math3.util.Incrementor$1"));
        Object term58 = newInstance(Class.forName("org.apache.commons.math3.util.Incrementor"));
        Object term61 = newInstance(Class.forName("org.apache.commons.math3.util.Incrementor$1"));
        Object term62 = newInstance(Class.forName("org.apache.commons.math3.util.Incrementor"));
        Object term65 = newInstance(Class.forName("org.apache.commons.math3.util.Incrementor$1"));
        double[] term66 = (double[]) newDoubleArray(5);
        double[] term72 = (double[]) newDoubleArray(4);
        double[] term77 = (double[]) newDoubleArray(3);
        Object term81 = newInstance(Class.forName("org.apache.commons.math3.util.Incrementor"));
        Object term84 = newInstance(Class.forName("org.apache.commons.math3.util.Incrementor$1"));
        Object term85 = newInstance(Class.forName("org.apache.commons.math3.util.Incrementor"));
        Object term88 = newInstance(Class.forName("org.apache.commons.math3.util.Incrementor$1"));
        setDoubleField(term25, term25.getClass(), "relativeThreshold", 0.7655020693602768);
        setDoubleField(term25, term25.getClass(), "absoluteThreshold", 0.1374549299694151);
        setDoubleField(term29, term29.getClass(), "growLimit", 100.0);
        setIntField(term31, term31.getClass(), "maximalCount", 50);
        setIntField(term31, term31.getClass(), "count", 0);
        setField(term31, term31.getClass(), "maxCountCallback", term34);
        setField(term29, term29.getClass(), "evaluations", term31);
        setDoubleField(term29, term29.getClass(), "lo", 0.7031006357544823);
        setDoubleField(term29, term29.getClass(), "hi", 0.9527281779865117);
        setDoubleField(term29, term29.getClass(), "mid", 0.9828442029246764);
        setDoubleField(term29, term29.getClass(), "fLo", 0.2779719046761513);
        setDoubleField(term29, term29.getClass(), "fHi", 0.6436713023569729);
        setDoubleField(term29, term29.getClass(), "fMid", 0.7332741045694002);
        setField(term28, term28.getClass(), "bracket", term29);
        setField(term28, term28.getClass(), "this$0", null);
        setDoubleField(term28, term28.getClass(), "relativeThreshold", 0.4569171842750229);
        setDoubleField(term28, term28.getClass(), "absoluteThreshold", 0.8598297828918529);
        setField(term28, term28.getClass(), "function", null);
        setField(term28, term28.getClass(), "goal", enum3);
        setDoubleField(term28, term28.getClass(), "start", 0.43692187681405226);
        setDoubleField(term28, term28.getClass(), "min", 0.7633268466829064);
        setDoubleField(term28, term28.getClass(), "max", 0.13481025392611334);
        setIntField(term58, term58.getClass(), "maximalCount", 568599855);
        setIntField(term58, term58.getClass(), "count", 1162663216);
        setField(term58, term58.getClass(), "maxCountCallback", term61);
        setField(term28, term28.getClass(), "evaluations", term58);
        setIntField(term62, term62.getClass(), "maximalCount", 1484323161);
        setIntField(term62, term62.getClass(), "count", 391863371);
        setField(term62, term62.getClass(), "maxCountCallback", term65);
        setField(term28, term28.getClass(), "iterations", term62);
        setField(term28, term28.getClass(), "checker", null);
        setField(term25, term25.getClass(), "line", term28);
        setField(term25, term25.getClass(), "function", null);
        setField(term25, term25.getClass(), "goal", enum3);
        setDoubleElement(term66, 0, 0.3800088629986428);
        setDoubleElement(term66, 1, 0.5840714198152577);
        setDoubleElement(term66, 2, 0.7559240768573477);
        setDoubleElement(term66, 3, 0.10667076642995188);
        setDoubleElement(term66, 4, 0.11493000848982304);
        setField(term25, term25.getClass(), "start", term66);
        setDoubleElement(term72, 0, 0.37161417339133307);
        setDoubleElement(term72, 1, 0.6805867182029153);
        setDoubleElement(term72, 2, 0.2852810965221698);
        setDoubleElement(term72, 3, 0.6300849762307866);
        setField(term25, term25.getClass(), "lowerBound", term72);
        setDoubleElement(term77, 0, 0.9737083944266686);
        setDoubleElement(term77, 1, 0.0668892744806211);
        setDoubleElement(term77, 2, 0.3587267442738795);
        setField(term25, term25.getClass(), "upperBound", term77);
        setIntField(term81, term81.getClass(), "maximalCount", -1922583790);
        setIntField(term81, term81.getClass(), "count", -616727354);
        setField(term81, term81.getClass(), "maxCountCallback", term84);
        setField(term25, term25.getClass(), "evaluations", term81);
        setIntField(term85, term85.getClass(), "maximalCount", -1955890973);
        setIntField(term85, term85.getClass(), "count", -2038273078);
        setField(term85, term85.getClass(), "maxCountCallback", term88);
        setField(term25, term25.getClass(), "iterations", term85);
        setField(term25, term25.getClass(), "checker", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math3.optim.nonlinear.scalar.noderiv.PowellOptimizer");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "doOptimize", argTypes, term25, args);
            assertTrue(false);
        }
        catch (MathUnsupportedOperationException e) {
        }

    }

};


