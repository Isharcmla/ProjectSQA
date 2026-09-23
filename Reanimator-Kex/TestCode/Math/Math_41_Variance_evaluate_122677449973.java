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

public class Variance_evaluate_122677449973 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term48932;
     Object term47194;
     Object term49611;
     Object term49612;

    public Variance_evaluate_122677449973() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term48932 = newInstance(Class.forName("org.apache.commons.math.stat.descriptive.moment.Variance"));
        term47194 = (double[]) newDoubleArray(133);
        term49611 = newInstance(Class.forName("org.apache.commons.math.stat.descriptive.moment.Variance"));
        setField(term49611, term49611.getClass(), "moment", null);
        setBooleanField(term49611, term49611.getClass(), "incMoment", false);
        setBooleanField(term49611, term49611.getClass(), "isBiasCorrected", false);
        setField(term49611, term49611.getClass(), "storedData", null);
        term49612 = (double[]) newDoubleArray(133);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.stat.descriptive.moment.Variance");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Array.newInstance(double.class, 0).getClass();
        argTypes[1] = double.class;
        Object[] args = new Object[2];
        args[0] = term47194;
        args[1] = Double.NaN;
        Object retValue = callMethod(klass, "evaluate", argTypes, term48932, args);
        assertTrue(recursiveEquals(term48932, term49611));
        assertTrue(recursiveEquals(term47194, term49612));
        assertTrue(recursiveEquals(retValue, Double.NaN));
    }

};


