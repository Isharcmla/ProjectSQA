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

public class RealMatrixImpl_isSingular_199483273777 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2974;
     Object term19472;

    public RealMatrixImpl_isSingular_199483273777() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2974 = newInstance(Class.forName("org.apache.commons.math.linear.RealMatrixImpl"));
        Object[] term2975 = (Object[]) newArray("[D", 6);
        double[] term2976 = (double[]) newDoubleArray(8);
        double[] term2985 = (double[]) newDoubleArray(6);
        double[] term2992 = (double[]) newDoubleArray(8);
        double[] term3001 = (double[]) newDoubleArray(6);
        double[] term3008 = (double[]) newDoubleArray(3);
        double[] term3012 = (double[]) newDoubleArray(9);
        Object[] term3022 = (Object[]) newArray("[D", 1);
        double[] term3023 = (double[]) newDoubleArray(4);
        int[] term3028 = (int[]) newIntArray(9);
        setDoubleElement(term2976, 0, 0.9477686563600426);
        setDoubleElement(term2976, 1, 0.530126080388379);
        setDoubleElement(term2976, 2, 0.44773981891873893);
        setDoubleElement(term2976, 3, 0.8079395143254551);
        setDoubleElement(term2976, 4, 0.8432220434692428);
        setDoubleElement(term2976, 5, 0.10735086460638021);
        setDoubleElement(term2976, 6, 0.17377837668919804);
        setDoubleElement(term2976, 7, 0.9617136552411361);
        setElement(term2975, 0, term2976);
        setDoubleElement(term2985, 0, 0.8733388286648099);
        setDoubleElement(term2985, 1, 0.6961639879171184);
        setDoubleElement(term2985, 2, 0.04086594399817722);
        setDoubleElement(term2985, 3, 0.8896348979317397);
        setDoubleElement(term2985, 4, 0.26895104127686764);
        setDoubleElement(term2985, 5, 0.44147348766746497);
        setElement(term2975, 1, term2985);
        setDoubleElement(term2992, 0, 0.20785767731652216);
        setDoubleElement(term2992, 1, 0.8233926052583531);
        setDoubleElement(term2992, 2, 0.01480700687689196);
        setDoubleElement(term2992, 3, 0.2199442770536334);
        setDoubleElement(term2992, 4, 0.18246579362349058);
        setDoubleElement(term2992, 5, 0.4625644623844958);
        setDoubleElement(term2992, 6, 0.20372080216921717);
        setDoubleElement(term2992, 7, 0.3858905478901201);
        setElement(term2975, 2, term2992);
        setDoubleElement(term3001, 0, 0.06209980384851188);
        setDoubleElement(term3001, 1, 0.7510022677490469);
        setDoubleElement(term3001, 2, 0.5419487144008749);
        setDoubleElement(term3001, 3, 0.5371162753597336);
        setDoubleElement(term3001, 4, 0.9361416298884132);
        setDoubleElement(term3001, 5, 0.8778317260539199);
        setElement(term2975, 3, term3001);
        setDoubleElement(term3008, 0, 0.45125789063502075);
        setDoubleElement(term3008, 1, 0.4651628339961664);
        setDoubleElement(term3008, 2, 0.7335000266072508);
        setElement(term2975, 4, term3008);
        setDoubleElement(term3012, 0, 0.947310784971331);
        setDoubleElement(term3012, 1, 0.6789722913921049);
        setDoubleElement(term3012, 2, 0.8655559834554122);
        setDoubleElement(term3012, 3, 0.468233333654713);
        setDoubleElement(term3012, 4, 0.5010487964484078);
        setDoubleElement(term3012, 5, 0.449352073121681);
        setDoubleElement(term3012, 6, 0.7010269091136693);
        setDoubleElement(term3012, 7, 0.6612253481241203);
        setDoubleElement(term3012, 8, 0.22159627353099653);
        setElement(term2975, 5, term3012);
        setField(term2974, term2974.getClass(), "data", term2975);
        setDoubleElement(term3023, 0, 0.9679819474184936);
        setDoubleElement(term3023, 1, 0.3343151559079882);
        setDoubleElement(term3023, 2, 0.6973440561579057);
        setDoubleElement(term3023, 3, 0.6981733274274508);
        setElement(term3022, 0, term3023);
        setField(term2974, term2974.getClass(), "lu", term3022);
        setIntElement(term3028, 0, 96566506);
        setIntElement(term3028, 1, -343325701);
        setIntElement(term3028, 2, 107945604);
        setIntElement(term3028, 3, -1963464809);
        setIntElement(term3028, 4, 71190297);
        setIntElement(term3028, 5, 1202361360);
        setIntElement(term3028, 6, -2015048153);
        setIntElement(term3028, 7, -2063457669);
        setIntElement(term3028, 8, -1222006000);
        setField(term2974, term2974.getClass(), "permutation", term3028);
        setIntField(term2974, term2974.getClass(), "parity", 1);
        term19472 = newInstance(Class.forName("org.apache.commons.math.linear.RealMatrixImpl"));
        Object[] term19473 = (Object[]) newArray("[D", 6);
        double[] term19474 = (double[]) newDoubleArray(8);
        double[] term19475 = (double[]) newDoubleArray(6);
        double[] term19476 = (double[]) newDoubleArray(8);
        double[] term19477 = (double[]) newDoubleArray(6);
        double[] term19478 = (double[]) newDoubleArray(3);
        double[] term19479 = (double[]) newDoubleArray(9);
        Object[] term19480 = (Object[]) newArray("[D", 1);
        double[] term19481 = (double[]) newDoubleArray(4);
        int[] term19482 = (int[]) newIntArray(9);
        setDoubleElement(term19474, 0, 0.9477686563600426);
        setDoubleElement(term19474, 1, 0.530126080388379);
        setDoubleElement(term19474, 2, 0.44773981891873893);
        setDoubleElement(term19474, 3, 0.8079395143254551);
        setDoubleElement(term19474, 4, 0.8432220434692428);
        setDoubleElement(term19474, 5, 0.10735086460638021);
        setDoubleElement(term19474, 6, 0.17377837668919804);
        setDoubleElement(term19474, 7, 0.9617136552411361);
        setElement(term19473, 0, term19474);
        setDoubleElement(term19475, 0, 0.8733388286648099);
        setDoubleElement(term19475, 1, 0.6961639879171184);
        setDoubleElement(term19475, 2, 0.04086594399817722);
        setDoubleElement(term19475, 3, 0.8896348979317397);
        setDoubleElement(term19475, 4, 0.26895104127686764);
        setDoubleElement(term19475, 5, 0.44147348766746497);
        setElement(term19473, 1, term19475);
        setDoubleElement(term19476, 0, 0.20785767731652216);
        setDoubleElement(term19476, 1, 0.8233926052583531);
        setDoubleElement(term19476, 2, 0.01480700687689196);
        setDoubleElement(term19476, 3, 0.2199442770536334);
        setDoubleElement(term19476, 4, 0.18246579362349058);
        setDoubleElement(term19476, 5, 0.4625644623844958);
        setDoubleElement(term19476, 6, 0.20372080216921717);
        setDoubleElement(term19476, 7, 0.3858905478901201);
        setElement(term19473, 2, term19476);
        setDoubleElement(term19477, 0, 0.06209980384851188);
        setDoubleElement(term19477, 1, 0.7510022677490469);
        setDoubleElement(term19477, 2, 0.5419487144008749);
        setDoubleElement(term19477, 3, 0.5371162753597336);
        setDoubleElement(term19477, 4, 0.9361416298884132);
        setDoubleElement(term19477, 5, 0.8778317260539199);
        setElement(term19473, 3, term19477);
        setDoubleElement(term19478, 0, 0.45125789063502075);
        setDoubleElement(term19478, 1, 0.4651628339961664);
        setDoubleElement(term19478, 2, 0.7335000266072508);
        setElement(term19473, 4, term19478);
        setDoubleElement(term19479, 0, 0.947310784971331);
        setDoubleElement(term19479, 1, 0.6789722913921049);
        setDoubleElement(term19479, 2, 0.8655559834554122);
        setDoubleElement(term19479, 3, 0.468233333654713);
        setDoubleElement(term19479, 4, 0.5010487964484078);
        setDoubleElement(term19479, 5, 0.449352073121681);
        setDoubleElement(term19479, 6, 0.7010269091136693);
        setDoubleElement(term19479, 7, 0.6612253481241203);
        setDoubleElement(term19479, 8, 0.22159627353099653);
        setElement(term19473, 5, term19479);
        setField(term19472, term19472.getClass(), "data", term19473);
        setDoubleElement(term19481, 0, 0.9679819474184936);
        setDoubleElement(term19481, 1, 0.3343151559079882);
        setDoubleElement(term19481, 2, 0.6973440561579057);
        setDoubleElement(term19481, 3, 0.6981733274274508);
        setElement(term19480, 0, term19481);
        setField(term19472, term19472.getClass(), "lu", term19480);
        setIntElement(term19482, 0, 96566506);
        setIntElement(term19482, 1, -343325701);
        setIntElement(term19482, 2, 107945604);
        setIntElement(term19482, 3, -1963464809);
        setIntElement(term19482, 4, 71190297);
        setIntElement(term19482, 5, 1202361360);
        setIntElement(term19482, 6, -2015048153);
        setIntElement(term19482, 7, -2063457669);
        setIntElement(term19482, 8, -1222006000);
        setField(term19472, term19472.getClass(), "permutation", term19482);
        setIntField(term19472, term19472.getClass(), "parity", 1);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.linear.RealMatrixImpl");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "isSingular", argTypes, term2974, args);
        assertTrue(recursiveEquals(term2974, term19472));
        assertTrue(recursiveEquals(retValue, false));
    }

};


