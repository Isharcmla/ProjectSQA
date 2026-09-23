package org.apache.commons.math.stat.descriptive.moment;

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
import static org.apache.commons.math.stat.descriptive.moment.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static org.apache.commons.math.stat.descriptive.moment.EqualityUtils.*;
import java.lang.Double;

public class Variance_evaluate_1226774499142 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term193604;
     Object term188926;
     Object term207866;
     Object term207867;

    public Variance_evaluate_1226774499142() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term193604 = newInstance(Class.forName("org.apache.commons.math.stat.descriptive.moment.Variance"));
        term188926 = (double[]) newDoubleArray(378);
        term207866 = newInstance(Class.forName("org.apache.commons.math.stat.descriptive.moment.Variance"));
        setField(term207866, term207866.getClass(), "moment", null);
        setBooleanField(term207866, term207866.getClass(), "incMoment", false);
        setBooleanField(term207866, term207866.getClass(), "isBiasCorrected", false);
        setField(term207866, term207866.getClass(), "storedData", null);
        term207867 = (double[]) newDoubleArray(378);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.stat.descriptive.moment.Variance");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Array.newInstance(double.class, 0).getClass();
        argTypes[1] = double.class;
        Object[] args = new Object[2];
        args[0] = term188926;
        args[1] = Double.NaN;
        Object retValue = callMethod(klass, "evaluate", argTypes, term193604, args);
        assertTrue(recursiveEquals(term193604, term207866));
        assertTrue(recursiveEquals(term188926, term207867));
        assertTrue(recursiveEquals(retValue, Double.NaN));
    }

};


