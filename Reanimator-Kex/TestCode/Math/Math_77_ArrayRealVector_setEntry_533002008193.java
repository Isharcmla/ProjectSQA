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
import org.apache.commons.math.linear.MatrixIndexException;
import static org.apache.commons.math.linear.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Integer;
import java.lang.Double;

public class ArrayRealVector_setEntry_533002008193 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term395;
     Object term397;
     Object term399;

    public ArrayRealVector_setEntry_533002008193() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term395 = newInstance(Class.forName("org.apache.commons.math.linear.ArrayRealVector"));
        double[] term396 = (double[]) newDoubleArray(0);
        setField(term395, term395.getClass(), "data", term396);
        term397 = new Integer(-1339778481);
        term399 = new Double(0.0027299293098262956);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.linear.ArrayRealVector");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = int.class;
        argTypes[1] = double.class;
        Object[] args = new Object[2];
        args[0] = term397;
        args[1] = term399;
        try {
            callMethod(klass, "setEntry", argTypes, term395, args);
            assertTrue(false);
        }
        catch (MatrixIndexException e) {
        }

    }

};


