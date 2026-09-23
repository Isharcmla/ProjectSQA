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

public class Variance_evaluate_1226774499105 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term107300;
     Object term105670;
     Object term114680;
     Object term114681;

    public Variance_evaluate_1226774499105() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term107300 = newInstance(Class.forName("org.apache.commons.math.stat.descriptive.moment.Variance"));
        term105670 = (double[]) newDoubleArray(124);
        term114680 = newInstance(Class.forName("org.apache.commons.math.stat.descriptive.moment.Variance"));
        setField(term114680, term114680.getClass(), "moment", null);
        setBooleanField(term114680, term114680.getClass(), "incMoment", false);
        setBooleanField(term114680, term114680.getClass(), "isBiasCorrected", false);
        setField(term114680, term114680.getClass(), "storedData", null);
        term114681 = (double[]) newDoubleArray(124);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.stat.descriptive.moment.Variance");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Array.newInstance(double.class, 0).getClass();
        argTypes[1] = double.class;
        Object[] args = new Object[2];
        args[0] = term105670;
        args[1] = Double.NaN;
        Object retValue = callMethod(klass, "evaluate", argTypes, term107300, args);
        assertTrue(recursiveEquals(term107300, term114680));
        assertTrue(recursiveEquals(term105670, term114681));
        assertTrue(recursiveEquals(retValue, Double.NaN));
    }

};


