package org.apache.commons.math.util;

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
import static org.apache.commons.math.util.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class FastMath_splitMult_131091213518 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term72;
     Object term79;
     Object term82;

    public FastMath_splitMult_131091213518() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term72 = (double[]) newDoubleArray(6);
        setDoubleElement(term72, 0, 0.6300849762307866);
        setDoubleElement(term72, 1, 0.9737083944266686);
        setDoubleElement(term72, 2, 0.0668892744806211);
        setDoubleElement(term72, 3, 0.3587267442738795);
        setDoubleElement(term72, 4, 0.07802449704920456);
        setDoubleElement(term72, 5, 0.5279279537140873);
        term79 = (double[]) newDoubleArray(2);
        setDoubleElement(term79, 0, 0.3202192021706908);
        setDoubleElement(term79, 1, 0.22651340641904605);
        term82 = (double[]) newDoubleArray(6);
        setDoubleElement(term82, 0, 0.8878841294187743);
        setDoubleElement(term82, 1, 0.6588948704887806);
        setDoubleElement(term82, 2, 0.6397214730945112);
        setDoubleElement(term82, 3, 0.25937345430928016);
        setDoubleElement(term82, 4, 0.5873228247510078);
        setDoubleElement(term82, 5, 0.8823181080774973);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.util.FastMath");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Array.newInstance(double.class, 0).getClass();
        argTypes[1] = Array.newInstance(double.class, 0).getClass();
        argTypes[2] = Array.newInstance(double.class, 0).getClass();
        Object[] args = new Object[3];
        args[0] = term72;
        args[1] = term79;
        args[2] = term82;
        callMethod(klass, "splitMult", argTypes, null, args);
    }

};


