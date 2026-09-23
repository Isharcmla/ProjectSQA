package org.apache.commons.math.optimization.linear;

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
import static org.apache.commons.math.optimization.linear.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static org.apache.commons.math.optimization.linear.EqualityUtils.*;

public class SimplexTableau_getInvertedCoeffiecientSum_1407857069202 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term117228;
     Object term117234;

    public SimplexTableau_getInvertedCoeffiecientSum_1407857069202() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term117228 = newInstance(Class.forName("org.apache.commons.math.linear.RealVectorImpl"));
        double[] term117121 = (double[]) newDoubleArray(0);
        setField(term117228, term117228.getClass(), "data", term117121);
        term117234 = newInstance(Class.forName("org.apache.commons.math.linear.RealVectorImpl"));
        double[] term117235 = (double[]) newDoubleArray(0);
        setField(term117234, term117234.getClass(), "data", term117235);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.optimization.linear.SimplexTableau");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.math.linear.RealVector");
        Object[] args = new Object[1];
        args[0] = term117228;
        Object retValue = callMethod(klass, "getInvertedCoeffiecientSum", argTypes, null, args);
        assertTrue(recursiveEquals(term117228, term117234));
        assertTrue(recursiveEquals(retValue, 0.0));
    }

};


