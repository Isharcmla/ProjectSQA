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
import static org.apache.commons.math3.util.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Double;

public class MathArrays_linearCombination_95195415632 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2235;
     Object term2237;
     Object term2239;
     Object term2241;
     Object term2243;
     Object term2245;
     Object term2247;
     Object term2249;

    public MathArrays_linearCombination_95195415632() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2235 = new Double(0.3238255203811462);
        term2237 = new Double(0.2843894095932772);
        term2239 = new Double(0.2382345237223229);
        term2241 = new Double(0.6037093070161561);
        term2243 = new Double(0.48050706663913145);
        term2245 = new Double(0.4990217874180345);
        term2247 = new Double(0.22767631814145395);
        term2249 = new Double(0.4630082575704827);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math3.util.MathArrays");
        Class<?>[] argTypes = new Class<?>[8];
        argTypes[0] = double.class;
        argTypes[1] = double.class;
        argTypes[2] = double.class;
        argTypes[3] = double.class;
        argTypes[4] = double.class;
        argTypes[5] = double.class;
        argTypes[6] = double.class;
        argTypes[7] = double.class;
        Object[] args = new Object[8];
        args[0] = term2235;
        args[1] = term2237;
        args[2] = term2239;
        args[3] = term2241;
        args[4] = term2243;
        args[5] = term2245;
        args[6] = term2247;
        args[7] = term2249;
        callMethod(klass, "linearCombination", argTypes, null, args);
    }

};


