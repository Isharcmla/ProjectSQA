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

public class Variance_evaluate_122677449966 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term26479;
     Object term21381;
     Object term37869;
     Object term37870;

    public Variance_evaluate_122677449966() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term26479 = newInstance(Class.forName("org.apache.commons.math.stat.descriptive.moment.Variance"));
        term21381 = (double[]) newDoubleArray(413);
        term37869 = newInstance(Class.forName("org.apache.commons.math.stat.descriptive.moment.Variance"));
        setField(term37869, term37869.getClass(), "moment", null);
        setBooleanField(term37869, term37869.getClass(), "incMoment", false);
        setBooleanField(term37869, term37869.getClass(), "isBiasCorrected", false);
        setField(term37869, term37869.getClass(), "storedData", null);
        term37870 = (double[]) newDoubleArray(413);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.stat.descriptive.moment.Variance");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Array.newInstance(double.class, 0).getClass();
        argTypes[1] = double.class;
        Object[] args = new Object[2];
        args[0] = term21381;
        args[1] = Double.NaN;
        Object retValue = callMethod(klass, "evaluate", argTypes, term26479, args);
        assertTrue(recursiveEquals(term26479, term37869));
        assertTrue(recursiveEquals(term21381, term37870));
        assertTrue(recursiveEquals(retValue, Double.NaN));
    }

};


