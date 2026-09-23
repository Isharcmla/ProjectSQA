package org.apache.commons.math.stat.correlation;

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
import static org.apache.commons.math.stat.correlation.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class PearsonsCorrelation_init_2056693145217 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2502194;

    public PearsonsCorrelation_init_2056693145217() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term2507540 = newInstance(Class.forName("org.apache.commons.math.stat.correlation.PearsonsCorrelation"));
        term2502194 = (Object[]) newArray("[D", 1);
        double[] term2502195 = (double[]) newDoubleArray(384);
        setElement(term2502194, 0, term2502195);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.stat.correlation.PearsonsCorrelation");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(Array.newInstance(double.class, 0).getClass(), 0).getClass();
        Object[] args = new Object[1];
        args[0] = term2502194;
        Object instance = callConstructor(klass, argTypes, args);
    }

};


