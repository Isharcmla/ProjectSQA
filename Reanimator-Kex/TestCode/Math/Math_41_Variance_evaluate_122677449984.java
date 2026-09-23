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

public class Variance_evaluate_122677449984 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term67077;
     Object term63359;
     Object term68800;
     Object term68801;

    public Variance_evaluate_122677449984() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term67077 = newInstance(Class.forName("org.apache.commons.math.stat.descriptive.moment.Variance"));
        term63359 = (double[]) newDoubleArray(298);
        term68800 = newInstance(Class.forName("org.apache.commons.math.stat.descriptive.moment.Variance"));
        setField(term68800, term68800.getClass(), "moment", null);
        setBooleanField(term68800, term68800.getClass(), "incMoment", false);
        setBooleanField(term68800, term68800.getClass(), "isBiasCorrected", false);
        setField(term68800, term68800.getClass(), "storedData", null);
        term68801 = (double[]) newDoubleArray(298);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.stat.descriptive.moment.Variance");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Array.newInstance(double.class, 0).getClass();
        argTypes[1] = double.class;
        Object[] args = new Object[2];
        args[0] = term63359;
        args[1] = Double.NaN;
        Object retValue = callMethod(klass, "evaluate", argTypes, term67077, args);
        assertTrue(recursiveEquals(term67077, term68800));
        assertTrue(recursiveEquals(term63359, term68801));
        assertTrue(recursiveEquals(retValue, Double.NaN));
    }

};


