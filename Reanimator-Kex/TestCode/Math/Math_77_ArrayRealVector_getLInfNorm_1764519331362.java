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
import static org.apache.commons.math.linear.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static org.apache.commons.math.linear.EqualityUtils.*;

public class ArrayRealVector_getLInfNorm_1764519331362 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term87532;
     Object term118704;

    public ArrayRealVector_getLInfNorm_1764519331362() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term87532 = newInstance(Class.forName("org.apache.commons.math.linear.ArrayRealVector"));
        double[] term86932 = (double[]) newDoubleArray(489);
        setField(term87532, term87532.getClass(), "data", term86932);
        term118704 = newInstance(Class.forName("org.apache.commons.math.linear.ArrayRealVector"));
        double[] term118705 = (double[]) newDoubleArray(489);
        setField(term118704, term118704.getClass(), "data", term118705);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.linear.ArrayRealVector");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getLInfNorm", argTypes, term87532, args);
        assertTrue(recursiveEquals(term87532, term118704));
    }

};


