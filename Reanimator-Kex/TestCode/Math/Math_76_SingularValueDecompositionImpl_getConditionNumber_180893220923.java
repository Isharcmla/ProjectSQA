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

public class SingularValueDecompositionImpl_getConditionNumber_180893220923 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term963;
     Object term4366;

    public SingularValueDecompositionImpl_getConditionNumber_180893220923() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term963 = newInstance(Class.forName("org.apache.commons.math.linear.SingularValueDecompositionImpl"));
        Object term966 = newInstance(Class.forName("org.apache.commons.math.linear.BiDiagonalTransformer"));
        Object[] term967 = (Object[]) newArray("[D", 4);
        double[] term968 = (double[]) newDoubleArray(8);
        double[] term977 = (double[]) newDoubleArray(0);
        double[] term978 = (double[]) newDoubleArray(4);
        double[] term983 = (double[]) newDoubleArray(1);
        double[] term985 = (double[]) newDoubleArray(0);
        double[] term986 = (double[]) newDoubleArray(1);
        double[] term988 = (double[]) newDoubleArray(5);
        double[] term994 = (double[]) newDoubleArray(3);
        double[] term998 = (double[]) newDoubleArray(2);
        double[] term1001 = (double[]) newDoubleArray(2);
        double[] term1004 = (double[]) newDoubleArray(5);
        setIntField(term963, term963.getClass(), "m", -1456670397);
        setIntField(term963, term963.getClass(), "n", 1622346318);
        setDoubleElement(term968, 0, 0.16828712051665362);
        setDoubleElement(term968, 1, 0.5975949169840026);
        setDoubleElement(term968, 2, 0.5125207579363754);
        setDoubleElement(term968, 3, 0.1682247220070444);
        setDoubleElement(term968, 4, 0.040825355718595024);
        setDoubleElement(term968, 5, 0.19754021671358302);
        setDoubleElement(term968, 6, 0.905102212387978);
        setDoubleElement(term968, 7, 0.8248232334502307);
        setElement(term967, 0, term968);
        setElement(term967, 1, term977);
        setDoubleElement(term978, 0, 0.4342455781017177);
        setDoubleElement(term978, 1, 0.3169119418035211);
        setDoubleElement(term978, 2, 0.9171660240493722);
        setDoubleElement(term978, 3, 0.9172575643210912);
        setElement(term967, 2, term978);
        setDoubleElement(term983, 0, 0.9776553509238997);
        setElement(term967, 3, term983);
        setField(term966, term966.getClass(), "householderVectors", term967);
        setField(term966, term966.getClass(), "main", term985);
        setDoubleElement(term986, 0, 0.9214187038380094);
        setField(term966, term966.getClass(), "secondary", term986);
        setField(term966, term966.getClass(), "cachedU", null);
        setField(term966, term966.getClass(), "cachedB", null);
        setField(term966, term966.getClass(), "cachedV", null);
        setField(term963, term963.getClass(), "transformer", term966);
        setDoubleElement(term988, 0, 0.1240028694334625);
        setDoubleElement(term988, 1, 0.9336699309532178);
        setDoubleElement(term988, 2, 0.18721227989825073);
        setDoubleElement(term988, 3, 0.2131256081762306);
        setDoubleElement(term988, 4, 0.03588195391803095);
        setField(term963, term963.getClass(), "mainBidiagonal", term988);
        setDoubleElement(term994, 0, 0.7965158013308613);
        setDoubleElement(term994, 1, 0.2875565287844002);
        setDoubleElement(term994, 2, 0.18556961666156768);
        setField(term963, term963.getClass(), "secondaryBidiagonal", term994);
        setDoubleElement(term998, 0, 0.41801713209224123);
        setDoubleElement(term998, 1, 0.010058361776520197);
        setField(term963, term963.getClass(), "mainTridiagonal", term998);
        setDoubleElement(term1001, 0, 0.22206025307636057);
        setDoubleElement(term1001, 1, 0.3762445362551795);
        setField(term963, term963.getClass(), "secondaryTridiagonal", term1001);
        setField(term963, term963.getClass(), "eigenDecomposition", null);
        setDoubleElement(term1004, 0, 0.6004517527698794);
        setDoubleElement(term1004, 1, 0.9412219458975137);
        setDoubleElement(term1004, 2, 0.06469331916225318);
        setDoubleElement(term1004, 3, 0.9259830415214885);
        setDoubleElement(term1004, 4, 0.6688842921741369);
        setField(term963, term963.getClass(), "singularValues", term1004);
        setField(term963, term963.getClass(), "cachedU", null);
        setField(term963, term963.getClass(), "cachedUt", null);
        setField(term963, term963.getClass(), "cachedS", null);
        setField(term963, term963.getClass(), "cachedV", null);
        setField(term963, term963.getClass(), "cachedVt", null);
        term4366 = newInstance(Class.forName("org.apache.commons.math.linear.SingularValueDecompositionImpl"));
        Object term4367 = newInstance(Class.forName("org.apache.commons.math.linear.BiDiagonalTransformer"));
        Object[] term4368 = (Object[]) newArray("[D", 4);
        double[] term4369 = (double[]) newDoubleArray(8);
        double[] term4370 = (double[]) newDoubleArray(0);
        double[] term4371 = (double[]) newDoubleArray(4);
        double[] term4372 = (double[]) newDoubleArray(1);
        double[] term4373 = (double[]) newDoubleArray(0);
        double[] term4374 = (double[]) newDoubleArray(1);
        double[] term4375 = (double[]) newDoubleArray(5);
        double[] term4376 = (double[]) newDoubleArray(3);
        double[] term4377 = (double[]) newDoubleArray(2);
        double[] term4378 = (double[]) newDoubleArray(2);
        double[] term4379 = (double[]) newDoubleArray(5);
        setIntField(term4366, term4366.getClass(), "m", -1456670397);
        setIntField(term4366, term4366.getClass(), "n", 1622346318);
        setDoubleElement(term4369, 0, 0.16828712051665362);
        setDoubleElement(term4369, 1, 0.5975949169840026);
        setDoubleElement(term4369, 2, 0.5125207579363754);
        setDoubleElement(term4369, 3, 0.1682247220070444);
        setDoubleElement(term4369, 4, 0.040825355718595024);
        setDoubleElement(term4369, 5, 0.19754021671358302);
        setDoubleElement(term4369, 6, 0.905102212387978);
        setDoubleElement(term4369, 7, 0.8248232334502307);
        setElement(term4368, 0, term4369);
        setElement(term4368, 1, term4370);
        setDoubleElement(term4371, 0, 0.4342455781017177);
        setDoubleElement(term4371, 1, 0.3169119418035211);
        setDoubleElement(term4371, 2, 0.9171660240493722);
        setDoubleElement(term4371, 3, 0.9172575643210912);
        setElement(term4368, 2, term4371);
        setDoubleElement(term4372, 0, 0.9776553509238997);
        setElement(term4368, 3, term4372);
        setField(term4367, term4367.getClass(), "householderVectors", term4368);
        setField(term4367, term4367.getClass(), "main", term4373);
        setDoubleElement(term4374, 0, 0.9214187038380094);
        setField(term4367, term4367.getClass(), "secondary", term4374);
        setField(term4367, term4367.getClass(), "cachedU", null);
        setField(term4367, term4367.getClass(), "cachedB", null);
        setField(term4367, term4367.getClass(), "cachedV", null);
        setField(term4366, term4366.getClass(), "transformer", term4367);
        setDoubleElement(term4375, 0, 0.1240028694334625);
        setDoubleElement(term4375, 1, 0.9336699309532178);
        setDoubleElement(term4375, 2, 0.18721227989825073);
        setDoubleElement(term4375, 3, 0.2131256081762306);
        setDoubleElement(term4375, 4, 0.03588195391803095);
        setField(term4366, term4366.getClass(), "mainBidiagonal", term4375);
        setDoubleElement(term4376, 0, 0.7965158013308613);
        setDoubleElement(term4376, 1, 0.2875565287844002);
        setDoubleElement(term4376, 2, 0.18556961666156768);
        setField(term4366, term4366.getClass(), "secondaryBidiagonal", term4376);
        setDoubleElement(term4377, 0, 0.41801713209224123);
        setDoubleElement(term4377, 1, 0.010058361776520197);
        setField(term4366, term4366.getClass(), "mainTridiagonal", term4377);
        setDoubleElement(term4378, 0, 0.22206025307636057);
        setDoubleElement(term4378, 1, 0.3762445362551795);
        setField(term4366, term4366.getClass(), "secondaryTridiagonal", term4378);
        setField(term4366, term4366.getClass(), "eigenDecomposition", null);
        setDoubleElement(term4379, 0, 0.6004517527698794);
        setDoubleElement(term4379, 1, 0.9412219458975137);
        setDoubleElement(term4379, 2, 0.06469331916225318);
        setDoubleElement(term4379, 3, 0.9259830415214885);
        setDoubleElement(term4379, 4, 0.6688842921741369);
        setField(term4366, term4366.getClass(), "singularValues", term4379);
        setField(term4366, term4366.getClass(), "cachedU", null);
        setField(term4366, term4366.getClass(), "cachedUt", null);
        setField(term4366, term4366.getClass(), "cachedS", null);
        setField(term4366, term4366.getClass(), "cachedV", null);
        setField(term4366, term4366.getClass(), "cachedVt", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.linear.SingularValueDecompositionImpl");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "getConditionNumber", argTypes, term963, args);
        assertTrue(recursiveEquals(term963, term4366));
        assertTrue(recursiveEquals(retValue, 0.8976915137566994));
    }

};


