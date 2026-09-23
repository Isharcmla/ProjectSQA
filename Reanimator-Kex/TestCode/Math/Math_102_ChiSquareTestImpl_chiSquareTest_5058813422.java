package org.apache.commons.math.stat.inference;

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
import java.lang.IllegalArgumentException;
import static org.apache.commons.math.stat.inference.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.lang.Double;

public class ChiSquareTestImpl_chiSquareTest_5058813422 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term47;
     Object term52;
     Object term54;
     Object term61;

    public ChiSquareTestImpl_chiSquareTest_5058813422() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term47 = newInstance(Class.forName("org.apache.commons.math.stat.inference.ChiSquareTestImpl"));
        Object term48 = newInstance(Class.forName("org.apache.commons.math.distribution.ChiSquaredDistributionImpl"));
        Object term49 = newInstance(Class.forName("org.apache.commons.math.distribution.GammaDistributionImpl"));
        setDoubleField(term49, term49.getClass(), "alpha", 0.5);
        setDoubleField(term49, term49.getClass(), "beta", 2.0);
        setField(term48, term48.getClass(), "gamma", term49);
        setField(term47, term47.getClass(), "distribution", term48);
        term52 = (double[]) newDoubleArray(1);
        setDoubleElement(term52, 0, 0.6076495596892013);
        term54 = (long[]) newLongArray(6);
        setLongElement(term54, 0, -7237588299778557629L);
        setLongElement(term54, 1, 6967924379644551255L);
        setLongElement(term54, 2, -2813493605142626659L);
        setLongElement(term54, 3, -8885298608300233488L);
        setLongElement(term54, 4, -4325723315152823407L);
        setLongElement(term54, 5, 2535595959091595249L);
        term61 = new Double(0.37773193782763337);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.stat.inference.ChiSquareTestImpl");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Array.newInstance(double.class, 0).getClass();
        argTypes[1] = Array.newInstance(long.class, 0).getClass();
        argTypes[2] = double.class;
        Object[] args = new Object[3];
        args[0] = term52;
        args[1] = term54;
        args[2] = term61;
        try {
            callMethod(klass, "chiSquareTest", argTypes, term47, args);
            assertTrue(false);
        }
        catch (IllegalArgumentException e) {
        }

    }

};


