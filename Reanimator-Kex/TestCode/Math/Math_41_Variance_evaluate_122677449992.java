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

public class Variance_evaluate_122677449992 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term84661;
     Object term81291;
     Object term85490;
     Object term85491;

    public Variance_evaluate_122677449992() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term84661 = newInstance(Class.forName("org.apache.commons.math.stat.descriptive.moment.Variance"));
        term81291 = (double[]) newDoubleArray(269);
        term85490 = newInstance(Class.forName("org.apache.commons.math.stat.descriptive.moment.Variance"));
        setField(term85490, term85490.getClass(), "moment", null);
        setBooleanField(term85490, term85490.getClass(), "incMoment", false);
        setBooleanField(term85490, term85490.getClass(), "isBiasCorrected", false);
        setField(term85490, term85490.getClass(), "storedData", null);
        term85491 = (double[]) newDoubleArray(269);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.stat.descriptive.moment.Variance");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Array.newInstance(double.class, 0).getClass();
        argTypes[1] = double.class;
        Object[] args = new Object[2];
        args[0] = term81291;
        args[1] = Double.NaN;
        Object retValue = callMethod(klass, "evaluate", argTypes, term84661, args);
        assertTrue(recursiveEquals(term84661, term85490));
        assertTrue(recursiveEquals(term81291, term85491));
        assertTrue(recursiveEquals(retValue, Double.NaN));
    }

};


