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

public class Variance_evaluate_1226774499120 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term143155;
     Object term138705;
     Object term157079;
     Object term157080;

    public Variance_evaluate_1226774499120() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term143155 = newInstance(Class.forName("org.apache.commons.math.stat.descriptive.moment.Variance"));
        term138705 = (double[]) newDoubleArray(359);
        term157079 = newInstance(Class.forName("org.apache.commons.math.stat.descriptive.moment.Variance"));
        setField(term157079, term157079.getClass(), "moment", null);
        setBooleanField(term157079, term157079.getClass(), "incMoment", false);
        setBooleanField(term157079, term157079.getClass(), "isBiasCorrected", false);
        setField(term157079, term157079.getClass(), "storedData", null);
        term157080 = (double[]) newDoubleArray(359);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.stat.descriptive.moment.Variance");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Array.newInstance(double.class, 0).getClass();
        argTypes[1] = double.class;
        Object[] args = new Object[2];
        args[0] = term138705;
        args[1] = Double.NaN;
        Object retValue = callMethod(klass, "evaluate", argTypes, term143155, args);
        assertTrue(recursiveEquals(term143155, term157079));
        assertTrue(recursiveEquals(term138705, term157080));
        assertTrue(recursiveEquals(retValue, Double.NaN));
    }

};


