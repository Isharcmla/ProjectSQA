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

public class PearsonsCorrelation_init_422050055221 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2511142;

    public PearsonsCorrelation_init_422050055221() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term2511034 = newInstance(Class.forName("org.apache.commons.math.stat.correlation.PearsonsCorrelation"));
        setIntField(term2511034, term2511034.getClass(), "nObs", 0);
        term2511142 = newInstance(Class.forName("org.apache.commons.math.linear.Array2DRowRealMatrix"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.stat.correlation.PearsonsCorrelation");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("org.apache.commons.math.linear.RealMatrix");
        argTypes[1] = int.class;
        Object[] args = new Object[2];
        args[0] = term2511142;
        args[1] = 0;
        Object instance = callConstructor(klass, argTypes, args);
    }

};


