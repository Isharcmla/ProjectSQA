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

public class ArrayRealVector_getLInfNorm_1764519331168 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term279;
     Object term10822;

    public ArrayRealVector_getLInfNorm_1764519331168() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term279 = newInstance(Class.forName("org.apache.commons.math.linear.ArrayRealVector"));
        double[] term280 = (double[]) newDoubleArray(0);
        setField(term279, term279.getClass(), "data", term280);
        term10822 = newInstance(Class.forName("org.apache.commons.math.linear.ArrayRealVector"));
        double[] term10823 = (double[]) newDoubleArray(0);
        setField(term10822, term10822.getClass(), "data", term10823);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.linear.ArrayRealVector");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "getLInfNorm", argTypes, term279, args);
        assertTrue(recursiveEquals(term279, term10822));
        assertTrue(recursiveEquals(retValue, 0.0));
    }

};


