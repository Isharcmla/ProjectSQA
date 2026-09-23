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
import java.lang.Double;

public class FastMath_slowSin_28807078429 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term193;
     Object term195;

    public FastMath_slowSin_28807078429() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term193 = new Double(0.24259014218848696);
        term195 = (double[]) newDoubleArray(8);
        setDoubleElement(term195, 0, 0.1544348383112728);
        setDoubleElement(term195, 1, 0.5187846213101265);
        setDoubleElement(term195, 2, 0.045893173090043815);
        setDoubleElement(term195, 3, 0.3626177854778667);
        setDoubleElement(term195, 4, 0.3163771663728089);
        setDoubleElement(term195, 5, 0.8819646072665548);
        setDoubleElement(term195, 6, 0.5412182593116958);
        setDoubleElement(term195, 7, 0.16988691727397487);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.util.FastMath");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = double.class;
        argTypes[1] = Array.newInstance(double.class, 0).getClass();
        Object[] args = new Object[2];
        args[0] = term193;
        args[1] = term195;
        callMethod(klass, "slowSin", argTypes, null, args);
    }

};


