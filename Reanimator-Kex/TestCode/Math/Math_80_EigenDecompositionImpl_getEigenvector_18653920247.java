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

public class EigenDecompositionImpl_getEigenvector_18653920247 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1328;
     Object term1405;

    public EigenDecompositionImpl_getEigenvector_18653920247() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1328 = newInstance(Class.forName("org.apache.commons.math.linear.EigenDecompositionImpl"));
        double[] term1330 = (double[]) newDoubleArray(5);
        double[] term1336 = (double[]) newDoubleArray(6);
        double[] term1343 = (double[]) newDoubleArray(3);
        Object term1347 = newInstance(Class.forName("org.apache.commons.math.linear.TriDiagonalTransformer"));
        Object[] term1348 = (Object[]) newArray("[D", 0);
        double[] term1349 = (double[]) newDoubleArray(5);
        double[] term1355 = (double[]) newDoubleArray(6);
        double[] term1368 = (double[]) newDoubleArray(0);
        double[] term1380 = (double[]) newDoubleArray(3);
        double[] term1384 = (double[]) newDoubleArray(1);
        Object[] term1386 = (Object[]) newArray("org.apache.commons.math.linear.ArrayRealVector", 9);
        Object term1387 = newInstance(Class.forName("org.apache.commons.math.linear.ArrayRealVector"));
        double[] term1388 = (double[]) newDoubleArray(0);
        Object term1389 = newInstance(Class.forName("org.apache.commons.math.linear.ArrayRealVector"));
        double[] term1390 = (double[]) newDoubleArray(0);
        Object term1391 = newInstance(Class.forName("org.apache.commons.math.linear.ArrayRealVector"));
        double[] term1392 = (double[]) newDoubleArray(0);
        Object term1393 = newInstance(Class.forName("org.apache.commons.math.linear.ArrayRealVector"));
        double[] term1394 = (double[]) newDoubleArray(0);
        Object term1395 = newInstance(Class.forName("org.apache.commons.math.linear.ArrayRealVector"));
        double[] term1396 = (double[]) newDoubleArray(0);
        Object term1397 = newInstance(Class.forName("org.apache.commons.math.linear.ArrayRealVector"));
        double[] term1398 = (double[]) newDoubleArray(0);
        Object term1399 = newInstance(Class.forName("org.apache.commons.math.linear.ArrayRealVector"));
        double[] term1400 = (double[]) newDoubleArray(0);
        Object term1401 = newInstance(Class.forName("org.apache.commons.math.linear.ArrayRealVector"));
        double[] term1402 = (double[]) newDoubleArray(0);
        Object term1403 = newInstance(Class.forName("org.apache.commons.math.linear.ArrayRealVector"));
        double[] term1404 = (double[]) newDoubleArray(0);
        setDoubleField(term1328, term1328.getClass(), "splitTolerance", 0.2682123119817419);
        setDoubleElement(term1330, 0, 0.2465788293643847);
        setDoubleElement(term1330, 1, 0.9194156323780788);
        setDoubleElement(term1330, 2, 0.2589672937578553);
        setDoubleElement(term1330, 3, 0.3503400017331547);
        setDoubleElement(term1330, 4, 0.8271286757001508);
        setField(term1328, term1328.getClass(), "main", term1330);
        setDoubleElement(term1336, 0, 0.6335804422604819);
        setDoubleElement(term1336, 1, 0.7981127611687099);
        setDoubleElement(term1336, 2, 0.4279162427372558);
        setDoubleElement(term1336, 3, 0.49094002611486065);
        setDoubleElement(term1336, 4, 0.42544116787510533);
        setDoubleElement(term1336, 5, 0.4841923400566003);
        setField(term1328, term1328.getClass(), "secondary", term1336);
        setDoubleElement(term1343, 0, 0.7630673805338225);
        setDoubleElement(term1343, 1, 0.9281656729617184);
        setDoubleElement(term1343, 2, 0.6107111302126562);
        setField(term1328, term1328.getClass(), "squaredSecondary", term1343);
        setField(term1347, term1347.getClass(), "householderVectors", term1348);
        setDoubleElement(term1349, 0, 0.682853703128826);
        setDoubleElement(term1349, 1, 0.3175549148584229);
        setDoubleElement(term1349, 2, 0.19843723313022976);
        setDoubleElement(term1349, 3, 0.5548677303832933);
        setDoubleElement(term1349, 4, 0.1916613619544515);
        setField(term1347, term1347.getClass(), "main", term1349);
        setDoubleElement(term1355, 0, 0.21883508391220008);
        setDoubleElement(term1355, 1, 0.21718677136334108);
        setDoubleElement(term1355, 2, 0.6577119694943789);
        setDoubleElement(term1355, 3, 0.5285216928887116);
        setDoubleElement(term1355, 4, 0.35049760295845667);
        setDoubleElement(term1355, 5, 0.7124244945678292);
        setField(term1347, term1347.getClass(), "secondary", term1355);
        setField(term1347, term1347.getClass(), "cachedQ", null);
        setField(term1347, term1347.getClass(), "cachedQt", null);
        setField(term1347, term1347.getClass(), "cachedT", null);
        setField(term1328, term1328.getClass(), "transformer", term1347);
        setDoubleField(term1328, term1328.getClass(), "lowerSpectra", 0.10349659570695524);
        setDoubleField(term1328, term1328.getClass(), "upperSpectra", 0.46078217363073126);
        setDoubleField(term1328, term1328.getClass(), "minPivot", 0.3389647053819348);
        setDoubleField(term1328, term1328.getClass(), "sigma", 0.2151134774049427);
        setDoubleField(term1328, term1328.getClass(), "sigmaLow", 0.14703921400520792);
        setDoubleField(term1328, term1328.getClass(), "tau", 0.9343367310647196);
        setField(term1328, term1328.getClass(), "work", term1368);
        setIntField(term1328, term1328.getClass(), "pingPong", -655067527);
        setDoubleField(term1328, term1328.getClass(), "qMax", 0.5569644096083258);
        setDoubleField(term1328, term1328.getClass(), "eMin", 0.7527275444646349);
        setIntField(term1328, term1328.getClass(), "tType", -6029667);
        setDoubleField(term1328, term1328.getClass(), "dMin", 0.38299462989514377);
        setDoubleField(term1328, term1328.getClass(), "dMin1", 0.12164012123809098);
        setDoubleField(term1328, term1328.getClass(), "dMin2", 0.019174439062670467);
        setDoubleField(term1328, term1328.getClass(), "dN", 0.17827385312846922);
        setDoubleField(term1328, term1328.getClass(), "dN1", 0.5284679973716927);
        setDoubleField(term1328, term1328.getClass(), "dN2", 0.5233539642461534);
        setDoubleField(term1328, term1328.getClass(), "g", 0.2065669149596887);
        setDoubleElement(term1380, 0, 0.48600687227277806);
        setDoubleElement(term1380, 1, 0.7384086133828546);
        setDoubleElement(term1380, 2, 0.9304178842125251);
        setField(term1328, term1328.getClass(), "realEigenvalues", term1380);
        setDoubleElement(term1384, 0, 0.9233657088240451);
        setField(term1328, term1328.getClass(), "imagEigenvalues", term1384);
        setField(term1387, term1387.getClass(), "data", term1388);
        setElement(term1386, 0, term1387);
        setField(term1389, term1389.getClass(), "data", term1390);
        setElement(term1386, 1, term1389);
        setField(term1391, term1391.getClass(), "data", term1392);
        setElement(term1386, 2, term1391);
        setField(term1393, term1393.getClass(), "data", term1394);
        setElement(term1386, 3, term1393);
        setField(term1395, term1395.getClass(), "data", term1396);
        setElement(term1386, 4, term1395);
        setField(term1397, term1397.getClass(), "data", term1398);
        setElement(term1386, 5, term1397);
        setField(term1399, term1399.getClass(), "data", term1400);
        setElement(term1386, 6, term1399);
        setField(term1401, term1401.getClass(), "data", term1402);
        setElement(term1386, 7, term1401);
        setField(term1403, term1403.getClass(), "data", term1404);
        setElement(term1386, 8, term1403);
        setField(term1328, term1328.getClass(), "eigenvectors", term1386);
        setField(term1328, term1328.getClass(), "cachedV", null);
        setField(term1328, term1328.getClass(), "cachedD", null);
        setField(term1328, term1328.getClass(), "cachedVt", null);
        term1405 = new Integer(-2068769794);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.linear.EigenDecompositionImpl");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term1405;
        try {
            callMethod(klass, "getEigenvector", argTypes, term1328, args);
            assertTrue(false);
        }
        catch (ArrayIndexOutOfBoundsException e) {
        }

    }

};


