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
import org.apache.commons.math.linear.MatrixIndexException;
import static org.apache.commons.math.linear.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.lang.Integer;

public class RealMatrixImpl_getColumnMatrix_65861905469 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2312;
     Object term2386;

    public RealMatrixImpl_getColumnMatrix_65861905469() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2312 = newInstance(Class.forName("org.apache.commons.math.linear.RealMatrixImpl"));
        Object[] term2313 = (Object[]) newArray("[D", 9);
        double[] term2314 = (double[]) newDoubleArray(0);
        double[] term2315 = (double[]) newDoubleArray(4);
        double[] term2320 = (double[]) newDoubleArray(4);
        double[] term2325 = (double[]) newDoubleArray(9);
        double[] term2335 = (double[]) newDoubleArray(3);
        double[] term2339 = (double[]) newDoubleArray(1);
        double[] term2341 = (double[]) newDoubleArray(5);
        double[] term2347 = (double[]) newDoubleArray(5);
        double[] term2353 = (double[]) newDoubleArray(8);
        Object[] term2362 = (Object[]) newArray("[D", 3);
        double[] term2363 = (double[]) newDoubleArray(6);
        double[] term2370 = (double[]) newDoubleArray(8);
        double[] term2379 = (double[]) newDoubleArray(3);
        int[] term2383 = (int[]) newIntArray(1);
        setElement(term2313, 0, term2314);
        setDoubleElement(term2315, 0, 0.5089649018567155);
        setDoubleElement(term2315, 1, 0.43450494104339743);
        setDoubleElement(term2315, 2, 0.033779151946421004);
        setDoubleElement(term2315, 3, 0.6244268006923053);
        setElement(term2313, 1, term2315);
        setDoubleElement(term2320, 0, 0.7143627594521448);
        setDoubleElement(term2320, 1, 0.11515719123986734);
        setDoubleElement(term2320, 2, 0.6413275352493107);
        setDoubleElement(term2320, 3, 0.9220677404866297);
        setElement(term2313, 2, term2320);
        setDoubleElement(term2325, 0, 0.4631036210522135);
        setDoubleElement(term2325, 1, 0.5673015329740946);
        setDoubleElement(term2325, 2, 0.24319604766284109);
        setDoubleElement(term2325, 3, 0.6819755234378504);
        setDoubleElement(term2325, 4, 0.7649032655562676);
        setDoubleElement(term2325, 5, 0.8134618920903623);
        setDoubleElement(term2325, 6, 0.8407288422993372);
        setDoubleElement(term2325, 7, 0.9588643380074068);
        setDoubleElement(term2325, 8, 0.8994044184659324);
        setElement(term2313, 3, term2325);
        setDoubleElement(term2335, 0, 0.6511212982355623);
        setDoubleElement(term2335, 1, 0.7930471696628196);
        setDoubleElement(term2335, 2, 0.9221738550316857);
        setElement(term2313, 4, term2335);
        setDoubleElement(term2339, 0, 0.9500688909740819);
        setElement(term2313, 5, term2339);
        setDoubleElement(term2341, 0, 0.41321123504241286);
        setDoubleElement(term2341, 1, 0.958732192900248);
        setDoubleElement(term2341, 2, 0.3781613978725693);
        setDoubleElement(term2341, 3, 0.6175317872196219);
        setDoubleElement(term2341, 4, 0.49445972971731134);
        setElement(term2313, 6, term2341);
        setDoubleElement(term2347, 0, 0.8508105832793618);
        setDoubleElement(term2347, 1, 0.7439643323924844);
        setDoubleElement(term2347, 2, 0.5332733444461174);
        setDoubleElement(term2347, 3, 0.22407276183101443);
        setDoubleElement(term2347, 4, 0.7705274550148203);
        setElement(term2313, 7, term2347);
        setDoubleElement(term2353, 0, 0.4901425510526187);
        setDoubleElement(term2353, 1, 0.07278410950877034);
        setDoubleElement(term2353, 2, 0.8888570821168202);
        setDoubleElement(term2353, 3, 0.8668367864011388);
        setDoubleElement(term2353, 4, 0.6199687921970567);
        setDoubleElement(term2353, 5, 0.10197030017477404);
        setDoubleElement(term2353, 6, 0.8407744901070183);
        setDoubleElement(term2353, 7, 0.20623434725762346);
        setElement(term2313, 8, term2353);
        setField(term2312, term2312.getClass(), "data", term2313);
        setDoubleElement(term2363, 0, 0.7117427045638587);
        setDoubleElement(term2363, 1, 0.18136572835226095);
        setDoubleElement(term2363, 2, 0.6590510792221129);
        setDoubleElement(term2363, 3, 0.23150372655746188);
        setDoubleElement(term2363, 4, 0.4146617418555236);
        setDoubleElement(term2363, 5, 0.4997869887510318);
        setElement(term2362, 0, term2363);
        setDoubleElement(term2370, 0, 0.27934774389918404);
        setDoubleElement(term2370, 1, 0.43814162844573357);
        setDoubleElement(term2370, 2, 0.05929047738699278);
        setDoubleElement(term2370, 3, 0.2123900087449222);
        setDoubleElement(term2370, 4, 0.8511302064941156);
        setDoubleElement(term2370, 5, 0.7036730322599665);
        setDoubleElement(term2370, 6, 0.2204271120026764);
        setDoubleElement(term2370, 7, 0.9176544304528376);
        setElement(term2362, 1, term2370);
        setDoubleElement(term2379, 0, 0.8392612253715892);
        setDoubleElement(term2379, 1, 0.4677633411051154);
        setDoubleElement(term2379, 2, 0.6531744322192781);
        setElement(term2362, 2, term2379);
        setField(term2312, term2312.getClass(), "lu", term2362);
        setIntElement(term2383, 0, -1347665717);
        setField(term2312, term2312.getClass(), "permutation", term2383);
        setIntField(term2312, term2312.getClass(), "parity", 1);
        term2386 = new Integer(-1888585309);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.linear.RealMatrixImpl");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term2386;
        try {
            callMethod(klass, "getColumnMatrix", argTypes, term2312, args);
            assertTrue(false);
        }
        catch (MatrixIndexException e) {
        }

    }

};


