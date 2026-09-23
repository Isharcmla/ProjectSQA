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
import java.lang.Double;

public class ArrayRealVector_set_739836660197 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term420;
     Object term422;
     Object term19788;

    public ArrayRealVector_set_739836660197() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term420 = newInstance(Class.forName("org.apache.commons.math.linear.ArrayRealVector"));
        double[] term421 = (double[]) newDoubleArray(0);
        setField(term420, term420.getClass(), "data", term421);
        term422 = new Double(0.8924855581421237);
        term19788 = newInstance(Class.forName("org.apache.commons.math.linear.ArrayRealVector"));
        double[] term19789 = (double[]) newDoubleArray(0);
        setField(term19788, term19788.getClass(), "data", term19789);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.linear.ArrayRealVector");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = double.class;
        Object[] args = new Object[1];
        args[0] = term422;
        callMethod(klass, "set", argTypes, term420, args);
        assertTrue(recursiveEquals(term420, term19788));
        assertTrue(recursiveEquals(term422, 0.8924855581421237));
    }

};


