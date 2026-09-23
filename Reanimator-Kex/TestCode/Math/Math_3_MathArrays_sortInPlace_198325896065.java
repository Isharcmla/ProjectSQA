package org.apache.commons.math3.util;

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
import org.apache.commons.math3.exception.DimensionMismatchException;
import static org.apache.commons.math3.util.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.String;
import java.lang.Object;

public class MathArrays_sortInPlace_198325896065 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1749;
     Object enum12;
     Object term1767;

    public MathArrays_sortInPlace_198325896065() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1749 = (double[]) newDoubleArray(3);
        setDoubleElement(term1749, 0, 0.9022041121474429);
        setDoubleElement(term1749, 1, 0.6512870939318848);
        setDoubleElement(term1749, 2, 0.8777038609128434);
        Class<? extends Object> term16620 = Class.forName((String) "org.apache.commons.math3.util.MathArrays$OrderDirection");
        Field term16619 = ((Class) term16620).getDeclaredField((String) "DECREASING");
        ((Field) term16619).setAccessible(true);
        enum12 = ((Field) term16619).get((Object) null);
        term1767 = (Object[]) newArray("[D", 6);
        double[] term1768 = (double[]) newDoubleArray(8);
        double[] term1777 = (double[]) newDoubleArray(9);
        double[] term1787 = (double[]) newDoubleArray(7);
        double[] term1795 = (double[]) newDoubleArray(3);
        double[] term1799 = (double[]) newDoubleArray(4);
        double[] term1804 = (double[]) newDoubleArray(2);
        setDoubleElement(term1768, 0, 0.008025683154629148);
        setDoubleElement(term1768, 1, 0.40598298281353484);
        setDoubleElement(term1768, 2, 0.3710067290060264);
        setDoubleElement(term1768, 3, 0.7818620200430967);
        setDoubleElement(term1768, 4, 0.04640022995603543);
        setDoubleElement(term1768, 5, 0.9123572866833729);
        setDoubleElement(term1768, 6, 0.40635376375558196);
        setDoubleElement(term1768, 7, 0.4772043271031934);
        setElement(term1767, 0, term1768);
        setDoubleElement(term1777, 0, 0.2446504549754045);
        setDoubleElement(term1777, 1, 0.6142723998707854);
        setDoubleElement(term1777, 2, 0.4355627280318103);
        setDoubleElement(term1777, 3, 0.841460835734741);
        setDoubleElement(term1777, 4, 0.7859316615744082);
        setDoubleElement(term1777, 5, 0.6428742553484879);
        setDoubleElement(term1777, 6, 0.6584165706677267);
        setDoubleElement(term1777, 7, 0.44268490778872205);
        setDoubleElement(term1777, 8, 0.7507333108648018);
        setElement(term1767, 1, term1777);
        setDoubleElement(term1787, 0, 0.007493740494434409);
        setDoubleElement(term1787, 1, 0.29172553321356776);
        setDoubleElement(term1787, 2, 0.9276995636844321);
        setDoubleElement(term1787, 3, 0.7636130748477434);
        setDoubleElement(term1787, 4, 0.07901636960861558);
        setDoubleElement(term1787, 5, 0.18717846301066243);
        setDoubleElement(term1787, 6, 0.5335953039331021);
        setElement(term1767, 2, term1787);
        setDoubleElement(term1795, 0, 0.5725602309856443);
        setDoubleElement(term1795, 1, 0.5310967137636303);
        setDoubleElement(term1795, 2, 0.6054109236809134);
        setElement(term1767, 3, term1795);
        setDoubleElement(term1799, 0, 0.9165240441138934);
        setDoubleElement(term1799, 1, 0.22227423914231126);
        setDoubleElement(term1799, 2, 0.06480976831423468);
        setDoubleElement(term1799, 3, 0.8490790645379176);
        setElement(term1767, 4, term1799);
        setDoubleElement(term1804, 0, 0.23129126164078717);
        setDoubleElement(term1804, 1, 0.6047138318674447);
        setElement(term1767, 5, term1804);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math3.util.MathArrays");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Array.newInstance(double.class, 0).getClass();
        argTypes[1] = Class.forName("org.apache.commons.math3.util.MathArrays$OrderDirection");
        argTypes[2] = Array.newInstance(Array.newInstance(double.class, 0).getClass(), 0).getClass();
        Object[] args = new Object[3];
        args[0] = term1749;
        args[1] = enum12;
        args[2] = term1767;
        try {
            callMethod(klass, "sortInPlace", argTypes, null, args);
            assertTrue(false);
        }
        catch (DimensionMismatchException e) {
        }

    }

};


