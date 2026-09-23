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

public class SimplexTableau_getInvertedCoeffiecientSum_1407857069216 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term126050;
     Object term128059;

    public SimplexTableau_getInvertedCoeffiecientSum_1407857069216() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term126050 = newInstance(Class.forName("org.apache.commons.math.linear.RealVectorImpl"));
        double[] term123981 = (double[]) newDoubleArray(489);
        setField(term126050, term126050.getClass(), "data", term123981);
        term128059 = newInstance(Class.forName("org.apache.commons.math.linear.RealVectorImpl"));
        double[] term128060 = (double[]) newDoubleArray(489);
        setField(term128059, term128059.getClass(), "data", term128060);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.optimization.linear.SimplexTableau");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.math.linear.RealVector");
        Object[] args = new Object[1];
        args[0] = term126050;
        callMethod(klass, "getInvertedCoeffiecientSum", argTypes, null, args);
        assertTrue(recursiveEquals(term126050, term128059));
    }

};


