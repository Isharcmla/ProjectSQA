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

public class PearsonsCorrelation_computeCorrelationMatrix_203760627484 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term553328;
     Object term553066;

    public PearsonsCorrelation_computeCorrelationMatrix_203760627484() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term553328 = newInstance(Class.forName("org.apache.commons.math.stat.correlation.PearsonsCorrelation"));
        term553066 = (Object[]) newArray("[D", 1);
        double[] term553067 = (double[]) newDoubleArray(2);
        setElement(term553066, 0, term553067);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.stat.correlation.PearsonsCorrelation");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(Array.newInstance(double.class, 0).getClass(), 0).getClass();
        Object[] args = new Object[1];
        args[0] = term553066;
        callMethod(klass, "computeCorrelationMatrix", argTypes, term553328, args);
    }

};


