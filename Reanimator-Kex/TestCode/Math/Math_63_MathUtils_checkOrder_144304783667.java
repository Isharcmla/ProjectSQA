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

public class MathUtils_checkOrder_144304783667 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term762;

    public MathUtils_checkOrder_144304783667() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term762 = (double[]) newDoubleArray(6);
        setDoubleElement(term762, 0, 0.24259014218848696);
        setDoubleElement(term762, 1, 0.1544348383112728);
        setDoubleElement(term762, 2, 0.5187846213101265);
        setDoubleElement(term762, 3, 0.045893173090043815);
        setDoubleElement(term762, 4, 0.3626177854778667);
        setDoubleElement(term762, 5, 0.3163771663728089);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.util.MathUtils");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(double.class, 0).getClass();
        Object[] args = new Object[1];
        args[0] = term762;
        callMethod(klass, "checkOrder", argTypes, null, args);
    }

};


