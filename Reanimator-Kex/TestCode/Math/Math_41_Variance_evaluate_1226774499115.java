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

public class Variance_evaluate_1226774499115 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term128260;
     Object term125178;
     Object term144026;
     Object term144027;

    public Variance_evaluate_1226774499115() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term128260 = newInstance(Class.forName("org.apache.commons.math.stat.descriptive.moment.Variance"));
        term125178 = (double[]) newDoubleArray(245);
        term144026 = newInstance(Class.forName("org.apache.commons.math.stat.descriptive.moment.Variance"));
        setField(term144026, term144026.getClass(), "moment", null);
        setBooleanField(term144026, term144026.getClass(), "incMoment", false);
        setBooleanField(term144026, term144026.getClass(), "isBiasCorrected", false);
        setField(term144026, term144026.getClass(), "storedData", null);
        term144027 = (double[]) newDoubleArray(245);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.stat.descriptive.moment.Variance");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Array.newInstance(double.class, 0).getClass();
        argTypes[1] = double.class;
        Object[] args = new Object[2];
        args[0] = term125178;
        args[1] = Double.NaN;
        Object retValue = callMethod(klass, "evaluate", argTypes, term128260, args);
        assertTrue(recursiveEquals(term128260, term144026));
        assertTrue(recursiveEquals(term125178, term144027));
        assertTrue(recursiveEquals(retValue, Double.NaN));
    }

};


