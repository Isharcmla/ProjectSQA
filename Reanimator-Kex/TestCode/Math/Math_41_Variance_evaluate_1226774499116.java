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

public class Variance_evaluate_1226774499116 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term132736;
     Object term129642;
     Object term145031;
     Object term145032;

    public Variance_evaluate_1226774499116() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term132736 = newInstance(Class.forName("org.apache.commons.math.stat.descriptive.moment.Variance"));
        term129642 = (double[]) newDoubleArray(246);
        term145031 = newInstance(Class.forName("org.apache.commons.math.stat.descriptive.moment.Variance"));
        setField(term145031, term145031.getClass(), "moment", null);
        setBooleanField(term145031, term145031.getClass(), "incMoment", false);
        setBooleanField(term145031, term145031.getClass(), "isBiasCorrected", false);
        setField(term145031, term145031.getClass(), "storedData", null);
        term145032 = (double[]) newDoubleArray(246);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.stat.descriptive.moment.Variance");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Array.newInstance(double.class, 0).getClass();
        argTypes[1] = double.class;
        Object[] args = new Object[2];
        args[0] = term129642;
        args[1] = Double.NaN;
        Object retValue = callMethod(klass, "evaluate", argTypes, term132736, args);
        assertTrue(recursiveEquals(term132736, term145031));
        assertTrue(recursiveEquals(term129642, term145032));
        assertTrue(recursiveEquals(retValue, Double.NaN));
    }

};


