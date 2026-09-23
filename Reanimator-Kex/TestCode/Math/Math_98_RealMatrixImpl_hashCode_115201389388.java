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

public class RealMatrixImpl_hashCode_115201389388 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4421;

    public RealMatrixImpl_hashCode_115201389388() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term4421 = newInstance(Class.forName("org.apache.commons.math.linear.RealMatrixImpl"));
        Object[] term4422 = (Object[]) newArray("[D", 9);
        double[] term4423 = (double[]) newDoubleArray(8);
        double[] term4432 = (double[]) newDoubleArray(6);
        double[] term4439 = (double[]) newDoubleArray(8);
        double[] term4448 = (double[]) newDoubleArray(8);
        double[] term4457 = (double[]) newDoubleArray(6);
        double[] term4464 = (double[]) newDoubleArray(1);
        double[] term4466 = (double[]) newDoubleArray(1);
        double[] term4468 = (double[]) newDoubleArray(4);
        double[] term4473 = (double[]) newDoubleArray(1);
        Object[] term4475 = (Object[]) newArray("[D", 5);
        double[] term4476 = (double[]) newDoubleArray(0);
        double[] term4477 = (double[]) newDoubleArray(0);
        double[] term4478 = (double[]) newDoubleArray(4);
        double[] term4483 = (double[]) newDoubleArray(9);
        double[] term4493 = (double[]) newDoubleArray(3);
        int[] term4497 = (int[]) newIntArray(6);
        setDoubleElement(term4423, 0, 0.10760444098786104);
        setDoubleElement(term4423, 1, 0.01528483181801743);
        setDoubleElement(term4423, 2, 0.04682003967006809);
        setDoubleElement(term4423, 3, 0.7905409988983721);
        setDoubleElement(term4423, 4, 0.9734219689441325);
        setDoubleElement(term4423, 5, 0.5656095365408487);
        setDoubleElement(term4423, 6, 0.9067966842819112);
        setDoubleElement(term4423, 7, 0.12692792670135955);
        setElement(term4422, 0, term4423);
        setDoubleElement(term4432, 0, 0.8612880788935964);
        setDoubleElement(term4432, 1, 0.942693451174182);
        setDoubleElement(term4432, 2, 0.5281468576963442);
        setDoubleElement(term4432, 3, 0.7587601518286838);
        setDoubleElement(term4432, 4, 0.4637876814191275);
        setDoubleElement(term4432, 5, 0.22419640970072618);
        setElement(term4422, 1, term4432);
        setDoubleElement(term4439, 0, 0.7927653255315935);
        setDoubleElement(term4439, 1, 0.46099818741569987);
        setDoubleElement(term4439, 2, 0.0539856711253599);
        setDoubleElement(term4439, 3, 0.07425867300066613);
        setDoubleElement(term4439, 4, 0.3321459296716357);
        setDoubleElement(term4439, 5, 0.5161676525058972);
        setDoubleElement(term4439, 6, 0.3140665316001605);
        setDoubleElement(term4439, 7, 0.005684976436328371);
        setElement(term4422, 2, term4439);
        setDoubleElement(term4448, 0, 0.6853845048972451);
        setDoubleElement(term4448, 1, 0.7298606953032495);
        setDoubleElement(term4448, 2, 0.08409138647122327);
        setDoubleElement(term4448, 3, 0.7549415655365366);
        setDoubleElement(term4448, 4, 0.10381603222584945);
        setDoubleElement(term4448, 5, 0.7261189187916395);
        setDoubleElement(term4448, 6, 0.9948921909237972);
        setDoubleElement(term4448, 7, 0.8826676677418305);
        setElement(term4422, 3, term4448);
        setDoubleElement(term4457, 0, 0.3515594618290028);
        setDoubleElement(term4457, 1, 0.33705928226360893);
        setDoubleElement(term4457, 2, 0.2586931188724769);
        setDoubleElement(term4457, 3, 0.7172855866461255);
        setDoubleElement(term4457, 4, 0.863939500507578);
        setDoubleElement(term4457, 5, 0.7341124480529497);
        setElement(term4422, 4, term4457);
        setDoubleElement(term4464, 0, 0.8568697336359051);
        setElement(term4422, 5, term4464);
        setDoubleElement(term4466, 0, 0.670426474495622);
        setElement(term4422, 6, term4466);
        setDoubleElement(term4468, 0, 0.7946992397818603);
        setDoubleElement(term4468, 1, 0.1875008638949398);
        setDoubleElement(term4468, 2, 0.9863263105761877);
        setDoubleElement(term4468, 3, 0.7702717047713711);
        setElement(term4422, 7, term4468);
        setDoubleElement(term4473, 0, 0.8081136617195611);
        setElement(term4422, 8, term4473);
        setField(term4421, term4421.getClass(), "data", term4422);
        setElement(term4475, 0, term4476);
        setElement(term4475, 1, term4477);
        setDoubleElement(term4478, 0, 0.9860913241292346);
        setDoubleElement(term4478, 1, 0.9042927054903839);
        setDoubleElement(term4478, 2, 0.9825423463658146);
        setDoubleElement(term4478, 3, 0.9535587012378192);
        setElement(term4475, 2, term4478);
        setDoubleElement(term4483, 0, 0.10151513381457755);
        setDoubleElement(term4483, 1, 0.2459118546787431);
        setDoubleElement(term4483, 2, 0.5187522941250506);
        setDoubleElement(term4483, 3, 0.5977863032810627);
        setDoubleElement(term4483, 4, 0.6384563119859914);
        setDoubleElement(term4483, 5, 0.47980964634221257);
        setDoubleElement(term4483, 6, 0.8674736307280658);
        setDoubleElement(term4483, 7, 0.1841006601291062);
        setDoubleElement(term4483, 8, 0.9772662571898173);
        setElement(term4475, 3, term4483);
        setDoubleElement(term4493, 0, 0.4139091920768172);
        setDoubleElement(term4493, 1, 0.7267446644246186);
        setDoubleElement(term4493, 2, 0.537827096227626);
        setElement(term4475, 4, term4493);
        setField(term4421, term4421.getClass(), "lu", term4475);
        setIntElement(term4497, 0, -1667990367);
        setIntElement(term4497, 1, -1214628358);
        setIntElement(term4497, 2, 1102721075);
        setIntElement(term4497, 3, -426764678);
        setIntElement(term4497, 4, -1222614956);
        setIntElement(term4497, 5, -1870495012);
        setField(term4421, term4421.getClass(), "permutation", term4497);
        setIntField(term4421, term4421.getClass(), "parity", 1);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.linear.RealMatrixImpl");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "hashCode", argTypes, term4421, args);
            assertTrue(false);
        }
        catch (ArrayIndexOutOfBoundsException e) {
        }

    }

};


