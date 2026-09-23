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

public class ArrayRealVector_projection_1070191850182 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term329;
     Object term331;
     Object term14754;
     Object term14756;
     Object term14752;

    public ArrayRealVector_projection_1070191850182() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term329 = newInstance(Class.forName("org.apache.commons.math.linear.ArrayRealVector"));
        double[] term330 = (double[]) newDoubleArray(0);
        setField(term329, term329.getClass(), "data", term330);
        term331 = newInstance(Class.forName("org.apache.commons.math.linear.ArrayRealVector"));
        double[] term332 = (double[]) newDoubleArray(0);
        setField(term331, term331.getClass(), "data", term332);
        term14754 = newInstance(Class.forName("org.apache.commons.math.linear.ArrayRealVector"));
        double[] term14755 = (double[]) newDoubleArray(0);
        setField(term14754, term14754.getClass(), "data", term14755);
        term14756 = newInstance(Class.forName("org.apache.commons.math.linear.ArrayRealVector"));
        double[] term14757 = (double[]) newDoubleArray(0);
        setField(term14756, term14756.getClass(), "data", term14757);
        term14752 = newInstance(Class.forName("org.apache.commons.math.linear.ArrayRealVector"));
        double[] term14753 = (double[]) newDoubleArray(0);
        setField(term14752, term14752.getClass(), "data", term14753);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.linear.ArrayRealVector");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.math.linear.ArrayRealVector");
        Object[] args = new Object[1];
        args[0] = term331;
        Object retValue = callMethod(klass, "projection", argTypes, term329, args);
        assertTrue(recursiveEquals(term329, term14754));
        assertTrue(recursiveEquals(term331, term14756));
        assertTrue(recursiveEquals(retValue, term14752));
    }

};


