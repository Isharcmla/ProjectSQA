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

public class SingularValueDecompositionImpl_getSolver_1804940021161 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term204171;

    public SingularValueDecompositionImpl_getSolver_1804940021161() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term204171 = newInstance(Class.forName("org.apache.commons.math.linear.SingularValueDecompositionImpl"));
        double[] term200239 = (double[]) newDoubleArray(55);
        Object term204269 = newInstance(Class.forName("org.apache.commons.math.linear.BlockRealMatrix"));
        Object term204371 = newInstance(Class.forName("org.apache.commons.math.linear.OpenMapRealMatrix"));
        setDoubleElement(term200239, 0, -9.2233720196749066E18);
        setDoubleElement(term200239, 1, 4.6071837631247811E18);
        setDoubleElement(term200239, 2, 9.2188684372274053E18);
        setDoubleElement(term200239, 3, -4.6161764239152251E18);
        setDoubleElement(term200239, 4, 4.6116860184273879E18);
        setDoubleElement(term200239, 5, -9.22337203677299E18);
        setDoubleElement(term200239, 6, -2.3058430092136937E18);
        setDoubleElement(term200239, 7, -9.2219643801139937E18);
        setDoubleElement(term200239, 8, -1.17064748747246054E18);
        setDoubleElement(term200239, 9, -1.7338858522426409E18);
        setDoubleElement(term200239, 10, -9.1738324408761088E18);
        setDoubleElement(term200239, 11, 9.2188684372274053E18);
        setDoubleElement(term200239, 12, 16384.0);
        setDoubleElement(term200239, 13, -7.6561193665298432E16);
        setDoubleElement(term200239, 14, 1.14872576823528653E18);
        setDoubleElement(term200239, 15, -9.221119148190334E18);
        setDoubleElement(term200239, 16, -8.6410001144064901E18);
        setDoubleElement(term200239, 17, -9.2233717619726746E18);
        setDoubleElement(term200239, 18, 6.8719476736E10);
        setDoubleElement(term200239, 19, 2.3035912094000087E18);
        setDoubleElement(term200239, 20, 9.2188684372274053E18);
        setDoubleElement(term200239, 21, -7.9308379226709688E18);
        setDoubleElement(term200239, 22, -9.2219289277762109E18);
        setDoubleElement(term200239, 23, -4.503599627370496E15);
        setDoubleElement(term200239, 24, -9.2211202370410906E18);
        setDoubleElement(term200239, 25, 9.2188687121053123E18);
        setDoubleElement(term200239, 26, -9.2233720368537108E18);
        setDoubleElement(term200239, 27, 4.6071824188000174E18);
        setDoubleElement(term200239, 28, -9.223372036854776E18);
        setDoubleElement(term200239, 29, 4194304.0);
        setDoubleElement(term200239, 30, -9.2233718413498778E18);
        setDoubleElement(term200239, 31, 4.6071824188005417E18);
        setDoubleElement(term200239, 32, 1.14841790504658534E18);
        setDoubleElement(term200239, 33, 3.152519739159348E16);
        setDoubleElement(term200239, 34, 3.1525197425147904E16);
        setDoubleElement(term200239, 35, -9.22337203674048E18);
        setDoubleElement(term200239, 36, -9.2095797629959537E18);
        setDoubleElement(term200239, 37, 2.81670474006529E14);
        setDoubleElement(term200239, 38, -4.6139022215521239E18);
        setDoubleElement(term200239, 39, -8.9395045228420792E18);
        setDoubleElement(term200239, 40, -4.0397014573406858E18);
        setDoubleElement(term200239, 41, 4.6139381102988493E18);
        setDoubleElement(term200239, 42, -1.08086334363323597E18);
        setDoubleElement(term200239, 43, -9.2233011870658724E18);
        setDoubleElement(term200239, 44, -4.212944082567167E15);
        setDoubleElement(term200239, 45, -4.6160307141224694E18);
        setDoubleElement(term200239, 46, 9.2188684372274053E18);
        setDoubleElement(term200239, 47, -9.1915561366308782E18);
        setDoubleElement(term200239, 48, 9.2207163628427561E18);
        setDoubleElement(term200239, 49, -4.503599627370496E15);
        setDoubleElement(term200239, 50, -9.221885162380332E18);
        setDoubleElement(term200239, 51, 1.37438953472E11);
        setDoubleElement(term200239, 52, -9.2233390515059425E18);
        setDoubleElement(term200239, 53, 9.2188684544072745E18);
        setDoubleElement(term200239, 54, 4.8954127949519913E18);
        setField(term204171, term204171.getClass(), "singularValues", term200239);
        setField(term204171, term204171.getClass(), "cachedUt", term204269);
        setField(term204171, term204171.getClass(), "cachedV", term204371);
        setIntField(term204171, term204171.getClass(), "m", -2147483648);
        setIntField(term204171, term204171.getClass(), "n", 128);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.linear.SingularValueDecompositionImpl");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "getSolver", argTypes, term204171, args);
            assertTrue(false);
        }
        catch (ArrayIndexOutOfBoundsException e) {
        }

    }

};


