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
import java.lang.NullPointerException;
import static org.apache.commons.math.linear.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class SingularValueDecompositionImpl_getU_209232149015 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3;

    public SingularValueDecompositionImpl_getU_209232149015() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3 = newInstance(Class.forName("org.apache.commons.math.linear.SingularValueDecompositionImpl"));
        Object term6 = newInstance(Class.forName("org.apache.commons.math.linear.BiDiagonalTransformer"));
        Object[] term7 = (Object[]) newArray("[D", 5);
        double[] term8 = (double[]) newDoubleArray(4);
        double[] term13 = (double[]) newDoubleArray(3);
        double[] term17 = (double[]) newDoubleArray(4);
        double[] term22 = (double[]) newDoubleArray(1);
        double[] term24 = (double[]) newDoubleArray(6);
        double[] term31 = (double[]) newDoubleArray(2);
        double[] term34 = (double[]) newDoubleArray(6);
        double[] term41 = (double[]) newDoubleArray(7);
        double[] term49 = (double[]) newDoubleArray(1);
        double[] term51 = (double[]) newDoubleArray(6);
        double[] term58 = (double[]) newDoubleArray(5);
        double[] term64 = (double[]) newDoubleArray(5);
        setIntField(term3, term3.getClass(), "m", 1162663216);
        setIntField(term3, term3.getClass(), "n", 1484323161);
        setDoubleElement(term8, 0, 0.13238746331190498);
        setDoubleElement(term8, 1, 0.3455959125047594);
        setDoubleElement(term8, 2, 0.5523635872663106);
        setDoubleElement(term8, 3, 0.544608645520025);
        setElement(term7, 0, term8);
        setDoubleElement(term13, 0, 0.28570734989730284);
        setDoubleElement(term13, 1, 0.40176586625454525);
        setDoubleElement(term13, 2, 0.2641345529914265);
        setElement(term7, 1, term13);
        setDoubleElement(term17, 0, 0.36923381893433327);
        setDoubleElement(term17, 1, 0.6076495596892013);
        setDoubleElement(term17, 2, 0.37773193782763337);
        setDoubleElement(term17, 3, 0.8474802076607362);
        setElement(term7, 2, term17);
        setDoubleElement(term22, 0, 0.5183269973490326);
        setElement(term7, 3, term22);
        setDoubleElement(term24, 0, 0.7655020693602768);
        setDoubleElement(term24, 1, 0.1374549299694151);
        setDoubleElement(term24, 2, 0.7031006357544823);
        setDoubleElement(term24, 3, 0.9527281779865117);
        setDoubleElement(term24, 4, 0.9828442029246764);
        setDoubleElement(term24, 5, 0.2779719046761513);
        setElement(term7, 4, term24);
        setField(term6, term6.getClass(), "householderVectors", term7);
        setDoubleElement(term31, 0, 0.6436713023569729);
        setDoubleElement(term31, 1, 0.7332741045694002);
        setField(term6, term6.getClass(), "main", term31);
        setDoubleElement(term34, 0, 0.4569171842750229);
        setDoubleElement(term34, 1, 0.8598297828918529);
        setDoubleElement(term34, 2, 0.43692187681405226);
        setDoubleElement(term34, 3, 0.7633268466829064);
        setDoubleElement(term34, 4, 0.13481025392611334);
        setDoubleElement(term34, 5, 0.3800088629986428);
        setField(term6, term6.getClass(), "secondary", term34);
        setField(term6, term6.getClass(), "cachedU", null);
        setField(term6, term6.getClass(), "cachedB", null);
        setField(term6, term6.getClass(), "cachedV", null);
        setField(term3, term3.getClass(), "transformer", term6);
        setDoubleElement(term41, 0, 0.5840714198152577);
        setDoubleElement(term41, 1, 0.7559240768573477);
        setDoubleElement(term41, 2, 0.10667076642995188);
        setDoubleElement(term41, 3, 0.11493000848982304);
        setDoubleElement(term41, 4, 0.37161417339133307);
        setDoubleElement(term41, 5, 0.6805867182029153);
        setDoubleElement(term41, 6, 0.2852810965221698);
        setField(term3, term3.getClass(), "mainBidiagonal", term41);
        setDoubleElement(term49, 0, 0.6300849762307866);
        setField(term3, term3.getClass(), "secondaryBidiagonal", term49);
        setDoubleElement(term51, 0, 0.9737083944266686);
        setDoubleElement(term51, 1, 0.0668892744806211);
        setDoubleElement(term51, 2, 0.3587267442738795);
        setDoubleElement(term51, 3, 0.07802449704920456);
        setDoubleElement(term51, 4, 0.5279279537140873);
        setDoubleElement(term51, 5, 0.3202192021706908);
        setField(term3, term3.getClass(), "mainTridiagonal", term51);
        setDoubleElement(term58, 0, 0.22651340641904605);
        setDoubleElement(term58, 1, 0.8878841294187743);
        setDoubleElement(term58, 2, 0.6588948704887806);
        setDoubleElement(term58, 3, 0.6397214730945112);
        setDoubleElement(term58, 4, 0.25937345430928016);
        setField(term3, term3.getClass(), "secondaryTridiagonal", term58);
        setField(term3, term3.getClass(), "eigenDecomposition", null);
        setDoubleElement(term64, 0, 0.5873228247510078);
        setDoubleElement(term64, 1, 0.8823181080774973);
        setDoubleElement(term64, 2, 0.2192450926212024);
        setDoubleElement(term64, 3, 0.7591353014991907);
        setDoubleElement(term64, 4, 0.791695029600875);
        setField(term3, term3.getClass(), "singularValues", term64);
        setField(term3, term3.getClass(), "cachedU", null);
        setField(term3, term3.getClass(), "cachedUt", null);
        setField(term3, term3.getClass(), "cachedS", null);
        setField(term3, term3.getClass(), "cachedV", null);
        setField(term3, term3.getClass(), "cachedVt", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.linear.SingularValueDecompositionImpl");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "getU", argTypes, term3, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


