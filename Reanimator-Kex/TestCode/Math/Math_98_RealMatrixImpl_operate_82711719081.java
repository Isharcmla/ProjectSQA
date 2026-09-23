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

public class RealMatrixImpl_operate_82711719081 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3524;
     Object term3575;

    public RealMatrixImpl_operate_82711719081() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3524 = newInstance(Class.forName("org.apache.commons.math.linear.RealMatrixImpl"));
        Object[] term3525 = (Object[]) newArray("[D", 5);
        double[] term3526 = (double[]) newDoubleArray(9);
        double[] term3536 = (double[]) newDoubleArray(3);
        double[] term3540 = (double[]) newDoubleArray(8);
        double[] term3549 = (double[]) newDoubleArray(5);
        double[] term3555 = (double[]) newDoubleArray(0);
        Object[] term3556 = (Object[]) newArray("[D", 2);
        double[] term3557 = (double[]) newDoubleArray(6);
        double[] term3564 = (double[]) newDoubleArray(3);
        int[] term3568 = (int[]) newIntArray(5);
        setDoubleElement(term3526, 0, 0.02342888977877522);
        setDoubleElement(term3526, 1, 0.8378559358854193);
        setDoubleElement(term3526, 2, 0.9378643616218147);
        setDoubleElement(term3526, 3, 0.567999688524224);
        setDoubleElement(term3526, 4, 0.9787822422280171);
        setDoubleElement(term3526, 5, 0.8486739100301995);
        setDoubleElement(term3526, 6, 0.7888093083298529);
        setDoubleElement(term3526, 7, 0.04280766204589481);
        setDoubleElement(term3526, 8, 0.811099486121254);
        setElement(term3525, 0, term3526);
        setDoubleElement(term3536, 0, 0.7148906778566934);
        setDoubleElement(term3536, 1, 0.9948833256821954);
        setDoubleElement(term3536, 2, 0.699722589784733);
        setElement(term3525, 1, term3536);
        setDoubleElement(term3540, 0, 0.837705867255565);
        setDoubleElement(term3540, 1, 0.41437680771372976);
        setDoubleElement(term3540, 2, 0.31449454294142376);
        setDoubleElement(term3540, 3, 0.04067152176941935);
        setDoubleElement(term3540, 4, 0.9264176593835999);
        setDoubleElement(term3540, 5, 0.9190512379106165);
        setDoubleElement(term3540, 6, 0.8774164202457728);
        setDoubleElement(term3540, 7, 0.6603591336412894);
        setElement(term3525, 2, term3540);
        setDoubleElement(term3549, 0, 0.6488236468273764);
        setDoubleElement(term3549, 1, 0.1278434101605157);
        setDoubleElement(term3549, 2, 0.4662569403259078);
        setDoubleElement(term3549, 3, 0.7993342506043556);
        setDoubleElement(term3549, 4, 0.1397483969082174);
        setElement(term3525, 3, term3549);
        setElement(term3525, 4, term3555);
        setField(term3524, term3524.getClass(), "data", term3525);
        setDoubleElement(term3557, 0, 0.7734226136878846);
        setDoubleElement(term3557, 1, 0.8877306185788729);
        setDoubleElement(term3557, 2, 0.2213636837696984);
        setDoubleElement(term3557, 3, 0.23604751860793194);
        setDoubleElement(term3557, 4, 0.7491362372773306);
        setDoubleElement(term3557, 5, 0.20073156979734064);
        setElement(term3556, 0, term3557);
        setDoubleElement(term3564, 0, 0.4655589762588376);
        setDoubleElement(term3564, 1, 0.33214340370542494);
        setDoubleElement(term3564, 2, 0.5496690348655936);
        setElement(term3556, 1, term3564);
        setField(term3524, term3524.getClass(), "lu", term3556);
        setIntElement(term3568, 0, -461771056);
        setIntElement(term3568, 1, -243422082);
        setIntElement(term3568, 2, 1384592638);
        setIntElement(term3568, 3, -1002370457);
        setIntElement(term3568, 4, -2014576105);
        setField(term3524, term3524.getClass(), "permutation", term3568);
        setIntField(term3524, term3524.getClass(), "parity", 1);
        term3575 = (double[]) newDoubleArray(9);
        setDoubleElement(term3575, 0, 0.01058857386775991);
        setDoubleElement(term3575, 1, 0.47389726801621446);
        setDoubleElement(term3575, 2, 0.6602182208506436);
        setDoubleElement(term3575, 3, 0.4222555092864597);
        setDoubleElement(term3575, 4, 0.38751643915794354);
        setDoubleElement(term3575, 5, 0.7012219082391921);
        setDoubleElement(term3575, 6, 0.3797374233070945);
        setDoubleElement(term3575, 7, 0.38484791313292943);
        setDoubleElement(term3575, 8, 0.22215991475278152);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.linear.RealMatrixImpl");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(double.class, 0).getClass();
        Object[] args = new Object[1];
        args[0] = term3575;
        try {
            callMethod(klass, "operate", argTypes, term3524, args);
            assertTrue(false);
        }
        catch (ArrayIndexOutOfBoundsException e) {
        }

    }

};


