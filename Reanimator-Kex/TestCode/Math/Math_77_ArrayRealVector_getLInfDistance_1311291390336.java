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

public class ArrayRealVector_getLInfDistance_1311291390336 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term79721;
     Object term79819;
     Object term100512;
     Object term100514;

    public ArrayRealVector_getLInfDistance_1311291390336() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term79721 = newInstance(Class.forName("org.apache.commons.math.linear.ArrayRealVector"));
        double[] term78135 = (double[]) newDoubleArray(489);
        setField(term79721, term79721.getClass(), "data", term78135);
        term79819 = newInstance(Class.forName("org.apache.commons.math.linear.ArrayRealVector"));
        setField(term79819, term79819.getClass(), "data", term78135);
        term100512 = newInstance(Class.forName("org.apache.commons.math.linear.ArrayRealVector"));
        double[] term100513 = (double[]) newDoubleArray(489);
        setField(term100512, term100512.getClass(), "data", term100513);
        term100514 = newInstance(Class.forName("org.apache.commons.math.linear.ArrayRealVector"));
        double[] term100515 = (double[]) newDoubleArray(489);
        setField(term100514, term100514.getClass(), "data", term100515);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.linear.ArrayRealVector");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.math.linear.ArrayRealVector");
        Object[] args = new Object[1];
        args[0] = term79819;
        Object retValue = callMethod(klass, "getLInfDistance", argTypes, term79721, args);
        assertTrue(recursiveEquals(term79721, term100512));
        assertTrue(recursiveEquals(term79819, term100514));
        assertTrue(recursiveEquals(retValue, 0.0));
    }

};


